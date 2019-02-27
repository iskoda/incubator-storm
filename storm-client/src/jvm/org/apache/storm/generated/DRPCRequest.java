/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class DRPCRequest implements org.apache.storm.thrift.TBase<DRPCRequest, DRPCRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DRPCRequest> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("DRPCRequest");

  private static final org.apache.storm.thrift.protocol.TField FUNC_ARGS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("func_args", org.apache.storm.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.storm.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("request_id", org.apache.storm.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DRPCRequestStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DRPCRequestTupleSchemeFactory();

  private java.lang.String func_args; // required
  private java.lang.String request_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    FUNC_ARGS((short)1, "func_args"),
    REQUEST_ID((short)2, "request_id");

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
        case 1: // FUNC_ARGS
          return FUNC_ARGS;
        case 2: // REQUEST_ID
          return REQUEST_ID;
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
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUNC_ARGS, new org.apache.storm.thrift.meta_data.FieldMetaData("func_args", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.storm.thrift.meta_data.FieldMetaData("request_id", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DRPCRequest.class, metaDataMap);
  }

  public DRPCRequest() {
  }

  public DRPCRequest(
    java.lang.String func_args,
    java.lang.String request_id)
  {
    this();
    this.func_args = func_args;
    this.request_id = request_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DRPCRequest(DRPCRequest other) {
    if (other.is_set_func_args()) {
      this.func_args = other.func_args;
    }
    if (other.is_set_request_id()) {
      this.request_id = other.request_id;
    }
  }

  public DRPCRequest deepCopy() {
    return new DRPCRequest(this);
  }

  @Override
  public void clear() {
    this.func_args = null;
    this.request_id = null;
  }

  public java.lang.String get_func_args() {
    return this.func_args;
  }

  public void set_func_args(java.lang.String func_args) {
    this.func_args = func_args;
  }

  public void unset_func_args() {
    this.func_args = null;
  }

  /** Returns true if field func_args is set (has been assigned a value) and false otherwise */
  public boolean is_set_func_args() {
    return this.func_args != null;
  }

  public void set_func_args_isSet(boolean value) {
    if (!value) {
      this.func_args = null;
    }
  }

  public java.lang.String get_request_id() {
    return this.request_id;
  }

  public void set_request_id(java.lang.String request_id) {
    this.request_id = request_id;
  }

  public void unset_request_id() {
    this.request_id = null;
  }

  /** Returns true if field request_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_request_id() {
    return this.request_id != null;
  }

  public void set_request_id_isSet(boolean value) {
    if (!value) {
      this.request_id = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case FUNC_ARGS:
      if (value == null) {
        unset_func_args();
      } else {
        set_func_args((java.lang.String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unset_request_id();
      } else {
        set_request_id((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FUNC_ARGS:
      return get_func_args();

    case REQUEST_ID:
      return get_request_id();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FUNC_ARGS:
      return is_set_func_args();
    case REQUEST_ID:
      return is_set_request_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DRPCRequest)
      return this.equals((DRPCRequest)that);
    return false;
  }

  public boolean equals(DRPCRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_func_args = true && this.is_set_func_args();
    boolean that_present_func_args = true && that.is_set_func_args();
    if (this_present_func_args || that_present_func_args) {
      if (!(this_present_func_args && that_present_func_args))
        return false;
      if (!this.func_args.equals(that.func_args))
        return false;
    }

    boolean this_present_request_id = true && this.is_set_request_id();
    boolean that_present_request_id = true && that.is_set_request_id();
    if (this_present_request_id || that_present_request_id) {
      if (!(this_present_request_id && that_present_request_id))
        return false;
      if (!this.request_id.equals(that.request_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_func_args()) ? 131071 : 524287);
    if (is_set_func_args())
      hashCode = hashCode * 8191 + func_args.hashCode();

    hashCode = hashCode * 8191 + ((is_set_request_id()) ? 131071 : 524287);
    if (is_set_request_id())
      hashCode = hashCode * 8191 + request_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DRPCRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_func_args()).compareTo(other.is_set_func_args());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_func_args()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.func_args, other.func_args);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_request_id()).compareTo(other.is_set_request_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_request_id()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.request_id, other.request_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DRPCRequest(");
    boolean first = true;

    sb.append("func_args:");
    if (this.func_args == null) {
      sb.append("null");
    } else {
      sb.append(this.func_args);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("request_id:");
    if (this.request_id == null) {
      sb.append("null");
    } else {
      sb.append(this.request_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    if (!is_set_func_args()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'func_args' is unset! Struct:" + toString());
    }

    if (!is_set_request_id()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'request_id' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DRPCRequestStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public DRPCRequestStandardScheme getScheme() {
      return new DRPCRequestStandardScheme();
    }
  }

  private static class DRPCRequestStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<DRPCRequest> {

    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, DRPCRequest struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUNC_ARGS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.func_args = iprot.readString();
              struct.set_func_args_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUEST_ID
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.request_id = iprot.readString();
              struct.set_request_id_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, DRPCRequest struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.func_args != null) {
        oprot.writeFieldBegin(FUNC_ARGS_FIELD_DESC);
        oprot.writeString(struct.func_args);
        oprot.writeFieldEnd();
      }
      if (struct.request_id != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(struct.request_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DRPCRequestTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public DRPCRequestTupleScheme getScheme() {
      return new DRPCRequestTupleScheme();
    }
  }

  private static class DRPCRequestTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<DRPCRequest> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, DRPCRequest struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.func_args);
      oprot.writeString(struct.request_id);
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, DRPCRequest struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      struct.func_args = iprot.readString();
      struct.set_func_args_isSet(true);
      struct.request_id = iprot.readString();
      struct.set_request_id_isSet(true);
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

