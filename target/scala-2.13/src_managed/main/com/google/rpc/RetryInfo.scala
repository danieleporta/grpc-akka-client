// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.rpc

/** Describes when the clients can retry a failed request. Clients could ignore
  * the recommendation here or retry when this information is missing from error
  * responses.
  *
  * It's always recommended that clients should use exponential backoff when
  * retrying.
  *
  * Clients should wait until `retry_delay` amount of time has passed since
  * receiving the error response before retrying.  If retrying requests also
  * fail, clients should use an exponential backoff scheme to gradually increase
  * the delay between retries based on `retry_delay`, until either a maximum
  * number of retires have been reached or a maximum retry delay cap has been
  * reached.
  *
  * @param retryDelay
  *   Clients should wait at least this long between retrying the same request.
  */
@SerialVersionUID(0L)
final case class RetryInfo(
    retryDelay: _root_.scala.Option[com.google.protobuf.duration.Duration] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[RetryInfo] with scalapb.lenses.Updatable[RetryInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (retryDelay.isDefined) {
        val __value = retryDelay.get
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
      retryDelay.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.rpc.RetryInfo = {
      var __retryDelay = this.retryDelay
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __retryDelay = Option(_root_.scalapb.LiteParser.readMessage(_input__, __retryDelay.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.rpc.RetryInfo(
          retryDelay = __retryDelay
      )
    }
    def getRetryDelay: com.google.protobuf.duration.Duration = retryDelay.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)
    def clearRetryDelay: RetryInfo = copy(retryDelay = _root_.scala.None)
    def withRetryDelay(__v: com.google.protobuf.duration.Duration): RetryInfo = copy(retryDelay = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => retryDelay.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => retryDelay.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.rpc.RetryInfo
}

object RetryInfo extends scalapb.GeneratedMessageCompanion[com.google.rpc.RetryInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.rpc.RetryInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.rpc.RetryInfo = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.rpc.RetryInfo(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.protobuf.duration.Duration]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.rpc.RetryInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.rpc.RetryInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.duration.Duration]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ErrorDetailsProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ErrorDetailsProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.duration.Duration
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.rpc.RetryInfo(
    retryDelay = _root_.scala.None
  )
  implicit class RetryInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.rpc.RetryInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.rpc.RetryInfo](_l) {
    def retryDelay: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration] = field(_.getRetryDelay)((c_, f_) => c_.copy(retryDelay = Option(f_)))
    def optionalRetryDelay: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.duration.Duration]] = field(_.retryDelay)((c_, f_) => c_.copy(retryDelay = f_))
  }
  final val RETRY_DELAY_FIELD_NUMBER = 1
  def of(
    retryDelay: _root_.scala.Option[com.google.protobuf.duration.Duration]
  ): _root_.com.google.rpc.RetryInfo = _root_.com.google.rpc.RetryInfo(
    retryDelay
  )
}
