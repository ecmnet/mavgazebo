// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: altimeter.proto

package gazebo.msgs;

public final class AltimeterOuterClass {
  private AltimeterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AltimeterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Altimeter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return Whether the time field is set.
     */
    boolean hasTime();
    /**
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return The time.
     */
    gazebo.msgs.TimeOuterClass.Time getTime();
    /**
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder();

    /**
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     *
     * <code>required double vertical_position = 2;</code>
     * @return Whether the verticalPosition field is set.
     */
    boolean hasVerticalPosition();
    /**
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     *
     * <code>required double vertical_position = 2;</code>
     * @return The verticalPosition.
     */
    double getVerticalPosition();

    /**
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     *
     * <code>required double vertical_velocity = 3;</code>
     * @return Whether the verticalVelocity field is set.
     */
    boolean hasVerticalVelocity();
    /**
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     *
     * <code>required double vertical_velocity = 3;</code>
     * @return The verticalVelocity.
     */
    double getVerticalVelocity();

    /**
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     *
     * <code>required double vertical_reference = 4;</code>
     * @return Whether the verticalReference field is set.
     */
    boolean hasVerticalReference();
    /**
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     *
     * <code>required double vertical_reference = 4;</code>
     * @return The verticalReference.
     */
    double getVerticalReference();
  }
  /**
   * <pre>
   *&#47; &#92;brief Altimeter sensor data
   * </pre>
   *
   * Protobuf type {@code gazebo.msgs.Altimeter}
   */
  public static final class Altimeter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Altimeter)
      AltimeterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Altimeter.newBuilder() to construct.
    private Altimeter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Altimeter() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Altimeter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Altimeter(
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
            case 17: {
              bitField0_ |= 0x00000002;
              verticalPosition_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              verticalVelocity_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              verticalReference_ = input.readDouble();
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
      return gazebo.msgs.AltimeterOuterClass.internal_static_gazebo_msgs_Altimeter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.AltimeterOuterClass.internal_static_gazebo_msgs_Altimeter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.AltimeterOuterClass.Altimeter.class, gazebo.msgs.AltimeterOuterClass.Altimeter.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.TimeOuterClass.Time time_;
    /**
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
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
     *&#47; &#92;brief Timestamp of the altimeter data
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
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder() {
      return time_ == null ? gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
    }

    public static final int VERTICAL_POSITION_FIELD_NUMBER = 2;
    private double verticalPosition_;
    /**
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     *
     * <code>required double vertical_position = 2;</code>
     * @return Whether the verticalPosition field is set.
     */
    @java.lang.Override
    public boolean hasVerticalPosition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     *
     * <code>required double vertical_position = 2;</code>
     * @return The verticalPosition.
     */
    @java.lang.Override
    public double getVerticalPosition() {
      return verticalPosition_;
    }

    public static final int VERTICAL_VELOCITY_FIELD_NUMBER = 3;
    private double verticalVelocity_;
    /**
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     *
     * <code>required double vertical_velocity = 3;</code>
     * @return Whether the verticalVelocity field is set.
     */
    @java.lang.Override
    public boolean hasVerticalVelocity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     *
     * <code>required double vertical_velocity = 3;</code>
     * @return The verticalVelocity.
     */
    @java.lang.Override
    public double getVerticalVelocity() {
      return verticalVelocity_;
    }

    public static final int VERTICAL_REFERENCE_FIELD_NUMBER = 4;
    private double verticalReference_;
    /**
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     *
     * <code>required double vertical_reference = 4;</code>
     * @return Whether the verticalReference field is set.
     */
    @java.lang.Override
    public boolean hasVerticalReference() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     *
     * <code>required double vertical_reference = 4;</code>
     * @return The verticalReference.
     */
    @java.lang.Override
    public double getVerticalReference() {
      return verticalReference_;
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
      if (!hasVerticalPosition()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVerticalVelocity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVerticalReference()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
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
        output.writeDouble(2, verticalPosition_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, verticalVelocity_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeDouble(4, verticalReference_);
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
          .computeDoubleSize(2, verticalPosition_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, verticalVelocity_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, verticalReference_);
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
      if (!(obj instanceof gazebo.msgs.AltimeterOuterClass.Altimeter)) {
        return super.equals(obj);
      }
      gazebo.msgs.AltimeterOuterClass.Altimeter other = (gazebo.msgs.AltimeterOuterClass.Altimeter) obj;

      if (hasTime() != other.hasTime()) return false;
      if (hasTime()) {
        if (!getTime()
            .equals(other.getTime())) return false;
      }
      if (hasVerticalPosition() != other.hasVerticalPosition()) return false;
      if (hasVerticalPosition()) {
        if (java.lang.Double.doubleToLongBits(getVerticalPosition())
            != java.lang.Double.doubleToLongBits(
                other.getVerticalPosition())) return false;
      }
      if (hasVerticalVelocity() != other.hasVerticalVelocity()) return false;
      if (hasVerticalVelocity()) {
        if (java.lang.Double.doubleToLongBits(getVerticalVelocity())
            != java.lang.Double.doubleToLongBits(
                other.getVerticalVelocity())) return false;
      }
      if (hasVerticalReference() != other.hasVerticalReference()) return false;
      if (hasVerticalReference()) {
        if (java.lang.Double.doubleToLongBits(getVerticalReference())
            != java.lang.Double.doubleToLongBits(
                other.getVerticalReference())) return false;
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
      if (hasVerticalPosition()) {
        hash = (37 * hash) + VERTICAL_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getVerticalPosition()));
      }
      if (hasVerticalVelocity()) {
        hash = (37 * hash) + VERTICAL_VELOCITY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getVerticalVelocity()));
      }
      if (hasVerticalReference()) {
        hash = (37 * hash) + VERTICAL_REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getVerticalReference()));
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.AltimeterOuterClass.Altimeter parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.AltimeterOuterClass.Altimeter prototype) {
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
     * <pre>
     *&#47; &#92;brief Altimeter sensor data
     * </pre>
     *
     * Protobuf type {@code gazebo.msgs.Altimeter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Altimeter)
        gazebo.msgs.AltimeterOuterClass.AltimeterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.AltimeterOuterClass.internal_static_gazebo_msgs_Altimeter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.AltimeterOuterClass.internal_static_gazebo_msgs_Altimeter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.AltimeterOuterClass.Altimeter.class, gazebo.msgs.AltimeterOuterClass.Altimeter.Builder.class);
      }

      // Construct using gazebo.msgs.AltimeterOuterClass.Altimeter.newBuilder()
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
        verticalPosition_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        verticalVelocity_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        verticalReference_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.AltimeterOuterClass.internal_static_gazebo_msgs_Altimeter_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.AltimeterOuterClass.Altimeter getDefaultInstanceForType() {
        return gazebo.msgs.AltimeterOuterClass.Altimeter.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.AltimeterOuterClass.Altimeter build() {
        gazebo.msgs.AltimeterOuterClass.Altimeter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.AltimeterOuterClass.Altimeter buildPartial() {
        gazebo.msgs.AltimeterOuterClass.Altimeter result = new gazebo.msgs.AltimeterOuterClass.Altimeter(this);
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
          result.verticalPosition_ = verticalPosition_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.verticalVelocity_ = verticalVelocity_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.verticalReference_ = verticalReference_;
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
        if (other instanceof gazebo.msgs.AltimeterOuterClass.Altimeter) {
          return mergeFrom((gazebo.msgs.AltimeterOuterClass.Altimeter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.AltimeterOuterClass.Altimeter other) {
        if (other == gazebo.msgs.AltimeterOuterClass.Altimeter.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasVerticalPosition()) {
          setVerticalPosition(other.getVerticalPosition());
        }
        if (other.hasVerticalVelocity()) {
          setVerticalVelocity(other.getVerticalVelocity());
        }
        if (other.hasVerticalReference()) {
          setVerticalReference(other.getVerticalReference());
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
        if (!hasVerticalPosition()) {
          return false;
        }
        if (!hasVerticalVelocity()) {
          return false;
        }
        if (!hasVerticalReference()) {
          return false;
        }
        if (!getTime().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.AltimeterOuterClass.Altimeter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.AltimeterOuterClass.Altimeter) e.getUnfinishedMessage();
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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
       *&#47; &#92;brief Timestamp of the altimeter data
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

      private double verticalPosition_ ;
      /**
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       *
       * <code>required double vertical_position = 2;</code>
       * @return Whether the verticalPosition field is set.
       */
      @java.lang.Override
      public boolean hasVerticalPosition() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       *
       * <code>required double vertical_position = 2;</code>
       * @return The verticalPosition.
       */
      @java.lang.Override
      public double getVerticalPosition() {
        return verticalPosition_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       *
       * <code>required double vertical_position = 2;</code>
       * @param value The verticalPosition to set.
       * @return This builder for chaining.
       */
      public Builder setVerticalPosition(double value) {
        bitField0_ |= 0x00000002;
        verticalPosition_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       *
       * <code>required double vertical_position = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVerticalPosition() {
        bitField0_ = (bitField0_ & ~0x00000002);
        verticalPosition_ = 0D;
        onChanged();
        return this;
      }

      private double verticalVelocity_ ;
      /**
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       *
       * <code>required double vertical_velocity = 3;</code>
       * @return Whether the verticalVelocity field is set.
       */
      @java.lang.Override
      public boolean hasVerticalVelocity() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       *
       * <code>required double vertical_velocity = 3;</code>
       * @return The verticalVelocity.
       */
      @java.lang.Override
      public double getVerticalVelocity() {
        return verticalVelocity_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       *
       * <code>required double vertical_velocity = 3;</code>
       * @param value The verticalVelocity to set.
       * @return This builder for chaining.
       */
      public Builder setVerticalVelocity(double value) {
        bitField0_ |= 0x00000004;
        verticalVelocity_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       *
       * <code>required double vertical_velocity = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearVerticalVelocity() {
        bitField0_ = (bitField0_ & ~0x00000004);
        verticalVelocity_ = 0D;
        onChanged();
        return this;
      }

      private double verticalReference_ ;
      /**
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       *
       * <code>required double vertical_reference = 4;</code>
       * @return Whether the verticalReference field is set.
       */
      @java.lang.Override
      public boolean hasVerticalReference() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       *
       * <code>required double vertical_reference = 4;</code>
       * @return The verticalReference.
       */
      @java.lang.Override
      public double getVerticalReference() {
        return verticalReference_;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       *
       * <code>required double vertical_reference = 4;</code>
       * @param value The verticalReference to set.
       * @return This builder for chaining.
       */
      public Builder setVerticalReference(double value) {
        bitField0_ |= 0x00000008;
        verticalReference_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       *
       * <code>required double vertical_reference = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVerticalReference() {
        bitField0_ = (bitField0_ & ~0x00000008);
        verticalReference_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Altimeter)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Altimeter)
    private static final gazebo.msgs.AltimeterOuterClass.Altimeter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.AltimeterOuterClass.Altimeter();
    }

    public static gazebo.msgs.AltimeterOuterClass.Altimeter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Altimeter>
        PARSER = new com.google.protobuf.AbstractParser<Altimeter>() {
      @java.lang.Override
      public Altimeter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Altimeter(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Altimeter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Altimeter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.AltimeterOuterClass.Altimeter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Altimeter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Altimeter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017altimeter.proto\022\013gazebo.msgs\032\ntime.pro" +
      "to\"~\n\tAltimeter\022\037\n\004time\030\001 \002(\0132\021.gazebo.m" +
      "sgs.Time\022\031\n\021vertical_position\030\002 \002(\001\022\031\n\021v" +
      "ertical_velocity\030\003 \002(\001\022\032\n\022vertical_refer" +
      "ence\030\004 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.TimeOuterClass.getDescriptor(),
        });
    internal_static_gazebo_msgs_Altimeter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Altimeter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Altimeter_descriptor,
        new java.lang.String[] { "Time", "VerticalPosition", "VerticalVelocity", "VerticalReference", });
    gazebo.msgs.TimeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
