// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

object QuotaProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.api.AnnotationsProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.api.Quota,
      com.google.api.MetricRule,
      com.google.api.QuotaLimit
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChZnb29nbGUvYXBpL3F1b3RhLnByb3RvEgpnb29nbGUuYXBpGhxnb29nbGUvYXBpL2Fubm90YXRpb25zLnByb3RvIpEBCgVRd
  W90YRI7CgZsaW1pdHMYAyADKAsyFi5nb29nbGUuYXBpLlF1b3RhTGltaXRCC+I/CBIGbGltaXRzUgZsaW1pdHMSSwoMbWV0cmljX
  3J1bGVzGAQgAygLMhYuZ29vZ2xlLmFwaS5NZXRyaWNSdWxlQhDiPw0SC21ldHJpY1J1bGVzUgttZXRyaWNSdWxlcyLrAQoKTWV0c
  mljUnVsZRIpCghzZWxlY3RvchgBIAEoCUIN4j8KEghzZWxlY3RvclIIc2VsZWN0b3ISXAoMbWV0cmljX2Nvc3RzGAIgAygLMicuZ
  29vZ2xlLmFwaS5NZXRyaWNSdWxlLk1ldHJpY0Nvc3RzRW50cnlCEOI/DRILbWV0cmljQ29zdHNSC21ldHJpY0Nvc3RzGlQKEE1ld
  HJpY0Nvc3RzRW50cnkSGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5EiAKBXZhbHVlGAIgASgDQgriPwcSBXZhbHVlUgV2YWx1Z
  ToCOAEirQQKClF1b3RhTGltaXQSHQoEbmFtZRgGIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEjIKC2Rlc2NyaXB0aW9uGAIgASgJQhDiP
  w0SC2Rlc2NyaXB0aW9uUgtkZXNjcmlwdGlvbhI2Cg1kZWZhdWx0X2xpbWl0GAMgASgDQhHiPw4SDGRlZmF1bHRMaW1pdFIMZGVmY
  XVsdExpbWl0EioKCW1heF9saW1pdBgEIAEoA0IN4j8KEghtYXhMaW1pdFIIbWF4TGltaXQSKgoJZnJlZV90aWVyGAcgASgDQg3iP
  woSCGZyZWVUaWVyUghmcmVlVGllchIpCghkdXJhdGlvbhgFIAEoCUIN4j8KEghkdXJhdGlvblIIZHVyYXRpb24SIwoGbWV0cmljG
  AggASgJQgviPwgSBm1ldHJpY1IGbWV0cmljEh0KBHVuaXQYCSABKAlCCeI/BhIEdW5pdFIEdW5pdBJHCgZ2YWx1ZXMYCiADKAsyI
  i5nb29nbGUuYXBpLlF1b3RhTGltaXQuVmFsdWVzRW50cnlCC+I/CBIGdmFsdWVzUgZ2YWx1ZXMSMwoMZGlzcGxheV9uYW1lGAwgA
  SgJQhDiPw0SC2Rpc3BsYXlOYW1lUgtkaXNwbGF5TmFtZRpPCgtWYWx1ZXNFbnRyeRIaCgNrZXkYASABKAlCCOI/BRIDa2V5UgNrZ
  XkSIAoFdmFsdWUYAiABKANCCuI/BxIFdmFsdWVSBXZhbHVlOgI4AUJsCg5jb20uZ29vZ2xlLmFwaUIKUXVvdGFQcm90b1ABWkVnb
  29nbGUuZ29sYW5nLm9yZy9nZW5wcm90by9nb29nbGVhcGlzL2FwaS9zZXJ2aWNlY29uZmlnO3NlcnZpY2Vjb25maWeiAgRHQVBJY
  gZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.api.AnnotationsProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}