// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

object DescriptorProtoCompanion extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.protobuf.descriptor.FileDescriptorSet,
      com.google.protobuf.descriptor.FileDescriptorProto,
      com.google.protobuf.descriptor.DescriptorProto,
      com.google.protobuf.descriptor.ExtensionRangeOptions,
      com.google.protobuf.descriptor.FieldDescriptorProto,
      com.google.protobuf.descriptor.OneofDescriptorProto,
      com.google.protobuf.descriptor.EnumDescriptorProto,
      com.google.protobuf.descriptor.EnumValueDescriptorProto,
      com.google.protobuf.descriptor.ServiceDescriptorProto,
      com.google.protobuf.descriptor.MethodDescriptorProto,
      com.google.protobuf.descriptor.FileOptions,
      com.google.protobuf.descriptor.MessageOptions,
      com.google.protobuf.descriptor.FieldOptions,
      com.google.protobuf.descriptor.OneofOptions,
      com.google.protobuf.descriptor.EnumOptions,
      com.google.protobuf.descriptor.EnumValueOptions,
      com.google.protobuf.descriptor.ServiceOptions,
      com.google.protobuf.descriptor.MethodOptions,
      com.google.protobuf.descriptor.UninterpretedOption,
      com.google.protobuf.descriptor.SourceCodeInfo,
      com.google.protobuf.descriptor.GeneratedCodeInfo
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiBnb29nbGUvcHJvdG9idWYvZGVzY3JpcHRvci5wcm90bxIPZ29vZ2xlLnByb3RvYnVmIlgKEUZpbGVEZXNjcmlwdG9yU2V0E
  kMKBGZpbGUYASADKAsyJC5nb29nbGUucHJvdG9idWYuRmlsZURlc2NyaXB0b3JQcm90b0IJ4j8GEgRmaWxlUgRmaWxlIqkGChNGa
  WxlRGVzY3JpcHRvclByb3RvEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRImCgdwYWNrYWdlGAIgASgJQgziPwkSB3BhY
  2thZ2VSB3BhY2thZ2USLwoKZGVwZW5kZW5jeRgDIAMoCUIP4j8MEgpkZXBlbmRlbmN5UgpkZXBlbmRlbmN5EkIKEXB1YmxpY19kZ
  XBlbmRlbmN5GAogAygFQhXiPxISEHB1YmxpY0RlcGVuZGVuY3lSEHB1YmxpY0RlcGVuZGVuY3kSPAoPd2Vha19kZXBlbmRlbmN5G
  AsgAygFQhPiPxASDndlYWtEZXBlbmRlbmN5Ug53ZWFrRGVwZW5kZW5jeRJVCgxtZXNzYWdlX3R5cGUYBCADKAsyIC5nb29nbGUuc
  HJvdG9idWYuRGVzY3JpcHRvclByb3RvQhDiPw0SC21lc3NhZ2VUeXBlUgttZXNzYWdlVHlwZRJQCgllbnVtX3R5cGUYBSADKAsyJ
  C5nb29nbGUucHJvdG9idWYuRW51bURlc2NyaXB0b3JQcm90b0IN4j8KEghlbnVtVHlwZVIIZW51bVR5cGUSTwoHc2VydmljZRgGI
  AMoCzInLmdvb2dsZS5wcm90b2J1Zi5TZXJ2aWNlRGVzY3JpcHRvclByb3RvQgziPwkSB3NlcnZpY2VSB3NlcnZpY2USUwoJZXh0Z
  W5zaW9uGAcgAygLMiUuZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvQg7iPwsSCWV4dGVuc2lvblIJZXh0ZW5za
  W9uEkQKB29wdGlvbnMYCCABKAsyHC5nb29nbGUucHJvdG9idWYuRmlsZU9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucxJeC
  hBzb3VyY2VfY29kZV9pbmZvGAkgASgLMh8uZ29vZ2xlLnByb3RvYnVmLlNvdXJjZUNvZGVJbmZvQhPiPxASDnNvdXJjZUNvZGVJb
  mZvUg5zb3VyY2VDb2RlSW5mbxIjCgZzeW50YXgYDCABKAlCC+I/CBIGc3ludGF4UgZzeW50YXgilQgKD0Rlc2NyaXB0b3JQcm90b
  xIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSRwoFZmllbGQYAiADKAsyJS5nb29nbGUucHJvdG9idWYuRmllbGREZXNjc
  mlwdG9yUHJvdG9CCuI/BxIFZmllbGRSBWZpZWxkElMKCWV4dGVuc2lvbhgGIAMoCzIlLmdvb2dsZS5wcm90b2J1Zi5GaWVsZERlc
  2NyaXB0b3JQcm90b0IO4j8LEglleHRlbnNpb25SCWV4dGVuc2lvbhJSCgtuZXN0ZWRfdHlwZRgDIAMoCzIgLmdvb2dsZS5wcm90b
  2J1Zi5EZXNjcmlwdG9yUHJvdG9CD+I/DBIKbmVzdGVkVHlwZVIKbmVzdGVkVHlwZRJQCgllbnVtX3R5cGUYBCADKAsyJC5nb29nb
  GUucHJvdG9idWYuRW51bURlc2NyaXB0b3JQcm90b0IN4j8KEghlbnVtVHlwZVIIZW51bVR5cGUSbQoPZXh0ZW5zaW9uX3JhbmdlG
  AUgAygLMi8uZ29vZ2xlLnByb3RvYnVmLkRlc2NyaXB0b3JQcm90by5FeHRlbnNpb25SYW5nZUIT4j8QEg5leHRlbnNpb25SYW5nZ
  VIOZXh0ZW5zaW9uUmFuZ2USVAoKb25lb2ZfZGVjbBgIIAMoCzIlLmdvb2dsZS5wcm90b2J1Zi5PbmVvZkRlc2NyaXB0b3JQcm90b
  0IO4j8LEglvbmVvZkRlY2xSCW9uZW9mRGVjbBJHCgdvcHRpb25zGAcgASgLMh8uZ29vZ2xlLnByb3RvYnVmLk1lc3NhZ2VPcHRpb
  25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMSaQoOcmVzZXJ2ZWRfcmFuZ2UYCSADKAsyLi5nb29nbGUucHJvdG9idWYuRGVzY3Jpc
  HRvclByb3RvLlJlc2VydmVkUmFuZ2VCEuI/DxINcmVzZXJ2ZWRSYW5nZVINcmVzZXJ2ZWRSYW5nZRI2Cg1yZXNlcnZlZF9uYW1lG
  AogAygJQhHiPw4SDHJlc2VydmVkTmFtZVIMcmVzZXJ2ZWROYW1lGp4BCg5FeHRlbnNpb25SYW5nZRIgCgVzdGFydBgBIAEoBUIK4
  j8HEgVzdGFydFIFc3RhcnQSGgoDZW5kGAIgASgFQgjiPwUSA2VuZFIDZW5kEk4KB29wdGlvbnMYAyABKAsyJi5nb29nbGUucHJvd
  G9idWYuRXh0ZW5zaW9uUmFuZ2VPcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMaTQoNUmVzZXJ2ZWRSYW5nZRIgCgVzdGFyd
  BgBIAEoBUIK4j8HEgVzdGFydFIFc3RhcnQSGgoDZW5kGAIgASgFQgjiPwUSA2VuZFIDZW5kIpYBChVFeHRlbnNpb25SYW5nZU9wd
  GlvbnMScgoUdW5pbnRlcnByZXRlZF9vcHRpb24Y5wcgAygLMiQuZ29vZ2xlLnByb3RvYnVmLlVuaW50ZXJwcmV0ZWRPcHRpb25CG
  OI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITdW5pbnRlcnByZXRlZE9wdGlvbioJCOgHEICAgIACIqYHChRGaWVsZERlc2NyaXB0b
  3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSIwoGbnVtYmVyGAMgASgFQgviPwgSBm51bWJlclIGbnVtYmVyE
  k0KBWxhYmVsGAQgASgOMisuZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvLkxhYmVsQgriPwcSBWxhYmVsUgVsY
  WJlbBJJCgR0eXBlGAUgASgOMiouZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvLlR5cGVCCeI/BhIEdHlwZVIEd
  HlwZRIqCgl0eXBlX25hbWUYBiABKAlCDeI/ChIIdHlwZU5hbWVSCHR5cGVOYW1lEikKCGV4dGVuZGVlGAIgASgJQg3iPwoSCGV4d
  GVuZGVlUghleHRlbmRlZRI2Cg1kZWZhdWx0X3ZhbHVlGAcgASgJQhHiPw4SDGRlZmF1bHRWYWx1ZVIMZGVmYXVsdFZhbHVlEjAKC
  29uZW9mX2luZGV4GAkgASgFQg/iPwwSCm9uZW9mSW5kZXhSCm9uZW9mSW5kZXgSKgoJanNvbl9uYW1lGAogASgJQg3iPwoSCGpzb
  25OYW1lUghqc29uTmFtZRJFCgdvcHRpb25zGAggASgLMh0uZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9uc0IM4j8JEgdvcHRpb
  25zUgdvcHRpb25zIrYCCgRUeXBlEg8KC1RZUEVfRE9VQkxFEAESDgoKVFlQRV9GTE9BVBACEg4KClRZUEVfSU5UNjQQAxIPCgtUW
  VBFX1VJTlQ2NBAEEg4KClRZUEVfSU5UMzIQBRIQCgxUWVBFX0ZJWEVENjQQBhIQCgxUWVBFX0ZJWEVEMzIQBxINCglUWVBFX0JPT
  0wQCBIPCgtUWVBFX1NUUklORxAJEg4KClRZUEVfR1JPVVAQChIQCgxUWVBFX01FU1NBR0UQCxIOCgpUWVBFX0JZVEVTEAwSDwoLV
  FlQRV9VSU5UMzIQDRINCglUWVBFX0VOVU0QDhIRCg1UWVBFX1NGSVhFRDMyEA8SEQoNVFlQRV9TRklYRUQ2NBAQEg8KC1RZUEVfU
  0lOVDMyEBESDwoLVFlQRV9TSU5UNjQQEiJDCgVMYWJlbBISCg5MQUJFTF9PUFRJT05BTBABEhIKDkxBQkVMX1JFUVVJUkVEEAISE
  goOTEFCRUxfUkVQRUFURUQQAyJ8ChRPbmVvZkRlc2NyaXB0b3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSR
  QoHb3B0aW9ucxgCIAEoCzIdLmdvb2dsZS5wcm90b2J1Zi5PbmVvZk9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucyLFAwoTR
  W51bURlc2NyaXB0b3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSSwoFdmFsdWUYAiADKAsyKS5nb29nbGUuc
  HJvdG9idWYuRW51bVZhbHVlRGVzY3JpcHRvclByb3RvQgriPwcSBXZhbHVlUgV2YWx1ZRJECgdvcHRpb25zGAMgASgLMhwuZ29vZ
  2xlLnByb3RvYnVmLkVudW1PcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMScQoOcmVzZXJ2ZWRfcmFuZ2UYBCADKAsyNi5nb
  29nbGUucHJvdG9idWYuRW51bURlc2NyaXB0b3JQcm90by5FbnVtUmVzZXJ2ZWRSYW5nZUIS4j8PEg1yZXNlcnZlZFJhbmdlUg1yZ
  XNlcnZlZFJhbmdlEjYKDXJlc2VydmVkX25hbWUYBSADKAlCEeI/DhIMcmVzZXJ2ZWROYW1lUgxyZXNlcnZlZE5hbWUaUQoRRW51b
  VJlc2VydmVkUmFuZ2USIAoFc3RhcnQYASABKAVCCuI/BxIFc3RhcnRSBXN0YXJ0EhoKA2VuZBgCIAEoBUII4j8FEgNlbmRSA2VuZ
  CKpAQoYRW51bVZhbHVlRGVzY3JpcHRvclByb3RvEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRIjCgZudW1iZXIYAiABK
  AVCC+I/CBIGbnVtYmVyUgZudW1iZXISSQoHb3B0aW9ucxgDIAEoCzIhLmdvb2dsZS5wcm90b2J1Zi5FbnVtVmFsdWVPcHRpb25zQ
  gziPwkSB29wdGlvbnNSB29wdGlvbnMizQEKFlNlcnZpY2VEZXNjcmlwdG9yUHJvdG8SHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lU
  gRuYW1lEksKBm1ldGhvZBgCIAMoCzImLmdvb2dsZS5wcm90b2J1Zi5NZXRob2REZXNjcmlwdG9yUHJvdG9CC+I/CBIGbWV0aG9kU
  gZtZXRob2QSRwoHb3B0aW9ucxgDIAEoCzIfLmdvb2dsZS5wcm90b2J1Zi5TZXJ2aWNlT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvc
  HRpb25zIu8CChVNZXRob2REZXNjcmlwdG9yUHJvdG8SHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEi0KCmlucHV0X3R5c
  GUYAiABKAlCDuI/CxIJaW5wdXRUeXBlUglpbnB1dFR5cGUSMAoLb3V0cHV0X3R5cGUYAyABKAlCD+I/DBIKb3V0cHV0VHlwZVIKb
  3V0cHV0VHlwZRJGCgdvcHRpb25zGAQgASgLMh4uZ29vZ2xlLnByb3RvYnVmLk1ldGhvZE9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb
  3B0aW9ucxJGChBjbGllbnRfc3RyZWFtaW5nGAUgASgIOgVmYWxzZUIU4j8REg9jbGllbnRTdHJlYW1pbmdSD2NsaWVudFN0cmVhb
  WluZxJGChBzZXJ2ZXJfc3RyZWFtaW5nGAYgASgIOgVmYWxzZUIU4j8REg9zZXJ2ZXJTdHJlYW1pbmdSD3NlcnZlclN0cmVhbWluZ
  yLlDAoLRmlsZU9wdGlvbnMSMwoMamF2YV9wYWNrYWdlGAEgASgJQhDiPw0SC2phdmFQYWNrYWdlUgtqYXZhUGFja2FnZRJJChRqY
  XZhX291dGVyX2NsYXNzbmFtZRgIIAEoCUIX4j8UEhJqYXZhT3V0ZXJDbGFzc25hbWVSEmphdmFPdXRlckNsYXNzbmFtZRJNChNqY
  XZhX211bHRpcGxlX2ZpbGVzGAogASgIOgVmYWxzZUIW4j8TEhFqYXZhTXVsdGlwbGVGaWxlc1IRamF2YU11bHRpcGxlRmlsZXMSY
  godamF2YV9nZW5lcmF0ZV9lcXVhbHNfYW5kX2hhc2gYFCABKAhCIBgB4j8bEhlqYXZhR2VuZXJhdGVFcXVhbHNBbmRIYXNoUhlqY
  XZhR2VuZXJhdGVFcXVhbHNBbmRIYXNoElQKFmphdmFfc3RyaW5nX2NoZWNrX3V0ZjgYGyABKAg6BWZhbHNlQhjiPxUSE2phdmFTd
  HJpbmdDaGVja1V0ZjhSE2phdmFTdHJpbmdDaGVja1V0ZjgSZQoMb3B0aW1pemVfZm9yGAkgASgOMikuZ29vZ2xlLnByb3RvYnVmL
  kZpbGVPcHRpb25zLk9wdGltaXplTW9kZToFU1BFRURCEOI/DRILb3B0aW1pemVGb3JSC29wdGltaXplRm9yEi0KCmdvX3BhY2thZ
  2UYCyABKAlCDuI/CxIJZ29QYWNrYWdlUglnb1BhY2thZ2USTQoTY2NfZ2VuZXJpY19zZXJ2aWNlcxgQIAEoCDoFZmFsc2VCFuI/E
  xIRY2NHZW5lcmljU2VydmljZXNSEWNjR2VuZXJpY1NlcnZpY2VzElMKFWphdmFfZ2VuZXJpY19zZXJ2aWNlcxgRIAEoCDoFZmFsc
  2VCGOI/FRITamF2YUdlbmVyaWNTZXJ2aWNlc1ITamF2YUdlbmVyaWNTZXJ2aWNlcxJNChNweV9nZW5lcmljX3NlcnZpY2VzGBIgA
  SgIOgVmYWxzZUIW4j8TEhFweUdlbmVyaWNTZXJ2aWNlc1IRcHlHZW5lcmljU2VydmljZXMSUAoUcGhwX2dlbmVyaWNfc2VydmljZ
  XMYKiABKAg6BWZhbHNlQhfiPxQSEnBocEdlbmVyaWNTZXJ2aWNlc1IScGhwR2VuZXJpY1NlcnZpY2VzEjYKCmRlcHJlY2F0ZWQYF
  yABKAg6BWZhbHNlQg/iPwwSCmRlcHJlY2F0ZWRSCmRlcHJlY2F0ZWQSRAoQY2NfZW5hYmxlX2FyZW5hcxgfIAEoCDoFZmFsc2VCE
  +I/EBIOY2NFbmFibGVBcmVuYXNSDmNjRW5hYmxlQXJlbmFzEkAKEW9iamNfY2xhc3NfcHJlZml4GCQgASgJQhTiPxESD29iamNDb
  GFzc1ByZWZpeFIPb2JqY0NsYXNzUHJlZml4Ej8KEGNzaGFycF9uYW1lc3BhY2UYJSABKAlCFOI/ERIPY3NoYXJwTmFtZXNwYWNlU
  g9jc2hhcnBOYW1lc3BhY2USMwoMc3dpZnRfcHJlZml4GCcgASgJQhDiPw0SC3N3aWZ0UHJlZml4Ugtzd2lmdFByZWZpeBI9ChBwa
  HBfY2xhc3NfcHJlZml4GCggASgJQhPiPxASDnBocENsYXNzUHJlZml4Ug5waHBDbGFzc1ByZWZpeBI2Cg1waHBfbmFtZXNwYWNlG
  CkgASgJQhHiPw4SDHBocE5hbWVzcGFjZVIMcGhwTmFtZXNwYWNlEk8KFnBocF9tZXRhZGF0YV9uYW1lc3BhY2UYLCABKAlCGeI/F
  hIUcGhwTWV0YWRhdGFOYW1lc3BhY2VSFHBocE1ldGFkYXRhTmFtZXNwYWNlEjMKDHJ1YnlfcGFja2FnZRgtIAEoCUIQ4j8NEgtyd
  WJ5UGFja2FnZVILcnVieVBhY2thZ2UScgoUdW5pbnRlcnByZXRlZF9vcHRpb24Y5wcgAygLMiQuZ29vZ2xlLnByb3RvYnVmLlVua
  W50ZXJwcmV0ZWRPcHRpb25CGOI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITdW5pbnRlcnByZXRlZE9wdGlvbiI6CgxPcHRpbWl6Z
  U1vZGUSCQoFU1BFRUQQARINCglDT0RFX1NJWkUQAhIQCgxMSVRFX1JVTlRJTUUQAyoJCOgHEICAgIACSgQIJhAnIskDCg5NZXNzY
  WdlT3B0aW9ucxJXChdtZXNzYWdlX3NldF93aXJlX2Zvcm1hdBgBIAEoCDoFZmFsc2VCGeI/FhIUbWVzc2FnZVNldFdpcmVGb3JtY
  XRSFG1lc3NhZ2VTZXRXaXJlRm9ybWF0Em8KH25vX3N0YW5kYXJkX2Rlc2NyaXB0b3JfYWNjZXNzb3IYAiABKAg6BWZhbHNlQiHiP
  x4SHG5vU3RhbmRhcmREZXNjcmlwdG9yQWNjZXNzb3JSHG5vU3RhbmRhcmREZXNjcmlwdG9yQWNjZXNzb3ISNgoKZGVwcmVjYXRlZ
  BgDIAEoCDoFZmFsc2VCD+I/DBIKZGVwcmVjYXRlZFIKZGVwcmVjYXRlZBIqCgltYXBfZW50cnkYByABKAhCDeI/ChIIbWFwRW50c
  nlSCG1hcEVudHJ5EnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5VbmludGVycHJldGVkT
  3B0aW9uQhjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24qCQjoBxCAgICAAkoECAgQCUoECAkQC
  iLJBAoMRmllbGRPcHRpb25zEk0KBWN0eXBlGAEgASgOMiMuZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9ucy5DVHlwZToGU1RSS
  U5HQgriPwcSBWN0eXBlUgVjdHlwZRIjCgZwYWNrZWQYAiABKAhCC+I/CBIGcGFja2VkUgZwYWNrZWQSVAoGanN0eXBlGAYgASgOM
  iQuZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9ucy5KU1R5cGU6CUpTX05PUk1BTEIL4j8IEgZqc3R5cGVSBmpzdHlwZRIkCgRsY
  Xp5GAUgASgIOgVmYWxzZUIJ4j8GEgRsYXp5UgRsYXp5EjYKCmRlcHJlY2F0ZWQYAyABKAg6BWZhbHNlQg/iPwwSCmRlcHJlY2F0Z
  WRSCmRlcHJlY2F0ZWQSJAoEd2VhaxgKIAEoCDoFZmFsc2VCCeI/BhIEd2Vha1IEd2VhaxJyChR1bmludGVycHJldGVkX29wdGlvb
  hjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZXRlZE9wdGlvbkIY4j8VEhN1bmludGVycHJldGVkT3B0aW9uUhN1b
  mludGVycHJldGVkT3B0aW9uIi8KBUNUeXBlEgoKBlNUUklORxAAEggKBENPUkQQARIQCgxTVFJJTkdfUElFQ0UQAiI1CgZKU1R5c
  GUSDQoJSlNfTk9STUFMEAASDQoJSlNfU1RSSU5HEAESDQoJSlNfTlVNQkVSEAIqCQjoBxCAgICAAkoECAQQBSKNAQoMT25lb2ZPc
  HRpb25zEnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5VbmludGVycHJldGVkT3B0aW9uQ
  hjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24qCQjoBxCAgICAAiL8AQoLRW51bU9wdGlvbnMSM
  AoLYWxsb3dfYWxpYXMYAiABKAhCD+I/DBIKYWxsb3dBbGlhc1IKYWxsb3dBbGlhcxI2CgpkZXByZWNhdGVkGAMgASgIOgVmYWxzZ
  UIP4j8MEgpkZXByZWNhdGVkUgpkZXByZWNhdGVkEnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b
  2J1Zi5VbmludGVycHJldGVkT3B0aW9uQhjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24qCQjoB
  xCAgICAAkoECAUQBiLJAQoQRW51bVZhbHVlT3B0aW9ucxI2CgpkZXByZWNhdGVkGAEgASgIOgVmYWxzZUIP4j8MEgpkZXByZWNhd
  GVkUgpkZXByZWNhdGVkEnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5VbmludGVycHJld
  GVkT3B0aW9uQhjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24qCQjoBxCAgICAAiLHAQoOU2Vyd
  mljZU9wdGlvbnMSNgoKZGVwcmVjYXRlZBghIAEoCDoFZmFsc2VCD+I/DBIKZGVwcmVjYXRlZFIKZGVwcmVjYXRlZBJyChR1bmlud
  GVycHJldGVkX29wdGlvbhjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZXRlZE9wdGlvbkIY4j8VEhN1bmludGVyc
  HJldGVkT3B0aW9uUhN1bmludGVycHJldGVkT3B0aW9uKgkI6AcQgICAgAIiowMKDU1ldGhvZE9wdGlvbnMSNgoKZGVwcmVjYXRlZ
  BghIAEoCDoFZmFsc2VCD+I/DBIKZGVwcmVjYXRlZFIKZGVwcmVjYXRlZBKIAQoRaWRlbXBvdGVuY3lfbGV2ZWwYIiABKA4yLy5nb
  29nbGUucHJvdG9idWYuTWV0aG9kT3B0aW9ucy5JZGVtcG90ZW5jeUxldmVsOhNJREVNUE9URU5DWV9VTktOT1dOQhXiPxISEGlkZ
  W1wb3RlbmN5TGV2ZWxSEGlkZW1wb3RlbmN5TGV2ZWwScgoUdW5pbnRlcnByZXRlZF9vcHRpb24Y5wcgAygLMiQuZ29vZ2xlLnByb
  3RvYnVmLlVuaW50ZXJwcmV0ZWRPcHRpb25CGOI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITdW5pbnRlcnByZXRlZE9wdGlvbiJQC
  hBJZGVtcG90ZW5jeUxldmVsEhcKE0lERU1QT1RFTkNZX1VOS05PV04QABITCg9OT19TSURFX0VGRkVDVFMQARIOCgpJREVNUE9UR
  U5UEAIqCQjoBxCAgICAAiLDBAoTVW5pbnRlcnByZXRlZE9wdGlvbhJMCgRuYW1lGAIgAygLMi0uZ29vZ2xlLnByb3RvYnVmLlVua
  W50ZXJwcmV0ZWRPcHRpb24uTmFtZVBhcnRCCeI/BhIEbmFtZVIEbmFtZRI/ChBpZGVudGlmaWVyX3ZhbHVlGAMgASgJQhTiPxESD
  2lkZW50aWZpZXJWYWx1ZVIPaWRlbnRpZmllclZhbHVlEkMKEnBvc2l0aXZlX2ludF92YWx1ZRgEIAEoBEIV4j8SEhBwb3NpdGl2Z
  UludFZhbHVlUhBwb3NpdGl2ZUludFZhbHVlEkMKEm5lZ2F0aXZlX2ludF92YWx1ZRgFIAEoA0IV4j8SEhBuZWdhdGl2ZUludFZhb
  HVlUhBuZWdhdGl2ZUludFZhbHVlEjMKDGRvdWJsZV92YWx1ZRgGIAEoAUIQ4j8NEgtkb3VibGVWYWx1ZVILZG91YmxlVmFsdWUSM
  woMc3RyaW5nX3ZhbHVlGAcgASgMQhDiPw0SC3N0cmluZ1ZhbHVlUgtzdHJpbmdWYWx1ZRI8Cg9hZ2dyZWdhdGVfdmFsdWUYCCABK
  AlCE+I/EBIOYWdncmVnYXRlVmFsdWVSDmFnZ3JlZ2F0ZVZhbHVlGmsKCE5hbWVQYXJ0EioKCW5hbWVfcGFydBgBIAIoCUIN4j8KE
  ghuYW1lUGFydFIIbmFtZVBhcnQSMwoMaXNfZXh0ZW5zaW9uGAIgAigIQhDiPw0SC2lzRXh0ZW5zaW9uUgtpc0V4dGVuc2lvbiKTA
  woOU291cmNlQ29kZUluZm8SUwoIbG9jYXRpb24YASADKAsyKC5nb29nbGUucHJvdG9idWYuU291cmNlQ29kZUluZm8uTG9jYXRpb
  25CDeI/ChIIbG9jYXRpb25SCGxvY2F0aW9uGqsCCghMb2NhdGlvbhIfCgRwYXRoGAEgAygFQgsQAeI/BhIEcGF0aFIEcGF0aBIfC
  gRzcGFuGAIgAygFQgsQAeI/BhIEc3BhblIEc3BhbhI/ChBsZWFkaW5nX2NvbW1lbnRzGAMgASgJQhTiPxESD2xlYWRpbmdDb21tZ
  W50c1IPbGVhZGluZ0NvbW1lbnRzEkIKEXRyYWlsaW5nX2NvbW1lbnRzGAQgASgJQhXiPxISEHRyYWlsaW5nQ29tbWVudHNSEHRyY
  WlsaW5nQ29tbWVudHMSWAoZbGVhZGluZ19kZXRhY2hlZF9jb21tZW50cxgGIAMoCUIc4j8ZEhdsZWFkaW5nRGV0YWNoZWRDb21tZ
  W50c1IXbGVhZGluZ0RldGFjaGVkQ29tbWVudHMikwIKEUdlbmVyYXRlZENvZGVJbmZvEl4KCmFubm90YXRpb24YASADKAsyLS5nb
  29nbGUucHJvdG9idWYuR2VuZXJhdGVkQ29kZUluZm8uQW5ub3RhdGlvbkIP4j8MEgphbm5vdGF0aW9uUgphbm5vdGF0aW9uGp0BC
  gpBbm5vdGF0aW9uEh8KBHBhdGgYASADKAVCCxAB4j8GEgRwYXRoUgRwYXRoEjAKC3NvdXJjZV9maWxlGAIgASgJQg/iPwwSCnNvd
  XJjZUZpbGVSCnNvdXJjZUZpbGUSIAoFYmVnaW4YAyABKAVCCuI/BxIFYmVnaW5SBWJlZ2luEhoKA2VuZBgEIAEoBUII4j8FEgNlb
  mRSA2VuZEKPAQoTY29tLmdvb2dsZS5wcm90b2J1ZkIQRGVzY3JpcHRvclByb3Rvc0gBWj5naXRodWIuY29tL2dvbGFuZy9wcm90b
  2J1Zi9wcm90b2MtZ2VuLWdvL2Rlc2NyaXB0b3I7ZGVzY3JpcHRvcvgBAaICA0dQQqoCGkdvb2dsZS5Qcm90b2J1Zi5SZWZsZWN0a
  W9u"""
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