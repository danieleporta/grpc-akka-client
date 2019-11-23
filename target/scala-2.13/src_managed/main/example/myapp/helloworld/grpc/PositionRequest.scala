// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package example.myapp.helloworld.grpc

@SerialVersionUID(0L)
final case class PositionRequest(
    exchangeUri: _root_.scala.Predef.String = "",
    qcodes: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[PositionRequest] with scalapb.lenses.Updatable[PositionRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = exchangeUri
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = qcodes
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
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
        val __v = exchangeUri
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = qcodes
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): example.myapp.helloworld.grpc.PositionRequest = {
      var __exchangeUri = this.exchangeUri
      var __qcodes = this.qcodes
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __exchangeUri = _input__.readString()
          case 18 =>
            __qcodes = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      example.myapp.helloworld.grpc.PositionRequest(
          exchangeUri = __exchangeUri,
          qcodes = __qcodes
      )
    }
    def withExchangeUri(__v: _root_.scala.Predef.String): PositionRequest = copy(exchangeUri = __v)
    def withQcodes(__v: _root_.scala.Predef.String): PositionRequest = copy(qcodes = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = exchangeUri
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = qcodes
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(exchangeUri)
        case 2 => _root_.scalapb.descriptors.PString(qcodes)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = example.myapp.helloworld.grpc.PositionRequest
}

object PositionRequest extends scalapb.GeneratedMessageCompanion[example.myapp.helloworld.grpc.PositionRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[example.myapp.helloworld.grpc.PositionRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): example.myapp.helloworld.grpc.PositionRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    example.myapp.helloworld.grpc.PositionRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[example.myapp.helloworld.grpc.PositionRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      example.myapp.helloworld.grpc.PositionRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HelloworldProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloworldProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = example.myapp.helloworld.grpc.PositionRequest(
    exchangeUri = "",
    qcodes = ""
  )
  implicit class PositionRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, example.myapp.helloworld.grpc.PositionRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, example.myapp.helloworld.grpc.PositionRequest](_l) {
    def exchangeUri: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.exchangeUri)((c_, f_) => c_.copy(exchangeUri = f_))
    def qcodes: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.qcodes)((c_, f_) => c_.copy(qcodes = f_))
  }
  final val EXCHANGEURI_FIELD_NUMBER = 1
  final val QCODES_FIELD_NUMBER = 2
  def of(
    exchangeUri: _root_.scala.Predef.String,
    qcodes: _root_.scala.Predef.String
  ): _root_.example.myapp.helloworld.grpc.PositionRequest = _root_.example.myapp.helloworld.grpc.PositionRequest(
    exchangeUri,
    qcodes
  )
}
