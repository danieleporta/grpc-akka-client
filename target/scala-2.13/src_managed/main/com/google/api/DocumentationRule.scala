// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** A documentation rule provides information about individual API elements.
  *
  * @param selector
  *   The selector is a comma-separated list of patterns. Each pattern is a
  *   qualified name of the element which may end in "*", indicating a wildcard.
  *   Wildcards are only allowed at the end and for a whole component of the
  *   qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". To
  *   specify a default for all applicable elements, the whole pattern "*"
  *   is used.
  * @param description
  *   Description of the selected API(s).
  * @param deprecationDescription
  *   Deprecation description of the selected element(s). It can be provided if an
  *   element is marked as `deprecated`.
  */
@SerialVersionUID(0L)
final case class DocumentationRule(
    selector: _root_.scala.Predef.String = "",
    description: _root_.scala.Predef.String = "",
    deprecationDescription: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[DocumentationRule] with scalapb.lenses.Updatable[DocumentationRule] {
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
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = deprecationDescription
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = selector
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = description
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = deprecationDescription
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.DocumentationRule = {
      var __selector = this.selector
      var __description = this.description
      var __deprecationDescription = this.deprecationDescription
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __selector = _input__.readString()
          case 18 =>
            __description = _input__.readString()
          case 26 =>
            __deprecationDescription = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.DocumentationRule(
          selector = __selector,
          description = __description,
          deprecationDescription = __deprecationDescription
      )
    }
    def withSelector(__v: _root_.scala.Predef.String): DocumentationRule = copy(selector = __v)
    def withDescription(__v: _root_.scala.Predef.String): DocumentationRule = copy(description = __v)
    def withDeprecationDescription(__v: _root_.scala.Predef.String): DocumentationRule = copy(deprecationDescription = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = selector
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = deprecationDescription
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(selector)
        case 2 => _root_.scalapb.descriptors.PString(description)
        case 3 => _root_.scalapb.descriptors.PString(deprecationDescription)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.DocumentationRule
}

object DocumentationRule extends scalapb.GeneratedMessageCompanion[com.google.api.DocumentationRule] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.DocumentationRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.DocumentationRule = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.DocumentationRule(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.DocumentationRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.DocumentationRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DocumentationProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DocumentationProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.DocumentationRule(
    selector = "",
    description = "",
    deprecationDescription = ""
  )
  implicit class DocumentationRuleLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.DocumentationRule]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.DocumentationRule](_l) {
    def selector: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.selector)((c_, f_) => c_.copy(selector = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def deprecationDescription: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.deprecationDescription)((c_, f_) => c_.copy(deprecationDescription = f_))
  }
  final val SELECTOR_FIELD_NUMBER = 1
  final val DESCRIPTION_FIELD_NUMBER = 2
  final val DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3
  def of(
    selector: _root_.scala.Predef.String,
    description: _root_.scala.Predef.String,
    deprecationDescription: _root_.scala.Predef.String
  ): _root_.com.google.api.DocumentationRule = _root_.com.google.api.DocumentationRule(
    selector,
    description,
    deprecationDescription
  )
}