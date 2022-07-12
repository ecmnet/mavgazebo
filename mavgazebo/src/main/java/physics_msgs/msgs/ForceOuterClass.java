// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Force.proto

package physics_msgs.msgs;

public final class ForceOuterClass {
  private ForceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:physics_msgs.msgs.Force)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     * @return The center.
     */
    gazebo.msgs.Vector3D.Vector3d getCenter();
    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     */
    gazebo.msgs.Vector3D.Vector3dOrBuilder getCenterOrBuilder();

    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     * @return Whether the force field is set.
     */
    boolean hasForce();
    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     * @return The force.
     */
    gazebo.msgs.Vector3D.Vector3d getForce();
    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     */
    gazebo.msgs.Vector3D.Vector3dOrBuilder getForceOrBuilder();
  }
  /**
   * Protobuf type {@code physics_msgs.msgs.Force}
   */
  public static final class Force extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:physics_msgs.msgs.Force)
      ForceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Force.newBuilder() to construct.
    private Force(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Force() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Force();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Force(
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
              gazebo.msgs.Vector3D.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = center_.toBuilder();
              }
              center_ = input.readMessage(gazebo.msgs.Vector3D.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(center_);
                center_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              gazebo.msgs.Vector3D.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = force_.toBuilder();
              }
              force_ = input.readMessage(gazebo.msgs.Vector3D.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(force_);
                force_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return physics_msgs.msgs.ForceOuterClass.internal_static_physics_msgs_msgs_Force_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return physics_msgs.msgs.ForceOuterClass.internal_static_physics_msgs_msgs_Force_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              physics_msgs.msgs.ForceOuterClass.Force.class, physics_msgs.msgs.ForceOuterClass.Force.Builder.class);
    }

    private int bitField0_;
    public static final int CENTER_FIELD_NUMBER = 1;
    private gazebo.msgs.Vector3D.Vector3d center_;
    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     * @return The center.
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3d getCenter() {
      return center_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : center_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d center = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3dOrBuilder getCenterOrBuilder() {
      return center_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : center_;
    }

    public static final int FORCE_FIELD_NUMBER = 2;
    private gazebo.msgs.Vector3D.Vector3d force_;
    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     * @return Whether the force field is set.
     */
    @java.lang.Override
    public boolean hasForce() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     * @return The force.
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3d getForce() {
      return force_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : force_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d force = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3dOrBuilder getForceOrBuilder() {
      return force_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : force_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCenter()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasForce()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCenter().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getForce().isInitialized()) {
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
        output.writeMessage(1, getCenter());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getForce());
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
          .computeMessageSize(1, getCenter());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getForce());
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
      if (!(obj instanceof physics_msgs.msgs.ForceOuterClass.Force)) {
        return super.equals(obj);
      }
      physics_msgs.msgs.ForceOuterClass.Force other = (physics_msgs.msgs.ForceOuterClass.Force) obj;

      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (hasForce() != other.hasForce()) return false;
      if (hasForce()) {
        if (!getForce()
            .equals(other.getForce())) return false;
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
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      if (hasForce()) {
        hash = (37 * hash) + FORCE_FIELD_NUMBER;
        hash = (53 * hash) + getForce().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static physics_msgs.msgs.ForceOuterClass.Force parseFrom(
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
    public static Builder newBuilder(physics_msgs.msgs.ForceOuterClass.Force prototype) {
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
     * Protobuf type {@code physics_msgs.msgs.Force}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:physics_msgs.msgs.Force)
        physics_msgs.msgs.ForceOuterClass.ForceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return physics_msgs.msgs.ForceOuterClass.internal_static_physics_msgs_msgs_Force_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return physics_msgs.msgs.ForceOuterClass.internal_static_physics_msgs_msgs_Force_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                physics_msgs.msgs.ForceOuterClass.Force.class, physics_msgs.msgs.ForceOuterClass.Force.Builder.class);
      }

      // Construct using physics_msgs.msgs.ForceOuterClass.Force.newBuilder()
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
          getCenterFieldBuilder();
          getForceFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          centerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (forceBuilder_ == null) {
          force_ = null;
        } else {
          forceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return physics_msgs.msgs.ForceOuterClass.internal_static_physics_msgs_msgs_Force_descriptor;
      }

      @java.lang.Override
      public physics_msgs.msgs.ForceOuterClass.Force getDefaultInstanceForType() {
        return physics_msgs.msgs.ForceOuterClass.Force.getDefaultInstance();
      }

      @java.lang.Override
      public physics_msgs.msgs.ForceOuterClass.Force build() {
        physics_msgs.msgs.ForceOuterClass.Force result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public physics_msgs.msgs.ForceOuterClass.Force buildPartial() {
        physics_msgs.msgs.ForceOuterClass.Force result = new physics_msgs.msgs.ForceOuterClass.Force(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (centerBuilder_ == null) {
            result.center_ = center_;
          } else {
            result.center_ = centerBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (forceBuilder_ == null) {
            result.force_ = force_;
          } else {
            result.force_ = forceBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof physics_msgs.msgs.ForceOuterClass.Force) {
          return mergeFrom((physics_msgs.msgs.ForceOuterClass.Force)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(physics_msgs.msgs.ForceOuterClass.Force other) {
        if (other == physics_msgs.msgs.ForceOuterClass.Force.getDefaultInstance()) return this;
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.hasForce()) {
          mergeForce(other.getForce());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCenter()) {
          return false;
        }
        if (!hasForce()) {
          return false;
        }
        if (!getCenter().isInitialized()) {
          return false;
        }
        if (!getForce().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        physics_msgs.msgs.ForceOuterClass.Force parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (physics_msgs.msgs.ForceOuterClass.Force) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private gazebo.msgs.Vector3D.Vector3d center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> centerBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       * @return The center.
       */
      public gazebo.msgs.Vector3D.Vector3d getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public Builder setCenter(gazebo.msgs.Vector3D.Vector3d value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public Builder setCenter(
          gazebo.msgs.Vector3D.Vector3d.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public Builder mergeCenter(gazebo.msgs.Vector3D.Vector3d value) {
        if (centerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              center_ != null &&
              center_ != gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) {
            center_ =
              gazebo.msgs.Vector3D.Vector3d.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          centerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public gazebo.msgs.Vector3D.Vector3d.Builder getCenterBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      public gazebo.msgs.Vector3D.Vector3dOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d center = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private gazebo.msgs.Vector3D.Vector3d force_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> forceBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       * @return Whether the force field is set.
       */
      public boolean hasForce() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       * @return The force.
       */
      public gazebo.msgs.Vector3D.Vector3d getForce() {
        if (forceBuilder_ == null) {
          return force_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : force_;
        } else {
          return forceBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public Builder setForce(gazebo.msgs.Vector3D.Vector3d value) {
        if (forceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          force_ = value;
          onChanged();
        } else {
          forceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public Builder setForce(
          gazebo.msgs.Vector3D.Vector3d.Builder builderForValue) {
        if (forceBuilder_ == null) {
          force_ = builderForValue.build();
          onChanged();
        } else {
          forceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public Builder mergeForce(gazebo.msgs.Vector3D.Vector3d value) {
        if (forceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              force_ != null &&
              force_ != gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) {
            force_ =
              gazebo.msgs.Vector3D.Vector3d.newBuilder(force_).mergeFrom(value).buildPartial();
          } else {
            force_ = value;
          }
          onChanged();
        } else {
          forceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public Builder clearForce() {
        if (forceBuilder_ == null) {
          force_ = null;
          onChanged();
        } else {
          forceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public gazebo.msgs.Vector3D.Vector3d.Builder getForceBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getForceFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      public gazebo.msgs.Vector3D.Vector3dOrBuilder getForceOrBuilder() {
        if (forceBuilder_ != null) {
          return forceBuilder_.getMessageOrBuilder();
        } else {
          return force_ == null ?
              gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : force_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d force = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> 
          getForceFieldBuilder() {
        if (forceBuilder_ == null) {
          forceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder>(
                  getForce(),
                  getParentForChildren(),
                  isClean());
          force_ = null;
        }
        return forceBuilder_;
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


      // @@protoc_insertion_point(builder_scope:physics_msgs.msgs.Force)
    }

    // @@protoc_insertion_point(class_scope:physics_msgs.msgs.Force)
    private static final physics_msgs.msgs.ForceOuterClass.Force DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new physics_msgs.msgs.ForceOuterClass.Force();
    }

    public static physics_msgs.msgs.ForceOuterClass.Force getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Force>
        PARSER = new com.google.protobuf.AbstractParser<Force>() {
      @java.lang.Override
      public Force parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Force(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Force> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Force> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public physics_msgs.msgs.ForceOuterClass.Force getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_physics_msgs_msgs_Force_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_physics_msgs_msgs_Force_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Force.proto\022\021physics_msgs.msgs\032\016vector" +
      "3d.proto\"T\n\005Force\022%\n\006center\030\001 \002(\0132\025.gaze" +
      "bo.msgs.Vector3d\022$\n\005force\030\002 \002(\0132\025.gazebo" +
      ".msgs.Vector3d"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.Vector3D.getDescriptor(),
        });
    internal_static_physics_msgs_msgs_Force_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_physics_msgs_msgs_Force_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_physics_msgs_msgs_Force_descriptor,
        new java.lang.String[] { "Center", "Force", });
    gazebo.msgs.Vector3D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
