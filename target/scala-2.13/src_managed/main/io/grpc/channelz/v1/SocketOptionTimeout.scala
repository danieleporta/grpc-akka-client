// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** For use with SocketOption's additional field.  This is primarily used for
  * SO_RCVTIMEO and SO_SNDTIMEO
  */
@SerialVersionUID(0L)
final case class SocketOptionTimeout(
    duration: _root_.scala.Option[com.google.protobuf.duration.Duration] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[SocketOptionTimeout] with scalapb.lenses.Updatable[SocketOptionTimeout] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (duration.isDefined) {
        val __value = duration.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
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
      duration.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.SocketOptionTimeout = {
      var __duration = this.duration
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __duration = Option(_root_.scalapb.LiteParser.readMessage(_input__, __duration.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.SocketOptionTimeout(
          duration = __duration
      )
    }
    def getDuration: com.google.protobuf.duration.Duration = duration.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)
    def clearDuration: SocketOptionTimeout = copy(duration = _root_.scala.None)
    def withDuration(__v: com.google.protobuf.duration.Duration): SocketOptionTimeout = copy(duration = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => duration.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => duration.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.SocketOptionTimeout
}

object SocketOptionTimeout extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.SocketOptionTimeout] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.SocketOptionTimeout] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.SocketOptionTimeout = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.SocketOptionTimeout(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.protobuf.duration.Duration]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.SocketOptionTimeout] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.SocketOptionTimeout(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.duration.Duration]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(17)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(17)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.duration.Duration
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.SocketOptionTimeout(
    duration = _root_.scala.None
  )
  implicit class SocketOptionTimeoutLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.SocketOptionTimeout]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.SocketOptionTimeout](_l) {
    def duration: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration] = field(_.getDuration)((c_, f_) => c_.copy(duration = Option(f_)))
    def optionalDuration: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.duration.Duration]] = field(_.duration)((c_, f_) => c_.copy(duration = f_))
  }
  final val DURATION_FIELD_NUMBER = 1
  def of(
    duration: _root_.scala.Option[com.google.protobuf.duration.Duration]
  ): _root_.io.grpc.channelz.v1.SocketOptionTimeout = _root_.io.grpc.channelz.v1.SocketOptionTimeout(
    duration
  )
}
