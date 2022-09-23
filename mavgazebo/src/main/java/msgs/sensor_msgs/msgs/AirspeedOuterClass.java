// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Airspeed.proto

package msgs.sensor_msgs.msgs;

public final class AirspeedOuterClass {
  private AirspeedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AirspeedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sensor_msgs.msgs.Airspeed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 time_usec = 1;</code>
     * @return Whether the timeUsec field is set.
     */
    boolean hasTimeUsec();
    /**
     * <code>required int64 time_usec = 1;</code>
     * @return The timeUsec.
     */
    long getTimeUsec();

    /**
     * <code>required double diff_pressure = 2;</code>
     * @return Whether the diffPressure field is set.
     */
    boolean hasDiffPressure();
    /**
     * <code>required double diff_pressure = 2;</code>
     * @return The diffPressure.
     */
    double getDiffPressure();
  }
  /**
   * Protobuf type {@code sensor_msgs.msgs.Airspeed}
   */
  public static final class Airspeed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sensor_msgs.msgs.Airspeed)
      AirspeedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Airspeed.newBuilder() to construct.
    private Airspeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Airspeed() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Airspeed();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Airspeed(
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
              timeUsec_ = input.readInt64();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              diffPressure_ = input.readDouble();
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
      return msgs.sensor_msgs.msgs.AirspeedOuterClass.internal_static_sensor_msgs_msgs_Airspeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msgs.sensor_msgs.msgs.AirspeedOuterClass.internal_static_sensor_msgs_msgs_Airspeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.class, msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_USEC_FIELD_NUMBER = 1;
    private long timeUsec_;
    /**
     * <code>required int64 time_usec = 1;</code>
     * @return Whether the timeUsec field is set.
     */
    @java.lang.Override
    public boolean hasTimeUsec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 time_usec = 1;</code>
     * @return The timeUsec.
     */
    @java.lang.Override
    public long getTimeUsec() {
      return timeUsec_;
    }

    public static final int DIFF_PRESSURE_FIELD_NUMBER = 2;
    private double diffPressure_;
    /**
     * <code>required double diff_pressure = 2;</code>
     * @return Whether the diffPressure field is set.
     */
    @java.lang.Override
    public boolean hasDiffPressure() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required double diff_pressure = 2;</code>
     * @return The diffPressure.
     */
    @java.lang.Override
    public double getDiffPressure() {
      return diffPressure_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTimeUsec()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDiffPressure()) {
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
        output.writeInt64(1, timeUsec_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, diffPressure_);
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
          .computeInt64Size(1, timeUsec_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, diffPressure_);
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
      if (!(obj instanceof msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed)) {
        return super.equals(obj);
      }
      msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed other = (msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed) obj;

      if (hasTimeUsec() != other.hasTimeUsec()) return false;
      if (hasTimeUsec()) {
        if (getTimeUsec()
            != other.getTimeUsec()) return false;
      }
      if (hasDiffPressure() != other.hasDiffPressure()) return false;
      if (hasDiffPressure()) {
        if (java.lang.Double.doubleToLongBits(getDiffPressure())
            != java.lang.Double.doubleToLongBits(
                other.getDiffPressure())) return false;
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
      if (hasTimeUsec()) {
        hash = (37 * hash) + TIME_USEC_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTimeUsec());
      }
      if (hasDiffPressure()) {
        hash = (37 * hash) + DIFF_PRESSURE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDiffPressure()));
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parseFrom(
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
    public static Builder newBuilder(msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed prototype) {
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
     * Protobuf type {@code sensor_msgs.msgs.Airspeed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sensor_msgs.msgs.Airspeed)
        msgs.sensor_msgs.msgs.AirspeedOuterClass.AirspeedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return msgs.sensor_msgs.msgs.AirspeedOuterClass.internal_static_sensor_msgs_msgs_Airspeed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return msgs.sensor_msgs.msgs.AirspeedOuterClass.internal_static_sensor_msgs_msgs_Airspeed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.class, msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.Builder.class);
      }

      // Construct using sensor_msgs.msgs.AirspeedOuterClass.Airspeed.newBuilder()
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
        timeUsec_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        diffPressure_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return msgs.sensor_msgs.msgs.AirspeedOuterClass.internal_static_sensor_msgs_msgs_Airspeed_descriptor;
      }

      @java.lang.Override
      public msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed getDefaultInstanceForType() {
        return msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.getDefaultInstance();
      }

      @java.lang.Override
      public msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed build() {
        msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed buildPartial() {
        msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed result = new msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timeUsec_ = timeUsec_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.diffPressure_ = diffPressure_;
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
        if (other instanceof msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed) {
          return mergeFrom((msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed other) {
        if (other == msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed.getDefaultInstance()) return this;
        if (other.hasTimeUsec()) {
          setTimeUsec(other.getTimeUsec());
        }
        if (other.hasDiffPressure()) {
          setDiffPressure(other.getDiffPressure());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTimeUsec()) {
          return false;
        }
        if (!hasDiffPressure()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long timeUsec_ ;
      /**
       * <code>required int64 time_usec = 1;</code>
       * @return Whether the timeUsec field is set.
       */
      @java.lang.Override
      public boolean hasTimeUsec() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int64 time_usec = 1;</code>
       * @return The timeUsec.
       */
      @java.lang.Override
      public long getTimeUsec() {
        return timeUsec_;
      }
      /**
       * <code>required int64 time_usec = 1;</code>
       * @param value The timeUsec to set.
       * @return This builder for chaining.
       */
      public Builder setTimeUsec(long value) {
        bitField0_ |= 0x00000001;
        timeUsec_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 time_usec = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeUsec() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timeUsec_ = 0L;
        onChanged();
        return this;
      }

      private double diffPressure_ ;
      /**
       * <code>required double diff_pressure = 2;</code>
       * @return Whether the diffPressure field is set.
       */
      @java.lang.Override
      public boolean hasDiffPressure() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required double diff_pressure = 2;</code>
       * @return The diffPressure.
       */
      @java.lang.Override
      public double getDiffPressure() {
        return diffPressure_;
      }
      /**
       * <code>required double diff_pressure = 2;</code>
       * @param value The diffPressure to set.
       * @return This builder for chaining.
       */
      public Builder setDiffPressure(double value) {
        bitField0_ |= 0x00000002;
        diffPressure_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double diff_pressure = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiffPressure() {
        bitField0_ = (bitField0_ & ~0x00000002);
        diffPressure_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:sensor_msgs.msgs.Airspeed)
    }

    // @@protoc_insertion_point(class_scope:sensor_msgs.msgs.Airspeed)
    private static final msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed();
    }

    public static msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Airspeed>
        PARSER = new com.google.protobuf.AbstractParser<Airspeed>() {
      @java.lang.Override
      public Airspeed parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Airspeed(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Airspeed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Airspeed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public msgs.sensor_msgs.msgs.AirspeedOuterClass.Airspeed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_msgs_msgs_Airspeed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_msgs_msgs_Airspeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Airspeed.proto\022\020sensor_msgs.msgs\"4\n\010Ai" +
      "rspeed\022\021\n\ttime_usec\030\001 \002(\003\022\025\n\rdiff_pressu" +
      "re\030\002 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sensor_msgs_msgs_Airspeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensor_msgs_msgs_Airspeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_msgs_msgs_Airspeed_descriptor,
        new java.lang.String[] { "TimeUsec", "DiffPressure", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}