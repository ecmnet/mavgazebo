// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model_v.proto

package gazebo.msgs;

public final class ModelV {
  private ModelV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Model_VOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Model_V)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    java.util.List<gazebo.msgs.ModelOuterClass.Model> 
        getModelsList();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    gazebo.msgs.ModelOuterClass.Model getModels(int index);
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    int getModelsCount();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    java.util.List<? extends gazebo.msgs.ModelOuterClass.ModelOrBuilder> 
        getModelsOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    gazebo.msgs.ModelOuterClass.ModelOrBuilder getModelsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.Model_V}
   */
  public static final class Model_V extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Model_V)
      Model_VOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Model_V.newBuilder() to construct.
    private Model_V(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Model_V() {
      models_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Model_V();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Model_V(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                models_ = new java.util.ArrayList<gazebo.msgs.ModelOuterClass.Model>();
                mutable_bitField0_ |= 0x00000001;
              }
              models_.add(
                  input.readMessage(gazebo.msgs.ModelOuterClass.Model.PARSER, extensionRegistry));
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
          models_ = java.util.Collections.unmodifiableList(models_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.ModelV.internal_static_gazebo_msgs_Model_V_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.ModelV.internal_static_gazebo_msgs_Model_V_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.ModelV.Model_V.class, gazebo.msgs.ModelV.Model_V.Builder.class);
    }

    public static final int MODELS_FIELD_NUMBER = 2;
    private java.util.List<gazebo.msgs.ModelOuterClass.Model> models_;
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    @java.lang.Override
    public java.util.List<gazebo.msgs.ModelOuterClass.Model> getModelsList() {
      return models_;
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends gazebo.msgs.ModelOuterClass.ModelOrBuilder> 
        getModelsOrBuilderList() {
      return models_;
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    @java.lang.Override
    public int getModelsCount() {
      return models_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.ModelOuterClass.Model getModels(int index) {
      return models_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    @java.lang.Override
    public gazebo.msgs.ModelOuterClass.ModelOrBuilder getModelsOrBuilder(
        int index) {
      return models_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getModelsCount(); i++) {
        if (!getModels(i).isInitialized()) {
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
      for (int i = 0; i < models_.size(); i++) {
        output.writeMessage(2, models_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < models_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, models_.get(i));
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
      if (!(obj instanceof gazebo.msgs.ModelV.Model_V)) {
        return super.equals(obj);
      }
      gazebo.msgs.ModelV.Model_V other = (gazebo.msgs.ModelV.Model_V) obj;

      if (!getModelsList()
          .equals(other.getModelsList())) return false;
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
      if (getModelsCount() > 0) {
        hash = (37 * hash) + MODELS_FIELD_NUMBER;
        hash = (53 * hash) + getModelsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static gazebo.msgs.ModelV.Model_V parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.ModelV.Model_V parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ModelV.Model_V parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static gazebo.msgs.ModelV.Model_V parseFrom(
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
    public static Builder newBuilder(gazebo.msgs.ModelV.Model_V prototype) {
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
     * Protobuf type {@code gazebo.msgs.Model_V}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Model_V)
        gazebo.msgs.ModelV.Model_VOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.ModelV.internal_static_gazebo_msgs_Model_V_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.ModelV.internal_static_gazebo_msgs_Model_V_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.ModelV.Model_V.class, gazebo.msgs.ModelV.Model_V.Builder.class);
      }

      // Construct using gazebo.msgs.ModelV.Model_V.newBuilder()
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
          getModelsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (modelsBuilder_ == null) {
          models_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          modelsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.ModelV.internal_static_gazebo_msgs_Model_V_descriptor;
      }

      @java.lang.Override
      public gazebo.msgs.ModelV.Model_V getDefaultInstanceForType() {
        return gazebo.msgs.ModelV.Model_V.getDefaultInstance();
      }

      @java.lang.Override
      public gazebo.msgs.ModelV.Model_V build() {
        gazebo.msgs.ModelV.Model_V result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public gazebo.msgs.ModelV.Model_V buildPartial() {
        gazebo.msgs.ModelV.Model_V result = new gazebo.msgs.ModelV.Model_V(this);
        int from_bitField0_ = bitField0_;
        if (modelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            models_ = java.util.Collections.unmodifiableList(models_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.models_ = models_;
        } else {
          result.models_ = modelsBuilder_.build();
        }
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
        if (other instanceof gazebo.msgs.ModelV.Model_V) {
          return mergeFrom((gazebo.msgs.ModelV.Model_V)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.ModelV.Model_V other) {
        if (other == gazebo.msgs.ModelV.Model_V.getDefaultInstance()) return this;
        if (modelsBuilder_ == null) {
          if (!other.models_.isEmpty()) {
            if (models_.isEmpty()) {
              models_ = other.models_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureModelsIsMutable();
              models_.addAll(other.models_);
            }
            onChanged();
          }
        } else {
          if (!other.models_.isEmpty()) {
            if (modelsBuilder_.isEmpty()) {
              modelsBuilder_.dispose();
              modelsBuilder_ = null;
              models_ = other.models_;
              bitField0_ = (bitField0_ & ~0x00000001);
              modelsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getModelsFieldBuilder() : null;
            } else {
              modelsBuilder_.addAllMessages(other.models_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getModelsCount(); i++) {
          if (!getModels(i).isInitialized()) {
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
        gazebo.msgs.ModelV.Model_V parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.ModelV.Model_V) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<gazebo.msgs.ModelOuterClass.Model> models_ =
        java.util.Collections.emptyList();
      private void ensureModelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          models_ = new java.util.ArrayList<gazebo.msgs.ModelOuterClass.Model>(models_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          gazebo.msgs.ModelOuterClass.Model, gazebo.msgs.ModelOuterClass.Model.Builder, gazebo.msgs.ModelOuterClass.ModelOrBuilder> modelsBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<gazebo.msgs.ModelOuterClass.Model> getModelsList() {
        if (modelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(models_);
        } else {
          return modelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public int getModelsCount() {
        if (modelsBuilder_ == null) {
          return models_.size();
        } else {
          return modelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public gazebo.msgs.ModelOuterClass.Model getModels(int index) {
        if (modelsBuilder_ == null) {
          return models_.get(index);
        } else {
          return modelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder setModels(
          int index, gazebo.msgs.ModelOuterClass.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.set(index, value);
          onChanged();
        } else {
          modelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder setModels(
          int index, gazebo.msgs.ModelOuterClass.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.set(index, builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(gazebo.msgs.ModelOuterClass.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.add(value);
          onChanged();
        } else {
          modelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          int index, gazebo.msgs.ModelOuterClass.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.add(index, value);
          onChanged();
        } else {
          modelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          gazebo.msgs.ModelOuterClass.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.add(builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          int index, gazebo.msgs.ModelOuterClass.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.add(index, builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addAllModels(
          java.lang.Iterable<? extends gazebo.msgs.ModelOuterClass.Model> values) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, models_);
          onChanged();
        } else {
          modelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder clearModels() {
        if (modelsBuilder_ == null) {
          models_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          modelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder removeModels(int index) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.remove(index);
          onChanged();
        } else {
          modelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public gazebo.msgs.ModelOuterClass.Model.Builder getModelsBuilder(
          int index) {
        return getModelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public gazebo.msgs.ModelOuterClass.ModelOrBuilder getModelsOrBuilder(
          int index) {
        if (modelsBuilder_ == null) {
          return models_.get(index);  } else {
          return modelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<? extends gazebo.msgs.ModelOuterClass.ModelOrBuilder> 
           getModelsOrBuilderList() {
        if (modelsBuilder_ != null) {
          return modelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(models_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public gazebo.msgs.ModelOuterClass.Model.Builder addModelsBuilder() {
        return getModelsFieldBuilder().addBuilder(
            gazebo.msgs.ModelOuterClass.Model.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public gazebo.msgs.ModelOuterClass.Model.Builder addModelsBuilder(
          int index) {
        return getModelsFieldBuilder().addBuilder(
            index, gazebo.msgs.ModelOuterClass.Model.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<gazebo.msgs.ModelOuterClass.Model.Builder> 
           getModelsBuilderList() {
        return getModelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          gazebo.msgs.ModelOuterClass.Model, gazebo.msgs.ModelOuterClass.Model.Builder, gazebo.msgs.ModelOuterClass.ModelOrBuilder> 
          getModelsFieldBuilder() {
        if (modelsBuilder_ == null) {
          modelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              gazebo.msgs.ModelOuterClass.Model, gazebo.msgs.ModelOuterClass.Model.Builder, gazebo.msgs.ModelOuterClass.ModelOrBuilder>(
                  models_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          models_ = null;
        }
        return modelsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Model_V)
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Model_V)
    private static final gazebo.msgs.ModelV.Model_V DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new gazebo.msgs.ModelV.Model_V();
    }

    public static gazebo.msgs.ModelV.Model_V getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Model_V>
        PARSER = new com.google.protobuf.AbstractParser<Model_V>() {
      @java.lang.Override
      public Model_V parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Model_V(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Model_V> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Model_V> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public gazebo.msgs.ModelV.Model_V getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Model_V_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gazebo_msgs_Model_V_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmodel_v.proto\022\013gazebo.msgs\032\013model.prot" +
      "o\"-\n\007Model_V\022\"\n\006models\030\002 \003(\0132\022.gazebo.ms" +
      "gs.Model"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.ModelOuterClass.getDescriptor(),
        });
    internal_static_gazebo_msgs_Model_V_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Model_V_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gazebo_msgs_Model_V_descriptor,
        new java.lang.String[] { "Models", });
    gazebo.msgs.ModelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
