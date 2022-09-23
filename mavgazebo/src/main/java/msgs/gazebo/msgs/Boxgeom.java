// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boxgeom.proto

package msgs.gazebo.msgs;

public final class Boxgeom {
  private Boxgeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BoxGeomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.BoxGeom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     * @return Whether the size field is set.
     */
    boolean hasSize();
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     * @return The size.
     */
    msgs.gazebo.msgs.Vector3D.Vector3d getSize();
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder getSizeOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.BoxGeom}
   */
  public static final class BoxGeom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.BoxGeom)
      BoxGeomOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BoxGeom.newBuilder() to construct.
    private BoxGeom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BoxGeom() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BoxGeom();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BoxGeom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              msgs.gazebo.msgs.Vector3D.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = size_.toBuilder();
              }
              size_ = input.readMessage(msgs.gazebo.msgs.Vector3D.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(size_);
                size_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return msgs.gazebo.msgs.Boxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msgs.gazebo.msgs.Boxgeom.internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msgs.gazebo.msgs.Boxgeom.BoxGeom.class, msgs.gazebo.msgs.Boxgeom.BoxGeom.Builder.class);
    }

    private int bitField0_;
    public static final int SIZE_FIELD_NUMBER = 1;
    private msgs.gazebo.msgs.Vector3D.Vector3d size_;
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     * @return Whether the size field is set.
     */
    @java.lang.Override
    public boolean hasSize() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     * @return The size.
     */
    @java.lang.Override
    public msgs.gazebo.msgs.Vector3D.Vector3d getSize() {
      return size_ == null ? msgs.gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : size_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    @java.lang.Override
    public msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder getSizeOrBuilder() {
      return size_ == null ? msgs.gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : size_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSize().isInitialized()) {
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
        output.writeMessage(1, getSize());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSize());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof msgs.gazebo.msgs.Boxgeom.BoxGeom)) {
        return super.equals(obj);
      }
      msgs.gazebo.msgs.Boxgeom.BoxGeom other = (msgs.gazebo.msgs.Boxgeom.BoxGeom) obj;

      if (hasSize() != other.hasSize()) return false;
      if (hasSize()) {
        if (!getSize()
            .equals(other.getSize())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getSize().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.Boxgeom.BoxGeom parseFrom(
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
    public static Builder newBuilder(msgs.gazebo.msgs.Boxgeom.BoxGeom prototype) {
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
     * Protobuf type {@code gazebo.msgs.BoxGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.BoxGeom)
        msgs.gazebo.msgs.Boxgeom.BoxGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return msgs.gazebo.msgs.Boxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return msgs.gazebo.msgs.Boxgeom.internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                msgs.gazebo.msgs.Boxgeom.BoxGeom.class, msgs.gazebo.msgs.Boxgeom.BoxGeom.Builder.class);
      }

      // Construct using gazebo.msgs.Boxgeom.BoxGeom.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSizeFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (sizeBuilder_ == null) {
          size_ = null;
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return msgs.gazebo.msgs.Boxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.Boxgeom.BoxGeom getDefaultInstanceForType() {
        return msgs.gazebo.msgs.Boxgeom.BoxGeom.getDefaultInstance();
      }

      @java.lang.Override
      public msgs.gazebo.msgs.Boxgeom.BoxGeom build() {
        msgs.gazebo.msgs.Boxgeom.BoxGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.Boxgeom.BoxGeom buildPartial() {
        msgs.gazebo.msgs.Boxgeom.BoxGeom result = new msgs.gazebo.msgs.Boxgeom.BoxGeom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (sizeBuilder_ == null) {
            result.size_ = size_;
          } else {
            result.size_ = sizeBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
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
        if (other instanceof msgs.gazebo.msgs.Boxgeom.BoxGeom) {
          return mergeFrom((msgs.gazebo.msgs.Boxgeom.BoxGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(msgs.gazebo.msgs.Boxgeom.BoxGeom other) {
        if (other == msgs.gazebo.msgs.Boxgeom.BoxGeom.getDefaultInstance()) return this;
        if (other.hasSize()) {
          mergeSize(other.getSize());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSize()) {
          return false;
        }
        if (!getSize().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        msgs.gazebo.msgs.Boxgeom.BoxGeom parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (msgs.gazebo.msgs.Boxgeom.BoxGeom) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private msgs.gazebo.msgs.Vector3D.Vector3d size_;
      private com.google.protobuf.SingleFieldBuilderV3<
          msgs.gazebo.msgs.Vector3D.Vector3d, msgs.gazebo.msgs.Vector3D.Vector3d.Builder, msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder> sizeBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       * @return Whether the size field is set.
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       * @return The size.
       */
      public msgs.gazebo.msgs.Vector3D.Vector3d getSize() {
        if (sizeBuilder_ == null) {
          return size_ == null ? msgs.gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : size_;
        } else {
          return sizeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder setSize(msgs.gazebo.msgs.Vector3D.Vector3d value) {
        if (sizeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          size_ = value;
          onChanged();
        } else {
          sizeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder setSize(
          msgs.gazebo.msgs.Vector3D.Vector3d.Builder builderForValue) {
        if (sizeBuilder_ == null) {
          size_ = builderForValue.build();
          onChanged();
        } else {
          sizeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder mergeSize(msgs.gazebo.msgs.Vector3D.Vector3d value) {
        if (sizeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              size_ != null &&
              size_ != msgs.gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) {
            size_ =
              msgs.gazebo.msgs.Vector3D.Vector3d.newBuilder(size_).mergeFrom(value).buildPartial();
          } else {
            size_ = value;
          }
          onChanged();
        } else {
          sizeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder clearSize() {
        if (sizeBuilder_ == null) {
          size_ = null;
          onChanged();
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public msgs.gazebo.msgs.Vector3D.Vector3d.Builder getSizeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSizeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder getSizeOrBuilder() {
        if (sizeBuilder_ != null) {
          return sizeBuilder_.getMessageOrBuilder();
        } else {
          return size_ == null ?
              msgs.gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : size_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          msgs.gazebo.msgs.Vector3D.Vector3d, msgs.gazebo.msgs.Vector3D.Vector3d.Builder, msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder> 
          getSizeFieldBuilder() {
        if (sizeBuilder_ == null) {
          sizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              msgs.gazebo.msgs.Vector3D.Vector3d, msgs.gazebo.msgs.Vector3D.Vector3d.Builder, msgs.gazebo.msgs.Vector3D.Vector3dOrBuilder>(
                  getSize(),
                  getParentForChildren(),
                  isClean());
          size_ = null;
        }
        return sizeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.BoxGeom)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.BoxGeom)
    private static final msgs.gazebo.msgs.Boxgeom.BoxGeom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new msgs.gazebo.msgs.Boxgeom.BoxGeom();
    }

    public static msgs.gazebo.msgs.Boxgeom.BoxGeom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<BoxGeom>
        PARSER = new com.google.protobuf.AbstractParser<BoxGeom>() {
      @java.lang.Override
      public BoxGeom parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BoxGeom(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BoxGeom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BoxGeom> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public msgs.gazebo.msgs.Boxgeom.BoxGeom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_BoxGeom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rboxgeom.proto\022\013gazebo.msgs\032\016vector3d.p" +
      "roto\".\n\007BoxGeom\022#\n\004size\030\001 \002(\0132\025.gazebo.m" +
      "sgs.Vector3d"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          msgs.gazebo.msgs.Vector3D.getDescriptor(),
        });
    internal_static_gazebo_msgs_BoxGeom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_BoxGeom_descriptor,
        new java.lang.String[] { "Size", });
    msgs.gazebo.msgs.Vector3D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}