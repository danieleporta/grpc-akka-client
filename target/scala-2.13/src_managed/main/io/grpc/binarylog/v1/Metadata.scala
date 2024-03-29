// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.binarylog.v1

/** A list of metadata pairs, used in the payload of client header,
  * server header, and server trailer.
  * Implementations may omit some entries to honor the header limits
  * of GRPC_BINARY_LOG_CONFIG.
  *
  * Header keys added by gRPC are omitted. To be more specific,
  * implementations will not log the following entries, and this is
  * not to be treated as a truncation:
  * - entries handled by grpc that are not user visible, such as those
  *   that begin with 'grpc-' (with exception of grpc-trace-bin)
  *   or keys like 'lb-token'
  * - transport specific entries, including but not limited to:
  *   ':path', ':authority', 'content-encoding', 'user-agent', 'te', etc
  * - entries added for call credentials
  *
  * Implementations must always log grpc-trace-bin if it is present.
  * Practically speaking it will only be visible on server side because
  * grpc-trace-bin is managed by low level client side mechanisms
  * inaccessible from the application level. On server side, the
  * header is just a normal metadata key.
  * The pair will not count towards the size limit.
  */
@SerialVersionUID(0L)
final case class Metadata(
    entry: _root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Metadata] with scalapb.lenses.Updatable[Metadata] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      entry.foreach { __item =>
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
      entry.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.binarylog.v1.Metadata = {
      val __entry = (_root_.scala.collection.immutable.Vector.newBuilder[io.grpc.binarylog.v1.MetadataEntry] ++= this.entry)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __entry += _root_.scalapb.LiteParser.readMessage(_input__, io.grpc.binarylog.v1.MetadataEntry.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.binarylog.v1.Metadata(
          entry = __entry.result()
      )
    }
    def clearEntry = copy(entry = _root_.scala.Seq.empty)
    def addEntry(__vs: io.grpc.binarylog.v1.MetadataEntry*): Metadata = addAllEntry(__vs)
    def addAllEntry(__vs: Iterable[io.grpc.binarylog.v1.MetadataEntry]): Metadata = copy(entry = entry ++ __vs)
    def withEntry(__v: _root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry]): Metadata = copy(entry = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => entry
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(entry.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.binarylog.v1.Metadata
}

object Metadata extends scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.Metadata] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.Metadata] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.binarylog.v1.Metadata = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.binarylog.v1.Metadata(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.binarylog.v1.Metadata] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.binarylog.v1.Metadata(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BinarylogProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BinarylogProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = io.grpc.binarylog.v1.MetadataEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.binarylog.v1.Metadata(
    entry = _root_.scala.Seq.empty
  )
  implicit class MetadataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Metadata]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.binarylog.v1.Metadata](_l) {
    def entry: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry]] = field(_.entry)((c_, f_) => c_.copy(entry = f_))
  }
  final val ENTRY_FIELD_NUMBER = 1
  def of(
    entry: _root_.scala.Seq[io.grpc.binarylog.v1.MetadataEntry]
  ): _root_.io.grpc.binarylog.v1.Metadata = _root_.io.grpc.binarylog.v1.Metadata(
    entry
  )
}
