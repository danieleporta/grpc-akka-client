// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** A descriptor for defining project properties for a service. One service may
  * have many consumer projects, and the service may want to behave differently
  * depending on some properties on the project. For example, a project may be
  * associated with a school, or a business, or a government agency, a business
  * type property on the project may affect how a service responds to the client.
  * This descriptor defines which properties are allowed to be set on a project.
  *
  * Example:
  *
  *    project_properties:
  *      properties:
  *      - name: NO_WATERMARK
  *        type: BOOL
  *        description: Allows usage of the API without watermarks.
  *      - name: EXTENDED_TILE_CACHE_PERIOD
  *        type: INT64
  *
  * @param properties
  *   List of per consumer project-specific properties.
  */
@SerialVersionUID(0L)
final case class ProjectProperties(
    properties: _root_.scala.Seq[com.google.api.Property] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ProjectProperties] with scalapb.lenses.Updatable[ProjectProperties] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      properties.foreach { __item =>
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
      properties.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.ProjectProperties = {
      val __properties = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Property] ++= this.properties)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __properties += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Property.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.ProjectProperties(
          properties = __properties.result()
      )
    }
    def clearProperties = copy(properties = _root_.scala.Seq.empty)
    def addProperties(__vs: com.google.api.Property*): ProjectProperties = addAllProperties(__vs)
    def addAllProperties(__vs: Iterable[com.google.api.Property]): ProjectProperties = copy(properties = properties ++ __vs)
    def withProperties(__v: _root_.scala.Seq[com.google.api.Property]): ProjectProperties = copy(properties = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => properties
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(properties.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.ProjectProperties
}

object ProjectProperties extends scalapb.GeneratedMessageCompanion[com.google.api.ProjectProperties] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.ProjectProperties] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.ProjectProperties = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.ProjectProperties(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Property]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.ProjectProperties] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.ProjectProperties(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.api.Property]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ConsumerProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ConsumerProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.api.Property
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.ProjectProperties(
    properties = _root_.scala.Seq.empty
  )
  implicit class ProjectPropertiesLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.ProjectProperties]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.ProjectProperties](_l) {
    def properties: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Property]] = field(_.properties)((c_, f_) => c_.copy(properties = f_))
  }
  final val PROPERTIES_FIELD_NUMBER = 1
  def of(
    properties: _root_.scala.Seq[com.google.api.Property]
  ): _root_.com.google.api.ProjectProperties = _root_.com.google.api.ProjectProperties(
    properties
  )
}
