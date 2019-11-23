package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.grpc.GrpcClientSettings
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Source
import akka.{Done, NotUsed}
import example.myapp.helloworld.grpc._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object PositionClient {

  def main(args: Array[String]): Unit = {
    // Boot akka
    implicit val sys = ActorSystem("PositionClient")
    implicit val mat = ActorMaterializer()
    implicit val ec = sys.dispatcher

    // Take details how to connect to the service from the config.
    val clientSettings = GrpcClientSettings.fromConfig(PositionService.name)
    // Create a client-side stub for the service
    val client: PositionService = PositionServiceClient(clientSettings)

    // Run examples for each of the exposed service methods.
    getPositions()

    def getPositions(): Unit = {

      sys.log.info("Performing request")
      val posStream = client.getPositions(PositionRequest("Alice", "btc/usd"))
      val done: Future[Done] =
        posStream.runForeach(pos => println(s"got single reply: ${pos.qcode} ${pos.volume} ${pos.entryPrice}" +
          s"  ${pos.entryPrice} ${pos.collateral.get} ${pos.pnl.getOrElse(-1)}"))

      done.onComplete {
        case Success(_) =>
          println("streamingReply done")
        case Failure(e) =>
          println(s"Error streamingReply: $e")

      }
    }
  }
}