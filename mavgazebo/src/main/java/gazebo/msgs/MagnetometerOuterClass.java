// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: magnetometer.proto

package gazebo.msgs;

public final class MagnetometerOuterClass {
  private MagnetometerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MagnetometerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Magnetometer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return Whether the time field is set.
     */
    boolean hasTime();
    /**
     * <pre>
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     * @return The time.
     */
    gazebo.msgs.TimeOuterClass.Time getTime();
    /**
     * <pre>
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder();

    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     * @return Whether the fieldTesla field is set.
     */
    boolean hasFieldTesla();
    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     * @return The fieldTesla.
     */
    gazebo.msgs.Vector3D.Vector3d getFieldTesla();
    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     */
    gazebo.msgs.Vector3D.Vector3dOrBuilder getFieldTeslaOrBuilder();
  }
  /**
   * <pre>
   *&#47; &#92;brief Message that encapsulates sensor data from a magnetometer.
   * </pre>
   *
   * Protobuf type {@code gazebo.msgs.Magnetometer}
   */
  public static final class Magnetometer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Magnetometer)
      MagnetometerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Magnetometer.newBuilder() to construct.
    private Magnetometer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Magnetometer() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Magnetometer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.MagnetometerOuterClass.internal_static_gazebo_msgs_Magnetometer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.MagnetometerOuterClass.internal_static_gazebo_msgs_Magnetometer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.MagnetometerOuterClass.Magnetometer.class, gazebo.msgs.MagnetometerOuterClass.Magnetometer.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.TimeOuterClass.Time time_;
    /**
     * <pre>
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
     *&#47; &#92;brief Global time at which the magnetic field strength was sampled
     * </pre>
     *
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.TimeOuterClass.TimeOrBuilder getTimeOrBuilder() {
      return time_ == null ? gazebo.msgs.TimeOuterClass.Time.getDefaultInstance() : time_;
    }

    public static final int FIELD_TESLA_FIELD_NUMBER = 2;
    private gazebo.msgs.Vector3D.Vector3d fieldTesla_;
    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     * @return Whether the fieldTesla field is set.
     */
    @java.lang.Override
    public boolean hasFieldTesla() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     * @return The fieldTesla.
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3d getFieldTesla() {
      return fieldTesla_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : fieldTesla_;
    }
    /**
     * <pre>
     *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
     * </pre>
     *
     * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector3D.Vector3dOrBuilder getFieldTeslaOrBuilder() {
      return fieldTesla_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : fieldTesla_;
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
      if (!hasFieldTesla()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getFieldTesla().isInitialized()) {
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
        output.writeMessage(2, getFieldTesla());
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
          .computeMessageSize(1, getTime());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getFieldTesla());
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
      if (!(obj instanceof gazebo.msgs.MagnetometerOuterClass.Magnetometer)) {
        return super.equals(obj);
      }
      gazebo.msgs.MagnetometerOuterClass.Magnetometer other = (gazebo.msgs.MagnetometerOuterClass.Magnetometer) obj;

      if (hasTime() != other.hasTime()) return false;
      if (hasTime()) {
        if (!getTime()
            .equals(other.getTime())) return false;
      }
      if (hasFieldTesla() != other.hasFieldTesla()) return false;
      if (hasFieldTesla()) {
        if (!getFieldTesla()
            .equals(other.getFieldTesla())) return false;
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
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      if (hasFieldTesla()) {
        hash = (37 * hash) + FIELD_TESLA_FIELD_NUMBER;
        hash = (53 * hash) + getFieldTesla().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.MagnetometerOuterClass.Magnetometer prototype) {
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
     *&#47; &#92;brief Message that encapsulates sensor data from a magnetometer.
     * </pre>
     *
     * Protobuf type {@code gazebo.msgs.Magnetometer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Magnetometer)
        gazebo.msgs.MagnetometerOuterClass.MagnetometerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.MagnetometerOuterClass.internal_static_gazebo_msgs_Magnetometer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.MagnetometerOuterClass.internal_static_gazebo_msgs_Magnetometer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.MagnetometerOuterClass.Magnetometer.class, gazebo.msgs.MagnetometerOuterClass.Magnetometer.Builder.class);
      }

      // Construct using gazebo.msgs.MagnetometerOuterClass.Magnetometer.newBuilder()
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
          getFieldTeslaFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        time_ = null;
        if (timeBuilder_ != null) {
          timeBuilder_.dispose();
          timeBuilder_ = null;
        }
        fieldTesla_ = null;
        if (fieldTeslaBuilder_ != null) {
          fieldTeslaBuilder_.dispose();
          fieldTeslaBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.MagnetometerOuterClass.internal_static_gazebo_msgs_Magnetometer_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.MagnetometerOuterClass.Magnetometer getDefaultInstanceForType() {
        return gazebo.msgs.MagnetometerOuterClass.Magnetometer.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.MagnetometerOuterClass.Magnetometer build() {
        gazebo.msgs.MagnetometerOuterClass.Magnetometer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.MagnetometerOuterClass.Magnetometer buildPartial() {
        gazebo.msgs.MagnetometerOuterClass.Magnetometer result = new gazebo.msgs.MagnetometerOuterClass.Magnetometer(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.MagnetometerOuterClass.Magnetometer result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.time_ = timeBuilder_ == null
              ? time_
              : timeBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fieldTesla_ = fieldTeslaBuilder_ == null
              ? fieldTesla_
              : fieldTeslaBuilder_.build();
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof gazebo.msgs.MagnetometerOuterClass.Magnetometer) {
          return mergeFrom((gazebo.msgs.MagnetometerOuterClass.Magnetometer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.MagnetometerOuterClass.Magnetometer other) {
        if (other == gazebo.msgs.MagnetometerOuterClass.Magnetometer.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasFieldTesla()) {
          mergeFieldTesla(other.getFieldTesla());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTime()) {
          return false;
        }
        if (!hasFieldTesla()) {
          return false;
        }
        if (!getTime().isInitialized()) {
          return false;
        }
        if (!getFieldTesla().isInitialized()) {
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
                    getTimeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getFieldTeslaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private gazebo.msgs.TimeOuterClass.Time time_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.TimeOuterClass.Time, gazebo.msgs.TimeOuterClass.Time.Builder, gazebo.msgs.TimeOuterClass.TimeOrBuilder> timeBuilder_;
      /**
       * <pre>
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder setTime(
          gazebo.msgs.TimeOuterClass.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder mergeTime(gazebo.msgs.TimeOuterClass.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            time_ != null &&
            time_ != gazebo.msgs.TimeOuterClass.Time.getDefaultInstance()) {
            getTimeBuilder().mergeFrom(value);
          } else {
            time_ = value;
          }
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
       * </pre>
       *
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = null;
        if (timeBuilder_ != null) {
          timeBuilder_.dispose();
          timeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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
       *&#47; &#92;brief Global time at which the magnetic field strength was sampled
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

      private gazebo.msgs.Vector3D.Vector3d fieldTesla_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> fieldTeslaBuilder_;
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       * @return Whether the fieldTesla field is set.
       */
      public boolean hasFieldTesla() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       * @return The fieldTesla.
       */
      public gazebo.msgs.Vector3D.Vector3d getFieldTesla() {
        if (fieldTeslaBuilder_ == null) {
          return fieldTesla_ == null ? gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : fieldTesla_;
        } else {
          return fieldTeslaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public Builder setFieldTesla(gazebo.msgs.Vector3D.Vector3d value) {
        if (fieldTeslaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fieldTesla_ = value;
        } else {
          fieldTeslaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public Builder setFieldTesla(
          gazebo.msgs.Vector3D.Vector3d.Builder builderForValue) {
        if (fieldTeslaBuilder_ == null) {
          fieldTesla_ = builderForValue.build();
        } else {
          fieldTeslaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public Builder mergeFieldTesla(gazebo.msgs.Vector3D.Vector3d value) {
        if (fieldTeslaBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            fieldTesla_ != null &&
            fieldTesla_ != gazebo.msgs.Vector3D.Vector3d.getDefaultInstance()) {
            getFieldTeslaBuilder().mergeFrom(value);
          } else {
            fieldTesla_ = value;
          }
        } else {
          fieldTeslaBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public Builder clearFieldTesla() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fieldTesla_ = null;
        if (fieldTeslaBuilder_ != null) {
          fieldTeslaBuilder_.dispose();
          fieldTeslaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public gazebo.msgs.Vector3D.Vector3d.Builder getFieldTeslaBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getFieldTeslaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      public gazebo.msgs.Vector3D.Vector3dOrBuilder getFieldTeslaOrBuilder() {
        if (fieldTeslaBuilder_ != null) {
          return fieldTeslaBuilder_.getMessageOrBuilder();
        } else {
          return fieldTesla_ == null ?
              gazebo.msgs.Vector3D.Vector3d.getDefaultInstance() : fieldTesla_;
        }
      }
      /**
       * <pre>
       *&#47; &#92;brief Magnetic field strength (in Tesla) along body-frame axis
       * </pre>
       *
       * <code>required .gazebo.msgs.Vector3d field_tesla = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder> 
          getFieldTeslaFieldBuilder() {
        if (fieldTeslaBuilder_ == null) {
          fieldTeslaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector3D.Vector3d, gazebo.msgs.Vector3D.Vector3d.Builder, gazebo.msgs.Vector3D.Vector3dOrBuilder>(
                  getFieldTesla(),
                  getParentForChildren(),
                  isClean());
          fieldTesla_ = null;
        }
        return fieldTeslaBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Magnetometer)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Magnetometer)
    private static final gazebo.msgs.MagnetometerOuterClass.Magnetometer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.MagnetometerOuterClass.Magnetometer();
    }

    public static gazebo.msgs.MagnetometerOuterClass.Magnetometer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Magnetometer>
        PARSER = new com.google.protobuf.AbstractParser<Magnetometer>() {
      @java.lang.Override
      public Magnetometer parsePartialFrom(
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

    public static com.google.protobuf.Parser<Magnetometer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Magnetometer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.MagnetometerOuterClass.Magnetometer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Magnetometer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Magnetometer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022magnetometer.proto\022\013gazebo.msgs\032\ntime." +
      "proto\032\016vector3d.proto\"[\n\014Magnetometer\022\037\n" +
      "\004time\030\001 \002(\0132\021.gazebo.msgs.Time\022*\n\013field_" +
      "tesla\030\002 \002(\0132\025.gazebo.msgs.Vector3d"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.TimeOuterClass.getDescriptor(),
          gazebo.msgs.Vector3D.getDescriptor(),
        });
    internal_static_gazebo_msgs_Magnetometer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Magnetometer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Magnetometer_descriptor,
        new java.lang.String[] { "Time", "FieldTesla", });
    gazebo.msgs.TimeOuterClass.getDescriptor();
    gazebo.msgs.Vector3D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
