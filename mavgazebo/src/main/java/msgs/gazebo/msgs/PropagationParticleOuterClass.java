// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: propagation_particle.proto

package msgs.gazebo.msgs;

public final class PropagationParticleOuterClass {
  private PropagationParticleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PropagationParticleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.PropagationParticle)
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
     * <code>required double signal_level = 3;</code>
     * @return Whether the signalLevel field is set.
     */
    boolean hasSignalLevel();
    /**
     * <code>required double signal_level = 3;</code>
     * @return The signalLevel.
     */
    double getSignalLevel();
  }
  /**
   * Protobuf type {@code gazebo.msgs.PropagationParticle}
   */
  public static final class PropagationParticle extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.PropagationParticle)
      PropagationParticleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PropagationParticle.newBuilder() to construct.
    private PropagationParticle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PropagationParticle() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PropagationParticle();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PropagationParticle(
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
              x_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              y_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              signalLevel_ = input.readDouble();
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
      return msgs.gazebo.msgs.PropagationParticleOuterClass.internal_static_gazebo_msgs_PropagationParticle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return msgs.gazebo.msgs.PropagationParticleOuterClass.internal_static_gazebo_msgs_PropagationParticle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.class, msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.Builder.class);
    }

    private int bitField0_;
    public static final int X_FIELD_NUMBER = 1;
    private double x_;
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
    private double y_;
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

    public static final int SIGNAL_LEVEL_FIELD_NUMBER = 3;
    private double signalLevel_;
    /**
     * <code>required double signal_level = 3;</code>
     * @return Whether the signalLevel field is set.
     */
    @java.lang.Override
    public boolean hasSignalLevel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required double signal_level = 3;</code>
     * @return The signalLevel.
     */
    @java.lang.Override
    public double getSignalLevel() {
      return signalLevel_;
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
      if (!hasSignalLevel()) {
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
        output.writeDouble(3, signalLevel_);
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
          .computeDoubleSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, signalLevel_);
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
      if (!(obj instanceof msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle)) {
        return super.equals(obj);
      }
      msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle other = (msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle) obj;

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
      if (hasSignalLevel() != other.hasSignalLevel()) return false;
      if (hasSignalLevel()) {
        if (java.lang.Double.doubleToLongBits(getSignalLevel())
            != java.lang.Double.doubleToLongBits(
                other.getSignalLevel())) return false;
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
      if (hasSignalLevel()) {
        hash = (37 * hash) + SIGNAL_LEVEL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getSignalLevel()));
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parseFrom(
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
    public static Builder newBuilder(msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle prototype) {
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
     * Protobuf type {@code gazebo.msgs.PropagationParticle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.PropagationParticle)
        msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return msgs.gazebo.msgs.PropagationParticleOuterClass.internal_static_gazebo_msgs_PropagationParticle_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return msgs.gazebo.msgs.PropagationParticleOuterClass.internal_static_gazebo_msgs_PropagationParticle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.class, msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.Builder.class);
      }

      // Construct using gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.newBuilder()
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
        x_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        signalLevel_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return msgs.gazebo.msgs.PropagationParticleOuterClass.internal_static_gazebo_msgs_PropagationParticle_descriptor;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle getDefaultInstanceForType() {
        return msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.getDefaultInstance();
      }

      @java.lang.Override
      public msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle build() {
        msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle buildPartial() {
        msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle result = new msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle(this);
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
          result.signalLevel_ = signalLevel_;
          to_bitField0_ |= 0x00000004;
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
        if (other instanceof msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle) {
          return mergeFrom((msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle other) {
        if (other == msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasSignalLevel()) {
          setSignalLevel(other.getSignalLevel());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        if (!hasSignalLevel()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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
        bitField0_ |= 0x00000001;
        x_ = value;
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
        bitField0_ |= 0x00000002;
        y_ = value;
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

      private double signalLevel_ ;
      /**
       * <code>required double signal_level = 3;</code>
       * @return Whether the signalLevel field is set.
       */
      @java.lang.Override
      public boolean hasSignalLevel() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required double signal_level = 3;</code>
       * @return The signalLevel.
       */
      @java.lang.Override
      public double getSignalLevel() {
        return signalLevel_;
      }
      /**
       * <code>required double signal_level = 3;</code>
       * @param value The signalLevel to set.
       * @return This builder for chaining.
       */
      public Builder setSignalLevel(double value) {
        bitField0_ |= 0x00000004;
        signalLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double signal_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignalLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        signalLevel_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PropagationParticle)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PropagationParticle)
    private static final msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle();
    }

    public static msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PropagationParticle>
        PARSER = new com.google.protobuf.AbstractParser<PropagationParticle>() {
      @java.lang.Override
      public PropagationParticle parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropagationParticle(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PropagationParticle> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PropagationParticle> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public msgs.gazebo.msgs.PropagationParticleOuterClass.PropagationParticle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PropagationParticle_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_PropagationParticle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032propagation_particle.proto\022\013gazebo.msg" +
      "s\"A\n\023PropagationParticle\022\t\n\001x\030\001 \002(\001\022\t\n\001y" +
      "\030\002 \002(\001\022\024\n\014signal_level\030\003 \002(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gazebo_msgs_PropagationParticle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_PropagationParticle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_PropagationParticle_descriptor,
        new java.lang.String[] { "X", "Y", "SignalLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}