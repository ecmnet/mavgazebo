// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spheregeom.proto

package gazebo.msgs;

public final class Spheregeom {
  private Spheregeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SphereGeomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.SphereGeom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *&#47; &#92;brief Radius of the sphere.
     * </pre>
     *
     * <code>required double radius = 1;</code>
     * @return Whether the radius field is set.
     */
    boolean hasRadius();
    /**
     * <pre>
     *&#47; &#92;brief Radius of the sphere.
     * </pre>
     *
     * <code>required double radius = 1;</code>
     * @return The radius.
     */
    double getRadius();
  }
  /**
   * Protobuf type {@code gazebo.msgs.SphereGeom}
   */
  public static final class SphereGeom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.SphereGeom)
      SphereGeomOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SphereGeom.newBuilder() to construct.
    private SphereGeom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SphereGeom() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SphereGeom();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.Spheregeom.internal_static_gazebo_msgs_SphereGeom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.Spheregeom.internal_static_gazebo_msgs_SphereGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.Spheregeom.SphereGeom.class, gazebo.msgs.Spheregeom.SphereGeom.Builder.class);
    }

    private int bitField0_;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private double radius_ = 0D;
    /**
     * <pre>
     *&#47; &#92;brief Radius of the sphere.
     * </pre>
     *
     * <code>required double radius = 1;</code>
     * @return Whether the radius field is set.
     */
    @java.lang.Override
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Radius of the sphere.
     * </pre>
     *
     * <code>required double radius = 1;</code>
     * @return The radius.
     */
    @java.lang.Override
    public double getRadius() {
      return radius_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRadius()) {
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
        output.writeDouble(1, radius_);
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
          .computeDoubleSize(1, radius_);
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
      if (!(obj instanceof gazebo.msgs.Spheregeom.SphereGeom)) {
        return super.equals(obj);
      }
      gazebo.msgs.Spheregeom.SphereGeom other = (gazebo.msgs.Spheregeom.SphereGeom) obj;

      if (hasRadius() != other.hasRadius()) return false;
      if (hasRadius()) {
        if (java.lang.Double.doubleToLongBits(getRadius())
            != java.lang.Double.doubleToLongBits(
                other.getRadius())) return false;
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
      if (hasRadius()) {
        hash = (37 * hash) + RADIUS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getRadius()));
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.Spheregeom.SphereGeom parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.Spheregeom.SphereGeom prototype) {
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
     * Protobuf type {@code gazebo.msgs.SphereGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.SphereGeom)
        gazebo.msgs.Spheregeom.SphereGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.Spheregeom.internal_static_gazebo_msgs_SphereGeom_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.Spheregeom.internal_static_gazebo_msgs_SphereGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.Spheregeom.SphereGeom.class, gazebo.msgs.Spheregeom.SphereGeom.Builder.class);
      }

      // Construct using gazebo.msgs.Spheregeom.SphereGeom.newBuilder()
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
        radius_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.Spheregeom.internal_static_gazebo_msgs_SphereGeom_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.Spheregeom.SphereGeom getDefaultInstanceForType() {
        return gazebo.msgs.Spheregeom.SphereGeom.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.Spheregeom.SphereGeom build() {
        gazebo.msgs.Spheregeom.SphereGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.Spheregeom.SphereGeom buildPartial() {
        gazebo.msgs.Spheregeom.SphereGeom result = new gazebo.msgs.Spheregeom.SphereGeom(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.Spheregeom.SphereGeom result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.radius_ = radius_;
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof gazebo.msgs.Spheregeom.SphereGeom) {
          return mergeFrom((gazebo.msgs.Spheregeom.SphereGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.Spheregeom.SphereGeom other) {
        if (other == gazebo.msgs.Spheregeom.SphereGeom.getDefaultInstance()) return this;
        if (other.hasRadius()) {
          setRadius(other.getRadius());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRadius()) {
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
                radius_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
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

      private double radius_ ;
      /**
       * <pre>
       *&#47; &#92;brief Radius of the sphere.
       * </pre>
       *
       * <code>required double radius = 1;</code>
       * @return Whether the radius field is set.
       */
      @java.lang.Override
      public boolean hasRadius() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Radius of the sphere.
       * </pre>
       *
       * <code>required double radius = 1;</code>
       * @return The radius.
       */
      @java.lang.Override
      public double getRadius() {
        return radius_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Radius of the sphere.
       * </pre>
       *
       * <code>required double radius = 1;</code>
       * @param value The radius to set.
       * @return This builder for chaining.
       */
      public Builder setRadius(double value) {
        
        radius_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Radius of the sphere.
       * </pre>
       *
       * <code>required double radius = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRadius() {
        bitField0_ = (bitField0_ & ~0x00000001);
        radius_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.SphereGeom)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.SphereGeom)
    private static final gazebo.msgs.Spheregeom.SphereGeom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.Spheregeom.SphereGeom();
    }

    public static gazebo.msgs.Spheregeom.SphereGeom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SphereGeom>
        PARSER = new com.google.protobuf.AbstractParser<SphereGeom>() {
      @java.lang.Override
      public SphereGeom parsePartialFrom(
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

    public static com.google.protobuf.Parser<SphereGeom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SphereGeom> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.Spheregeom.SphereGeom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_SphereGeom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_SphereGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020spheregeom.proto\022\013gazebo.msgs\"\034\n\nSpher" +
      "eGeom\022\016\n\006radius\030\001 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_SphereGeom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_SphereGeom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_SphereGeom_descriptor,
        new java.lang.String[] { "Radius", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
