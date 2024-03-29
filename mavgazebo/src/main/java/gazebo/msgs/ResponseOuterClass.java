// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response.proto

package gazebo.msgs;

public final class ResponseOuterClass {
  private ResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>required string request = 2;</code>
     * @return Whether the request field is set.
     */
    boolean hasRequest();
    /**
     * <code>required string request = 2;</code>
     * @return The request.
     */
    java.lang.String getRequest();
    /**
     * <code>required string request = 2;</code>
     * @return The bytes for request.
     */
    com.google.protobuf.ByteString
        getRequestBytes();

    /**
     * <code>required string response = 3;</code>
     * @return Whether the response field is set.
     */
    boolean hasResponse();
    /**
     * <code>required string response = 3;</code>
     * @return The response.
     */
    java.lang.String getResponse();
    /**
     * <code>required string response = 3;</code>
     * @return The bytes for response.
     */
    com.google.protobuf.ByteString
        getResponseBytes();

    /**
     * <code>optional string type = 4;</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <code>optional string type = 4;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <code>optional string type = 4;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>optional bytes serialized_data = 5;</code>
     * @return Whether the serializedData field is set.
     */
    boolean hasSerializedData();
    /**
     * <code>optional bytes serialized_data = 5;</code>
     * @return The serializedData.
     */
    com.google.protobuf.ByteString getSerializedData();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Response}
   */
  public static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      request_ = "";
      response_ = "";
      type_ = "";
      serializedData_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Response();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.ResponseOuterClass.internal_static_gazebo_msgs_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.ResponseOuterClass.internal_static_gazebo_msgs_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.ResponseOuterClass.Response.class, gazebo.msgs.ResponseOuterClass.Response.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>required int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int REQUEST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object request_ = "";
    /**
     * <code>required string request = 2;</code>
     * @return Whether the request field is set.
     */
    @java.lang.Override
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string request = 2;</code>
     * @return The request.
     */
    @java.lang.Override
    public java.lang.String getRequest() {
      java.lang.Object ref = request_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          request_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string request = 2;</code>
     * @return The bytes for request.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRequestBytes() {
      java.lang.Object ref = request_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        request_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESPONSE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object response_ = "";
    /**
     * <code>required string response = 3;</code>
     * @return Whether the response field is set.
     */
    @java.lang.Override
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string response = 3;</code>
     * @return The response.
     */
    @java.lang.Override
    public java.lang.String getResponse() {
      java.lang.Object ref = response_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          response_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string response = 3;</code>
     * @return The bytes for response.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResponseBytes() {
      java.lang.Object ref = response_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        response_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object type_ = "";
    /**
     * <code>optional string type = 4;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string type = 4;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERIALIZED_DATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString serializedData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes serialized_data = 5;</code>
     * @return Whether the serializedData field is set.
     */
    @java.lang.Override
    public boolean hasSerializedData() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bytes serialized_data = 5;</code>
     * @return The serializedData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSerializedData() {
      return serializedData_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRequest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResponse()) {
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
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, request_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, response_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeBytes(5, serializedData_);
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
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, request_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, response_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, serializedData_);
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
      if (!(obj instanceof gazebo.msgs.ResponseOuterClass.Response)) {
        return super.equals(obj);
      }
      gazebo.msgs.ResponseOuterClass.Response other = (gazebo.msgs.ResponseOuterClass.Response) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasRequest() != other.hasRequest()) return false;
      if (hasRequest()) {
        if (!getRequest()
            .equals(other.getRequest())) return false;
      }
      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (!getType()
            .equals(other.getType())) return false;
      }
      if (hasSerializedData() != other.hasSerializedData()) return false;
      if (hasSerializedData()) {
        if (!getSerializedData()
            .equals(other.getSerializedData())) return false;
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
      if (hasRequest()) {
        hash = (37 * hash) + REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getRequest().hashCode();
      }
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasSerializedData()) {
        hash = (37 * hash) + SERIALIZED_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getSerializedData().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ResponseOuterClass.Response parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.ResponseOuterClass.Response prototype) {
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
     * Protobuf type {@code gazebo.msgs.Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Response)
        gazebo.msgs.ResponseOuterClass.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.ResponseOuterClass.internal_static_gazebo_msgs_Response_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.ResponseOuterClass.internal_static_gazebo_msgs_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.ResponseOuterClass.Response.class, gazebo.msgs.ResponseOuterClass.Response.Builder.class);
      }

      // Construct using gazebo.msgs.ResponseOuterClass.Response.newBuilder()
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
        request_ = "";
        response_ = "";
        type_ = "";
        serializedData_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.ResponseOuterClass.internal_static_gazebo_msgs_Response_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.ResponseOuterClass.Response getDefaultInstanceForType() {
        return gazebo.msgs.ResponseOuterClass.Response.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.ResponseOuterClass.Response build() {
        gazebo.msgs.ResponseOuterClass.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.ResponseOuterClass.Response buildPartial() {
        gazebo.msgs.ResponseOuterClass.Response result = new gazebo.msgs.ResponseOuterClass.Response(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.ResponseOuterClass.Response result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.request_ = request_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.response_ = response_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.type_ = type_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.serializedData_ = serializedData_;
          to_bitField0_ |= 0x00000010;
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
        if (other instanceof gazebo.msgs.ResponseOuterClass.Response) {
          return mergeFrom((gazebo.msgs.ResponseOuterClass.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.ResponseOuterClass.Response other) {
        if (other == gazebo.msgs.ResponseOuterClass.Response.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasRequest()) {
          request_ = other.request_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasResponse()) {
          response_ = other.response_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.hasType()) {
          type_ = other.type_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.hasSerializedData()) {
          setSerializedData(other.getSerializedData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasRequest()) {
          return false;
        }
        if (!hasResponse()) {
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
                id_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                request_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                response_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                type_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                serializedData_ = input.readBytes();
                bitField0_ |= 0x00000010;
                break;
              } // case 42
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
       * <code>required int32 id = 1;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
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
       * <code>required int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object request_ = "";
      /**
       * <code>required string request = 2;</code>
       * @return Whether the request field is set.
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string request = 2;</code>
       * @return The request.
       */
      public java.lang.String getRequest() {
        java.lang.Object ref = request_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            request_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string request = 2;</code>
       * @return The bytes for request.
       */
      public com.google.protobuf.ByteString
          getRequestBytes() {
        java.lang.Object ref = request_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          request_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string request = 2;</code>
       * @param value The request to set.
       * @return This builder for chaining.
       */
      public Builder setRequest(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        request_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required string request = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequest() {
        request_ = getDefaultInstance().getRequest();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>required string request = 2;</code>
       * @param value The bytes for request to set.
       * @return This builder for chaining.
       */
      public Builder setRequestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        request_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object response_ = "";
      /**
       * <code>required string response = 3;</code>
       * @return Whether the response field is set.
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string response = 3;</code>
       * @return The response.
       */
      public java.lang.String getResponse() {
        java.lang.Object ref = response_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            response_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string response = 3;</code>
       * @return The bytes for response.
       */
      public com.google.protobuf.ByteString
          getResponseBytes() {
        java.lang.Object ref = response_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          response_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string response = 3;</code>
       * @param value The response to set.
       * @return This builder for chaining.
       */
      public Builder setResponse(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        response_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>required string response = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearResponse() {
        response_ = getDefaultInstance().getResponse();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>required string response = 3;</code>
       * @param value The bytes for response to set.
       * @return This builder for chaining.
       */
      public Builder setResponseBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        response_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>optional string type = 4;</code>
       * @return Whether the type field is set.
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string type = 4;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string type = 4;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string type = 4;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = getDefaultInstance().getType();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 4;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString serializedData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes serialized_data = 5;</code>
       * @return Whether the serializedData field is set.
       */
      @java.lang.Override
      public boolean hasSerializedData() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional bytes serialized_data = 5;</code>
       * @return The serializedData.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getSerializedData() {
        return serializedData_;
      }
      /**
       * <code>optional bytes serialized_data = 5;</code>
       * @param value The serializedData to set.
       * @return This builder for chaining.
       */
      public Builder setSerializedData(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        serializedData_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes serialized_data = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSerializedData() {
        bitField0_ = (bitField0_ & ~0x00000010);
        serializedData_ = getDefaultInstance().getSerializedData();
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Response)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Response)
    private static final gazebo.msgs.ResponseOuterClass.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.ResponseOuterClass.Response();
    }

    public static gazebo.msgs.ResponseOuterClass.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @java.lang.Override
      public Response parsePartialFrom(
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

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.ResponseOuterClass.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016response.proto\022\013gazebo.msgs\"`\n\010Respons" +
      "e\022\n\n\002id\030\001 \002(\005\022\017\n\007request\030\002 \002(\t\022\020\n\010respon" +
      "se\030\003 \002(\t\022\014\n\004type\030\004 \001(\t\022\027\n\017serialized_dat" +
      "a\030\005 \001(\014"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Response_descriptor,
        new java.lang.String[] { "Id", "Request", "Response", "Type", "SerializedData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
