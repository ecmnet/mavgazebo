// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image.proto

package msgs.gazebo.msgs;

public final class ImageOuterClass {
  private ImageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Image)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Image width (number of columns)
     * </pre>
     *
     * <code>required uint32 width = 1;</code>
     * @return Whether the width field is set.
     */
    boolean hasWidth();
    /**
     * <pre>
     * Image width (number of columns)
     * </pre>
     *
     * <code>required uint32 width = 1;</code>
     * @return The width.
     */
    int getWidth();

    /**
     * <pre>
     * Image height (number of rows)
     * </pre>
     *
     * <code>required uint32 height = 2;</code>
     * @return Whether the height field is set.
     */
    boolean hasHeight();
    /**
     * <pre>
     * Image height (number of rows)
     * </pre>
     *
     * <code>required uint32 height = 2;</code>
     * @return The height.
     */
    int getHeight();

    /**
     * <pre>
     * Corresponds to Image::PixelFormat enum
     * </pre>
     *
     * <code>required uint32 pixel_format = 3;</code>
     * @return Whether the pixelFormat field is set.
     */
    boolean hasPixelFormat();
    /**
     * <pre>
     * Corresponds to Image::PixelFormat enum
     * </pre>
     *
     * <code>required uint32 pixel_format = 3;</code>
     * @return The pixelFormat.
     */
    int getPixelFormat();

    /**
     * <pre>
     * Full row length in bytes
     * </pre>
     *
     * <code>required uint32 step = 4;</code>
     * @return Whether the step field is set.
     */
    boolean hasStep();
    /**
     * <pre>
     * Full row length in bytes
     * </pre>
     *
     * <code>required uint32 step = 4;</code>
     * @return The step.
     */
    int getStep();

    /**
     * <pre>
     * repeated uint32 data          = 5; // Actual data, size if (step * rows)
     * </pre>
     *
     * <code>required bytes data = 5;</code>
     * @return Whether the data field is set.
     */
    boolean hasData();
    /**
     * <pre>
     * repeated uint32 data          = 5; // Actual data, size if (step * rows)
     * </pre>
     *
     * <code>required bytes data = 5;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Image}
   */
  public static final class Image extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Image)
      ImageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Image.newBuilder() to construct.
    private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Image() {
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Image();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Image(
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
            case 8: {
              bitField0_ |= 0x00000001;
              width_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              height_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              pixelFormat_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              step_ = input.readUInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              data_ = input.readBytes();
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
      return msgs.gazebo.msgs.ImageOuterClass.internal_static_gazebo_msgs_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msgs.gazebo.msgs.ImageOuterClass.internal_static_gazebo_msgs_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msgs.gazebo.msgs.ImageOuterClass.Image.class, msgs.gazebo.msgs.ImageOuterClass.Image.Builder.class);
    }

    private int bitField0_;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int width_;
    /**
     * <pre>
     * Image width (number of columns)
     * </pre>
     *
     * <code>required uint32 width = 1;</code>
     * @return Whether the width field is set.
     */
    @java.lang.Override
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Image width (number of columns)
     * </pre>
     *
     * <code>required uint32 width = 1;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 2;
    private int height_;
    /**
     * <pre>
     * Image height (number of rows)
     * </pre>
     *
     * <code>required uint32 height = 2;</code>
     * @return Whether the height field is set.
     */
    @java.lang.Override
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Image height (number of rows)
     * </pre>
     *
     * <code>required uint32 height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }

    public static final int PIXEL_FORMAT_FIELD_NUMBER = 3;
    private int pixelFormat_;
    /**
     * <pre>
     * Corresponds to Image::PixelFormat enum
     * </pre>
     *
     * <code>required uint32 pixel_format = 3;</code>
     * @return Whether the pixelFormat field is set.
     */
    @java.lang.Override
    public boolean hasPixelFormat() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Corresponds to Image::PixelFormat enum
     * </pre>
     *
     * <code>required uint32 pixel_format = 3;</code>
     * @return The pixelFormat.
     */
    @java.lang.Override
    public int getPixelFormat() {
      return pixelFormat_;
    }

    public static final int STEP_FIELD_NUMBER = 4;
    private int step_;
    /**
     * <pre>
     * Full row length in bytes
     * </pre>
     *
     * <code>required uint32 step = 4;</code>
     * @return Whether the step field is set.
     */
    @java.lang.Override
    public boolean hasStep() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Full row length in bytes
     * </pre>
     *
     * <code>required uint32 step = 4;</code>
     * @return The step.
     */
    @java.lang.Override
    public int getStep() {
      return step_;
    }

    public static final int DATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString data_;
    /**
     * <pre>
     * repeated uint32 data          = 5; // Actual data, size if (step * rows)
     * </pre>
     *
     * <code>required bytes data = 5;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * repeated uint32 data          = 5; // Actual data, size if (step * rows)
     * </pre>
     *
     * <code>required bytes data = 5;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasWidth()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHeight()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPixelFormat()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStep()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
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
        output.writeUInt32(1, width_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, height_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, pixelFormat_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt32(4, step_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeBytes(5, data_);
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
          .computeUInt32Size(1, width_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, height_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, pixelFormat_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, step_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, data_);
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
      if (!(obj instanceof msgs.gazebo.msgs.ImageOuterClass.Image)) {
        return super.equals(obj);
      }
      msgs.gazebo.msgs.ImageOuterClass.Image other = (msgs.gazebo.msgs.ImageOuterClass.Image) obj;

      if (hasWidth() != other.hasWidth()) return false;
      if (hasWidth()) {
        if (getWidth()
            != other.getWidth()) return false;
      }
      if (hasHeight() != other.hasHeight()) return false;
      if (hasHeight()) {
        if (getHeight()
            != other.getHeight()) return false;
      }
      if (hasPixelFormat() != other.hasPixelFormat()) return false;
      if (hasPixelFormat()) {
        if (getPixelFormat()
            != other.getPixelFormat()) return false;
      }
      if (hasStep() != other.hasStep()) return false;
      if (hasStep()) {
        if (getStep()
            != other.getStep()) return false;
      }
      if (hasData() != other.hasData()) return false;
      if (hasData()) {
        if (!getData()
            .equals(other.getData())) return false;
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
      if (hasWidth()) {
        hash = (37 * hash) + WIDTH_FIELD_NUMBER;
        hash = (53 * hash) + getWidth();
      }
      if (hasHeight()) {
        hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getHeight();
      }
      if (hasPixelFormat()) {
        hash = (37 * hash) + PIXEL_FORMAT_FIELD_NUMBER;
        hash = (53 * hash) + getPixelFormat();
      }
      if (hasStep()) {
        hash = (37 * hash) + STEP_FIELD_NUMBER;
        hash = (53 * hash) + getStep();
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.ImageOuterClass.Image parseFrom(
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
    public static Builder newBuilder(msgs.gazebo.msgs.ImageOuterClass.Image prototype) {
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
     * Protobuf type {@code gazebo.msgs.Image}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Image)
        msgs.gazebo.msgs.ImageOuterClass.ImageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return msgs.gazebo.msgs.ImageOuterClass.internal_static_gazebo_msgs_Image_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return msgs.gazebo.msgs.ImageOuterClass.internal_static_gazebo_msgs_Image_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                msgs.gazebo.msgs.ImageOuterClass.Image.class, msgs.gazebo.msgs.ImageOuterClass.Image.Builder.class);
      }

      // Construct using gazebo.msgs.ImageOuterClass.Image.newBuilder()
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
        width_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        height_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        pixelFormat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        step_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return msgs.gazebo.msgs.ImageOuterClass.internal_static_gazebo_msgs_Image_descriptor;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.ImageOuterClass.Image getDefaultInstanceForType() {
        return msgs.gazebo.msgs.ImageOuterClass.Image.getDefaultInstance();
      }

      @java.lang.Override
      public msgs.gazebo.msgs.ImageOuterClass.Image build() {
        msgs.gazebo.msgs.ImageOuterClass.Image result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.ImageOuterClass.Image buildPartial() {
        msgs.gazebo.msgs.ImageOuterClass.Image result = new msgs.gazebo.msgs.ImageOuterClass.Image(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.width_ = width_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.height_ = height_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.pixelFormat_ = pixelFormat_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.step_ = step_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.data_ = data_;
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
        if (other instanceof msgs.gazebo.msgs.ImageOuterClass.Image) {
          return mergeFrom((msgs.gazebo.msgs.ImageOuterClass.Image)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(msgs.gazebo.msgs.ImageOuterClass.Image other) {
        if (other == msgs.gazebo.msgs.ImageOuterClass.Image.getDefaultInstance()) return this;
        if (other.hasWidth()) {
          setWidth(other.getWidth());
        }
        if (other.hasHeight()) {
          setHeight(other.getHeight());
        }
        if (other.hasPixelFormat()) {
          setPixelFormat(other.getPixelFormat());
        }
        if (other.hasStep()) {
          setStep(other.getStep());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasWidth()) {
          return false;
        }
        if (!hasHeight()) {
          return false;
        }
        if (!hasPixelFormat()) {
          return false;
        }
        if (!hasStep()) {
          return false;
        }
        if (!hasData()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        msgs.gazebo.msgs.ImageOuterClass.Image parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (msgs.gazebo.msgs.ImageOuterClass.Image) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int width_ ;
      /**
       * <pre>
       * Image width (number of columns)
       * </pre>
       *
       * <code>required uint32 width = 1;</code>
       * @return Whether the width field is set.
       */
      @java.lang.Override
      public boolean hasWidth() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Image width (number of columns)
       * </pre>
       *
       * <code>required uint32 width = 1;</code>
       * @return The width.
       */
      @java.lang.Override
      public int getWidth() {
        return width_;
      }
      /**
       * <pre>
       * Image width (number of columns)
       * </pre>
       *
       * <code>required uint32 width = 1;</code>
       * @param value The width to set.
       * @return This builder for chaining.
       */
      public Builder setWidth(int value) {
        bitField0_ |= 0x00000001;
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Image width (number of columns)
       * </pre>
       *
       * <code>required uint32 width = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWidth() {
        bitField0_ = (bitField0_ & ~0x00000001);
        width_ = 0;
        onChanged();
        return this;
      }

      private int height_ ;
      /**
       * <pre>
       * Image height (number of rows)
       * </pre>
       *
       * <code>required uint32 height = 2;</code>
       * @return Whether the height field is set.
       */
      @java.lang.Override
      public boolean hasHeight() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Image height (number of rows)
       * </pre>
       *
       * <code>required uint32 height = 2;</code>
       * @return The height.
       */
      @java.lang.Override
      public int getHeight() {
        return height_;
      }
      /**
       * <pre>
       * Image height (number of rows)
       * </pre>
       *
       * <code>required uint32 height = 2;</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(int value) {
        bitField0_ |= 0x00000002;
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Image height (number of rows)
       * </pre>
       *
       * <code>required uint32 height = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000002);
        height_ = 0;
        onChanged();
        return this;
      }

      private int pixelFormat_ ;
      /**
       * <pre>
       * Corresponds to Image::PixelFormat enum
       * </pre>
       *
       * <code>required uint32 pixel_format = 3;</code>
       * @return Whether the pixelFormat field is set.
       */
      @java.lang.Override
      public boolean hasPixelFormat() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Corresponds to Image::PixelFormat enum
       * </pre>
       *
       * <code>required uint32 pixel_format = 3;</code>
       * @return The pixelFormat.
       */
      @java.lang.Override
      public int getPixelFormat() {
        return pixelFormat_;
      }
      /**
       * <pre>
       * Corresponds to Image::PixelFormat enum
       * </pre>
       *
       * <code>required uint32 pixel_format = 3;</code>
       * @param value The pixelFormat to set.
       * @return This builder for chaining.
       */
      public Builder setPixelFormat(int value) {
        bitField0_ |= 0x00000004;
        pixelFormat_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Corresponds to Image::PixelFormat enum
       * </pre>
       *
       * <code>required uint32 pixel_format = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPixelFormat() {
        bitField0_ = (bitField0_ & ~0x00000004);
        pixelFormat_ = 0;
        onChanged();
        return this;
      }

      private int step_ ;
      /**
       * <pre>
       * Full row length in bytes
       * </pre>
       *
       * <code>required uint32 step = 4;</code>
       * @return Whether the step field is set.
       */
      @java.lang.Override
      public boolean hasStep() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Full row length in bytes
       * </pre>
       *
       * <code>required uint32 step = 4;</code>
       * @return The step.
       */
      @java.lang.Override
      public int getStep() {
        return step_;
      }
      /**
       * <pre>
       * Full row length in bytes
       * </pre>
       *
       * <code>required uint32 step = 4;</code>
       * @param value The step to set.
       * @return This builder for chaining.
       */
      public Builder setStep(int value) {
        bitField0_ |= 0x00000008;
        step_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Full row length in bytes
       * </pre>
       *
       * <code>required uint32 step = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStep() {
        bitField0_ = (bitField0_ & ~0x00000008);
        step_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * repeated uint32 data          = 5; // Actual data, size if (step * rows)
       * </pre>
       *
       * <code>required bytes data = 5;</code>
       * @return Whether the data field is set.
       */
      @java.lang.Override
      public boolean hasData() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * repeated uint32 data          = 5; // Actual data, size if (step * rows)
       * </pre>
       *
       * <code>required bytes data = 5;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <pre>
       * repeated uint32 data          = 5; // Actual data, size if (step * rows)
       * </pre>
       *
       * <code>required bytes data = 5;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * repeated uint32 data          = 5; // Actual data, size if (step * rows)
       * </pre>
       *
       * <code>required bytes data = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000010);
        data_ = getDefaultInstance().getData();
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Image)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Image)
    private static final msgs.gazebo.msgs.ImageOuterClass.Image DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new msgs.gazebo.msgs.ImageOuterClass.Image();
    }

    public static msgs.gazebo.msgs.ImageOuterClass.Image getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Image>
        PARSER = new com.google.protobuf.AbstractParser<Image>() {
      @java.lang.Override
      public Image parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Image(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Image> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Image> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public msgs.gazebo.msgs.ImageOuterClass.Image getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Image_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Image_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013image.proto\022\013gazebo.msgs\"X\n\005Image\022\r\n\005w" +
      "idth\030\001 \002(\r\022\016\n\006height\030\002 \002(\r\022\024\n\014pixel_form" +
      "at\030\003 \002(\r\022\014\n\004step\030\004 \002(\r\022\014\n\004data\030\005 \002(\014"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Image_descriptor,
        new java.lang.String[] { "Width", "Height", "PixelFormat", "Step", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}