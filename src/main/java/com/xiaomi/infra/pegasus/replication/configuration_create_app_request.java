// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.replication;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2022-03-10")
public class configuration_create_app_request implements org.apache.thrift.TBase<configuration_create_app_request, configuration_create_app_request._Fields>, java.io.Serializable, Cloneable, Comparable<configuration_create_app_request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("configuration_create_app_request");

  private static final org.apache.thrift.protocol.TField APP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("app_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("options", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new configuration_create_app_requestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new configuration_create_app_requestTupleSchemeFactory();

  public java.lang.String app_name; // required
  public create_app_options options; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APP_NAME((short)1, "app_name"),
    OPTIONS((short)2, "options");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // APP_NAME
          return APP_NAME;
        case 2: // OPTIONS
          return OPTIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APP_NAME, new org.apache.thrift.meta_data.FieldMetaData("app_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("options", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, create_app_options.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(configuration_create_app_request.class, metaDataMap);
  }

  public configuration_create_app_request() {
  }

  public configuration_create_app_request(
    java.lang.String app_name,
    create_app_options options)
  {
    this();
    this.app_name = app_name;
    this.options = options;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public configuration_create_app_request(configuration_create_app_request other) {
    if (other.isSetApp_name()) {
      this.app_name = other.app_name;
    }
    if (other.isSetOptions()) {
      this.options = new create_app_options(other.options);
    }
  }

  public configuration_create_app_request deepCopy() {
    return new configuration_create_app_request(this);
  }

  @Override
  public void clear() {
    this.app_name = null;
    this.options = null;
  }

  public java.lang.String getApp_name() {
    return this.app_name;
  }

  public configuration_create_app_request setApp_name(java.lang.String app_name) {
    this.app_name = app_name;
    return this;
  }

  public void unsetApp_name() {
    this.app_name = null;
  }

  /** Returns true if field app_name is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_name() {
    return this.app_name != null;
  }

  public void setApp_nameIsSet(boolean value) {
    if (!value) {
      this.app_name = null;
    }
  }

  public create_app_options getOptions() {
    return this.options;
  }

  public configuration_create_app_request setOptions(create_app_options options) {
    this.options = options;
    return this;
  }

  public void unsetOptions() {
    this.options = null;
  }

  /** Returns true if field options is set (has been assigned a value) and false otherwise */
  public boolean isSetOptions() {
    return this.options != null;
  }

  public void setOptionsIsSet(boolean value) {
    if (!value) {
      this.options = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case APP_NAME:
      if (value == null) {
        unsetApp_name();
      } else {
        setApp_name((java.lang.String)value);
      }
      break;

    case OPTIONS:
      if (value == null) {
        unsetOptions();
      } else {
        setOptions((create_app_options)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case APP_NAME:
      return getApp_name();

    case OPTIONS:
      return getOptions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case APP_NAME:
      return isSetApp_name();
    case OPTIONS:
      return isSetOptions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof configuration_create_app_request)
      return this.equals((configuration_create_app_request)that);
    return false;
  }

  public boolean equals(configuration_create_app_request that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_app_name = true && this.isSetApp_name();
    boolean that_present_app_name = true && that.isSetApp_name();
    if (this_present_app_name || that_present_app_name) {
      if (!(this_present_app_name && that_present_app_name))
        return false;
      if (!this.app_name.equals(that.app_name))
        return false;
    }

    boolean this_present_options = true && this.isSetOptions();
    boolean that_present_options = true && that.isSetOptions();
    if (this_present_options || that_present_options) {
      if (!(this_present_options && that_present_options))
        return false;
      if (!this.options.equals(that.options))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetApp_name()) ? 131071 : 524287);
    if (isSetApp_name())
      hashCode = hashCode * 8191 + app_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetOptions()) ? 131071 : 524287);
    if (isSetOptions())
      hashCode = hashCode * 8191 + options.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(configuration_create_app_request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetApp_name()).compareTo(other.isSetApp_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app_name, other.app_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOptions()).compareTo(other.isSetOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.options, other.options);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("configuration_create_app_request(");
    boolean first = true;

    sb.append("app_name:");
    if (this.app_name == null) {
      sb.append("null");
    } else {
      sb.append(this.app_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("options:");
    if (this.options == null) {
      sb.append("null");
    } else {
      sb.append(this.options);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (options != null) {
      options.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class configuration_create_app_requestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public configuration_create_app_requestStandardScheme getScheme() {
      return new configuration_create_app_requestStandardScheme();
    }
  }

  private static class configuration_create_app_requestStandardScheme extends org.apache.thrift.scheme.StandardScheme<configuration_create_app_request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, configuration_create_app_request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.app_name = iprot.readString();
              struct.setApp_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.options = new create_app_options();
              struct.options.read(iprot);
              struct.setOptionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, configuration_create_app_request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.app_name != null) {
        oprot.writeFieldBegin(APP_NAME_FIELD_DESC);
        oprot.writeString(struct.app_name);
        oprot.writeFieldEnd();
      }
      if (struct.options != null) {
        oprot.writeFieldBegin(OPTIONS_FIELD_DESC);
        struct.options.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class configuration_create_app_requestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public configuration_create_app_requestTupleScheme getScheme() {
      return new configuration_create_app_requestTupleScheme();
    }
  }

  private static class configuration_create_app_requestTupleScheme extends org.apache.thrift.scheme.TupleScheme<configuration_create_app_request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, configuration_create_app_request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetApp_name()) {
        optionals.set(0);
      }
      if (struct.isSetOptions()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetApp_name()) {
        oprot.writeString(struct.app_name);
      }
      if (struct.isSetOptions()) {
        struct.options.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, configuration_create_app_request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.app_name = iprot.readString();
        struct.setApp_nameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.options = new create_app_options();
        struct.options.read(iprot);
        struct.setOptionsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

