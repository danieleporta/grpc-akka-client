// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** `QuotaLimit` defines a specific limit that applies over a specified duration
  * for a limit type. There can be at most one limit for a duration and limit
  * type combination defined within a `QuotaGroup`.
  *
  * @param name
  *   Name of the quota limit. The name is used to refer to the limit when
  *   overriding the default limit on per-consumer basis.
  *  
  *   For group-based quota limits, the name must be unique within the quota
  *   group. If a name is not provided, it will be generated from the limit_by
  *   and duration fields.
  *  
  *   For metric-based quota limits, the name must be provided, and it must be
  *   unique within the service. The name can only include alphanumeric
  *   characters as well as '-'.
  *  
  *   The maximum length of the limit name is 64 characters.
  *  
  *   The name of a limit is used as a unique identifier for this limit.
  *   Therefore, once a limit has been put into use, its name should be
  *   immutable. You can use the display_name field to provide a user-friendly
  *   name for the limit. The display name can be evolved over time without
  *   affecting the identity of the limit.
  * @param description
  *   Optional. User-visible, extended description for this quota limit.
  *   Should be used only when more context is needed to understand this limit
  *   than provided by the limit's display name (see: `display_name`).
  * @param defaultLimit
  *   Default number of tokens that can be consumed during the specified
  *   duration. This is the number of tokens assigned when a client
  *   application developer activates the service for his/her project.
  *  
  *   Specifying a value of 0 will block all requests. This can be used if you
  *   are provisioning quota to selected consumers and blocking others.
  *   Similarly, a value of -1 will indicate an unlimited quota. No other
  *   negative values are allowed.
  *  
  *   Used by group-based quotas only.
  * @param maxLimit
  *   Maximum number of tokens that can be consumed during the specified
  *   duration. Client application developers can override the default limit up
  *   to this maximum. If specified, this value cannot be set to a value less
  *   than the default limit. If not specified, it is set to the default limit.
  *  
  *   To allow clients to apply overrides with no upper bound, set this to -1,
  *   indicating unlimited maximum quota.
  *  
  *   Used by group-based quotas only.
  * @param freeTier
  *   Free tier value displayed in the Developers Console for this limit.
  *   The free tier is the number of tokens that will be subtracted from the
  *   billed amount when billing is enabled.
  *   This field can only be set on a limit with duration "1d", in a billable
  *   group; it is invalid on any other limit. If this field is not set, it
  *   defaults to 0, indicating that there is no free tier for this service.
  *  
  *   Used by group-based quotas only.
  * @param duration
  *   Duration of this limit in textual notation. Example: "100s", "24h", "1d".
  *   For duration longer than a day, only multiple of days is supported. We
  *   support only "100s" and "1d" for now. Additional support will be added in
  *   the future. "0" indicates indefinite duration.
  *  
  *   Used by group-based quotas only.
  * @param metric
  *   The name of the metric this quota limit applies to. The quota limits with
  *   the same metric will be checked together during runtime. The metric must be
  *   defined within the service config.
  *  
  *   Used by metric-based quotas only.
  * @param unit
  *   Specify the unit of the quota limit. It uses the same syntax as
  *   [Metric.unit][]. The supported unit kinds are determined by the quota
  *   backend system.
  *  
  *   The [Google Service Control](https://cloud.google.com/service-control)
  *   supports the following unit components:
  *   * One of the time intevals:
  *     * "/min"  for quota every minute.
  *     * "/d"  for quota every 24 hours, starting 00:00 US Pacific Time.
  *     * Otherwise the quota won't be reset by time, such as storage limit.
  *   * One and only one of the granted containers:
  *     * "/{organization}" quota for an organization.
  *     * "/{project}" quota for a project.
  *     * "/{folder}" quota for a folder.
  *     * "/{resource}" quota for a universal resource.
  *   * Zero or more quota segmentation dimension. Not all combos are valid.
  *     * "/{region}" quota for every region. Not to be used with time intervals.
  *     * Otherwise the resources granted on the target is not segmented.
  *     * "/{zone}" quota for every zone. Not to be used with time intervals.
  *     * Otherwise the resources granted on the target is not segmented.
  *     * "/{resource}" quota for a resource associated with a project or org.
  *  
  *   Here are some examples:
  *   * "1/min/{project}" for quota per minute per project.
  *   * "1/min/{user}" for quota per minute per user.
  *   * "1/min/{organization}" for quota per minute per organization.
  *  
  *   Note: the order of unit components is insignificant.
  *   The "1" at the beginning is required to follow the metric unit syntax.
  *  
  *   Used by metric-based quotas only.
  * @param values
  *   Tiered limit values. Also allows for regional or zone overrides for these
  *   values if "/{region}" or "/{zone}" is specified in the unit field.
  *  
  *   Currently supported tiers from low to high:
  *   VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
  *  
  *   To apply different limit values for users according to their tiers, specify
  *   the values for the tiers you want to differentiate. For example:
  *   {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
  *  
  *   The limit value for each tier is optional except for the tier STANDARD.
  *   The limit value for an unspecified tier falls to the value of its next
  *   tier towards tier STANDARD. For the above example, the limit value for tier
  *   STANDARD is 500.
  *  
  *   To apply the same limit value for all users, just specify limit value for
  *   tier STANDARD. For example: {STANDARD:500}.
  *  
  *   To apply a regional overide for a tier, add a map entry with key
  *   "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
  *   override, add a map entry with key "&lt;TIER&gt;/{zone}".
  *   Further, a wildcard can be used at the end of a zone name in order to
  *   specify zone level overrides. For example:
  *   LOW: 10, STANDARD: 50, HIGH: 100,
  *   LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
  *   LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
  *  
  *   The regional overrides tier set for each region must be the same as
  *   the tier set for default limit values. Same rule applies for zone overrides
  *   tier as well.
  *  
  *   Used by metric-based quotas only.
  * @param displayName
  *   User-visible display name for this limit.
  *   Optional. If not set, the UI will provide a default display name based on
  *   the quota configuration. This field can be used to override the default
  *   display name generated from the configuration.
  */
@SerialVersionUID(0L)
final case class QuotaLimit(
    name: _root_.scala.Predef.String = "",
    description: _root_.scala.Predef.String = "",
    defaultLimit: _root_.scala.Long = 0L,
    maxLimit: _root_.scala.Long = 0L,
    freeTier: _root_.scala.Long = 0L,
    duration: _root_.scala.Predef.String = "",
    metric: _root_.scala.Predef.String = "",
    unit: _root_.scala.Predef.String = "",
    values: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Long] = _root_.scala.collection.immutable.Map.empty,
    displayName: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[QuotaLimit] with scalapb.lenses.Updatable[QuotaLimit] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = defaultLimit
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(3, __value)
        }
      };
      
      {
        val __value = maxLimit
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(4, __value)
        }
      };
      
      {
        val __value = freeTier
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(7, __value)
        }
      };
      
      {
        val __value = duration
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = metric
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
        }
      };
      
      {
        val __value = unit
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(9, __value)
        }
      };
      values.foreach { __item =>
        val __value = com.google.api.QuotaLimit._typemapper_values.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = displayName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(12, __value)
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
        val __v = description
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = defaultLimit
        if (__v != 0L) {
          _output__.writeInt64(3, __v)
        }
      };
      {
        val __v = maxLimit
        if (__v != 0L) {
          _output__.writeInt64(4, __v)
        }
      };
      {
        val __v = duration
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = freeTier
        if (__v != 0L) {
          _output__.writeInt64(7, __v)
        }
      };
      {
        val __v = metric
        if (__v != "") {
          _output__.writeString(8, __v)
        }
      };
      {
        val __v = unit
        if (__v != "") {
          _output__.writeString(9, __v)
        }
      };
      values.foreach { __v =>
        val __m = com.google.api.QuotaLimit._typemapper_values.toBase(__v)
        _output__.writeTag(10, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = displayName
        if (__v != "") {
          _output__.writeString(12, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.QuotaLimit = {
      var __name = this.name
      var __description = this.description
      var __defaultLimit = this.defaultLimit
      var __maxLimit = this.maxLimit
      var __freeTier = this.freeTier
      var __duration = this.duration
      var __metric = this.metric
      var __unit = this.unit
      val __values = (_root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Long] ++= this.values)
      var __displayName = this.displayName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 50 =>
            __name = _input__.readString()
          case 18 =>
            __description = _input__.readString()
          case 24 =>
            __defaultLimit = _input__.readInt64()
          case 32 =>
            __maxLimit = _input__.readInt64()
          case 56 =>
            __freeTier = _input__.readInt64()
          case 42 =>
            __duration = _input__.readString()
          case 66 =>
            __metric = _input__.readString()
          case 74 =>
            __unit = _input__.readString()
          case 82 =>
            __values += com.google.api.QuotaLimit._typemapper_values.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.google.api.QuotaLimit.ValuesEntry.defaultInstance))
          case 98 =>
            __displayName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.QuotaLimit(
          name = __name,
          description = __description,
          defaultLimit = __defaultLimit,
          maxLimit = __maxLimit,
          freeTier = __freeTier,
          duration = __duration,
          metric = __metric,
          unit = __unit,
          values = __values.result(),
          displayName = __displayName
      )
    }
    def withName(__v: _root_.scala.Predef.String): QuotaLimit = copy(name = __v)
    def withDescription(__v: _root_.scala.Predef.String): QuotaLimit = copy(description = __v)
    def withDefaultLimit(__v: _root_.scala.Long): QuotaLimit = copy(defaultLimit = __v)
    def withMaxLimit(__v: _root_.scala.Long): QuotaLimit = copy(maxLimit = __v)
    def withFreeTier(__v: _root_.scala.Long): QuotaLimit = copy(freeTier = __v)
    def withDuration(__v: _root_.scala.Predef.String): QuotaLimit = copy(duration = __v)
    def withMetric(__v: _root_.scala.Predef.String): QuotaLimit = copy(metric = __v)
    def withUnit(__v: _root_.scala.Predef.String): QuotaLimit = copy(unit = __v)
    def clearValues = copy(values = _root_.scala.collection.immutable.Map.empty)
    def addValues(__vs: (_root_.scala.Predef.String, _root_.scala.Long)*): QuotaLimit = addAllValues(__vs)
    def addAllValues(__vs: Iterable[(_root_.scala.Predef.String, _root_.scala.Long)]): QuotaLimit = copy(values = values ++ __vs)
    def withValues(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Long]): QuotaLimit = copy(values = __v)
    def withDisplayName(__v: _root_.scala.Predef.String): QuotaLimit = copy(displayName = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 6 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = defaultLimit
          if (__t != 0L) __t else null
        }
        case 4 => {
          val __t = maxLimit
          if (__t != 0L) __t else null
        }
        case 7 => {
          val __t = freeTier
          if (__t != 0L) __t else null
        }
        case 5 => {
          val __t = duration
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = metric
          if (__t != "") __t else null
        }
        case 9 => {
          val __t = unit
          if (__t != "") __t else null
        }
        case 10 => values.iterator.map(com.google.api.QuotaLimit._typemapper_values.toBase).toSeq
        case 12 => {
          val __t = displayName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 6 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(description)
        case 3 => _root_.scalapb.descriptors.PLong(defaultLimit)
        case 4 => _root_.scalapb.descriptors.PLong(maxLimit)
        case 7 => _root_.scalapb.descriptors.PLong(freeTier)
        case 5 => _root_.scalapb.descriptors.PString(duration)
        case 8 => _root_.scalapb.descriptors.PString(metric)
        case 9 => _root_.scalapb.descriptors.PString(unit)
        case 10 => _root_.scalapb.descriptors.PRepeated(values.iterator.map(com.google.api.QuotaLimit._typemapper_values.toBase(_).toPMessage).toVector)
        case 12 => _root_.scalapb.descriptors.PString(displayName)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.QuotaLimit
}

object QuotaLimit extends scalapb.GeneratedMessageCompanion[com.google.api.QuotaLimit] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.QuotaLimit] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.QuotaLimit = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.QuotaLimit(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(3), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(4), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(5), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(6), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(7), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(8), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.QuotaLimit.ValuesEntry]].iterator.map(com.google.api.QuotaLimit._typemapper_values.toCustom).toMap,
      __fieldsMap.getOrElse(__fields.get(9), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.QuotaLimit] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.QuotaLimit(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Seq[com.google.api.QuotaLimit.ValuesEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(com.google.api.QuotaLimit._typemapper_values.toCustom).toMap,
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = QuotaProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = QuotaProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 10 => __out = com.google.api.QuotaLimit.ValuesEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.api.QuotaLimit.ValuesEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.QuotaLimit(
    name = "",
    description = "",
    defaultLimit = 0L,
    maxLimit = 0L,
    freeTier = 0L,
    duration = "",
    metric = "",
    unit = "",
    values = _root_.scala.collection.immutable.Map.empty,
    displayName = ""
  )
  @SerialVersionUID(0L)
  final case class ValuesEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Long = 0L
      ) extends scalapb.GeneratedMessage with scalapb.Message[ValuesEntry] with scalapb.lenses.Updatable[ValuesEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = value
          if (__value != 0L) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(2, __value)
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != 0L) {
            _output__.writeInt64(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.QuotaLimit.ValuesEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 16 =>
              __value = _input__.readInt64()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.api.QuotaLimit.ValuesEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): ValuesEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Long): ValuesEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != 0L) __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PLong(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.api.QuotaLimit.ValuesEntry
  }
  
  object ValuesEntry extends scalapb.GeneratedMessageCompanion[com.google.api.QuotaLimit.ValuesEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.QuotaLimit.ValuesEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.QuotaLimit.ValuesEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.api.QuotaLimit.ValuesEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), 0L).asInstanceOf[_root_.scala.Long]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.QuotaLimit.ValuesEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.api.QuotaLimit.ValuesEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Long]).getOrElse(0L)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.api.QuotaLimit.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.api.QuotaLimit.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.api.QuotaLimit.ValuesEntry(
      key = "",
      value = 0L
    )
    implicit class ValuesEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.QuotaLimit.ValuesEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.QuotaLimit.ValuesEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.google.api.QuotaLimit.ValuesEntry, (_root_.scala.Predef.String, _root_.scala.Long)] =
      _root_.scalapb.TypeMapper[com.google.api.QuotaLimit.ValuesEntry, (_root_.scala.Predef.String, _root_.scala.Long)](__m => (__m.key, __m.value))(__p => com.google.api.QuotaLimit.ValuesEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Long
    ): _root_.com.google.api.QuotaLimit.ValuesEntry = _root_.com.google.api.QuotaLimit.ValuesEntry(
      key,
      value
    )
  }
  
  implicit class QuotaLimitLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.QuotaLimit]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.QuotaLimit](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def defaultLimit: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.defaultLimit)((c_, f_) => c_.copy(defaultLimit = f_))
    def maxLimit: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.maxLimit)((c_, f_) => c_.copy(maxLimit = f_))
    def freeTier: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.freeTier)((c_, f_) => c_.copy(freeTier = f_))
    def duration: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.duration)((c_, f_) => c_.copy(duration = f_))
    def metric: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.metric)((c_, f_) => c_.copy(metric = f_))
    def unit: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.unit)((c_, f_) => c_.copy(unit = f_))
    def values: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Long]] = field(_.values)((c_, f_) => c_.copy(values = f_))
    def displayName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.displayName)((c_, f_) => c_.copy(displayName = f_))
  }
  final val NAME_FIELD_NUMBER = 6
  final val DESCRIPTION_FIELD_NUMBER = 2
  final val DEFAULT_LIMIT_FIELD_NUMBER = 3
  final val MAX_LIMIT_FIELD_NUMBER = 4
  final val FREE_TIER_FIELD_NUMBER = 7
  final val DURATION_FIELD_NUMBER = 5
  final val METRIC_FIELD_NUMBER = 8
  final val UNIT_FIELD_NUMBER = 9
  final val VALUES_FIELD_NUMBER = 10
  final val DISPLAY_NAME_FIELD_NUMBER = 12
  @transient
  private val _typemapper_values: _root_.scalapb.TypeMapper[com.google.api.QuotaLimit.ValuesEntry, (_root_.scala.Predef.String, _root_.scala.Long)] = implicitly[_root_.scalapb.TypeMapper[com.google.api.QuotaLimit.ValuesEntry, (_root_.scala.Predef.String, _root_.scala.Long)]]
  def of(
    name: _root_.scala.Predef.String,
    description: _root_.scala.Predef.String,
    defaultLimit: _root_.scala.Long,
    maxLimit: _root_.scala.Long,
    freeTier: _root_.scala.Long,
    duration: _root_.scala.Predef.String,
    metric: _root_.scala.Predef.String,
    unit: _root_.scala.Predef.String,
    values: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Long],
    displayName: _root_.scala.Predef.String
  ): _root_.com.google.api.QuotaLimit = _root_.com.google.api.QuotaLimit(
    name,
    description,
    defaultLimit,
    maxLimit,
    freeTier,
    duration,
    metric,
    unit,
    values,
    displayName
  )
}
