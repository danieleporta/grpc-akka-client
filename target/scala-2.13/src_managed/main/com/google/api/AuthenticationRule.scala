// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Authentication rules for the service.
  *
  * By default, if a method has any authentication requirements, every request
  * must include a valid credential matching one of the requirements.
  * It's an error to include more than one kind of credential in a single
  * request.
  *
  * If a method doesn't have any auth requirements, request credentials will be
  * ignored.
  *
  * @param selector
  *   Selects the methods to which this rule applies.
  *  
  *   Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
  * @param oauth
  *   The requirements for OAuth credentials.
  * @param allowWithoutCredential
  *   If true, the service accepts API keys without any other credential.
  * @param requirements
  *   Requirements for additional authentication providers.
  */
@SerialVersionUID(0L)
final case class AuthenticationRule(
    selector: _root_.scala.Predef.String = "",
    oauth: _root_.scala.Option[com.google.api.OAuthRequirements] = _root_.scala.None,
    allowWithoutCredential: _root_.scala.Boolean = false,
    requirements: _root_.scala.Seq[com.google.api.AuthRequirement] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[AuthenticationRule] with scalapb.lenses.Updatable[AuthenticationRule] {
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
      if (oauth.isDefined) {
        val __value = oauth.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = allowWithoutCredential
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
        }
      };
      requirements.foreach { __item =>
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
        val __v = selector
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      oauth.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = allowWithoutCredential
        if (__v != false) {
          _output__.writeBool(5, __v)
        }
      };
      requirements.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.AuthenticationRule = {
      var __selector = this.selector
      var __oauth = this.oauth
      var __allowWithoutCredential = this.allowWithoutCredential
      val __requirements = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.AuthRequirement] ++= this.requirements)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __selector = _input__.readString()
          case 18 =>
            __oauth = Option(_root_.scalapb.LiteParser.readMessage(_input__, __oauth.getOrElse(com.google.api.OAuthRequirements.defaultInstance)))
          case 40 =>
            __allowWithoutCredential = _input__.readBool()
          case 58 =>
            __requirements += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.AuthRequirement.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.AuthenticationRule(
          selector = __selector,
          oauth = __oauth,
          allowWithoutCredential = __allowWithoutCredential,
          requirements = __requirements.result()
      )
    }
    def withSelector(__v: _root_.scala.Predef.String): AuthenticationRule = copy(selector = __v)
    def getOauth: com.google.api.OAuthRequirements = oauth.getOrElse(com.google.api.OAuthRequirements.defaultInstance)
    def clearOauth: AuthenticationRule = copy(oauth = _root_.scala.None)
    def withOauth(__v: com.google.api.OAuthRequirements): AuthenticationRule = copy(oauth = Option(__v))
    def withAllowWithoutCredential(__v: _root_.scala.Boolean): AuthenticationRule = copy(allowWithoutCredential = __v)
    def clearRequirements = copy(requirements = _root_.scala.Seq.empty)
    def addRequirements(__vs: com.google.api.AuthRequirement*): AuthenticationRule = addAllRequirements(__vs)
    def addAllRequirements(__vs: Iterable[com.google.api.AuthRequirement]): AuthenticationRule = copy(requirements = requirements ++ __vs)
    def withRequirements(__v: _root_.scala.Seq[com.google.api.AuthRequirement]): AuthenticationRule = copy(requirements = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = selector
          if (__t != "") __t else null
        }
        case 2 => oauth.orNull
        case 5 => {
          val __t = allowWithoutCredential
          if (__t != false) __t else null
        }
        case 7 => requirements
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(selector)
        case 2 => oauth.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => _root_.scalapb.descriptors.PBoolean(allowWithoutCredential)
        case 7 => _root_.scalapb.descriptors.PRepeated(requirements.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.AuthenticationRule
}

object AuthenticationRule extends scalapb.GeneratedMessageCompanion[com.google.api.AuthenticationRule] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.AuthenticationRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.AuthenticationRule = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.AuthenticationRule(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.api.OAuthRequirements]],
      __fieldsMap.getOrElse(__fields.get(2), false).asInstanceOf[_root_.scala.Boolean],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.AuthRequirement]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.AuthenticationRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.AuthenticationRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.api.OAuthRequirements]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Seq[com.google.api.AuthRequirement]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AuthProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AuthProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.api.OAuthRequirements
      case 7 => __out = com.google.api.AuthRequirement
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.AuthenticationRule(
    selector = "",
    oauth = _root_.scala.None,
    allowWithoutCredential = false,
    requirements = _root_.scala.Seq.empty
  )
  implicit class AuthenticationRuleLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.AuthenticationRule]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.AuthenticationRule](_l) {
    def selector: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.selector)((c_, f_) => c_.copy(selector = f_))
    def oauth: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.OAuthRequirements] = field(_.getOauth)((c_, f_) => c_.copy(oauth = Option(f_)))
    def optionalOauth: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.api.OAuthRequirements]] = field(_.oauth)((c_, f_) => c_.copy(oauth = f_))
    def allowWithoutCredential: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.allowWithoutCredential)((c_, f_) => c_.copy(allowWithoutCredential = f_))
    def requirements: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.AuthRequirement]] = field(_.requirements)((c_, f_) => c_.copy(requirements = f_))
  }
  final val SELECTOR_FIELD_NUMBER = 1
  final val OAUTH_FIELD_NUMBER = 2
  final val ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5
  final val REQUIREMENTS_FIELD_NUMBER = 7
  def of(
    selector: _root_.scala.Predef.String,
    oauth: _root_.scala.Option[com.google.api.OAuthRequirements],
    allowWithoutCredential: _root_.scala.Boolean,
    requirements: _root_.scala.Seq[com.google.api.AuthRequirement]
  ): _root_.com.google.api.AuthenticationRule = _root_.com.google.api.AuthenticationRule(
    selector,
    oauth,
    allowWithoutCredential,
    requirements
  )
}
