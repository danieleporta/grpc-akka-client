
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.longrunning

import scala.concurrent.ExecutionContext

import io.grpc.ManagedChannel
import io.grpc.MethodDescriptor

import akka.grpc.GrpcClientSettings

import akka.grpc.scaladsl.AkkaGrpcClient

import akka.grpc.internal.Marshaller
import akka.grpc.internal.NettyClientUtils
import akka.grpc.internal.ClientState

import akka.stream.Materializer

import akka.grpc.scaladsl.SingleResponseRequestBuilder
import akka.grpc.internal.ScalaUnaryRequestBuilder

// Not sealed so users can extend to write their stubs
trait OperationsClient extends Operations with OperationsClientPowerApi with AkkaGrpcClient

object OperationsClient {
  def apply(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext): OperationsClient =
    new DefaultOperationsClient(settings)
}

final class DefaultOperationsClient(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext) extends OperationsClient {
  import DefaultOperationsClient._

  private val options = NettyClientUtils.callOptions(settings)
  private val clientState = new ClientState(settings)

  
    private def listOperationsRequestBuilder(channel:scala.concurrent.Future[ManagedChannel]) = {
      
        new ScalaUnaryRequestBuilder(listOperationsDescriptor, channel, options, settings)
      
    }
  
    private def getOperationRequestBuilder(channel:scala.concurrent.Future[ManagedChannel]) = {
      
        new ScalaUnaryRequestBuilder(getOperationDescriptor, channel, options, settings)
      
    }
  
    private def deleteOperationRequestBuilder(channel:scala.concurrent.Future[ManagedChannel]) = {
      
        new ScalaUnaryRequestBuilder(deleteOperationDescriptor, channel, options, settings)
      
    }
  
    private def cancelOperationRequestBuilder(channel:scala.concurrent.Future[ManagedChannel]) = {
      
        new ScalaUnaryRequestBuilder(cancelOperationDescriptor, channel, options, settings)
      
    }
  

  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer listOperations(com.google.longrunning.ListOperationsRequest) if possible.
     */
    
      override def listOperations(): SingleResponseRequestBuilder[com.google.longrunning.ListOperationsRequest, com.google.longrunning.ListOperationsResponse] =
        clientState.withChannel(listOperationsRequestBuilder _)
    

    /**
     * For access to method metadata use the parameterless version of listOperations
     */
    def listOperations(in: com.google.longrunning.ListOperationsRequest): scala.concurrent.Future[com.google.longrunning.ListOperationsResponse] =
      listOperations().invoke(in)
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer getOperation(com.google.longrunning.GetOperationRequest) if possible.
     */
    
      override def getOperation(): SingleResponseRequestBuilder[com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation] =
        clientState.withChannel(getOperationRequestBuilder _)
    

    /**
     * For access to method metadata use the parameterless version of getOperation
     */
    def getOperation(in: com.google.longrunning.GetOperationRequest): scala.concurrent.Future[com.google.longrunning.Operation] =
      getOperation().invoke(in)
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer deleteOperation(com.google.longrunning.DeleteOperationRequest) if possible.
     */
    
      override def deleteOperation(): SingleResponseRequestBuilder[com.google.longrunning.DeleteOperationRequest, com.google.protobuf.empty.Empty] =
        clientState.withChannel(deleteOperationRequestBuilder _)
    

    /**
     * For access to method metadata use the parameterless version of deleteOperation
     */
    def deleteOperation(in: com.google.longrunning.DeleteOperationRequest): scala.concurrent.Future[com.google.protobuf.empty.Empty] =
      deleteOperation().invoke(in)
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer cancelOperation(com.google.longrunning.CancelOperationRequest) if possible.
     */
    
      override def cancelOperation(): SingleResponseRequestBuilder[com.google.longrunning.CancelOperationRequest, com.google.protobuf.empty.Empty] =
        clientState.withChannel(cancelOperationRequestBuilder _)
    

    /**
     * For access to method metadata use the parameterless version of cancelOperation
     */
    def cancelOperation(in: com.google.longrunning.CancelOperationRequest): scala.concurrent.Future[com.google.protobuf.empty.Empty] =
      cancelOperation().invoke(in)
  

  override def close(): scala.concurrent.Future[akka.Done] = clientState.close()
  override def closed(): scala.concurrent.Future[akka.Done] = clientState.closed()

}



private object DefaultOperationsClient {

  def apply(settings: GrpcClientSettings)(implicit mat: Materializer, ex: ExecutionContext): OperationsClient =
    new DefaultOperationsClient(settings)

  import Operations.Serializers._

  
    private val listOperationsDescriptor: MethodDescriptor[com.google.longrunning.ListOperationsRequest, com.google.longrunning.ListOperationsResponse] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("google.longrunning.Operations", "ListOperations"))
        .setRequestMarshaller(new Marshaller(ListOperationsRequestSerializer))
        .setResponseMarshaller(new Marshaller(ListOperationsResponseSerializer))
        .setSampledToLocalTracing(true)
        .build()
  
    private val getOperationDescriptor: MethodDescriptor[com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("google.longrunning.Operations", "GetOperation"))
        .setRequestMarshaller(new Marshaller(GetOperationRequestSerializer))
        .setResponseMarshaller(new Marshaller(OperationSerializer))
        .setSampledToLocalTracing(true)
        .build()
  
    private val deleteOperationDescriptor: MethodDescriptor[com.google.longrunning.DeleteOperationRequest, com.google.protobuf.empty.Empty] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("google.longrunning.Operations", "DeleteOperation"))
        .setRequestMarshaller(new Marshaller(DeleteOperationRequestSerializer))
        .setResponseMarshaller(new Marshaller(EmptySerializer))
        .setSampledToLocalTracing(true)
        .build()
  
    private val cancelOperationDescriptor: MethodDescriptor[com.google.longrunning.CancelOperationRequest, com.google.protobuf.empty.Empty] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("google.longrunning.Operations", "CancelOperation"))
        .setRequestMarshaller(new Marshaller(CancelOperationRequestSerializer))
        .setResponseMarshaller(new Marshaller(EmptySerializer))
        .setSampledToLocalTracing(true)
        .build()
  
}

trait OperationsClientPowerApi {
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer listOperations(com.google.longrunning.ListOperationsRequest) if possible.
     */
    
      def listOperations(): SingleResponseRequestBuilder[com.google.longrunning.ListOperationsRequest, com.google.longrunning.ListOperationsResponse] = ???
    
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer getOperation(com.google.longrunning.GetOperationRequest) if possible.
     */
    
      def getOperation(): SingleResponseRequestBuilder[com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation] = ???
    
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer deleteOperation(com.google.longrunning.DeleteOperationRequest) if possible.
     */
    
      def deleteOperation(): SingleResponseRequestBuilder[com.google.longrunning.DeleteOperationRequest, com.google.protobuf.empty.Empty] = ???
    
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer cancelOperation(com.google.longrunning.CancelOperationRequest) if possible.
     */
    
      def cancelOperation(): SingleResponseRequestBuilder[com.google.longrunning.CancelOperationRequest, com.google.protobuf.empty.Empty] = ???
    
  

}
