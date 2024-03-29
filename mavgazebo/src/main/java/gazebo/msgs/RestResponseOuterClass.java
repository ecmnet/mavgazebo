// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rest_response.proto

package gazebo.msgs;

public final class RestResponseOuterClass {
  private RestResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RestResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.RestResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     *
     * <code>optional uint32 id = 1;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     *
     * <code>optional uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     *
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     *
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     * @return The type.
     */
    gazebo.msgs.RestResponseOuterClass.RestResponse.Type getType();

    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return Whether the msg field is set.
     */
    boolean hasMsg();
    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return The msg.
     */
    java.lang.String getMsg();
    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.RestResponse}
   */
  public static final class RestResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.RestResponse)
      RestResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RestResponse.newBuilder() to construct.
    private RestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RestResponse() {
      type_ = 1;
      msg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RestResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.RestResponseOuterClass.internal_static_gazebo_msgs_RestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.RestResponseOuterClass.internal_static_gazebo_msgs_RestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.RestResponseOuterClass.RestResponse.class, gazebo.msgs.RestResponseOuterClass.RestResponse.Builder.class);
    }

    /**
     * Protobuf enum {@code gazebo.msgs.RestResponse.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       *&#47; &#92;brief Rest service call was successfull
       * </pre>
       *
       * <code>SUCCESS = 1;</code>
       */
      SUCCESS(1),
      /**
       * <pre>
       *&#47; &#92;brief Error calling rest service
       * </pre>
       *
       * <code>ERR = 2;</code>
       */
      ERR(2),
      /**
       * <pre>
       *&#47; &#92;brief Response to a login request
       * </pre>
       *
       * <code>LOGIN = 3;</code>
       */
      LOGIN(3),
      /**
       * <pre>
       *&#47; &#92;brief Response to a logout request
       * </pre>
       *
       * <code>LOGOUT = 4;</code>
       */
      LOGOUT(4),
      ;

      /**
       * <pre>
       *&#47; &#92;brief Rest service call was successfull
       * </pre>
       *
       * <code>SUCCESS = 1;</code>
       */
      public static final int SUCCESS_VALUE = 1;
      /**
       * <pre>
       *&#47; &#92;brief Error calling rest service
       * </pre>
       *
       * <code>ERR = 2;</code>
       */
      public static final int ERR_VALUE = 2;
      /**
       * <pre>
       *&#47; &#92;brief Response to a login request
       * </pre>
       *
       * <code>LOGIN = 3;</code>
       */
      public static final int LOGIN_VALUE = 3;
      /**
       * <pre>
       *&#47; &#92;brief Response to a logout request
       * </pre>
       *
       * <code>LOGOUT = 4;</code>
       */
      public static final int LOGOUT_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 1: return SUCCESS;
          case 2: return ERR;
          case 3: return LOGIN;
          case 4: return LOGOUT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return gazebo.msgs.RestResponseOuterClass.RestResponse.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:gazebo.msgs.RestResponse.Type)
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     *
     * <code>optional uint32 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     *
     * <code>optional uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_ = 1;
    /**
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     *
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     *
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     * @return The type.
     */
    @java.lang.Override public gazebo.msgs.RestResponseOuterClass.RestResponse.Type getType() {
      gazebo.msgs.RestResponseOuterClass.RestResponse.Type result = gazebo.msgs.RestResponseOuterClass.RestResponse.Type.forNumber(type_);
      return result == null ? gazebo.msgs.RestResponseOuterClass.RestResponse.Type.SUCCESS : result;
    }

    public static final int MSG_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object msg_ = "";
    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return Whether the msg field is set.
     */
    @java.lang.Override
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return The msg.
     */
    @java.lang.Override
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     *
     * <code>optional string msg = 3;</code>
     * @return The bytes for msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof gazebo.msgs.RestResponseOuterClass.RestResponse)) {
        return super.equals(obj);
      }
      gazebo.msgs.RestResponseOuterClass.RestResponse other = (gazebo.msgs.RestResponseOuterClass.RestResponse) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasMsg() != other.hasMsg()) return false;
      if (hasMsg()) {
        if (!getMsg()
            .equals(other.getMsg())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      if (hasMsg()) {
        hash = (37 * hash) + MSG_FIELD_NUMBER;
        hash = (53 * hash) + getMsg().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.RestResponseOuterClass.RestResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(gazebo.msgs.RestResponseOuterClass.RestResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.RestResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.RestResponse)
        gazebo.msgs.RestResponseOuterClass.RestResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.RestResponseOuterClass.internal_static_gazebo_msgs_RestResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.RestResponseOuterClass.internal_static_gazebo_msgs_RestResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.RestResponseOuterClass.RestResponse.class, gazebo.msgs.RestResponseOuterClass.RestResponse.Builder.class);
      }

      // Construct using gazebo.msgs.RestResponseOuterClass.RestResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        type_ = 1;
        msg_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.RestResponseOuterClass.internal_static_gazebo_msgs_RestResponse_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.RestResponseOuterClass.RestResponse getDefaultInstanceForType() {
        return gazebo.msgs.RestResponseOuterClass.RestResponse.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.RestResponseOuterClass.RestResponse build() {
        gazebo.msgs.RestResponseOuterClass.RestResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.RestResponseOuterClass.RestResponse buildPartial() {
        gazebo.msgs.RestResponseOuterClass.RestResponse result = new gazebo.msgs.RestResponseOuterClass.RestResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.RestResponseOuterClass.RestResponse result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.type_ = type_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.msg_ = msg_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.RestResponseOuterClass.RestResponse) {
          return mergeFrom((gazebo.msgs.RestResponseOuterClass.RestResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.RestResponseOuterClass.RestResponse other) {
        if (other == gazebo.msgs.RestResponseOuterClass.RestResponse.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasMsg()) {
          msg_ = other.msg_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                int tmpRaw = input.readEnum();
                gazebo.msgs.RestResponseOuterClass.RestResponse.Type tmpValue =
                    gazebo.msgs.RestResponseOuterClass.RestResponse.Type.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(2, tmpRaw);
                } else {
                  type_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 16
              case 26: {
                msg_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       *
       * <code>optional uint32 id = 1;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       *
       * <code>optional uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       *
       * <code>optional uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       *
       * <code>optional uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 1;
      /**
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       *
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       * @return Whether the type field is set.
       */
      @java.lang.Override public boolean hasType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       *
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public gazebo.msgs.RestResponseOuterClass.RestResponse.Type getType() {
        gazebo.msgs.RestResponseOuterClass.RestResponse.Type result = gazebo.msgs.RestResponseOuterClass.RestResponse.Type.forNumber(type_);
        return result == null ? gazebo.msgs.RestResponseOuterClass.RestResponse.Type.SUCCESS : result;
      }
      /**
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       *
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(gazebo.msgs.RestResponseOuterClass.RestResponse.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       *
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @return Whether the msg field is set.
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @return The msg.
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            msg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        msg_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        msg_ = getDefaultInstance().getMsg();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       *
       * <code>optional string msg = 3;</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        msg_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.RestResponse)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.RestResponse)
    private static final gazebo.msgs.RestResponseOuterClass.RestResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.RestResponseOuterClass.RestResponse();
    }

    public static gazebo.msgs.RestResponseOuterClass.RestResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<RestResponse>
        PARSER = new com.google.protobuf.AbstractParser<RestResponse>() {
      @java.lang.Override
      public RestResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<RestResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RestResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.RestResponseOuterClass.RestResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_RestResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_RestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023rest_response.proto\022\013gazebo.msgs\"\212\001\n\014R" +
      "estResponse\022\n\n\002id\030\001 \001(\r\022,\n\004type\030\002 \002(\0162\036." +
      "gazebo.msgs.RestResponse.Type\022\013\n\003msg\030\003 \001" +
      "(\t\"3\n\004Type\022\013\n\007SUCCESS\020\001\022\007\n\003ERR\020\002\022\t\n\005LOGI" +
      "N\020\003\022\n\n\006LOGOUT\020\004"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_RestResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_RestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_RestResponse_descriptor,
        new java.lang.String[] { "Id", "Type", "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
