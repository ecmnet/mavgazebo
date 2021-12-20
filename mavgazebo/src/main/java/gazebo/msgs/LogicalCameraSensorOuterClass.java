// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logical_camera_sensor.proto

package gazebo.msgs;

public final class LogicalCameraSensorOuterClass {
  private LogicalCameraSensorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LogicalCameraSensorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.LogicalCameraSensor)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *&#47; &#92;brief Near clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double near_clip = 1;</code>
     * @return Whether the nearClip field is set.
     */
    boolean hasNearClip();
    /**
     * <pre>
     *&#47; &#92;brief Near clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double near_clip = 1;</code>
     * @return The nearClip.
     */
    double getNearClip();

    /**
     * <pre>
     *&#47; &#92;brief Far clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double far_clip = 2;</code>
     * @return Whether the farClip field is set.
     */
    boolean hasFarClip();
    /**
     * <pre>
     *&#47; &#92;brief Far clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double far_clip = 2;</code>
     * @return The farClip.
     */
    double getFarClip();

    /**
     * <pre>
     *&#47; &#92;brief Horizontal field of view in radians.
     * </pre>
     *
     * <code>required double horizontal_fov = 3;</code>
     * @return Whether the horizontalFov field is set.
     */
    boolean hasHorizontalFov();
    /**
     * <pre>
     *&#47; &#92;brief Horizontal field of view in radians.
     * </pre>
     *
     * <code>required double horizontal_fov = 3;</code>
     * @return The horizontalFov.
     */
    double getHorizontalFov();

    /**
     * <pre>
     *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
     * </pre>
     *
     * <code>required double aspect_ratio = 4;</code>
     * @return Whether the aspectRatio field is set.
     */
    boolean hasAspectRatio();
    /**
     * <pre>
     *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
     * </pre>
     *
     * <code>required double aspect_ratio = 4;</code>
     * @return The aspectRatio.
     */
    double getAspectRatio();
  }
  /**
   * Protobuf type {@code gazebo.msgs.LogicalCameraSensor}
   */
  public static final class LogicalCameraSensor extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.LogicalCameraSensor)
      LogicalCameraSensorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogicalCameraSensor.newBuilder() to construct.
    private LogicalCameraSensor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogicalCameraSensor() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogicalCameraSensor();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LogicalCameraSensor(
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
            case 9: {
              bitField0_ |= 0x00000001;
              nearClip_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              farClip_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              horizontalFov_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              aspectRatio_ = input.readDouble();
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
      return gazebo.msgs.LogicalCameraSensorOuterClass.internal_static_gazebo_msgs_LogicalCameraSensor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.LogicalCameraSensorOuterClass.internal_static_gazebo_msgs_LogicalCameraSensor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.class, gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.Builder.class);
    }

    private int bitField0_;
    public static final int NEAR_CLIP_FIELD_NUMBER = 1;
    private double nearClip_;
    /**
     * <pre>
     *&#47; &#92;brief Near clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double near_clip = 1;</code>
     * @return Whether the nearClip field is set.
     */
    @java.lang.Override
    public boolean hasNearClip() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Near clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double near_clip = 1;</code>
     * @return The nearClip.
     */
    @java.lang.Override
    public double getNearClip() {
      return nearClip_;
    }

    public static final int FAR_CLIP_FIELD_NUMBER = 2;
    private double farClip_;
    /**
     * <pre>
     *&#47; &#92;brief Far clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double far_clip = 2;</code>
     * @return Whether the farClip field is set.
     */
    @java.lang.Override
    public boolean hasFarClip() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Far clipping plane of the view frustum in meters.
     * </pre>
     *
     * <code>required double far_clip = 2;</code>
     * @return The farClip.
     */
    @java.lang.Override
    public double getFarClip() {
      return farClip_;
    }

    public static final int HORIZONTAL_FOV_FIELD_NUMBER = 3;
    private double horizontalFov_;
    /**
     * <pre>
     *&#47; &#92;brief Horizontal field of view in radians.
     * </pre>
     *
     * <code>required double horizontal_fov = 3;</code>
     * @return Whether the horizontalFov field is set.
     */
    @java.lang.Override
    public boolean hasHorizontalFov() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Horizontal field of view in radians.
     * </pre>
     *
     * <code>required double horizontal_fov = 3;</code>
     * @return The horizontalFov.
     */
    @java.lang.Override
    public double getHorizontalFov() {
      return horizontalFov_;
    }

    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    private double aspectRatio_;
    /**
     * <pre>
     *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
     * </pre>
     *
     * <code>required double aspect_ratio = 4;</code>
     * @return Whether the aspectRatio field is set.
     */
    @java.lang.Override
    public boolean hasAspectRatio() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
     * </pre>
     *
     * <code>required double aspect_ratio = 4;</code>
     * @return The aspectRatio.
     */
    @java.lang.Override
    public double getAspectRatio() {
      return aspectRatio_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNearClip()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFarClip()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHorizontalFov()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAspectRatio()) {
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
        output.writeDouble(1, nearClip_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, farClip_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, horizontalFov_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeDouble(4, aspectRatio_);
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
          .computeDoubleSize(1, nearClip_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, farClip_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, horizontalFov_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, aspectRatio_);
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
      if (!(obj instanceof gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor)) {
        return super.equals(obj);
      }
      gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor other = (gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor) obj;

      if (hasNearClip() != other.hasNearClip()) return false;
      if (hasNearClip()) {
        if (java.lang.Double.doubleToLongBits(getNearClip())
            != java.lang.Double.doubleToLongBits(
                other.getNearClip())) return false;
      }
      if (hasFarClip() != other.hasFarClip()) return false;
      if (hasFarClip()) {
        if (java.lang.Double.doubleToLongBits(getFarClip())
            != java.lang.Double.doubleToLongBits(
                other.getFarClip())) return false;
      }
      if (hasHorizontalFov() != other.hasHorizontalFov()) return false;
      if (hasHorizontalFov()) {
        if (java.lang.Double.doubleToLongBits(getHorizontalFov())
            != java.lang.Double.doubleToLongBits(
                other.getHorizontalFov())) return false;
      }
      if (hasAspectRatio() != other.hasAspectRatio()) return false;
      if (hasAspectRatio()) {
        if (java.lang.Double.doubleToLongBits(getAspectRatio())
            != java.lang.Double.doubleToLongBits(
                other.getAspectRatio())) return false;
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
      if (hasNearClip()) {
        hash = (37 * hash) + NEAR_CLIP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getNearClip()));
      }
      if (hasFarClip()) {
        hash = (37 * hash) + FAR_CLIP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getFarClip()));
      }
      if (hasHorizontalFov()) {
        hash = (37 * hash) + HORIZONTAL_FOV_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getHorizontalFov()));
      }
      if (hasAspectRatio()) {
        hash = (37 * hash) + ASPECT_RATIO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getAspectRatio()));
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor prototype) {
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
     * Protobuf type {@code gazebo.msgs.LogicalCameraSensor}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.LogicalCameraSensor)
        gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.LogicalCameraSensorOuterClass.internal_static_gazebo_msgs_LogicalCameraSensor_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.LogicalCameraSensorOuterClass.internal_static_gazebo_msgs_LogicalCameraSensor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.class, gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.Builder.class);
      }

      // Construct using gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        nearClip_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        farClip_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        horizontalFov_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        aspectRatio_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.LogicalCameraSensorOuterClass.internal_static_gazebo_msgs_LogicalCameraSensor_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor getDefaultInstanceForType() {
        return gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor build() {
        gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor buildPartial() {
        gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor result = new gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nearClip_ = nearClip_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.farClip_ = farClip_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.horizontalFov_ = horizontalFov_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.aspectRatio_ = aspectRatio_;
          to_bitField0_ |= 0x00000008;
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
        if (other instanceof gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor) {
          return mergeFrom((gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor other) {
        if (other == gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor.getDefaultInstance()) return this;
        if (other.hasNearClip()) {
          setNearClip(other.getNearClip());
        }
        if (other.hasFarClip()) {
          setFarClip(other.getFarClip());
        }
        if (other.hasHorizontalFov()) {
          setHorizontalFov(other.getHorizontalFov());
        }
        if (other.hasAspectRatio()) {
          setAspectRatio(other.getAspectRatio());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNearClip()) {
          return false;
        }
        if (!hasFarClip()) {
          return false;
        }
        if (!hasHorizontalFov()) {
          return false;
        }
        if (!hasAspectRatio()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private double nearClip_ ;
      /**
       * <pre>
       *&#47; &#92;brief Near clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double near_clip = 1;</code>
       * @return Whether the nearClip field is set.
       */
      @java.lang.Override
      public boolean hasNearClip() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Near clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double near_clip = 1;</code>
       * @return The nearClip.
       */
      @java.lang.Override
      public double getNearClip() {
        return nearClip_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Near clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double near_clip = 1;</code>
       * @param value The nearClip to set.
       * @return This builder for chaining.
       */
      public Builder setNearClip(double value) {
        bitField0_ |= 0x00000001;
        nearClip_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Near clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double near_clip = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNearClip() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nearClip_ = 0D;
        onChanged();
        return this;
      }

      private double farClip_ ;
      /**
       * <pre>
       *&#47; &#92;brief Far clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double far_clip = 2;</code>
       * @return Whether the farClip field is set.
       */
      @java.lang.Override
      public boolean hasFarClip() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Far clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double far_clip = 2;</code>
       * @return The farClip.
       */
      @java.lang.Override
      public double getFarClip() {
        return farClip_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Far clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double far_clip = 2;</code>
       * @param value The farClip to set.
       * @return This builder for chaining.
       */
      public Builder setFarClip(double value) {
        bitField0_ |= 0x00000002;
        farClip_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Far clipping plane of the view frustum in meters.
       * </pre>
       *
       * <code>required double far_clip = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFarClip() {
        bitField0_ = (bitField0_ & ~0x00000002);
        farClip_ = 0D;
        onChanged();
        return this;
      }

      private double horizontalFov_ ;
      /**
       * <pre>
       *&#47; &#92;brief Horizontal field of view in radians.
       * </pre>
       *
       * <code>required double horizontal_fov = 3;</code>
       * @return Whether the horizontalFov field is set.
       */
      @java.lang.Override
      public boolean hasHorizontalFov() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Horizontal field of view in radians.
       * </pre>
       *
       * <code>required double horizontal_fov = 3;</code>
       * @return The horizontalFov.
       */
      @java.lang.Override
      public double getHorizontalFov() {
        return horizontalFov_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Horizontal field of view in radians.
       * </pre>
       *
       * <code>required double horizontal_fov = 3;</code>
       * @param value The horizontalFov to set.
       * @return This builder for chaining.
       */
      public Builder setHorizontalFov(double value) {
        bitField0_ |= 0x00000004;
        horizontalFov_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Horizontal field of view in radians.
       * </pre>
       *
       * <code>required double horizontal_fov = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHorizontalFov() {
        bitField0_ = (bitField0_ & ~0x00000004);
        horizontalFov_ = 0D;
        onChanged();
        return this;
      }

      private double aspectRatio_ ;
      /**
       * <pre>
       *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
       * </pre>
       *
       * <code>required double aspect_ratio = 4;</code>
       * @return Whether the aspectRatio field is set.
       */
      @java.lang.Override
      public boolean hasAspectRatio() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
       * </pre>
       *
       * <code>required double aspect_ratio = 4;</code>
       * @return The aspectRatio.
       */
      @java.lang.Override
      public double getAspectRatio() {
        return aspectRatio_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
       * </pre>
       *
       * <code>required double aspect_ratio = 4;</code>
       * @param value The aspectRatio to set.
       * @return This builder for chaining.
       */
      public Builder setAspectRatio(double value) {
        bitField0_ |= 0x00000008;
        aspectRatio_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Near and far clipping plane aspect ratio (width/height).
       * </pre>
       *
       * <code>required double aspect_ratio = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAspectRatio() {
        bitField0_ = (bitField0_ & ~0x00000008);
        aspectRatio_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.LogicalCameraSensor)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.LogicalCameraSensor)
    private static final gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor();
    }

    public static gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LogicalCameraSensor>
        PARSER = new com.google.protobuf.AbstractParser<LogicalCameraSensor>() {
      @java.lang.Override
      public LogicalCameraSensor parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogicalCameraSensor(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LogicalCameraSensor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogicalCameraSensor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.LogicalCameraSensorOuterClass.LogicalCameraSensor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_LogicalCameraSensor_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_LogicalCameraSensor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033logical_camera_sensor.proto\022\013gazebo.ms" +
      "gs\"h\n\023LogicalCameraSensor\022\021\n\tnear_clip\030\001" +
      " \002(\001\022\020\n\010far_clip\030\002 \002(\001\022\026\n\016horizontal_fov" +
      "\030\003 \002(\001\022\024\n\014aspect_ratio\030\004 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_LogicalCameraSensor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_LogicalCameraSensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_LogicalCameraSensor_descriptor,
        new java.lang.String[] { "NearClip", "FarClip", "HorizontalFov", "AspectRatio", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
