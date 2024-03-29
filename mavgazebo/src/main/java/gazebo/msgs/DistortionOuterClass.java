// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distortion.proto

package gazebo.msgs;

public final class DistortionOuterClass {
  private DistortionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DistortionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Distortion)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     * @return The center.
     */
    gazebo.msgs.Vector2D.Vector2d getCenter();
    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     */
    gazebo.msgs.Vector2D.Vector2dOrBuilder getCenterOrBuilder();

    /**
     * <code>optional double k1 = 2;</code>
     * @return Whether the k1 field is set.
     */
    boolean hasK1();
    /**
     * <code>optional double k1 = 2;</code>
     * @return The k1.
     */
    double getK1();

    /**
     * <code>optional double k2 = 3;</code>
     * @return Whether the k2 field is set.
     */
    boolean hasK2();
    /**
     * <code>optional double k2 = 3;</code>
     * @return The k2.
     */
    double getK2();

    /**
     * <code>optional double k3 = 4;</code>
     * @return Whether the k3 field is set.
     */
    boolean hasK3();
    /**
     * <code>optional double k3 = 4;</code>
     * @return The k3.
     */
    double getK3();

    /**
     * <code>optional double p1 = 5;</code>
     * @return Whether the p1 field is set.
     */
    boolean hasP1();
    /**
     * <code>optional double p1 = 5;</code>
     * @return The p1.
     */
    double getP1();

    /**
     * <code>optional double p2 = 6;</code>
     * @return Whether the p2 field is set.
     */
    boolean hasP2();
    /**
     * <code>optional double p2 = 6;</code>
     * @return The p2.
     */
    double getP2();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Distortion}
   */
  public static final class Distortion extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Distortion)
      DistortionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Distortion.newBuilder() to construct.
    private Distortion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Distortion() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Distortion();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.DistortionOuterClass.internal_static_gazebo_msgs_Distortion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.DistortionOuterClass.internal_static_gazebo_msgs_Distortion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.DistortionOuterClass.Distortion.class, gazebo.msgs.DistortionOuterClass.Distortion.Builder.class);
    }

    private int bitField0_;
    public static final int CENTER_FIELD_NUMBER = 1;
    private gazebo.msgs.Vector2D.Vector2d center_;
    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     * @return The center.
     */
    @java.lang.Override
    public gazebo.msgs.Vector2D.Vector2d getCenter() {
      return center_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : center_;
    }
    /**
     * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.Vector2D.Vector2dOrBuilder getCenterOrBuilder() {
      return center_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : center_;
    }

    public static final int K1_FIELD_NUMBER = 2;
    private double k1_ = 0D;
    /**
     * <code>optional double k1 = 2;</code>
     * @return Whether the k1 field is set.
     */
    @java.lang.Override
    public boolean hasK1() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional double k1 = 2;</code>
     * @return The k1.
     */
    @java.lang.Override
    public double getK1() {
      return k1_;
    }

    public static final int K2_FIELD_NUMBER = 3;
    private double k2_ = 0D;
    /**
     * <code>optional double k2 = 3;</code>
     * @return Whether the k2 field is set.
     */
    @java.lang.Override
    public boolean hasK2() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional double k2 = 3;</code>
     * @return The k2.
     */
    @java.lang.Override
    public double getK2() {
      return k2_;
    }

    public static final int K3_FIELD_NUMBER = 4;
    private double k3_ = 0D;
    /**
     * <code>optional double k3 = 4;</code>
     * @return Whether the k3 field is set.
     */
    @java.lang.Override
    public boolean hasK3() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional double k3 = 4;</code>
     * @return The k3.
     */
    @java.lang.Override
    public double getK3() {
      return k3_;
    }

    public static final int P1_FIELD_NUMBER = 5;
    private double p1_ = 0D;
    /**
     * <code>optional double p1 = 5;</code>
     * @return Whether the p1 field is set.
     */
    @java.lang.Override
    public boolean hasP1() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional double p1 = 5;</code>
     * @return The p1.
     */
    @java.lang.Override
    public double getP1() {
      return p1_;
    }

    public static final int P2_FIELD_NUMBER = 6;
    private double p2_ = 0D;
    /**
     * <code>optional double p2 = 6;</code>
     * @return Whether the p2 field is set.
     */
    @java.lang.Override
    public boolean hasP2() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional double p2 = 6;</code>
     * @return The p2.
     */
    @java.lang.Override
    public double getP2() {
      return p2_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasCenter()) {
        if (!getCenter().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCenter());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, k1_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, k2_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeDouble(4, k3_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeDouble(5, p1_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeDouble(6, p2_);
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
          .computeMessageSize(1, getCenter());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, k1_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, k2_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, k3_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, p1_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, p2_);
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
      if (!(obj instanceof gazebo.msgs.DistortionOuterClass.Distortion)) {
        return super.equals(obj);
      }
      gazebo.msgs.DistortionOuterClass.Distortion other = (gazebo.msgs.DistortionOuterClass.Distortion) obj;

      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (hasK1() != other.hasK1()) return false;
      if (hasK1()) {
        if (java.lang.Double.doubleToLongBits(getK1())
            != java.lang.Double.doubleToLongBits(
                other.getK1())) return false;
      }
      if (hasK2() != other.hasK2()) return false;
      if (hasK2()) {
        if (java.lang.Double.doubleToLongBits(getK2())
            != java.lang.Double.doubleToLongBits(
                other.getK2())) return false;
      }
      if (hasK3() != other.hasK3()) return false;
      if (hasK3()) {
        if (java.lang.Double.doubleToLongBits(getK3())
            != java.lang.Double.doubleToLongBits(
                other.getK3())) return false;
      }
      if (hasP1() != other.hasP1()) return false;
      if (hasP1()) {
        if (java.lang.Double.doubleToLongBits(getP1())
            != java.lang.Double.doubleToLongBits(
                other.getP1())) return false;
      }
      if (hasP2() != other.hasP2()) return false;
      if (hasP2()) {
        if (java.lang.Double.doubleToLongBits(getP2())
            != java.lang.Double.doubleToLongBits(
                other.getP2())) return false;
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
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      if (hasK1()) {
        hash = (37 * hash) + K1_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getK1()));
      }
      if (hasK2()) {
        hash = (37 * hash) + K2_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getK2()));
      }
      if (hasK3()) {
        hash = (37 * hash) + K3_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getK3()));
      }
      if (hasP1()) {
        hash = (37 * hash) + P1_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getP1()));
      }
      if (hasP2()) {
        hash = (37 * hash) + P2_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getP2()));
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.DistortionOuterClass.Distortion parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.DistortionOuterClass.Distortion prototype) {
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
     * Protobuf type {@code gazebo.msgs.Distortion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Distortion)
        gazebo.msgs.DistortionOuterClass.DistortionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.DistortionOuterClass.internal_static_gazebo_msgs_Distortion_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.DistortionOuterClass.internal_static_gazebo_msgs_Distortion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.DistortionOuterClass.Distortion.class, gazebo.msgs.DistortionOuterClass.Distortion.Builder.class);
      }

      // Construct using gazebo.msgs.DistortionOuterClass.Distortion.newBuilder()
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
          getCenterFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        center_ = null;
        if (centerBuilder_ != null) {
          centerBuilder_.dispose();
          centerBuilder_ = null;
        }
        k1_ = 0D;
        k2_ = 0D;
        k3_ = 0D;
        p1_ = 0D;
        p2_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.DistortionOuterClass.internal_static_gazebo_msgs_Distortion_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.DistortionOuterClass.Distortion getDefaultInstanceForType() {
        return gazebo.msgs.DistortionOuterClass.Distortion.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.DistortionOuterClass.Distortion build() {
        gazebo.msgs.DistortionOuterClass.Distortion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.DistortionOuterClass.Distortion buildPartial() {
        gazebo.msgs.DistortionOuterClass.Distortion result = new gazebo.msgs.DistortionOuterClass.Distortion(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(gazebo.msgs.DistortionOuterClass.Distortion result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.center_ = centerBuilder_ == null
              ? center_
              : centerBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.k1_ = k1_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.k2_ = k2_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.k3_ = k3_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.p1_ = p1_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.p2_ = p2_;
          to_bitField0_ |= 0x00000020;
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
        if (other instanceof gazebo.msgs.DistortionOuterClass.Distortion) {
          return mergeFrom((gazebo.msgs.DistortionOuterClass.Distortion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.DistortionOuterClass.Distortion other) {
        if (other == gazebo.msgs.DistortionOuterClass.Distortion.getDefaultInstance()) return this;
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.hasK1()) {
          setK1(other.getK1());
        }
        if (other.hasK2()) {
          setK2(other.getK2());
        }
        if (other.hasK3()) {
          setK3(other.getK3());
        }
        if (other.hasP1()) {
          setP1(other.getP1());
        }
        if (other.hasP2()) {
          setP2(other.getP2());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasCenter()) {
          if (!getCenter().isInitialized()) {
            return false;
          }
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
                    getCenterFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 17: {
                k1_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
              case 25: {
                k2_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
              case 33: {
                k3_ = input.readDouble();
                bitField0_ |= 0x00000008;
                break;
              } // case 33
              case 41: {
                p1_ = input.readDouble();
                bitField0_ |= 0x00000010;
                break;
              } // case 41
              case 49: {
                p2_ = input.readDouble();
                bitField0_ |= 0x00000020;
                break;
              } // case 49
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

      private gazebo.msgs.Vector2D.Vector2d center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder> centerBuilder_;
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       * @return The center.
       */
      public gazebo.msgs.Vector2D.Vector2d getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public Builder setCenter(gazebo.msgs.Vector2D.Vector2d value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
        } else {
          centerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public Builder setCenter(
          gazebo.msgs.Vector2D.Vector2d.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public Builder mergeCenter(gazebo.msgs.Vector2D.Vector2d value) {
        if (centerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            center_ != null &&
            center_ != gazebo.msgs.Vector2D.Vector2d.getDefaultInstance()) {
            getCenterBuilder().mergeFrom(value);
          } else {
            center_ = value;
          }
        } else {
          centerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public Builder clearCenter() {
        bitField0_ = (bitField0_ & ~0x00000001);
        center_ = null;
        if (centerBuilder_ != null) {
          centerBuilder_.dispose();
          centerBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public gazebo.msgs.Vector2D.Vector2d.Builder getCenterBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      public gazebo.msgs.Vector2D.Vector2dOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              gazebo.msgs.Vector2D.Vector2d.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector2d center = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              gazebo.msgs.Vector2D.Vector2d, gazebo.msgs.Vector2D.Vector2d.Builder, gazebo.msgs.Vector2D.Vector2dOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private double k1_ ;
      /**
       * <code>optional double k1 = 2;</code>
       * @return Whether the k1 field is set.
       */
      @java.lang.Override
      public boolean hasK1() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional double k1 = 2;</code>
       * @return The k1.
       */
      @java.lang.Override
      public double getK1() {
        return k1_;
      }
      /**
       * <code>optional double k1 = 2;</code>
       * @param value The k1 to set.
       * @return This builder for chaining.
       */
      public Builder setK1(double value) {
        
        k1_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional double k1 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearK1() {
        bitField0_ = (bitField0_ & ~0x00000002);
        k1_ = 0D;
        onChanged();
        return this;
      }

      private double k2_ ;
      /**
       * <code>optional double k2 = 3;</code>
       * @return Whether the k2 field is set.
       */
      @java.lang.Override
      public boolean hasK2() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional double k2 = 3;</code>
       * @return The k2.
       */
      @java.lang.Override
      public double getK2() {
        return k2_;
      }
      /**
       * <code>optional double k2 = 3;</code>
       * @param value The k2 to set.
       * @return This builder for chaining.
       */
      public Builder setK2(double value) {
        
        k2_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional double k2 = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearK2() {
        bitField0_ = (bitField0_ & ~0x00000004);
        k2_ = 0D;
        onChanged();
        return this;
      }

      private double k3_ ;
      /**
       * <code>optional double k3 = 4;</code>
       * @return Whether the k3 field is set.
       */
      @java.lang.Override
      public boolean hasK3() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional double k3 = 4;</code>
       * @return The k3.
       */
      @java.lang.Override
      public double getK3() {
        return k3_;
      }
      /**
       * <code>optional double k3 = 4;</code>
       * @param value The k3 to set.
       * @return This builder for chaining.
       */
      public Builder setK3(double value) {
        
        k3_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional double k3 = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearK3() {
        bitField0_ = (bitField0_ & ~0x00000008);
        k3_ = 0D;
        onChanged();
        return this;
      }

      private double p1_ ;
      /**
       * <code>optional double p1 = 5;</code>
       * @return Whether the p1 field is set.
       */
      @java.lang.Override
      public boolean hasP1() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional double p1 = 5;</code>
       * @return The p1.
       */
      @java.lang.Override
      public double getP1() {
        return p1_;
      }
      /**
       * <code>optional double p1 = 5;</code>
       * @param value The p1 to set.
       * @return This builder for chaining.
       */
      public Builder setP1(double value) {
        
        p1_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional double p1 = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearP1() {
        bitField0_ = (bitField0_ & ~0x00000010);
        p1_ = 0D;
        onChanged();
        return this;
      }

      private double p2_ ;
      /**
       * <code>optional double p2 = 6;</code>
       * @return Whether the p2 field is set.
       */
      @java.lang.Override
      public boolean hasP2() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional double p2 = 6;</code>
       * @return The p2.
       */
      @java.lang.Override
      public double getP2() {
        return p2_;
      }
      /**
       * <code>optional double p2 = 6;</code>
       * @param value The p2 to set.
       * @return This builder for chaining.
       */
      public Builder setP2(double value) {
        
        p2_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>optional double p2 = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearP2() {
        bitField0_ = (bitField0_ & ~0x00000020);
        p2_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Distortion)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Distortion)
    private static final gazebo.msgs.DistortionOuterClass.Distortion DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.DistortionOuterClass.Distortion();
    }

    public static gazebo.msgs.DistortionOuterClass.Distortion getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Distortion>
        PARSER = new com.google.protobuf.AbstractParser<Distortion>() {
      @java.lang.Override
      public Distortion parsePartialFrom(
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

    public static com.google.protobuf.Parser<Distortion> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Distortion> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.DistortionOuterClass.Distortion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Distortion_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Distortion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020distortion.proto\022\013gazebo.msgs\032\016vector2" +
      "d.proto\"o\n\nDistortion\022%\n\006center\030\001 \001(\0132\025." +
      "gazebo.msgs.Vector2d\022\n\n\002k1\030\002 \001(\001\022\n\n\002k2\030\003" +
      " \001(\001\022\n\n\002k3\030\004 \001(\001\022\n\n\002p1\030\005 \001(\001\022\n\n\002p2\030\006 \001(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.Vector2D.getDescriptor(),
        });
    internal_static_gazebo_msgs_Distortion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Distortion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Distortion_descriptor,
        new java.lang.String[] { "Center", "K1", "K2", "K3", "P1", "P2", });
    gazebo.msgs.Vector2D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
