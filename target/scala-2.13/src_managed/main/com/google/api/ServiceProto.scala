// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

object ServiceProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.api.AnnotationsProto,
    com.google.api.AuthProto,
    com.google.api.BackendProto,
    com.google.api.BillingProto,
    com.google.api.ContextProto,
    com.google.api.ControlProto,
    com.google.api.DocumentationProto,
    com.google.api.EndpointProto,
    com.google.api.ExperimentalProto,
    com.google.api.HttpProto,
    com.google.api.LabelProto,
    com.google.api.LogProto,
    com.google.api.LoggingProto,
    com.google.api.MetricProto,
    com.google.api.MonitoredResourceProto,
    com.google.api.MonitoringProto,
    com.google.api.QuotaProto,
    com.google.api.SourceInfoProto,
    com.google.api.SystemParameterProto,
    com.google.api.UsageProto,
    com.google.protobuf.any.AnyProto,
    com.google.protobuf.api.ApiProto,
    com.google.protobuf.`type`.TypeProto,
    com.google.protobuf.wrappers.WrappersProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.api.Service
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Chhnb29nbGUvYXBpL3NlcnZpY2UucHJvdG8SCmdvb2dsZS5hcGkaHGdvb2dsZS9hcGkvYW5ub3RhdGlvbnMucHJvdG8aFWdvb
  2dsZS9hcGkvYXV0aC5wcm90bxoYZ29vZ2xlL2FwaS9iYWNrZW5kLnByb3RvGhhnb29nbGUvYXBpL2JpbGxpbmcucHJvdG8aGGdvb
  2dsZS9hcGkvY29udGV4dC5wcm90bxoYZ29vZ2xlL2FwaS9jb250cm9sLnByb3RvGh5nb29nbGUvYXBpL2RvY3VtZW50YXRpb24uc
  HJvdG8aGWdvb2dsZS9hcGkvZW5kcG9pbnQucHJvdG8aKmdvb2dsZS9hcGkvZXhwZXJpbWVudGFsL2V4cGVyaW1lbnRhbC5wcm90b
  xoVZ29vZ2xlL2FwaS9odHRwLnByb3RvGhZnb29nbGUvYXBpL2xhYmVsLnByb3RvGhRnb29nbGUvYXBpL2xvZy5wcm90bxoYZ29vZ
  2xlL2FwaS9sb2dnaW5nLnByb3RvGhdnb29nbGUvYXBpL21ldHJpYy5wcm90bxojZ29vZ2xlL2FwaS9tb25pdG9yZWRfcmVzb3VyY
  2UucHJvdG8aG2dvb2dsZS9hcGkvbW9uaXRvcmluZy5wcm90bxoWZ29vZ2xlL2FwaS9xdW90YS5wcm90bxocZ29vZ2xlL2FwaS9zb
  3VyY2VfaW5mby5wcm90bxohZ29vZ2xlL2FwaS9zeXN0ZW1fcGFyYW1ldGVyLnByb3RvGhZnb29nbGUvYXBpL3VzYWdlLnByb3RvG
  hlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvGhlnb29nbGUvcHJvdG9idWYvYXBpLnByb3RvGhpnb29nbGUvcHJvdG9idWYvdHlwZ
  S5wcm90bxoeZ29vZ2xlL3Byb3RvYnVmL3dyYXBwZXJzLnByb3RvIqINCgdTZXJ2aWNlElcKDmNvbmZpZ192ZXJzaW9uGBQgASgLM
  hwuZ29vZ2xlLnByb3RvYnVmLlVJbnQzMlZhbHVlQhLiPw8SDWNvbmZpZ1ZlcnNpb25SDWNvbmZpZ1ZlcnNpb24SHQoEbmFtZRgBI
  AEoCUIJ4j8GEgRuYW1lUgRuYW1lEhcKAmlkGCEgASgJQgfiPwQSAmlkUgJpZBIgCgV0aXRsZRgCIAEoCUIK4j8HEgV0aXRsZVIFd
  Gl0bGUSRgoTcHJvZHVjZXJfcHJvamVjdF9pZBgWIAEoCUIW4j8TEhFwcm9kdWNlclByb2plY3RJZFIRcHJvZHVjZXJQcm9qZWN0S
  WQSMwoEYXBpcxgDIAMoCzIULmdvb2dsZS5wcm90b2J1Zi5BcGlCCeI/BhIEYXBpc1IEYXBpcxI3CgV0eXBlcxgEIAMoCzIVLmdvb
  2dsZS5wcm90b2J1Zi5UeXBlQgriPwcSBXR5cGVzUgV0eXBlcxI3CgVlbnVtcxgFIAMoCzIVLmdvb2dsZS5wcm90b2J1Zi5FbnVtQ
  griPwcSBWVudW1zUgVlbnVtcxJTCg1kb2N1bWVudGF0aW9uGAYgASgLMhkuZ29vZ2xlLmFwaS5Eb2N1bWVudGF0aW9uQhLiPw8SD
  WRvY3VtZW50YXRpb25SDWRvY3VtZW50YXRpb24SOwoHYmFja2VuZBgIIAEoCzITLmdvb2dsZS5hcGkuQmFja2VuZEIM4j8JEgdiY
  WNrZW5kUgdiYWNrZW5kEi8KBGh0dHAYCSABKAsyEC5nb29nbGUuYXBpLkh0dHBCCeI/BhIEaHR0cFIEaHR0cBIzCgVxdW90YRgKI
  AEoCzIRLmdvb2dsZS5hcGkuUXVvdGFCCuI/BxIFcXVvdGFSBXF1b3RhElcKDmF1dGhlbnRpY2F0aW9uGAsgASgLMhouZ29vZ2xlL
  mFwaS5BdXRoZW50aWNhdGlvbkIT4j8QEg5hdXRoZW50aWNhdGlvblIOYXV0aGVudGljYXRpb24SOwoHY29udGV4dBgMIAEoCzITL
  mdvb2dsZS5hcGkuQ29udGV4dEIM4j8JEgdjb250ZXh0Ugdjb250ZXh0EjMKBXVzYWdlGA8gASgLMhEuZ29vZ2xlLmFwaS5Vc2FnZ
  UIK4j8HEgV1c2FnZVIFdXNhZ2USQgoJZW5kcG9pbnRzGBIgAygLMhQuZ29vZ2xlLmFwaS5FbmRwb2ludEIO4j8LEgllbmRwb2lud
  HNSCWVuZHBvaW50cxI7Cgdjb250cm9sGBUgASgLMhMuZ29vZ2xlLmFwaS5Db250cm9sQgziPwkSB2NvbnRyb2xSB2NvbnRyb2wSO
  AoEbG9ncxgXIAMoCzIZLmdvb2dsZS5hcGkuTG9nRGVzY3JpcHRvckIJ4j8GEgRsb2dzUgRsb2dzEkQKB21ldHJpY3MYGCADKAsyH
  C5nb29nbGUuYXBpLk1ldHJpY0Rlc2NyaXB0b3JCDOI/CRIHbWV0cmljc1IHbWV0cmljcxJxChNtb25pdG9yZWRfcmVzb3VyY2VzG
  BkgAygLMicuZ29vZ2xlLmFwaS5Nb25pdG9yZWRSZXNvdXJjZURlc2NyaXB0b3JCF+I/FBISbW9uaXRvcmVkUmVzb3VyY2VzUhJtb
  25pdG9yZWRSZXNvdXJjZXMSOwoHYmlsbGluZxgaIAEoCzITLmdvb2dsZS5hcGkuQmlsbGluZ0IM4j8JEgdiaWxsaW5nUgdiaWxsa
  W5nEjsKB2xvZ2dpbmcYGyABKAsyEy5nb29nbGUuYXBpLkxvZ2dpbmdCDOI/CRIHbG9nZ2luZ1IHbG9nZ2luZxJHCgptb25pdG9ya
  W5nGBwgASgLMhYuZ29vZ2xlLmFwaS5Nb25pdG9yaW5nQg/iPwwSCm1vbml0b3JpbmdSCm1vbml0b3JpbmcSYAoRc3lzdGVtX3Bhc
  mFtZXRlcnMYHSABKAsyHC5nb29nbGUuYXBpLlN5c3RlbVBhcmFtZXRlcnNCFeI/EhIQc3lzdGVtUGFyYW1ldGVyc1IQc3lzdGVtU
  GFyYW1ldGVycxJICgtzb3VyY2VfaW5mbxglIAEoCzIWLmdvb2dsZS5hcGkuU291cmNlSW5mb0IP4j8MEgpzb3VyY2VJbmZvUgpzb
  3VyY2VJbmZvEk8KDGV4cGVyaW1lbnRhbBhlIAEoCzIYLmdvb2dsZS5hcGkuRXhwZXJpbWVudGFsQhHiPw4SDGV4cGVyaW1lbnRhb
  FIMZXhwZXJpbWVudGFsQm4KDmNvbS5nb29nbGUuYXBpQgxTZXJ2aWNlUHJvdG9QAVpFZ29vZ2xlLmdvbGFuZy5vcmcvZ2VucHJvd
  G8vZ29vZ2xlYXBpcy9hcGkvc2VydmljZWNvbmZpZztzZXJ2aWNlY29uZmlnogIER0FQSWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.api.AnnotationsProto.javaDescriptor,
      com.google.api.AuthProto.javaDescriptor,
      com.google.api.BackendProto.javaDescriptor,
      com.google.api.BillingProto.javaDescriptor,
      com.google.api.ContextProto.javaDescriptor,
      com.google.api.ControlProto.javaDescriptor,
      com.google.api.DocumentationProto.javaDescriptor,
      com.google.api.EndpointProto.javaDescriptor,
      com.google.api.ExperimentalProto.javaDescriptor,
      com.google.api.HttpProto.javaDescriptor,
      com.google.api.LabelProto.javaDescriptor,
      com.google.api.LogProto.javaDescriptor,
      com.google.api.LoggingProto.javaDescriptor,
      com.google.api.MetricProto.javaDescriptor,
      com.google.api.MonitoredResourceProto.javaDescriptor,
      com.google.api.MonitoringProto.javaDescriptor,
      com.google.api.QuotaProto.javaDescriptor,
      com.google.api.SourceInfoProto.javaDescriptor,
      com.google.api.SystemParameterProto.javaDescriptor,
      com.google.api.UsageProto.javaDescriptor,
      com.google.protobuf.any.AnyProto.javaDescriptor,
      com.google.protobuf.api.ApiProto.javaDescriptor,
      com.google.protobuf.`type`.TypeProto.javaDescriptor,
      com.google.protobuf.wrappers.WrappersProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}