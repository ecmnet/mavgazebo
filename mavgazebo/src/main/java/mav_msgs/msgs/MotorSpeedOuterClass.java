// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MotorSpeed.proto

package mav_msgs.msgs;

public final class MotorSpeedOuterClass {
  private MotorSpeedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MotorSpeedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:mav_msgs.msgs.MotorSpeed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @return A list containing the motorSpeed.
     */
    java.util.List<java.lang.Float> getMotorSpeedList();
    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @return The count of motorSpeed.
     */
    int getMotorSpeedCount();
    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The motorSpeed at the given index.
     */
    float getMotorSpeed(int index);
  }
  /**
   * Protobuf type {@code mav_msgs.msgs.MotorSpeed}
   */
  public static final class MotorSpeed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:mav_msgs.msgs.MotorSpeed)
      MotorSpeedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MotorSpeed.newBuilder() to construct.
    private MotorSpeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MotorSpeed() {
      motorSpeed_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MotorSpeed();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MotorSpeed(
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
            case 13: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                motorSpeed_ = newFloatList();
                mutable_bitField0_ |= 0x00000001;
              }
              motorSpeed_.addFloat(input.readFloat());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                motorSpeed_ = newFloatList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                motorSpeed_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          motorSpeed_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mav_msgs.msgs.MotorSpeedOuterClass.internal_static_mav_msgs_msgs_MotorSpeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mav_msgs.msgs.MotorSpeedOuterClass.internal_static_mav_msgs_msgs_MotorSpeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.class, mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.Builder.class);
    }

    public static final int MOTOR_SPEED_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.FloatList motorSpeed_;
    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @return A list containing the motorSpeed.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getMotorSpeedList() {
      return motorSpeed_;
    }
    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @return The count of motorSpeed.
     */
    public int getMotorSpeedCount() {
      return motorSpeed_.size();
    }
    /**
     * <code>repeated float motor_speed = 1 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The motorSpeed at the given index.
     */
    public float getMotorSpeed(int index) {
      return motorSpeed_.getFloat(index);
    }
    private int motorSpeedMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getMotorSpeedList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(motorSpeedMemoizedSerializedSize);
      }
      for (int i = 0; i < motorSpeed_.size(); i++) {
        output.writeFloatNoTag(motorSpeed_.getFloat(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        dataSize = 4 * getMotorSpeedList().size();
        size += dataSize;
        if (!getMotorSpeedList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        motorSpeedMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed)) {
        return super.equals(obj);
      }
      mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed other = (mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed) obj;

      if (!getMotorSpeedList()
          .equals(other.getMotorSpeedList())) return false;
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
      if (getMotorSpeedCount() > 0) {
        hash = (37 * hash) + MOTOR_SPEED_FIELD_NUMBER;
        hash = (53 * hash) + getMotorSpeedList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parseFrom(
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
    public static Builder newBuilder(mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed prototype) {
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
     * Protobuf type {@code mav_msgs.msgs.MotorSpeed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:mav_msgs.msgs.MotorSpeed)
        mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return mav_msgs.msgs.MotorSpeedOuterClass.internal_static_mav_msgs_msgs_MotorSpeed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return mav_msgs.msgs.MotorSpeedOuterClass.internal_static_mav_msgs_msgs_MotorSpeed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.class, mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.Builder.class);
      }

      // Construct using mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.newBuilder()
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
        motorSpeed_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return mav_msgs.msgs.MotorSpeedOuterClass.internal_static_mav_msgs_msgs_MotorSpeed_descriptor;
      }

      @java.lang.Override
      public mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed getDefaultInstanceForType() {
        return mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.getDefaultInstance();
      }

      @java.lang.Override
      public mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed build() {
        mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed buildPartial() {
        mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed result = new mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          motorSpeed_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.motorSpeed_ = motorSpeed_;
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
        if (other instanceof mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed) {
          return mergeFrom((mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed other) {
        if (other == mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed.getDefaultInstance()) return this;
        if (!other.motorSpeed_.isEmpty()) {
          if (motorSpeed_.isEmpty()) {
            motorSpeed_ = other.motorSpeed_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMotorSpeedIsMutable();
            motorSpeed_.addAll(other.motorSpeed_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.FloatList motorSpeed_ = emptyFloatList();
      private void ensureMotorSpeedIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          motorSpeed_ = mutableCopy(motorSpeed_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @return A list containing the motorSpeed.
       */
      public java.util.List<java.lang.Float>
          getMotorSpeedList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(motorSpeed_) : motorSpeed_;
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @return The count of motorSpeed.
       */
      public int getMotorSpeedCount() {
        return motorSpeed_.size();
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The motorSpeed at the given index.
       */
      public float getMotorSpeed(int index) {
        return motorSpeed_.getFloat(index);
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @param index The index to set the value at.
       * @param value The motorSpeed to set.
       * @return This builder for chaining.
       */
      public Builder setMotorSpeed(
          int index, float value) {
        ensureMotorSpeedIsMutable();
        motorSpeed_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @param value The motorSpeed to add.
       * @return This builder for chaining.
       */
      public Builder addMotorSpeed(float value) {
        ensureMotorSpeedIsMutable();
        motorSpeed_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @param values The motorSpeed to add.
       * @return This builder for chaining.
       */
      public Builder addAllMotorSpeed(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureMotorSpeedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, motorSpeed_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float motor_speed = 1 [packed = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearMotorSpeed() {
        motorSpeed_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:mav_msgs.msgs.MotorSpeed)
    }

    // @@protoc_insertion_point(class_scope:mav_msgs.msgs.MotorSpeed)
    private static final mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed();
    }

    public static mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MotorSpeed>
        PARSER = new com.google.protobuf.AbstractParser<MotorSpeed>() {
      @java.lang.Override
      public MotorSpeed parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MotorSpeed(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MotorSpeed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MotorSpeed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public mav_msgs.msgs.MotorSpeedOuterClass.MotorSpeed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mav_msgs_msgs_MotorSpeed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mav_msgs_msgs_MotorSpeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MotorSpeed.proto\022\rmav_msgs.msgs\"%\n\nMot" +
      "orSpeed\022\027\n\013motor_speed\030\001 \003(\002B\002\020\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mav_msgs_msgs_MotorSpeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mav_msgs_msgs_MotorSpeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mav_msgs_msgs_MotorSpeed_descriptor,
        new java.lang.String[] { "MotorSpeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
