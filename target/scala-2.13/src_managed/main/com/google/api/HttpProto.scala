// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

object HttpProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.api.Http,
      com.google.api.HttpRule,
      com.google.api.CustomHttpPattern
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVnb29nbGUvYXBpL2h0dHAucHJvdG8SCmdvb2dsZS5hcGkiqAEKBEh0dHASNgoFcnVsZXMYASADKAsyFC5nb29nbGUuYXBpL
  kh0dHBSdWxlQgriPwcSBXJ1bGVzUgVydWxlcxJoCh9mdWxseV9kZWNvZGVfcmVzZXJ2ZWRfZXhwYW5zaW9uGAIgASgIQiHiPx4SH
  GZ1bGx5RGVjb2RlUmVzZXJ2ZWRFeHBhbnNpb25SHGZ1bGx5RGVjb2RlUmVzZXJ2ZWRFeHBhbnNpb24irQMKCEh0dHBSdWxlEikKC
  HNlbGVjdG9yGAEgASgJQg3iPwoSCHNlbGVjdG9yUghzZWxlY3RvchIcCgNnZXQYAiABKAlCCOI/BRIDZ2V0SABSA2dldBIcCgNwd
  XQYAyABKAlCCOI/BRIDcHV0SABSA3B1dBIfCgRwb3N0GAQgASgJQgniPwYSBHBvc3RIAFIEcG9zdBIlCgZkZWxldGUYBSABKAlCC
  +I/CBIGZGVsZXRlSABSBmRlbGV0ZRIiCgVwYXRjaBgGIAEoCUIK4j8HEgVwYXRjaEgAUgVwYXRjaBJECgZjdXN0b20YCCABKAsyH
  S5nb29nbGUuYXBpLkN1c3RvbUh0dHBQYXR0ZXJuQgviPwgSBmN1c3RvbUgAUgZjdXN0b20SHQoEYm9keRgHIAEoCUIJ4j8GEgRib
  2R5UgRib2R5El4KE2FkZGl0aW9uYWxfYmluZGluZ3MYCyADKAsyFC5nb29nbGUuYXBpLkh0dHBSdWxlQhfiPxQSEmFkZGl0aW9uY
  WxCaW5kaW5nc1ISYWRkaXRpb25hbEJpbmRpbmdzQgkKB3BhdHRlcm4iUQoRQ3VzdG9tSHR0cFBhdHRlcm4SHQoEa2luZBgBIAEoC
  UIJ4j8GEgRraW5kUgRraW5kEh0KBHBhdGgYAiABKAlCCeI/BhIEcGF0aFIEcGF0aEJqCg5jb20uZ29vZ2xlLmFwaUIJSHR0cFByb
  3RvUAFaQWdvb2dsZS5nb2xhbmcub3JnL2dlbnByb3RvL2dvb2dsZWFwaXMvYXBpL2Fubm90YXRpb25zO2Fubm90YXRpb25z+AEBo
  gIER0FQSWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}