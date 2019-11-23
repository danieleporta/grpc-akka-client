// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Monitoring configuration of the service.
  *
  * The example below shows how to configure monitored resources and metrics
  * for monitoring. In the example, a monitored resource and two metrics are
  * defined. The `library.googleapis.com/book/returned_count` metric is sent
  * to both producer and consumer projects, whereas the
  * `library.googleapis.com/book/overdue_count` metric is only sent to the
  * consumer project.
  *
  *     monitored_resources:
  *     - type: library.googleapis.com/branch
  *       labels:
  *       - key: /city
  *         description: The city where the library branch is located in.
  *       - key: /name
  *         description: The name of the branch.
  *     metrics:
  *     - name: library.googleapis.com/book/returned_count
  *       metric_kind: DELTA
  *       value_type: INT64
  *       labels:
  *       - key: /customer_id
  *     - name: library.googleapis.com/book/overdue_count
  *       metric_kind: GAUGE
  *       value_type: INT64
  *       labels:
  *       - key: /customer_id
  *     monitoring:
  *       producer_destinations:
  *       - monitored_resource: library.googleapis.com/branch
  *         metrics:
  *         - library.googleapis.com/book/returned_count
  *       consumer_destinations:
  *       - monitored_resource: library.googleapis.com/branch
  *         metrics:
  *         - library.googleapis.com/book/returned_count
  *         - library.googleapis.com/book/overdue_count
  *
  * @param producerDestinations
  *   Monitoring configurations for sending metrics to the producer project.
  *   There can be multiple producer destinations, each one must have a
  *   different monitored resource type. A metric can be used in at most
  *   one producer destination.
  * @param consumerDestinations
  *   Monitoring configurations for sending metrics to the consumer project.
  *   There can be multiple consumer destinations, each one must have a
  *   different monitored resource type. A metric can be used in at most
  *   one consumer destination.
  */
@SerialVersionUID(0L)
final case class Monitoring(
    producerDestinations: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination] = _root_.scala.Seq.empty,
    consumerDestinations: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Monitoring] with scalapb.lenses.Updatable[Monitoring] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      producerDestinations.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      consumerDestinations.foreach { __item =>
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
      producerDestinations.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      consumerDestinations.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Monitoring = {
      val __producerDestinations = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Monitoring.MonitoringDestination] ++= this.producerDestinations)
      val __consumerDestinations = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Monitoring.MonitoringDestination] ++= this.consumerDestinations)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __producerDestinations += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Monitoring.MonitoringDestination.defaultInstance)
          case 18 =>
            __consumerDestinations += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Monitoring.MonitoringDestination.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.Monitoring(
          producerDestinations = __producerDestinations.result(),
          consumerDestinations = __consumerDestinations.result()
      )
    }
    def clearProducerDestinations = copy(producerDestinations = _root_.scala.Seq.empty)
    def addProducerDestinations(__vs: com.google.api.Monitoring.MonitoringDestination*): Monitoring = addAllProducerDestinations(__vs)
    def addAllProducerDestinations(__vs: Iterable[com.google.api.Monitoring.MonitoringDestination]): Monitoring = copy(producerDestinations = producerDestinations ++ __vs)
    def withProducerDestinations(__v: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]): Monitoring = copy(producerDestinations = __v)
    def clearConsumerDestinations = copy(consumerDestinations = _root_.scala.Seq.empty)
    def addConsumerDestinations(__vs: com.google.api.Monitoring.MonitoringDestination*): Monitoring = addAllConsumerDestinations(__vs)
    def addAllConsumerDestinations(__vs: Iterable[com.google.api.Monitoring.MonitoringDestination]): Monitoring = copy(consumerDestinations = consumerDestinations ++ __vs)
    def withConsumerDestinations(__v: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]): Monitoring = copy(consumerDestinations = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => producerDestinations
        case 2 => consumerDestinations
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(producerDestinations.iterator.map(_.toPMessage).toVector)
        case 2 => _root_.scalapb.descriptors.PRepeated(consumerDestinations.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.Monitoring
}

object Monitoring extends scalapb.GeneratedMessageCompanion[com.google.api.Monitoring] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Monitoring] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Monitoring = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.Monitoring(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Monitoring] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.Monitoring(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MonitoringProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MonitoringProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.api.Monitoring.MonitoringDestination
      case 2 => __out = com.google.api.Monitoring.MonitoringDestination
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.api.Monitoring.MonitoringDestination
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.Monitoring(
    producerDestinations = _root_.scala.Seq.empty,
    consumerDestinations = _root_.scala.Seq.empty
  )
  /** Configuration of a specific monitoring destination (the producer project
    * or the consumer project).
    *
    * @param monitoredResource
    *   The monitored resource type. The type must be defined in
    *   [Service.monitored_resources][google.api.Service.monitored_resources] section.
    * @param metrics
    *   Names of the metrics to report to this monitoring destination.
    *   Each name must be defined in [Service.metrics][google.api.Service.metrics] section.
    */
  @SerialVersionUID(0L)
  final case class MonitoringDestination(
      monitoredResource: _root_.scala.Predef.String = "",
      metrics: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
      ) extends scalapb.GeneratedMessage with scalapb.Message[MonitoringDestination] with scalapb.lenses.Updatable[MonitoringDestination] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = monitoredResource
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        metrics.foreach { __item =>
          val __value = __item
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
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
          val __v = monitoredResource
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        metrics.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Monitoring.MonitoringDestination = {
        var __monitoredResource = this.monitoredResource
        val __metrics = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.metrics)
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __monitoredResource = _input__.readString()
            case 18 =>
              __metrics += _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.api.Monitoring.MonitoringDestination(
            monitoredResource = __monitoredResource,
            metrics = __metrics.result()
        )
      }
      def withMonitoredResource(__v: _root_.scala.Predef.String): MonitoringDestination = copy(monitoredResource = __v)
      def clearMetrics = copy(metrics = _root_.scala.Seq.empty)
      def addMetrics(__vs: _root_.scala.Predef.String*): MonitoringDestination = addAllMetrics(__vs)
      def addAllMetrics(__vs: Iterable[_root_.scala.Predef.String]): MonitoringDestination = copy(metrics = metrics ++ __vs)
      def withMetrics(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MonitoringDestination = copy(metrics = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = monitoredResource
            if (__t != "") __t else null
          }
          case 2 => metrics
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(monitoredResource)
          case 2 => _root_.scalapb.descriptors.PRepeated(metrics.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.api.Monitoring.MonitoringDestination
  }
  
  object MonitoringDestination extends scalapb.GeneratedMessageCompanion[com.google.api.Monitoring.MonitoringDestination] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Monitoring.MonitoringDestination] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Monitoring.MonitoringDestination = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.api.Monitoring.MonitoringDestination(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Monitoring.MonitoringDestination] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.api.Monitoring.MonitoringDestination(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.api.Monitoring.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.api.Monitoring.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.api.Monitoring.MonitoringDestination(
      monitoredResource = "",
      metrics = _root_.scala.Seq.empty
    )
    implicit class MonitoringDestinationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Monitoring.MonitoringDestination]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Monitoring.MonitoringDestination](_l) {
      def monitoredResource: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.monitoredResource)((c_, f_) => c_.copy(monitoredResource = f_))
      def metrics: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.metrics)((c_, f_) => c_.copy(metrics = f_))
    }
    final val MONITORED_RESOURCE_FIELD_NUMBER = 1
    final val METRICS_FIELD_NUMBER = 2
    def of(
      monitoredResource: _root_.scala.Predef.String,
      metrics: _root_.scala.Seq[_root_.scala.Predef.String]
    ): _root_.com.google.api.Monitoring.MonitoringDestination = _root_.com.google.api.Monitoring.MonitoringDestination(
      monitoredResource,
      metrics
    )
  }
  
  implicit class MonitoringLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Monitoring]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Monitoring](_l) {
    def producerDestinations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]] = field(_.producerDestinations)((c_, f_) => c_.copy(producerDestinations = f_))
    def consumerDestinations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]] = field(_.consumerDestinations)((c_, f_) => c_.copy(consumerDestinations = f_))
  }
  final val PRODUCER_DESTINATIONS_FIELD_NUMBER = 1
  final val CONSUMER_DESTINATIONS_FIELD_NUMBER = 2
  def of(
    producerDestinations: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination],
    consumerDestinations: _root_.scala.Seq[com.google.api.Monitoring.MonitoringDestination]
  ): _root_.com.google.api.Monitoring = _root_.com.google.api.Monitoring(
    producerDestinations,
    consumerDestinations
  )
}
