// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** ChannelTrace represents the recent events that have occurred on the channel.
  *
  * @param numEventsLogged
  *   Number of events ever logged in this tracing object. This can differ from
  *   events.size() because events can be overwritten or garbage collected by
  *   implementations.
  * @param creationTimestamp
  *   Time that this channel was created.
  * @param events
  *   List of events that have occurred on this channel.
  */
@SerialVersionUID(0L)
final case class ChannelTrace(
    numEventsLogged: _root_.scala.Long = 0L,
    creationTimestamp: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
    events: _root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ChannelTrace] with scalapb.lenses.Updatable[ChannelTrace] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = numEventsLogged
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(1, __value)
        }
      };
      if (creationTimestamp.isDefined) {
        val __value = creationTimestamp.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      events.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      {
        val __v = numEventsLogged
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
      creationTimestamp.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      events.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.ChannelTrace = {
      var __numEventsLogged = this.numEventsLogged
      var __creationTimestamp = this.creationTimestamp
      val __events = (_root_.scala.collection.immutable.Vector.newBuilder[io.grpc.channelz.v1.ChannelTraceEvent] ++= this.events)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __numEventsLogged = _input__.readInt64()
          case 18 =>
            __creationTimestamp = Option(_root_.scalapb.LiteParser.readMessage(_input__, __creationTimestamp.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)))
          case 26 =>
            __events += _root_.scalapb.LiteParser.readMessage(_input__, io.grpc.channelz.v1.ChannelTraceEvent.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.ChannelTrace(
          numEventsLogged = __numEventsLogged,
          creationTimestamp = __creationTimestamp,
          events = __events.result()
      )
    }
    def withNumEventsLogged(__v: _root_.scala.Long): ChannelTrace = copy(numEventsLogged = __v)
    def getCreationTimestamp: com.google.protobuf.timestamp.Timestamp = creationTimestamp.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearCreationTimestamp: ChannelTrace = copy(creationTimestamp = _root_.scala.None)
    def withCreationTimestamp(__v: com.google.protobuf.timestamp.Timestamp): ChannelTrace = copy(creationTimestamp = Option(__v))
    def clearEvents = copy(events = _root_.scala.Seq.empty)
    def addEvents(__vs: io.grpc.channelz.v1.ChannelTraceEvent*): ChannelTrace = addAllEvents(__vs)
    def addAllEvents(__vs: Iterable[io.grpc.channelz.v1.ChannelTraceEvent]): ChannelTrace = copy(events = events ++ __vs)
    def withEvents(__v: _root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent]): ChannelTrace = copy(events = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = numEventsLogged
          if (__t != 0L) __t else null
        }
        case 2 => creationTimestamp.orNull
        case 3 => events
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(numEventsLogged)
        case 2 => creationTimestamp.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(events.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.ChannelTrace
}

object ChannelTrace extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.ChannelTrace] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.ChannelTrace] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.ChannelTrace = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.ChannelTrace(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.ChannelTrace] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.ChannelTrace(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.timestamp.Timestamp
      case 3 => __out = io.grpc.channelz.v1.ChannelTraceEvent
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.ChannelTrace(
    numEventsLogged = 0L,
    creationTimestamp = _root_.scala.None,
    events = _root_.scala.Seq.empty
  )
  implicit class ChannelTraceLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.ChannelTrace]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.ChannelTrace](_l) {
    def numEventsLogged: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.numEventsLogged)((c_, f_) => c_.copy(numEventsLogged = f_))
    def creationTimestamp: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getCreationTimestamp)((c_, f_) => c_.copy(creationTimestamp = Option(f_)))
    def optionalCreationTimestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.creationTimestamp)((c_, f_) => c_.copy(creationTimestamp = f_))
    def events: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent]] = field(_.events)((c_, f_) => c_.copy(events = f_))
  }
  final val NUM_EVENTS_LOGGED_FIELD_NUMBER = 1
  final val CREATION_TIMESTAMP_FIELD_NUMBER = 2
  final val EVENTS_FIELD_NUMBER = 3
  def of(
    numEventsLogged: _root_.scala.Long,
    creationTimestamp: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
    events: _root_.scala.Seq[io.grpc.channelz.v1.ChannelTraceEvent]
  ): _root_.io.grpc.channelz.v1.ChannelTrace = _root_.io.grpc.channelz.v1.ChannelTrace(
    numEventsLogged,
    creationTimestamp,
    events
  )
}