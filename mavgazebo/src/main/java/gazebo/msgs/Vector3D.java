// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vector3d.proto

package gazebo.msgs;

public final class Vector3D {
  private Vector3D() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Vector3dOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Vector3d)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required double x = 1;</code>
     * @return Whether the x field is set.
     */
    boolean hasX();
    /**
     * <code>required double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>required double y = 2;</code>
     * @return Whether the y field is set.
     */
    boolean hasY();
    /**
     * <code>required double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>required double z = 3;</code>
     * @return Whether the z field is set.
     */
    boolean hasZ();
    /**
     * <code>required double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Vector3d}
   */
  public static final class Vector3d extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Vector3d)
      Vector3dOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Vector3d.newBuilder() to construct.
    private Vector3d(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Vector3d() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Vector3d();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.Vector3D.internal_static_gazebo_msgs_Vector3d_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.Vector3D.internal_static_gazebo_msgs_Vector3d_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.Vector3D.Vector3d.class, gazebo.msgs.Vector3D.Vector3d.Builder.class);
    }

    private int bitField0_;
    public static final int X_FIELD_NUMBER = 1;
    private double x_ = 0D;
    /**
     * <code>required double x = 1;</code>
     * @return Whether the x field is set.
     */
    @java.lang.Override
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_ = 0D;
    /**
     * <code>required double y = 2;</code>
     * @return Whether the y field is set.
     */
    @java.lang.Override
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_ = 0D;
    /**
     * <code>required double z = 3;</code>
     * @return Whether the z field is set.
     */
    @java.lang.Override
    public boolean hasZ() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZ()) {
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
        output.writeDouble(1, x_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, y_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, z_);
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
          .computeDoubleSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
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
      if (!(obj instanceof gazebo.msgs.Vector3D.Vector3d)) {
        return super.equals(obj);
      }
      gazebo.msgs.Vector3D.Vector3d other = (gazebo.msgs.Vector3D.Vector3d) obj;

      if (hasX() != other.hasX()) return false;
      if (hasX()) {
        if (java.lang.Double.doubleToLongBits(getX())
            != java.lang.Double.doubleToLongBits(
                other.getX())) return false;
      }
      if (hasY() != other.hasY()) return false;
      if (hasY()) {
        if (java.lang.Double.doubleToLongBits(getY())
            != java.lang.Double.doubleToLongBits(
                other.getY())) return false;
      }
      if (hasZ() != other.hasZ()) return false;
      if (hasZ()) {
        if (java.lang.Double.doubleToLongBits(getZ())
            != java.lang.Double.doubleToLongBits(
                other.getZ())) return false;
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
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getX()));
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getY()));
      }
      if (hasZ()) {
        hash = (37 * hash) + Z_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getZ()));
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Vector3D.Vector3d parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.Vector3D.Vector3d prototype) {
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
     * Protobuf type {@code gazebo.msgs.Vector3d}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Vector3d)
        gazebo.msgs.Vector3D.Vector3dOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.Vector3D.internal_static_gazebo_msgs_Vector3d_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.Vector3D.internal_static_gazebo_msgs_Vector3d_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.Vector3D.Vector3d.class, gazebo.msgs.Vector3D.Vector3d.Builder.class);
      }

      // Construct using gazebo.msgs.Vector3D.Vector3d.newBuilder()
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
        x_ = 0D;
        y_ = 0D;
        z_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.Vector3D.internal_static_gazebo_msgs_Vector3d_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.Vector3D.Vector3d getDefaultInstanceForType() {
        return gazebo.msgs.Vector3D.Vector3d.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.Vector3D.Vector3d build() {
        gazebo.msgs.Vector3D.Vector3d result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.Vector3D.Vector3d buildPartial() {
        gazebo.msgs.Vector3D.Vector3d result = new gazebo.msgs.Vector3D.Vector3d(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.Vector3D.Vector3d result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.x_ = x_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.y_ = y_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.z_ = z_;
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
        if (other instanceof gazebo.msgs.Vector3D.Vector3d) {
          return mergeFrom((gazebo.msgs.Vector3D.Vector3d)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.Vector3D.Vector3d other) {
        if (other == gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasX()) {
          return false;
        }
        if (!hasY()) {
          return false;
        }
        if (!hasZ()) {
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
              case 9: {
                x_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
              case 17: {
                y_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
              case 25: {
                z_ = input.readDouble();
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

      private double x_ ;
      /**
       * <code>required double x = 1;</code>
       * @return Whether the x field is set.
       */
      @java.lang.Override
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>required double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>required double y = 2;</code>
       * @return Whether the y field is set.
       */
      @java.lang.Override
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>required double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>required double z = 3;</code>
       * @return Whether the z field is set.
       */
      @java.lang.Override
      public boolean hasZ() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>required double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>required double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Vector3d)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Vector3d)
    private static final gazebo.msgs.Vector3D.Vector3d DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.Vector3D.Vector3d();
    }

    public static gazebo.msgs.Vector3D.Vector3d getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Vector3d>
        PARSER = new com.google.protobuf.AbstractParser<Vector3d>() {
      @java.lang.Override
      public Vector3d parsePartialFrom(
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

    public static com.google.protobuf.Parser<Vector3d> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Vector3d> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3d getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Vector3d_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Vector3d_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016vector3d.proto\022\013gazebo.msgs\"+\n\010Vector3" +
      "d\022\t\n\001x\030\001 \002(\001\022\t\n\001y\030\002 \002(\001\022\t\n\001z\030\003 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_Vector3d_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Vector3d_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Vector3d_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
