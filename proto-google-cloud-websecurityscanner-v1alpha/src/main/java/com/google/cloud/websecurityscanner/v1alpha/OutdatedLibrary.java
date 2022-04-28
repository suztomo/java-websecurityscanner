/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * Information reported for an outdated library.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.OutdatedLibrary}
 */
public final class OutdatedLibrary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)
    OutdatedLibraryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OutdatedLibrary.newBuilder() to construct.
  private OutdatedLibrary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OutdatedLibrary() {
    libraryName_ = "";
    version_ = "";
    learnMoreUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OutdatedLibrary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OutdatedLibrary(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              libraryName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                learnMoreUrls_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              learnMoreUrls_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        learnMoreUrls_ = learnMoreUrls_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.class,
            com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.Builder.class);
  }

  public static final int LIBRARY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object libraryName_;
  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   *
   * @return The libraryName.
   */
  @java.lang.Override
  public java.lang.String getLibraryName() {
    java.lang.Object ref = libraryName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      libraryName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   *
   * @return The bytes for libraryName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLibraryNameBytes() {
    java.lang.Object ref = libraryName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      libraryName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEARN_MORE_URLS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList learnMoreUrls_;
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @return A list containing the learnMoreUrls.
   */
  public com.google.protobuf.ProtocolStringList getLearnMoreUrlsList() {
    return learnMoreUrls_;
  }
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @return The count of learnMoreUrls.
   */
  public int getLearnMoreUrlsCount() {
    return learnMoreUrls_.size();
  }
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The learnMoreUrls at the given index.
   */
  public java.lang.String getLearnMoreUrls(int index) {
    return learnMoreUrls_.get(index);
  }
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the learnMoreUrls at the given index.
   */
  public com.google.protobuf.ByteString getLearnMoreUrlsBytes(int index) {
    return learnMoreUrls_.getByteString(index);
  }

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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(libraryName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, libraryName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    for (int i = 0; i < learnMoreUrls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, learnMoreUrls_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(libraryName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, libraryName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < learnMoreUrls_.size(); i++) {
        dataSize += computeStringSizeNoTag(learnMoreUrls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLearnMoreUrlsList().size();
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary other =
        (com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary) obj;

    if (!getLibraryName().equals(other.getLibraryName())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (!getLearnMoreUrlsList().equals(other.getLearnMoreUrlsList())) return false;
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
    hash = (37 * hash) + LIBRARY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getLibraryName().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (getLearnMoreUrlsCount() > 0) {
      hash = (37 * hash) + LEARN_MORE_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getLearnMoreUrlsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Information reported for an outdated library.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.OutdatedLibrary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)
      com.google.cloud.websecurityscanner.v1alpha.OutdatedLibraryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.class,
              com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      libraryName_ = "";

      version_ = "";

      learnMoreUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary build() {
      com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary result =
          new com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary(this);
      int from_bitField0_ = bitField0_;
      result.libraryName_ = libraryName_;
      result.version_ = version_;
      if (((bitField0_ & 0x00000001) != 0)) {
        learnMoreUrls_ = learnMoreUrls_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.learnMoreUrls_ = learnMoreUrls_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary other) {
      if (other == com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary.getDefaultInstance())
        return this;
      if (!other.getLibraryName().isEmpty()) {
        libraryName_ = other.libraryName_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.learnMoreUrls_.isEmpty()) {
        if (learnMoreUrls_.isEmpty()) {
          learnMoreUrls_ = other.learnMoreUrls_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLearnMoreUrlsIsMutable();
          learnMoreUrls_.addAll(other.learnMoreUrls_);
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
      com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object libraryName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the outdated library.
     * </pre>
     *
     * <code>string library_name = 1;</code>
     *
     * @return The libraryName.
     */
    public java.lang.String getLibraryName() {
      java.lang.Object ref = libraryName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        libraryName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the outdated library.
     * </pre>
     *
     * <code>string library_name = 1;</code>
     *
     * @return The bytes for libraryName.
     */
    public com.google.protobuf.ByteString getLibraryNameBytes() {
      java.lang.Object ref = libraryName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        libraryName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the outdated library.
     * </pre>
     *
     * <code>string library_name = 1;</code>
     *
     * @param value The libraryName to set.
     * @return This builder for chaining.
     */
    public Builder setLibraryName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      libraryName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the outdated library.
     * </pre>
     *
     * <code>string library_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLibraryName() {

      libraryName_ = getDefaultInstance().getLibraryName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the outdated library.
     * </pre>
     *
     * <code>string library_name = 1;</code>
     *
     * @param value The bytes for libraryName to set.
     * @return This builder for chaining.
     */
    public Builder setLibraryNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      libraryName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * The version number.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version number.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version number.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version number.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version number.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList learnMoreUrls_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureLearnMoreUrlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        learnMoreUrls_ = new com.google.protobuf.LazyStringArrayList(learnMoreUrls_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @return A list containing the learnMoreUrls.
     */
    public com.google.protobuf.ProtocolStringList getLearnMoreUrlsList() {
      return learnMoreUrls_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @return The count of learnMoreUrls.
     */
    public int getLearnMoreUrlsCount() {
      return learnMoreUrls_.size();
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The learnMoreUrls at the given index.
     */
    public java.lang.String getLearnMoreUrls(int index) {
      return learnMoreUrls_.get(index);
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the learnMoreUrls at the given index.
     */
    public com.google.protobuf.ByteString getLearnMoreUrlsBytes(int index) {
      return learnMoreUrls_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The learnMoreUrls to set.
     * @return This builder for chaining.
     */
    public Builder setLearnMoreUrls(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLearnMoreUrlsIsMutable();
      learnMoreUrls_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param value The learnMoreUrls to add.
     * @return This builder for chaining.
     */
    public Builder addLearnMoreUrls(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLearnMoreUrlsIsMutable();
      learnMoreUrls_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param values The learnMoreUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAllLearnMoreUrls(java.lang.Iterable<java.lang.String> values) {
      ensureLearnMoreUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, learnMoreUrls_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLearnMoreUrls() {
      learnMoreUrls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URLs to learn more information about the vulnerabilities in the library.
     * </pre>
     *
     * <code>repeated string learn_more_urls = 3;</code>
     *
     * @param value The bytes of the learnMoreUrls to add.
     * @return This builder for chaining.
     */
    public Builder addLearnMoreUrlsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureLearnMoreUrlsIsMutable();
      learnMoreUrls_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)
  private static final com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutdatedLibrary> PARSER =
      new com.google.protobuf.AbstractParser<OutdatedLibrary>() {
        @java.lang.Override
        public OutdatedLibrary parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OutdatedLibrary(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OutdatedLibrary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutdatedLibrary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
