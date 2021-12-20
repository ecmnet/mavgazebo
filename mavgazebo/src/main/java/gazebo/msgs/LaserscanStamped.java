// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laserscan_stamped.proto

package gazebo.msgs;

public final class LaserscanStamped {
  private LaserscanStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LaserScanStampedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.LaserScanStamped)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return Whether the time field is set.
     */
    boolean hasTime();
    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return The time.
     */
    gazebo.msgs.TimeOuterClass.Time getTime();
    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder();

    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     * @return Whether the scan field is set.
     */
    boolean hasScan();
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     * @return The scan.
     */
    gazebo.msgs.Laserscan.LaserScan getScan();
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    gazebo.msgs.Laserscan.LaserScanOrBuilder getScanOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.LaserScanStamped}
   */
  public static final class LaserScanStamped extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.LaserScanStamped)
      LaserScanStampedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LaserScanStamped.newBuilder() to construct.
    private LaserScanStamped(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LaserScanStamped() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LaserScanStamped();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LaserScanStamped(
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
              gazebo.msgs.TimeOuterClass.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(gazebo.msgs.TimeOuterClass.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              gazebo.msgs.Laserscan.LaserScan.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = scan_.toBuilder();
              }
              scan_ = input.readMessage(gazebo.msgs.Laserscan.LaserScan.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scan_);
                scan_ = subBuilder.buildPartial();
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
      return gazebo.msgs.LaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.LaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.LaserscanStamped.LaserScanStamped.class, gazebo.msgs.LaserscanStamped.LaserScanStamped.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.TimeOuterClass.Time time_;
    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return Whether the time field is set.
     */
    @java.lang.Override
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return The time.
     */
    @java.lang.Override
    public gazebo.msgs.TimeOuterClass.Time getTime() {
      return time_ == null ? gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
    }
    /**
     * <pre>
     * Time when the data was captured
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder() {
      return time_ == null ? gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
    }

    public static final int SCAN_FIELD_NUMBER = 2;
    private gazebo.msgs.Laserscan.LaserScan scan_;
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     * @return Whether the scan field is set.
     */
    @java.lang.Override
    public boolean hasScan() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     * @return The scan.
     */
    @java.lang.Override
    public gazebo.msgs.Laserscan.LaserScan getScan() {
      return scan_ == null ? gazebo.msgs.Laserscan.LaserScan.getDefaultInstance() : scan_;
    }
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Laserscan.LaserScanOrBuilder getScanOrBuilder() {
      return scan_ == null ? gazebo.msgs.Laserscan.LaserScan.getDefaultInstance() : scan_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScan()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getScan().isInitialized()) {
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
        output.writeMessage(1, getTime());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getScan());
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
          .computeMessageSize(1, getTime());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getScan());
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
      if (!(obj instanceof gazebo.msgs.LaserscanStamped.LaserScanStamped)) {
        return super.equals(obj);
      }
      gazebo.msgs.LaserscanStamped.LaserScanStamped other = (gazebo.msgs.LaserscanStamped.LaserScanStamped) obj;

      if (hasTime() != other.hasTime()) return false;
      if (hasTime()) {
        if (!getTime()
            .equals(other.getTime())) return false;
      }
      if (hasScan() != other.hasScan()) return false;
      if (hasScan()) {
        if (!getScan()
            .equals(other.getScan())) return false;
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
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      if (hasScan()) {
        hash = (37 * hash) + SCAN_FIELD_NUMBER;
        hash = (53 * hash) + getScan().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.LaserscanStamped.LaserScanStamped parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.LaserscanStamped.LaserScanStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.LaserScanStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.LaserScanStamped)
        gazebo.msgs.LaserscanStamped.LaserScanStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.LaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.LaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.LaserscanStamped.LaserScanStamped.class, gazebo.msgs.LaserscanStamped.LaserScanStamped.Builder.class);
      }

      // Construct using gazebo.msgs.LaserscanStamped.LaserScanStamped.newBuilder()
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
          getTimeFieldBuilder();
          getScanFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = null;
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (scanBuilder_ == null) {
          scan_ = null;
        } else {
          scanBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.LaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.LaserscanStamped.LaserScanStamped getDefaultInstanceForType() {
        return gazebo.msgs.LaserscanStamped.LaserScanStamped.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.LaserscanStamped.LaserScanStamped build() {
        gazebo.msgs.LaserscanStamped.LaserScanStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.LaserscanStamped.LaserScanStamped buildPartial() {
        gazebo.msgs.LaserscanStamped.LaserScanStamped result = new gazebo.msgs.LaserscanStamped.LaserScanStamped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (timeBuilder_ == null) {
            result.time_ = time_;
          } else {
            result.time_ = timeBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (scanBuilder_ == null) {
            result.scan_ = scan_;
          } else {
            result.scan_ = scanBuilder_.build();
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
        if (other instanceof gazebo.msgs.LaserscanStamped.LaserScanStamped) {
          return mergeFrom((gazebo.msgs.LaserscanStamped.LaserScanStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.LaserscanStamped.LaserScanStamped other) {
        if (other == gazebo.msgs.LaserscanStamped.LaserScanStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasScan()) {
          mergeScan(other.getScan());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTime()) {
          return false;
        }
        if (!hasScan()) {
          return false;
        }
        if (!getTime().isInitialized()) {
          return false;
        }
        if (!getScan().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.LaserscanStamped.LaserScanStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.LaserscanStamped.LaserScanStamped) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private gazebo.msgs.TimeOuterClass.Time time_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.TimeOuterClass.Time, gazebo.msgs.TimeOuterClass.Time.Builder, gazebo.msgs.TimeOuterClass.TimeOrBuilder> timeBuilder_;
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       * @return Whether the time field is set.
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       * @return The time.
       */
      public gazebo.msgs.TimeOuterClass.Time getTime() {
        if (timeBuilder_ == null) {
          return time_ == null ? gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder setTime(gazebo.msgs.TimeOuterClass.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder setTime(
          gazebo.msgs.TimeOuterClass.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder mergeTime(gazebo.msgs.TimeOuterClass.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              time_ != null &&
              time_ != gazebo.msgs.TimeOuterClass.Time.getDefaultInstance()) {
            time_ =
              gazebo.msgs.TimeOuterClass.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = null;
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public gazebo.msgs.TimeOuterClass.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_ == null ?
              gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
        }
      }
      /**
       * <pre>
       * Time when the data was captured
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.TimeOuterClass.Time, gazebo.msgs.TimeOuterClass.Time.Builder, gazebo.msgs.TimeOuterClass.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.TimeOuterClass.Time, gazebo.msgs.TimeOuterClass.Time.Builder, gazebo.msgs.TimeOuterClass.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private gazebo.msgs.Laserscan.LaserScan scan_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Laserscan.LaserScan, gazebo.msgs.Laserscan.LaserScan.Builder, gazebo.msgs.Laserscan.LaserScanOrBuilder> scanBuilder_;
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       * @return Whether the scan field is set.
       */
      public boolean hasScan() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       * @return The scan.
       */
      public gazebo.msgs.Laserscan.LaserScan getScan() {
        if (scanBuilder_ == null) {
          return scan_ == null ? gazebo.msgs.Laserscan.LaserScan.getDefaultInstance() : scan_;
        } else {
          return scanBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder setScan(gazebo.msgs.Laserscan.LaserScan value) {
        if (scanBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scan_ = value;
          onChanged();
        } else {
          scanBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder setScan(
          gazebo.msgs.Laserscan.LaserScan.Builder builderForValue) {
        if (scanBuilder_ == null) {
          scan_ = builderForValue.build();
          onChanged();
        } else {
          scanBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder mergeScan(gazebo.msgs.Laserscan.LaserScan value) {
        if (scanBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              scan_ != null &&
              scan_ != gazebo.msgs.Laserscan.LaserScan.getDefaultInstance()) {
            scan_ =
              gazebo.msgs.Laserscan.LaserScan.newBuilder(scan_).mergeFrom(value).buildPartial();
          } else {
            scan_ = value;
          }
          onChanged();
        } else {
          scanBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder clearScan() {
        if (scanBuilder_ == null) {
          scan_ = null;
          onChanged();
        } else {
          scanBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public gazebo.msgs.Laserscan.LaserScan.Builder getScanBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getScanFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public gazebo.msgs.Laserscan.LaserScanOrBuilder getScanOrBuilder() {
        if (scanBuilder_ != null) {
          return scanBuilder_.getMessageOrBuilder();
        } else {
          return scan_ == null ?
              gazebo.msgs.Laserscan.LaserScan.getDefaultInstance() : scan_;
        }
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Laserscan.LaserScan, gazebo.msgs.Laserscan.LaserScan.Builder, gazebo.msgs.Laserscan.LaserScanOrBuilder> 
          getScanFieldBuilder() {
        if (scanBuilder_ == null) {
          scanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Laserscan.LaserScan, gazebo.msgs.Laserscan.LaserScan.Builder, gazebo.msgs.Laserscan.LaserScanOrBuilder>(
                  getScan(),
                  getParentForChildren(),
                  isClean());
          scan_ = null;
        }
        return scanBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.LaserScanStamped)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.LaserScanStamped)
    private static final gazebo.msgs.LaserscanStamped.LaserScanStamped DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.LaserscanStamped.LaserScanStamped();
    }

    public static gazebo.msgs.LaserscanStamped.LaserScanStamped getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LaserScanStamped>
        PARSER = new com.google.protobuf.AbstractParser<LaserScanStamped>() {
      @java.lang.Override
      public LaserScanStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LaserScanStamped(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LaserScanStamped> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LaserScanStamped> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.LaserscanStamped.LaserScanStamped getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_LaserScanStamped_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027laserscan_stamped.proto\022\013gazebo.msgs\032\n" +
      "time.proto\032\017laserscan.proto\"Y\n\020LaserScan" +
      "Stamped\022\037\n\004time\030\001 \002(\0132\021.gazebo.msgs.Time" +
      "\022$\n\004scan\030\002 \002(\0132\026.gazebo.msgs.LaserScan"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.TimeOuterClass.getDescriptor(),
          gazebo.msgs.Laserscan.getDescriptor(),
        });
    internal_static_gazebo_msgs_LaserScanStamped_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_LaserScanStamped_descriptor,
        new java.lang.String[] { "Time", "Scan", });
    gazebo.msgs.TimeOuterClass.getDescriptor();
    gazebo.msgs.Laserscan.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
