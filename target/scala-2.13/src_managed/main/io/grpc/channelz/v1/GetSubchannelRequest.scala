// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** @param subchannelId
  *   subchannel_id is the identifier of the specific subchannel to get.
  */
@SerialVersionUID(0L)
final case class GetSubchannelRequest(
    subchannelId: _root_.scala.Long = 0L
    ) extends scalapb.GeneratedMessage with scalapb.Message[GetSubchannelRequest] with scalapb.lenses.Updatable[GetSubchannelRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = subchannelId
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(1, __value)
        }
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
      {
        val __v = subchannelId
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.GetSubchannelRequest = {
      var __subchannelId = this.subchannelId
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __subchannelId = _input__.readInt64()
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.GetSubchannelRequest(
          subchannelId = __subchannelId
      )
    }
    def withSubchannelId(__v: _root_.scala.Long): GetSubchannelRequest = copy(subchannelId = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = subchannelId
          if (__t != 0L) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(subchannelId)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.GetSubchannelRequest
}

object GetSubchannelRequest extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.GetSubchannelRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.GetSubchannelRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.GetSubchannelRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.GetSubchannelRequest(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[_root_.scala.Long]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.GetSubchannelRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.GetSubchannelRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Long]).getOrElse(0L)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(30)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(30)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.GetSubchannelRequest(
    subchannelId = 0L
  )
  implicit class GetSubchannelRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.GetSubchannelRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.GetSubchannelRequest](_l) {
    def subchannelId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.subchannelId)((c_, f_) => c_.copy(subchannelId = f_))
  }
  final val SUBCHANNEL_ID_FIELD_NUMBER = 1
  def of(
    subchannelId: _root_.scala.Long
  ): _root_.io.grpc.channelz.v1.GetSubchannelRequest = _root_.io.grpc.channelz.v1.GetSubchannelRequest(
    subchannelId
  )
}
