// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** A context rule provides information about the context for an individual API
  * element.
  *
  * @param selector
  *   Selects the methods to which this rule applies.
  *  
  *   Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
  * @param requested
  *   A list of full type names of requested contexts.
  * @param provided
  *   A list of full type names of provided contexts.
  */
@SerialVersionUID(0L)
final case class ContextRule(
    selector: _root_.scala.Predef.String = "",
    requested: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    provided: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ContextRule] with scalapb.lenses.Updatable[ContextRule] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = selector
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      requested.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      provided.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = selector
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      requested.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      provided.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.ContextRule = {
      var __selector = this.selector
      val __requested = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.requested)
      val __provided = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.provided)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __selector = _input__.readString()
          case 18 =>
            __requested += _input__.readString()
          case 26 =>
            __provided += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.ContextRule(
          selector = __selector,
          requested = __requested.result(),
          provided = __provided.result()
      )
    }
    def withSelector(__v: _root_.scala.Predef.String): ContextRule = copy(selector = __v)
    def clearRequested = copy(requested = _root_.scala.Seq.empty)
    def addRequested(__vs: _root_.scala.Predef.String*): ContextRule = addAllRequested(__vs)
    def addAllRequested(__vs: Iterable[_root_.scala.Predef.String]): ContextRule = copy(requested = requested ++ __vs)
    def withRequested(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ContextRule = copy(requested = __v)
    def clearProvided = copy(provided = _root_.scala.Seq.empty)
    def addProvided(__vs: _root_.scala.Predef.String*): ContextRule = addAllProvided(__vs)
    def addAllProvided(__vs: Iterable[_root_.scala.Predef.String]): ContextRule = copy(provided = provided ++ __vs)
    def withProvided(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ContextRule = copy(provided = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = selector
          if (__t != "") __t else null
        }
        case 2 => requested
        case 3 => provided
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(selector)
        case 2 => _root_.scalapb.descriptors.PRepeated(requested.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(provided.iterator.map(_root_.scalapb.descriptors.PString).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.ContextRule
}

object ContextRule extends scalapb.GeneratedMessageCompanion[com.google.api.ContextRule] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.ContextRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.ContextRule = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.ContextRule(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.ContextRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.ContextRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ContextProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ContextProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.ContextRule(
    selector = "",
    requested = _root_.scala.Seq.empty,
    provided = _root_.scala.Seq.empty
  )
  implicit class ContextRuleLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.ContextRule]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.ContextRule](_l) {
    def selector: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.selector)((c_, f_) => c_.copy(selector = f_))
    def requested: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.requested)((c_, f_) => c_.copy(requested = f_))
    def provided: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.provided)((c_, f_) => c_.copy(provided = f_))
  }
  final val SELECTOR_FIELD_NUMBER = 1
  final val REQUESTED_FIELD_NUMBER = 2
  final val PROVIDED_FIELD_NUMBER = 3
  def of(
    selector: _root_.scala.Predef.String,
    requested: _root_.scala.Seq[_root_.scala.Predef.String],
    provided: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.com.google.api.ContextRule = _root_.com.google.api.ContextRule(
    selector,
    requested,
    provided
  )
}
