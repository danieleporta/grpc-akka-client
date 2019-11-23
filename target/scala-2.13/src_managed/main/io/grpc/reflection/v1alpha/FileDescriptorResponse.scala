// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.reflection.v1alpha

/** Serialized FileDescriptorProto messages sent by the server answering
  * a file_by_filename, file_containing_symbol, or file_containing_extension
  * request.
  *
  * @param fileDescriptorProto
  *   Serialized FileDescriptorProto messages. We avoid taking a dependency on
  *   descriptor.proto, which uses proto2 only features, by making them opaque
  *   bytes instead.
  */
@SerialVersionUID(0L)
final case class FileDescriptorResponse(
    fileDescriptorProto: _root_.scala.Seq[_root_.com.google.protobuf.ByteString] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[FileDescriptorResponse] with scalapb.lenses.Updatable[FileDescriptorResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      fileDescriptorProto.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      fileDescriptorProto.foreach { __v =>
        val __m = __v
        _output__.writeBytes(1, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.reflection.v1alpha.FileDescriptorResponse = {
      val __fileDescriptorProto = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.com.google.protobuf.ByteString] ++= this.fileDescriptorProto)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileDescriptorProto += _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.reflection.v1alpha.FileDescriptorResponse(
          fileDescriptorProto = __fileDescriptorProto.result()
      )
    }
    def clearFileDescriptorProto = copy(fileDescriptorProto = _root_.scala.Seq.empty)
    def addFileDescriptorProto(__vs: _root_.com.google.protobuf.ByteString*): FileDescriptorResponse = addAllFileDescriptorProto(__vs)
    def addAllFileDescriptorProto(__vs: Iterable[_root_.com.google.protobuf.ByteString]): FileDescriptorResponse = copy(fileDescriptorProto = fileDescriptorProto ++ __vs)
    def withFileDescriptorProto(__v: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]): FileDescriptorResponse = copy(fileDescriptorProto = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => fileDescriptorProto
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(fileDescriptorProto.iterator.map(_root_.scalapb.descriptors.PByteString).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.reflection.v1alpha.FileDescriptorResponse
}

object FileDescriptorResponse extends scalapb.GeneratedMessageCompanion[io.grpc.reflection.v1alpha.FileDescriptorResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.reflection.v1alpha.FileDescriptorResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.reflection.v1alpha.FileDescriptorResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.reflection.v1alpha.FileDescriptorResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[_root_.com.google.protobuf.ByteString]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.reflection.v1alpha.FileDescriptorResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.reflection.v1alpha.FileDescriptorResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.com.google.protobuf.ByteString]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ReflectionProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ReflectionProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.reflection.v1alpha.FileDescriptorResponse(
    fileDescriptorProto = _root_.scala.Seq.empty
  )
  implicit class FileDescriptorResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.reflection.v1alpha.FileDescriptorResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.reflection.v1alpha.FileDescriptorResponse](_l) {
    def fileDescriptorProto: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.com.google.protobuf.ByteString]] = field(_.fileDescriptorProto)((c_, f_) => c_.copy(fileDescriptorProto = f_))
  }
  final val FILE_DESCRIPTOR_PROTO_FIELD_NUMBER = 1
  def of(
    fileDescriptorProto: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]
  ): _root_.io.grpc.reflection.v1alpha.FileDescriptorResponse = _root_.io.grpc.reflection.v1alpha.FileDescriptorResponse(
    fileDescriptorProto
  )
}