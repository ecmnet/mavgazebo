// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin.proto

package gazebo.msgs;

public final class PluginOuterClass {
  private PluginOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PluginOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Plugin)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required string filename = 2;</code>
     * @return Whether the filename field is set.
     */
    boolean hasFilename();
    /**
     * <code>required string filename = 2;</code>
     * @return The filename.
     */
    java.lang.String getFilename();
    /**
     * <code>required string filename = 2;</code>
     * @return The bytes for filename.
     */
    com.google.protobuf.ByteString
        getFilenameBytes();

    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return Whether the innerxml field is set.
     */
    boolean hasInnerxml();
    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return The innerxml.
     */
    java.lang.String getInnerxml();
    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return The bytes for innerxml.
     */
    com.google.protobuf.ByteString
        getInnerxmlBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Plugin}
   */
  public static final class Plugin extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Plugin)
      PluginOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Plugin.newBuilder() to construct.
    private Plugin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Plugin() {
      name_ = "";
      filename_ = "";
      innerxml_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Plugin();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.PluginOuterClass.internal_static_gazebo_msgs_Plugin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.PluginOuterClass.internal_static_gazebo_msgs_Plugin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.PluginOuterClass.Plugin.class, gazebo.msgs.PluginOuterClass.Plugin.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILENAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object filename_ = "";
    /**
     * <code>required string filename = 2;</code>
     * @return Whether the filename field is set.
     */
    @java.lang.Override
    public boolean hasFilename() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string filename = 2;</code>
     * @return The filename.
     */
    @java.lang.Override
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          filename_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string filename = 2;</code>
     * @return The bytes for filename.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INNERXML_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object innerxml_ = "";
    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return Whether the innerxml field is set.
     */
    @java.lang.Override
    public boolean hasInnerxml() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return The innerxml.
     */
    @java.lang.Override
    public java.lang.String getInnerxml() {
      java.lang.Object ref = innerxml_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          innerxml_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string innerxml = 3 [default = ""];</code>
     * @return The bytes for innerxml.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInnerxmlBytes() {
      java.lang.Object ref = innerxml_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        innerxml_ = b;
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

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFilename()) {
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filename_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, innerxml_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filename_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, innerxml_);
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
      if (!(obj instanceof gazebo.msgs.PluginOuterClass.Plugin)) {
        return super.equals(obj);
      }
      gazebo.msgs.PluginOuterClass.Plugin other = (gazebo.msgs.PluginOuterClass.Plugin) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasFilename() != other.hasFilename()) return false;
      if (hasFilename()) {
        if (!getFilename()
            .equals(other.getFilename())) return false;
      }
      if (hasInnerxml() != other.hasInnerxml()) return false;
      if (hasInnerxml()) {
        if (!getInnerxml()
            .equals(other.getInnerxml())) return false;
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
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasFilename()) {
        hash = (37 * hash) + FILENAME_FIELD_NUMBER;
        hash = (53 * hash) + getFilename().hashCode();
      }
      if (hasInnerxml()) {
        hash = (37 * hash) + INNERXML_FIELD_NUMBER;
        hash = (53 * hash) + getInnerxml().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PluginOuterClass.Plugin parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.PluginOuterClass.Plugin prototype) {
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
     * Protobuf type {@code gazebo.msgs.Plugin}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Plugin)
        gazebo.msgs.PluginOuterClass.PluginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.PluginOuterClass.internal_static_gazebo_msgs_Plugin_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.PluginOuterClass.internal_static_gazebo_msgs_Plugin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.PluginOuterClass.Plugin.class, gazebo.msgs.PluginOuterClass.Plugin.Builder.class);
      }

      // Construct using gazebo.msgs.PluginOuterClass.Plugin.newBuilder()
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
        name_ = "";
        filename_ = "";
        innerxml_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.PluginOuterClass.internal_static_gazebo_msgs_Plugin_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.PluginOuterClass.Plugin getDefaultInstanceForType() {
        return gazebo.msgs.PluginOuterClass.Plugin.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.PluginOuterClass.Plugin build() {
        gazebo.msgs.PluginOuterClass.Plugin result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.PluginOuterClass.Plugin buildPartial() {
        gazebo.msgs.PluginOuterClass.Plugin result = new gazebo.msgs.PluginOuterClass.Plugin(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.PluginOuterClass.Plugin result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.filename_ = filename_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.innerxml_ = innerxml_;
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
        if (other instanceof gazebo.msgs.PluginOuterClass.Plugin) {
          return mergeFrom((gazebo.msgs.PluginOuterClass.Plugin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.PluginOuterClass.Plugin other) {
        if (other == gazebo.msgs.PluginOuterClass.Plugin.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasFilename()) {
          filename_ = other.filename_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasInnerxml()) {
          innerxml_ = other.innerxml_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasFilename()) {
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
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                filename_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                innerxml_ = input.readBytes();
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

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object filename_ = "";
      /**
       * <code>required string filename = 2;</code>
       * @return Whether the filename field is set.
       */
      public boolean hasFilename() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string filename = 2;</code>
       * @return The filename.
       */
      public java.lang.String getFilename() {
        java.lang.Object ref = filename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            filename_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string filename = 2;</code>
       * @return The bytes for filename.
       */
      public com.google.protobuf.ByteString
          getFilenameBytes() {
        java.lang.Object ref = filename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          filename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string filename = 2;</code>
       * @param value The filename to set.
       * @return This builder for chaining.
       */
      public Builder setFilename(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        filename_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required string filename = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilename() {
        filename_ = getDefaultInstance().getFilename();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>required string filename = 2;</code>
       * @param value The bytes for filename to set.
       * @return This builder for chaining.
       */
      public Builder setFilenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        filename_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object innerxml_ = "";
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @return Whether the innerxml field is set.
       */
      public boolean hasInnerxml() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @return The innerxml.
       */
      public java.lang.String getInnerxml() {
        java.lang.Object ref = innerxml_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            innerxml_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @return The bytes for innerxml.
       */
      public com.google.protobuf.ByteString
          getInnerxmlBytes() {
        java.lang.Object ref = innerxml_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          innerxml_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @param value The innerxml to set.
       * @return This builder for chaining.
       */
      public Builder setInnerxml(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        innerxml_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @return This builder for chaining.
       */
      public Builder clearInnerxml() {
        innerxml_ = getDefaultInstance().getInnerxml();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string innerxml = 3 [default = ""];</code>
       * @param value The bytes for innerxml to set.
       * @return This builder for chaining.
       */
      public Builder setInnerxmlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        innerxml_ = value;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Plugin)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Plugin)
    private static final gazebo.msgs.PluginOuterClass.Plugin DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.PluginOuterClass.Plugin();
    }

    public static gazebo.msgs.PluginOuterClass.Plugin getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Plugin>
        PARSER = new com.google.protobuf.AbstractParser<Plugin>() {
      @java.lang.Override
      public Plugin parsePartialFrom(
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

    public static com.google.protobuf.Parser<Plugin> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Plugin> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.PluginOuterClass.Plugin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Plugin_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Plugin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014plugin.proto\022\013gazebo.msgs\"<\n\006Plugin\022\014\n" +
      "\004name\030\001 \002(\t\022\020\n\010filename\030\002 \002(\t\022\022\n\010innerxm" +
      "l\030\003 \001(\t:\000"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_Plugin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Plugin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Plugin_descriptor,
        new java.lang.String[] { "Name", "Filename", "Innerxml", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
