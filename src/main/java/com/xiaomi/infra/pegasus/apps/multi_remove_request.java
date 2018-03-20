// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.apps;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-03-20")
public class multi_remove_request implements com.xiaomi.infra.pegasus.thrift.TBase<multi_remove_request, multi_remove_request._Fields>, java.io.Serializable, Cloneable, Comparable<multi_remove_request> {
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TStruct STRUCT_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TStruct("multi_remove_request");

  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField HASH_KEY_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("hash_key", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)1);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField SORK_KEYS_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("sork_keys", com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST, (short)2);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField MAX_COUNT_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("max_count", com.xiaomi.infra.pegasus.thrift.protocol.TType.I64, (short)3);

  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new multi_remove_requestStandardSchemeFactory();
  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new multi_remove_requestTupleSchemeFactory();

  public com.xiaomi.infra.pegasus.base.blob hash_key; // required
  public java.util.List<com.xiaomi.infra.pegasus.base.blob> sork_keys; // required
  public long max_count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.xiaomi.infra.pegasus.thrift.TFieldIdEnum {
    HASH_KEY((short)1, "hash_key"),
    SORK_KEYS((short)2, "sork_keys"),
    MAX_COUNT((short)3, "max_count");

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
        case 1: // HASH_KEY
          return HASH_KEY;
        case 2: // SORK_KEYS
          return SORK_KEYS;
        case 3: // MAX_COUNT
          return MAX_COUNT;
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
  private static final int __MAX_COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HASH_KEY, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("hash_key", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.SORK_KEYS, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("sork_keys", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.ListMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST, 
            new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class))));
    tmpMap.put(_Fields.MAX_COUNT, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("max_count", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData.addStructMetaDataMap(multi_remove_request.class, metaDataMap);
  }

  public multi_remove_request() {
  }

  public multi_remove_request(
    com.xiaomi.infra.pegasus.base.blob hash_key,
    java.util.List<com.xiaomi.infra.pegasus.base.blob> sork_keys,
    long max_count)
  {
    this();
    this.hash_key = hash_key;
    this.sork_keys = sork_keys;
    this.max_count = max_count;
    setMax_countIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public multi_remove_request(multi_remove_request other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHash_key()) {
      this.hash_key = new com.xiaomi.infra.pegasus.base.blob(other.hash_key);
    }
    if (other.isSetSork_keys()) {
      java.util.List<com.xiaomi.infra.pegasus.base.blob> __this__sork_keys = new java.util.ArrayList<com.xiaomi.infra.pegasus.base.blob>(other.sork_keys.size());
      for (com.xiaomi.infra.pegasus.base.blob other_element : other.sork_keys) {
        __this__sork_keys.add(new com.xiaomi.infra.pegasus.base.blob(other_element));
      }
      this.sork_keys = __this__sork_keys;
    }
    this.max_count = other.max_count;
  }

  public multi_remove_request deepCopy() {
    return new multi_remove_request(this);
  }

  @Override
  public void clear() {
    this.hash_key = null;
    this.sork_keys = null;
    setMax_countIsSet(false);
    this.max_count = 0;
  }

  public com.xiaomi.infra.pegasus.base.blob getHash_key() {
    return this.hash_key;
  }

  public multi_remove_request setHash_key(com.xiaomi.infra.pegasus.base.blob hash_key) {
    this.hash_key = hash_key;
    return this;
  }

  public void unsetHash_key() {
    this.hash_key = null;
  }

  /** Returns true if field hash_key is set (has been assigned a value) and false otherwise */
  public boolean isSetHash_key() {
    return this.hash_key != null;
  }

  public void setHash_keyIsSet(boolean value) {
    if (!value) {
      this.hash_key = null;
    }
  }

  public int getSork_keysSize() {
    return (this.sork_keys == null) ? 0 : this.sork_keys.size();
  }

  public java.util.Iterator<com.xiaomi.infra.pegasus.base.blob> getSork_keysIterator() {
    return (this.sork_keys == null) ? null : this.sork_keys.iterator();
  }

  public void addToSork_keys(com.xiaomi.infra.pegasus.base.blob elem) {
    if (this.sork_keys == null) {
      this.sork_keys = new java.util.ArrayList<com.xiaomi.infra.pegasus.base.blob>();
    }
    this.sork_keys.add(elem);
  }

  public java.util.List<com.xiaomi.infra.pegasus.base.blob> getSork_keys() {
    return this.sork_keys;
  }

  public multi_remove_request setSork_keys(java.util.List<com.xiaomi.infra.pegasus.base.blob> sork_keys) {
    this.sork_keys = sork_keys;
    return this;
  }

  public void unsetSork_keys() {
    this.sork_keys = null;
  }

  /** Returns true if field sork_keys is set (has been assigned a value) and false otherwise */
  public boolean isSetSork_keys() {
    return this.sork_keys != null;
  }

  public void setSork_keysIsSet(boolean value) {
    if (!value) {
      this.sork_keys = null;
    }
  }

  public long getMax_count() {
    return this.max_count;
  }

  public multi_remove_request setMax_count(long max_count) {
    this.max_count = max_count;
    setMax_countIsSet(true);
    return this;
  }

  public void unsetMax_count() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_COUNT_ISSET_ID);
  }

  /** Returns true if field max_count is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_count() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_COUNT_ISSET_ID);
  }

  public void setMax_countIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HASH_KEY:
      if (value == null) {
        unsetHash_key();
      } else {
        setHash_key((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case SORK_KEYS:
      if (value == null) {
        unsetSork_keys();
      } else {
        setSork_keys((java.util.List<com.xiaomi.infra.pegasus.base.blob>)value);
      }
      break;

    case MAX_COUNT:
      if (value == null) {
        unsetMax_count();
      } else {
        setMax_count((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HASH_KEY:
      return getHash_key();

    case SORK_KEYS:
      return getSork_keys();

    case MAX_COUNT:
      return getMax_count();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HASH_KEY:
      return isSetHash_key();
    case SORK_KEYS:
      return isSetSork_keys();
    case MAX_COUNT:
      return isSetMax_count();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof multi_remove_request)
      return this.equals((multi_remove_request)that);
    return false;
  }

  public boolean equals(multi_remove_request that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hash_key = true && this.isSetHash_key();
    boolean that_present_hash_key = true && that.isSetHash_key();
    if (this_present_hash_key || that_present_hash_key) {
      if (!(this_present_hash_key && that_present_hash_key))
        return false;
      if (!this.hash_key.equals(that.hash_key))
        return false;
    }

    boolean this_present_sork_keys = true && this.isSetSork_keys();
    boolean that_present_sork_keys = true && that.isSetSork_keys();
    if (this_present_sork_keys || that_present_sork_keys) {
      if (!(this_present_sork_keys && that_present_sork_keys))
        return false;
      if (!this.sork_keys.equals(that.sork_keys))
        return false;
    }

    boolean this_present_max_count = true;
    boolean that_present_max_count = true;
    if (this_present_max_count || that_present_max_count) {
      if (!(this_present_max_count && that_present_max_count))
        return false;
      if (this.max_count != that.max_count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHash_key()) ? 131071 : 524287);
    if (isSetHash_key())
      hashCode = hashCode * 8191 + hash_key.hashCode();

    hashCode = hashCode * 8191 + ((isSetSork_keys()) ? 131071 : 524287);
    if (isSetSork_keys())
      hashCode = hashCode * 8191 + sork_keys.hashCode();

    hashCode = hashCode * 8191 + com.xiaomi.infra.pegasus.thrift.TBaseHelper.hashCode(max_count);

    return hashCode;
  }

  @Override
  public int compareTo(multi_remove_request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHash_key()).compareTo(other.isSetHash_key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHash_key()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.hash_key, other.hash_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSork_keys()).compareTo(other.isSetSork_keys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSork_keys()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.sork_keys, other.sork_keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMax_count()).compareTo(other.isSetMax_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_count()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.max_count, other.max_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("multi_remove_request(");
    boolean first = true;

    sb.append("hash_key:");
    if (this.hash_key == null) {
      sb.append("null");
    } else {
      sb.append(this.hash_key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sork_keys:");
    if (this.sork_keys == null) {
      sb.append("null");
    } else {
      sb.append(this.sork_keys);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("max_count:");
    sb.append(this.max_count);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.xiaomi.infra.pegasus.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (hash_key != null) {
      hash_key.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(out)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(in)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class multi_remove_requestStandardSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public multi_remove_requestStandardScheme getScheme() {
      return new multi_remove_requestStandardScheme();
    }
  }

  private static class multi_remove_requestStandardScheme extends com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme<multi_remove_request> {

    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot, multi_remove_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HASH_KEY
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.hash_key = new com.xiaomi.infra.pegasus.base.blob();
              struct.hash_key.read(iprot);
              struct.setHash_keyIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SORK_KEYS
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST) {
              {
                com.xiaomi.infra.pegasus.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.sork_keys = new java.util.ArrayList<com.xiaomi.infra.pegasus.base.blob>(_list8.size);
                com.xiaomi.infra.pegasus.base.blob _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new com.xiaomi.infra.pegasus.base.blob();
                  _elem9.read(iprot);
                  struct.sork_keys.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setSork_keysIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_COUNT
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I64) {
              struct.max_count = iprot.readI64();
              struct.setMax_countIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot, multi_remove_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hash_key != null) {
        oprot.writeFieldBegin(HASH_KEY_FIELD_DESC);
        struct.hash_key.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.sork_keys != null) {
        oprot.writeFieldBegin(SORK_KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new com.xiaomi.infra.pegasus.thrift.protocol.TList(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, struct.sork_keys.size()));
          for (com.xiaomi.infra.pegasus.base.blob _iter11 : struct.sork_keys)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MAX_COUNT_FIELD_DESC);
      oprot.writeI64(struct.max_count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class multi_remove_requestTupleSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public multi_remove_requestTupleScheme getScheme() {
      return new multi_remove_requestTupleScheme();
    }
  }

  private static class multi_remove_requestTupleScheme extends com.xiaomi.infra.pegasus.thrift.scheme.TupleScheme<multi_remove_request> {

    @Override
    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, multi_remove_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol oprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHash_key()) {
        optionals.set(0);
      }
      if (struct.isSetSork_keys()) {
        optionals.set(1);
      }
      if (struct.isSetMax_count()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetHash_key()) {
        struct.hash_key.write(oprot);
      }
      if (struct.isSetSork_keys()) {
        {
          oprot.writeI32(struct.sork_keys.size());
          for (com.xiaomi.infra.pegasus.base.blob _iter12 : struct.sork_keys)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetMax_count()) {
        oprot.writeI64(struct.max_count);
      }
    }

    @Override
    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, multi_remove_request struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol iprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.hash_key = new com.xiaomi.infra.pegasus.base.blob();
        struct.hash_key.read(iprot);
        struct.setHash_keyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          com.xiaomi.infra.pegasus.thrift.protocol.TList _list13 = new com.xiaomi.infra.pegasus.thrift.protocol.TList(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sork_keys = new java.util.ArrayList<com.xiaomi.infra.pegasus.base.blob>(_list13.size);
          com.xiaomi.infra.pegasus.base.blob _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new com.xiaomi.infra.pegasus.base.blob();
            _elem14.read(iprot);
            struct.sork_keys.add(_elem14);
          }
        }
        struct.setSork_keysIsSet(true);
      }
      if (incoming.get(2)) {
        struct.max_count = iprot.readI64();
        struct.setMax_countIsSet(true);
      }
    }
  }

  private static <S extends com.xiaomi.infra.pegasus.thrift.scheme.IScheme> S scheme(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol proto) {
    return (com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

