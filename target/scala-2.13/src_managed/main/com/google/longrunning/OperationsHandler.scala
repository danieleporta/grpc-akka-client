
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.longrunning

import scala.concurrent.ExecutionContext

import akka.grpc.scaladsl.{ GrpcExceptionHandler, GrpcMarshalling }
import akka.grpc.Codecs

import akka.http.scaladsl.model.{ HttpRequest, HttpResponse, StatusCodes }
import akka.http.scaladsl.model.Uri.Path
import akka.http.scaladsl.model.Uri.Path.Segment
import akka.actor.ActorSystem
import akka.stream.Materializer




  object OperationsHandler {
    private val notFound = scala.concurrent.Future.successful(HttpResponse(StatusCodes.NotFound))

    /**
     * Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
     * for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.
     *
     * Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `OperationsHandler.partial` when combining
     * several services.
     */
    def apply(implementation: Operations)(implicit mat: Materializer, system: ActorSystem): HttpRequest => scala.concurrent.Future[HttpResponse] =
      partial(implementation).orElse { case _ => notFound }

    /**
     * Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
     * for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.
     *
     * Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `OperationsHandler.partial` when combining
     * several services.
     */
    def apply(implementation: Operations, eHandler: ActorSystem => PartialFunction[Throwable, io.grpc.Status])(implicit mat: Materializer, system: ActorSystem): HttpRequest => scala.concurrent.Future[HttpResponse] =
      partial(implementation, Operations.name, eHandler).orElse { case _ => notFound }

    /**
     * Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
     * for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.
     *
     * Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `OperationsHandler.partial` when combining
     * several services.
     *
     * Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
     */
    def apply(implementation: Operations, prefix: String)(implicit mat: Materializer, system: ActorSystem): HttpRequest => scala.concurrent.Future[HttpResponse] =
      partial(implementation, prefix).orElse { case _ => notFound }

    /**
     * Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
     * for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.
     *
     * Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `OperationsHandler.partial` when combining
     * several services.
     *
     * Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
     */
    def apply(implementation: Operations, prefix: String, eHandler: ActorSystem => PartialFunction[Throwable, io.grpc.Status])(implicit mat: Materializer, system: ActorSystem): HttpRequest => scala.concurrent.Future[HttpResponse] =
      partial(implementation, prefix, eHandler).orElse { case _ => notFound }

    /**
     * Creates a partial `HttpRequest` to `HttpResponse` handler that can be combined with handlers of other
     * services with `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` and then used in for example
     * `Http().bindAndHandleAsync`.
     *
     * Use `OperationsHandler.apply` if the server is only handling one service.
     *
     * Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
     */
    def partial(implementation: Operations, prefix: String = Operations.name, eHandler: ActorSystem => PartialFunction[Throwable, io.grpc.Status] = GrpcExceptionHandler.defaultMapper)(implicit mat: Materializer, system: ActorSystem): PartialFunction[HttpRequest, scala.concurrent.Future[HttpResponse]] = {
      implicit val ec: ExecutionContext = mat.executionContext
      import Operations.Serializers._

      def handle(request: HttpRequest, method: String): scala.concurrent.Future[HttpResponse] = method match {
        
        case "ListOperations" =>
          val responseCodec = Codecs.negotiate(request)
          
          GrpcMarshalling.unmarshal(request)(ListOperationsRequestSerializer, mat)
            .flatMap(implementation.listOperations(_))
            .map(e => GrpcMarshalling.marshal(e, eHandler)(ListOperationsResponseSerializer, mat, responseCodec, system))
        
        case "GetOperation" =>
          val responseCodec = Codecs.negotiate(request)
          
          GrpcMarshalling.unmarshal(request)(GetOperationRequestSerializer, mat)
            .flatMap(implementation.getOperation(_))
            .map(e => GrpcMarshalling.marshal(e, eHandler)(OperationSerializer, mat, responseCodec, system))
        
        case "DeleteOperation" =>
          val responseCodec = Codecs.negotiate(request)
          
          GrpcMarshalling.unmarshal(request)(DeleteOperationRequestSerializer, mat)
            .flatMap(implementation.deleteOperation(_))
            .map(e => GrpcMarshalling.marshal(e, eHandler)(EmptySerializer, mat, responseCodec, system))
        
        case "CancelOperation" =>
          val responseCodec = Codecs.negotiate(request)
          
          GrpcMarshalling.unmarshal(request)(CancelOperationRequestSerializer, mat)
            .flatMap(implementation.cancelOperation(_))
            .map(e => GrpcMarshalling.marshal(e, eHandler)(EmptySerializer, mat, responseCodec, system))
        
        case m => scala.concurrent.Future.failed(new NotImplementedError(s"Not implemented: $m"))
      }

      Function.unlift((req: HttpRequest) => req.uri.path match {
        case Path.Slash(Segment(`prefix`, Path.Slash(Segment(method, Path.Empty)))) ⇒
          Some(handle(req, method).recoverWith(GrpcExceptionHandler.default(eHandler(system))))
        case _ =>
          None
      })
    }
  }

