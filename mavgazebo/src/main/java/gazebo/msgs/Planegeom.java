// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: planegeom.proto

package gazebo.msgs;

public final class Planegeom {
  private Planegeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlaneGeomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.PlaneGeom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     * @return Whether the normal field is set.
     */
    boolean hasNormal();
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     * @return The normal.
     */
    gazebo.msgs.Vector3D.Vector3d getNormal();
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    gazebo.msgs.Vector3D.Vector3dOrBuilder getNormalOrBuilder();

    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     * @return Whether the size field is set.
     */
    boolean hasSize();
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     * @return The size.
     */
    gazebo.msgs.Vector2D.Vector2d getSize();
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    gazebo.msgs.Vector2D.Vector2dOrBuilder getSizeOrBuilder();

    /**
     * <code>optional double d = 3 [default = 0];</code>
     * @return Whether the d field is set.
     */
    boolean hasD();
    /**
     * <code>optional double d = 3 [default = 0];</code>
     * @return The d.
     */
    double getD();
  }
  /**
   * Protobuf type {@code gazebo.msgs.PlaneGeom}
   */
  public static final class PlaneGeom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.PlaneGeom)
      PlaneGeomOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlaneGeom.newBuilder() to construct.
    private PlaneGeom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlaneGeom() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlaneGeom();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.Planegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.Planegeom.internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.Planegeom.PlaneGeom.class, gazebo.msgs.Planegeom.PlaneGeom.Builder.class);
    }

    private int bitField0_;
    public static final int NORMAL_FIELD_NUMBER = 1;
    private gazebo.msgs.Vector3D.Vector3d normal_;
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     * @return Whether the normal field is set.
     */
    @java.lang.Override
    public boolean hasNormal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     * @return The normal.
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3d getNormal() {
      return normal_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : normal_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3dOrBuilder getNormalOrBuilder() {
      return normal_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : normal_;
    }

    public static final int SIZE_FIELD_NUMBER = 2;
    private gazebo.msgs.Vector2D.Vector2d size_;
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     * @return Whether the size field is set.
     */
    @java.lang.Override
    public boolean hasSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public gazebo.msgs.Vector2D.Vector2d getSize() {
      return size_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : size_;
    }
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector2D.Vector2dOrBuilder getSizeOrBuilder() {
      return size_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : size_;
    }

    public static final int D_FIELD_NUMBER = 3;
    private double d_ = 0D;
    /**
     * <code>optional double d = 3 [default = 0];</code>
     * @return Whether the d field is set.
     */
    @java.lang.Override
    public boolean hasD() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional double d = 3 [default = 0];</code>
     * @return The d.
     */
    @java.lang.Override
    public double getD() {
      return d_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNormal()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getNormal().isInitialized()) {
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
        output.writeMessage(1, getNormal());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getSize());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, d_);
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
          .computeMessageSize(1, getNormal());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSize());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, d_);
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
      if (!(obj instanceof gazebo.msgs.Planegeom.PlaneGeom)) {
        return super.equals(obj);
      }
      gazebo.msgs.Planegeom.PlaneGeom other = (gazebo.msgs.Planegeom.PlaneGeom) obj;

      if (hasNormal() != other.hasNormal()) return false;
      if (hasNormal()) {
        if (!getNormal()
            .equals(other.getNormal())) return false;
      }
      if (hasSize() != other.hasSize()) return false;
      if (hasSize()) {
        if (!getSize()
            .equals(other.getSize())) return false;
      }
      if (hasD() != other.hasD()) return false;
      if (hasD()) {
        if (java.lang.Double.doubleToLongBits(getD())
            != java.lang.Double.doubleToLongBits(
                other.getD())) return false;
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
      if (hasNormal()) {
        hash = (37 * hash) + NORMAL_FIELD_NUMBER;
        hash = (53 * hash) + getNormal().hashCode();
      }
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getSize().hashCode();
      }
      if (hasD()) {
        hash = (37 * hash) + D_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getD()));
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Planegeom.PlaneGeom parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.Planegeom.PlaneGeom prototype) {
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
     * Protobuf type {@code gazebo.msgs.PlaneGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.PlaneGeom)
        gazebo.msgs.Planegeom.PlaneGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.Planegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.Planegeom.internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.Planegeom.PlaneGeom.class, gazebo.msgs.Planegeom.PlaneGeom.Builder.class);
      }

      // Construct using gazebo.msgs.Planegeom.PlaneGeom.newBuilder()
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
          getNormalFieldBuilder();
          getSizeFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        normal_ = null;
        if (normalBuilder_ != null) {
          normalBuilder_.dispose();
          normalBuilder_ = null;
        }
        size_ = null;
        if (sizeBuilder_ != null) {
          sizeBuilder_.dispose();
          sizeBuilder_ = null;
        }
        d_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.Planegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.Planegeom.PlaneGeom getDefaultInstanceForType() {
        return gazebo.msgs.Planegeom.PlaneGeom.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.Planegeom.PlaneGeom build() {
        gazebo.msgs.Planegeom.PlaneGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.Planegeom.PlaneGeom buildPartial() {
        gazebo.msgs.Planegeom.PlaneGeom result = new gazebo.msgs.Planegeom.PlaneGeom(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.Planegeom.PlaneGeom result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.normal_ = normalBuilder_ == null
              ? normal_
              : normalBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.size_ = sizeBuilder_ == null
              ? size_
              : sizeBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.d_ = d_;
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
        if (other instanceof gazebo.msgs.Planegeom.PlaneGeom) {
          return mergeFrom((gazebo.msgs.Planegeom.PlaneGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.Planegeom.PlaneGeom other) {
        if (other == gazebo.msgs.Planegeom.PlaneGeom.getDefaultInstance()) return this;
        if (other.hasNormal()) {
          mergeNormal(other.getNormal());
        }
        if (other.hasSize()) {
          mergeSize(other.getSize());
        }
        if (other.hasD()) {
          setD(other.getD());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNormal()) {
          return false;
        }
        if (!hasSize()) {
          return false;
        }
        if (!getNormal().isInitialized()) {
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
                input.readMessage(
                    getNormalFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getSizeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 25: {
                d_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
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

      private gazebo.msgs.Vector3D.Vector3d normal_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> normalBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       * @return Whether the normal field is set.
       */
      public boolean hasNormal() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       * @return The normal.
       */
      public gazebo.msgs.Vector3D.Vector3d getNormal() {
        if (normalBuilder_ == null) {
          return normal_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : normal_;
        } else {
          return normalBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder setNormal(gazebo.msgs.Vector3D.Vector3d value) {
        if (normalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          normal_ = value;
        } else {
          normalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder setNormal(
          gazebo.msgs.Vector3D.Vector3d.Builder builderForValue) {
        if (normalBuilder_ == null) {
          normal_ = builderForValue.build();
        } else {
          normalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder mergeNormal(gazebo.msgs.Vector3D.Vector3d value) {
        if (normalBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            normal_ != null &&
            normal_ != gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) {
            getNormalBuilder().mergeFrom(value);
          } else {
            normal_ = value;
          }
        } else {
          normalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder clearNormal() {
        bitField0_ = (bitField0_ & ~0x00000001);
        normal_ = null;
        if (normalBuilder_ != null) {
          normalBuilder_.dispose();
          normalBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public gazebo.msgs.Vector3D.Vector3d.Builder getNormalBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNormalFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public gazebo.msgs.Vector3D.Vector3dOrBuilder getNormalOrBuilder() {
        if (normalBuilder_ != null) {
          return normalBuilder_.getMessageOrBuilder();
        } else {
          return normal_ == null ?
              gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : normal_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> 
          getNormalFieldBuilder() {
        if (normalBuilder_ == null) {
          normalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder>(
                  getNormal(),
                  getParentForChildren(),
                  isClean());
          normal_ = null;
        }
        return normalBuilder_;
      }

      private gazebo.msgs.Vector2D.Vector2d size_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder> sizeBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       * @return Whether the size field is set.
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       * @return The size.
       */
      public gazebo.msgs.Vector2D.Vector2d getSize() {
        if (sizeBuilder_ == null) {
          return size_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : size_;
        } else {
          return sizeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder setSize(gazebo.msgs.Vector2D.Vector2d value) {
        if (sizeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          size_ = value;
        } else {
          sizeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder setSize(
          gazebo.msgs.Vector2D.Vector2d.Builder builderForValue) {
        if (sizeBuilder_ == null) {
          size_ = builderForValue.build();
        } else {
          sizeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder mergeSize(gazebo.msgs.Vector2D.Vector2d value) {
        if (sizeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            size_ != null &&
            size_ != gazebo.msgs.Vector2D.Vector2d.getDefaultInstance()) {
            getSizeBuilder().mergeFrom(value);
          } else {
            size_ = value;
          }
        } else {
          sizeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = null;
        if (sizeBuilder_ != null) {
          sizeBuilder_.dispose();
          sizeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public gazebo.msgs.Vector2D.Vector2d.Builder getSizeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSizeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public gazebo.msgs.Vector2D.Vector2dOrBuilder getSizeOrBuilder() {
        if (sizeBuilder_ != null) {
          return sizeBuilder_.getMessageOrBuilder();
        } else {
          return size_ == null ?
              gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : size_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder> 
          getSizeFieldBuilder() {
        if (sizeBuilder_ == null) {
          sizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder>(
                  getSize(),
                  getParentForChildren(),
                  isClean());
          size_ = null;
        }
        return sizeBuilder_;
      }

      private double d_ ;
      /**
       * <code>optional double d = 3 [default = 0];</code>
       * @return Whether the d field is set.
       */
      @java.lang.Override
      public boolean hasD() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       * @return The d.
       */
      @java.lang.Override
      public double getD() {
        return d_;
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       * @param value The d to set.
       * @return This builder for chaining.
       */
      public Builder setD(double value) {
        
        d_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearD() {
        bitField0_ = (bitField0_ & ~0x00000004);
        d_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PlaneGeom)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PlaneGeom)
    private static final gazebo.msgs.Planegeom.PlaneGeom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.Planegeom.PlaneGeom();
    }

    public static gazebo.msgs.Planegeom.PlaneGeom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PlaneGeom>
        PARSER = new com.google.protobuf.AbstractParser<PlaneGeom>() {
      @java.lang.Override
      public PlaneGeom parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlaneGeom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlaneGeom> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.Planegeom.PlaneGeom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PlaneGeom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017planegeom.proto\022\013gazebo.msgs\032\016vector3d" +
      ".proto\032\016vector2d.proto\"e\n\tPlaneGeom\022%\n\006n" +
      "ormal\030\001 \002(\0132\025.gazebo.msgs.Vector3d\022#\n\004si" +
      "ze\030\002 \002(\0132\025.gazebo.msgs.Vector2d\022\014\n\001d\030\003 \001" +
      "(\001:\0010"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.Vector3D.getDescriptor(),
          gazebo.msgs.Vector2D.getDescriptor(),
        });
    internal_static_gazebo_msgs_PlaneGeom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_PlaneGeom_descriptor,
        new java.lang.String[] { "Normal", "Size", "D", });
    gazebo.msgs.Vector3D.getDescriptor();
    gazebo.msgs.Vector2D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
