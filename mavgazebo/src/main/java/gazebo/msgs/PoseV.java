// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pose_v.proto

package gazebo.msgs;

public final class PoseV {
  private PoseV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Pose_VOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Pose_V)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    java.util.List<gazebo.msgs.PoseOuterClass.Pose> 
        getPoseList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    gazebo.msgs.PoseOuterClass.Pose getPose(int index);
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    int getPoseCount();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    java.util.List<? extends gazebo.msgs.PoseOuterClass.PoseOrBuilder> 
        getPoseOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    gazebo.msgs.PoseOuterClass.PoseOrBuilder getPoseOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.Pose_V}
   */
  public static final class Pose_V extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Pose_V)
      Pose_VOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Pose_V.newBuilder() to construct.
    private Pose_V(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Pose_V() {
      pose_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Pose_V();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.PoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.PoseV.internal_static_gazebo_msgs_Pose_V_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.PoseV.Pose_V.class, gazebo.msgs.PoseV.Pose_V.Builder.class);
    }

    public static final int POSE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<gazebo.msgs.PoseOuterClass.Pose> pose_;
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    @java.lang.Override
    public java.util.List<gazebo.msgs.PoseOuterClass.Pose> getPoseList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends gazebo.msgs.PoseOuterClass.PoseOrBuilder> 
        getPoseOrBuilderList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    @java.lang.Override
    public int getPoseCount() {
      return pose_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.PoseOuterClass.Pose getPose(int index) {
      return pose_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    @java.lang.Override
    public gazebo.msgs.PoseOuterClass.PoseOrBuilder getPoseOrBuilder(
        int index) {
      return pose_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPoseCount(); i++) {
        if (!getPose(i).isInitialized()) {
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
      for (int i = 0; i < pose_.size(); i++) {
        output.writeMessage(1, pose_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pose_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, pose_.get(i));
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
      if (!(obj instanceof gazebo.msgs.PoseV.Pose_V)) {
        return super.equals(obj);
      }
      gazebo.msgs.PoseV.Pose_V other = (gazebo.msgs.PoseV.Pose_V) obj;

      if (!getPoseList()
          .equals(other.getPoseList())) return false;
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
      if (getPoseCount() > 0) {
        hash = (37 * hash) + POSE_FIELD_NUMBER;
        hash = (53 * hash) + getPoseList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.PoseV.Pose_V parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PoseV.Pose_V parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.PoseV.Pose_V parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.PoseV.Pose_V prototype) {
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
     * Protobuf type {@code gazebo.msgs.Pose_V}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Pose_V)
        gazebo.msgs.PoseV.Pose_VOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.PoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.PoseV.internal_static_gazebo_msgs_Pose_V_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.PoseV.Pose_V.class, gazebo.msgs.PoseV.Pose_V.Builder.class);
      }

      // Construct using gazebo.msgs.PoseV.Pose_V.newBuilder()
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
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
        } else {
          pose_ = null;
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.PoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.PoseV.Pose_V getDefaultInstanceForType() {
        return gazebo.msgs.PoseV.Pose_V.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.PoseV.Pose_V build() {
        gazebo.msgs.PoseV.Pose_V result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.PoseV.Pose_V buildPartial() {
        gazebo.msgs.PoseV.Pose_V result = new gazebo.msgs.PoseV.Pose_V(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(gazebo.msgs.PoseV.Pose_V result) {
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pose_ = java.util.Collections.unmodifiableList(pose_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
      }

      private void buildPartial0(gazebo.msgs.PoseV.Pose_V result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof gazebo.msgs.PoseV.Pose_V) {
          return mergeFrom((gazebo.msgs.PoseV.Pose_V)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.PoseV.Pose_V other) {
        if (other == gazebo.msgs.PoseV.Pose_V.getDefaultInstance()) return this;
        if (poseBuilder_ == null) {
          if (!other.pose_.isEmpty()) {
            if (pose_.isEmpty()) {
              pose_ = other.pose_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePoseIsMutable();
              pose_.addAll(other.pose_);
            }
            onChanged();
          }
        } else {
          if (!other.pose_.isEmpty()) {
            if (poseBuilder_.isEmpty()) {
              poseBuilder_.dispose();
              poseBuilder_ = null;
              pose_ = other.pose_;
              bitField0_ = (bitField0_ & ~0x00000001);
              poseBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPoseFieldBuilder() : null;
            } else {
              poseBuilder_.addAllMessages(other.pose_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getPoseCount(); i++) {
          if (!getPose(i).isInitialized()) {
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
                gazebo.msgs.PoseOuterClass.Pose m =
                    input.readMessage(
                        gazebo.msgs.PoseOuterClass.Pose.PARSER,
                        extensionRegistry);
                if (poseBuilder_ == null) {
                  ensurePoseIsMutable();
                  pose_.add(m);
                } else {
                  poseBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<gazebo.msgs.PoseOuterClass.Pose> pose_ =
        java.util.Collections.emptyList();
      private void ensurePoseIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pose_ = new java.util.ArrayList<gazebo.msgs.PoseOuterClass.Pose>(pose_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          gazebo.msgs.PoseOuterClass.Pose, gazebo.msgs.PoseOuterClass.Pose.Builder, gazebo.msgs.PoseOuterClass.PoseOrBuilder> poseBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public java.util.List<gazebo.msgs.PoseOuterClass.Pose> getPoseList() {
        if (poseBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pose_);
        } else {
          return poseBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public int getPoseCount() {
        if (poseBuilder_ == null) {
          return pose_.size();
        } else {
          return poseBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.PoseOuterClass.Pose getPose(int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);
        } else {
          return poseBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder setPose(
          int index, gazebo.msgs.PoseOuterClass.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.set(index, value);
          onChanged();
        } else {
          poseBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder setPose(
          int index, gazebo.msgs.PoseOuterClass.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.set(index, builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder addPose(gazebo.msgs.PoseOuterClass.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.add(value);
          onChanged();
        } else {
          poseBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder addPose(
          int index, gazebo.msgs.PoseOuterClass.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.add(index, value);
          onChanged();
        } else {
          poseBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder addPose(
          gazebo.msgs.PoseOuterClass.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.add(builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder addPose(
          int index, gazebo.msgs.PoseOuterClass.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.add(index, builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder addAllPose(
          java.lang.Iterable<? extends gazebo.msgs.PoseOuterClass.Pose> values) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pose_);
          onChanged();
        } else {
          poseBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder removePose(int index) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.remove(index);
          onChanged();
        } else {
          poseBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.PoseOuterClass.Pose.Builder getPoseBuilder(
          int index) {
        return getPoseFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.PoseOuterClass.PoseOrBuilder getPoseOrBuilder(
          int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);  } else {
          return poseBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public java.util.List<? extends gazebo.msgs.PoseOuterClass.PoseOrBuilder> 
           getPoseOrBuilderList() {
        if (poseBuilder_ != null) {
          return poseBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pose_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.PoseOuterClass.Pose.Builder addPoseBuilder() {
        return getPoseFieldBuilder().addBuilder(
            gazebo.msgs.PoseOuterClass.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.PoseOuterClass.Pose.Builder addPoseBuilder(
          int index) {
        return getPoseFieldBuilder().addBuilder(
            index, gazebo.msgs.PoseOuterClass.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public java.util.List<gazebo.msgs.PoseOuterClass.Pose.Builder> 
           getPoseBuilderList() {
        return getPoseFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          gazebo.msgs.PoseOuterClass.Pose, gazebo.msgs.PoseOuterClass.Pose.Builder, gazebo.msgs.PoseOuterClass.PoseOrBuilder> 
          getPoseFieldBuilder() {
        if (poseBuilder_ == null) {
          poseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              gazebo.msgs.PoseOuterClass.Pose, gazebo.msgs.PoseOuterClass.Pose.Builder, gazebo.msgs.PoseOuterClass.PoseOrBuilder>(
                  pose_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Pose_V)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Pose_V)
    private static final gazebo.msgs.PoseV.Pose_V DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.PoseV.Pose_V();
    }

    public static gazebo.msgs.PoseV.Pose_V getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Pose_V>
        PARSER = new com.google.protobuf.AbstractParser<Pose_V>() {
      @java.lang.Override
      public Pose_V parsePartialFrom(
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

    public static com.google.protobuf.Parser<Pose_V> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Pose_V> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.PoseV.Pose_V getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Pose_V_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Pose_V_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014pose_v.proto\022\013gazebo.msgs\032\npose.proto\"" +
      ")\n\006Pose_V\022\037\n\004pose\030\001 \003(\0132\021.gazebo.msgs.Po" +
      "se"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.PoseOuterClass.getDescriptor(),
        });
    internal_static_gazebo_msgs_Pose_V_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Pose_V_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Pose_V_descriptor,
        new java.lang.String[] { "Pose", });
    gazebo.msgs.PoseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
