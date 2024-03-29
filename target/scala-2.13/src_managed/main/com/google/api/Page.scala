// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Represents a documentation page. A page can contain subpages to represent
  * nested documentation set structure.
  *
  * @param name
  *   The name of the page. It will be used as an identity of the page to
  *   generate URI of the page, text of the link to this page in navigation,
  *   etc. The full page name (start from the root page name to this page
  *   concatenated with `.`) can be used as reference to the page in your
  *   documentation. For example:
  *   &lt;pre&gt;&lt;code&gt;pages:
  *   - name: Tutorial
  *     content: &amp;#40;== include tutorial.md ==&amp;#41;
  *     subpages:
  *     - name: Java
  *       content: &amp;#40;== include tutorial_java.md ==&amp;#41;
  *   &lt;/code&gt;&lt;/pre&gt;
  *   You can reference `Java` page using Markdown reference link syntax:
  *   `[Java][Tutorial.Java]`.
  * @param content
  *   The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
  *   to include content from a Markdown file.
  * @param subpages
  *   Subpages of this page. The order of subpages specified here will be
  *   honored in the generated docset.
  */
@SerialVersionUID(0L)
final case class Page(
    name: _root_.scala.Predef.String = "",
    content: _root_.scala.Predef.String = "",
    subpages: _root_.scala.Seq[com.google.api.Page] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Page] with scalapb.lenses.Updatable[Page] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = content
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      subpages.foreach { __item =>
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = content
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      subpages.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Page = {
      var __name = this.name
      var __content = this.content
      val __subpages = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Page] ++= this.subpages)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __content = _input__.readString()
          case 26 =>
            __subpages += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Page.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.Page(
          name = __name,
          content = __content,
          subpages = __subpages.result()
      )
    }
    def withName(__v: _root_.scala.Predef.String): Page = copy(name = __v)
    def withContent(__v: _root_.scala.Predef.String): Page = copy(content = __v)
    def clearSubpages = copy(subpages = _root_.scala.Seq.empty)
    def addSubpages(__vs: com.google.api.Page*): Page = addAllSubpages(__vs)
    def addAllSubpages(__vs: Iterable[com.google.api.Page]): Page = copy(subpages = subpages ++ __vs)
    def withSubpages(__v: _root_.scala.Seq[com.google.api.Page]): Page = copy(subpages = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = content
          if (__t != "") __t else null
        }
        case 3 => subpages
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(content)
        case 3 => _root_.scalapb.descriptors.PRepeated(subpages.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.Page
}

object Page extends scalapb.GeneratedMessageCompanion[com.google.api.Page] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Page] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Page = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.Page(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Page]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Page] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.Page(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[com.google.api.Page]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DocumentationProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DocumentationProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.api.Page
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.Page(
    name = "",
    content = "",
    subpages = _root_.scala.Seq.empty
  )
  implicit class PageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Page]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Page](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def content: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.content)((c_, f_) => c_.copy(content = f_))
    def subpages: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Page]] = field(_.subpages)((c_, f_) => c_.copy(subpages = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val CONTENT_FIELD_NUMBER = 2
  final val SUBPAGES_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Predef.String,
    content: _root_.scala.Predef.String,
    subpages: _root_.scala.Seq[com.google.api.Page]
  ): _root_.com.google.api.Page = _root_.com.google.api.Page(
    name,
    content,
    subpages
  )
}
