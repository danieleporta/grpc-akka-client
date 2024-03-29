// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.`type`

/** Represents a whole calendar date, e.g. date of birth. The time of day and
  * time zone are either specified elsewhere or are not significant. The date
  * is relative to the Proleptic Gregorian Calendar. The day may be 0 to
  * represent a year and month where the day is not significant, e.g. credit card
  * expiration date. The year may be 0 to represent a month and day independent
  * of year, e.g. anniversary date. Related types are [google.type.TimeOfDay][google.type.TimeOfDay]
  * and `google.protobuf.Timestamp`.
  *
  * @param year
  *   Year of date. Must be from 1 to 9999, or 0 if specifying a date without
  *   a year.
  * @param month
  *   Month of year. Must be from 1 to 12.
  * @param day
  *   Day of month. Must be from 1 to 31 and valid for the year and month, or 0
  *   if specifying a year/month where the day is not significant.
  */
@SerialVersionUID(0L)
final case class Date(
    year: _root_.scala.Int = 0,
    month: _root_.scala.Int = 0,
    day: _root_.scala.Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[Date] with scalapb.lenses.Updatable[Date] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = year
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = month
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = day
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
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
        val __v = year
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = month
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = day
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.`type`.Date = {
      var __year = this.year
      var __month = this.month
      var __day = this.day
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __year = _input__.readInt32()
          case 16 =>
            __month = _input__.readInt32()
          case 24 =>
            __day = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.`type`.Date(
          year = __year,
          month = __month,
          day = __day
      )
    }
    def withYear(__v: _root_.scala.Int): Date = copy(year = __v)
    def withMonth(__v: _root_.scala.Int): Date = copy(month = __v)
    def withDay(__v: _root_.scala.Int): Date = copy(day = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = year
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = month
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = day
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(year)
        case 2 => _root_.scalapb.descriptors.PInt(month)
        case 3 => _root_.scalapb.descriptors.PInt(day)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.`type`.Date
}

object Date extends scalapb.GeneratedMessageCompanion[com.google.`type`.Date] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.`type`.Date] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.`type`.Date = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.`type`.Date(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.`type`.Date] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.`type`.Date(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DateProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DateProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.`type`.Date(
    year = 0,
    month = 0,
    day = 0
  )
  implicit class DateLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.`type`.Date]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.`type`.Date](_l) {
    def year: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.year)((c_, f_) => c_.copy(year = f_))
    def month: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.month)((c_, f_) => c_.copy(month = f_))
    def day: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.day)((c_, f_) => c_.copy(day = f_))
  }
  final val YEAR_FIELD_NUMBER = 1
  final val MONTH_FIELD_NUMBER = 2
  final val DAY_FIELD_NUMBER = 3
  def of(
    year: _root_.scala.Int,
    month: _root_.scala.Int,
    day: _root_.scala.Int
  ): _root_.com.google.`type`.Date = _root_.com.google.`type`.Date(
    year,
    month,
    day
  )
}
