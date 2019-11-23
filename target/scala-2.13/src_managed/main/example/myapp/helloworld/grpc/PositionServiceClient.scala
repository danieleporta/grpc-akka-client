
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc

import scala.concurrent.ExecutionContext

import io.grpc.ManagedChannel
import io.grpc.MethodDescriptor

import akka.grpc.GrpcClientSettings

import akka.grpc.scaladsl.AkkaGrpcClient

import akka.grpc.internal.Marshaller
import akka.grpc.internal.NettyClientUtils
import akka.grpc.internal.ClientState

import akka.stream.Materializer

import akka.grpc.scaladsl.StreamResponseRequestBuilder
import akka.grpc.internal.ScalaServerStreamingRequestBuilder

// Not sealed so users can extend to write their stubs
trait PositionServiceClient extends PositionService with PositionServiceClientPowerApi with AkkaGrpcClient

object PositionServiceClient {
  def apply(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext): PositionServiceClient =
    new DefaultPositionServiceClient(settings)
}

final class DefaultPositionServiceClient(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext) extends PositionServiceClient {
  import DefaultPositionServiceClient._

  private val options = NettyClientUtils.callOptions(settings)
  private val clientState = new ClientState(settings)

  
    private def getPositionsRequestBuilder(channel:scala.concurrent.Future[ManagedChannel]) = {
      
        val fqName = "helloworld.PositionService.GetPositions"
        
          new ScalaServerStreamingRequestBuilder(getPositionsDescriptor, fqName, channel, options, settings)
        
      
    }
  

  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer getPositions(example.myapp.helloworld.grpc.PositionRequest) if possible.
     */
    
      override def getPositions(): StreamResponseRequestBuilder[example.myapp.helloworld.grpc.PositionRequest, example.myapp.helloworld.grpc.PositionReply] =
        clientState.withChannel(getPositionsRequestBuilder _)
    

    /**
     * For access to method metadata use the parameterless version of getPositions
     */
    def getPositions(in: example.myapp.helloworld.grpc.PositionRequest): akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.PositionReply, akka.NotUsed] =
      getPositions().invoke(in)
  

  override def close(): scala.concurrent.Future[akka.Done] = clientState.close()
  override def closed(): scala.concurrent.Future[akka.Done] = clientState.closed()

}



private object DefaultPositionServiceClient {

  def apply(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext): PositionServiceClient =
    new DefaultPositionServiceClient(settings)

  import PositionService.Serializers._

  
    private val getPositionsDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.PositionRequest, example.myapp.helloworld.grpc.PositionReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
   MethodDescriptor.MethodType.SERVER_STREAMING 
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.PositionService", "GetPositions"))
        .setRequestMarshaller(new Marshaller(PositionRequestSerializer))
        .setResponseMarshaller(new Marshaller(PositionReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
  
}

trait PositionServiceClientPowerApi {
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer getPositions(example.myapp.helloworld.grpc.PositionRequest) if possible.
     */
    
      def getPositions(): StreamResponseRequestBuilder[example.myapp.helloworld.grpc.PositionRequest, example.myapp.helloworld.grpc.PositionReply] = ???
    
  

}
