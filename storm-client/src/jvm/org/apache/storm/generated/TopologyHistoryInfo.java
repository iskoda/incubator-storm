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
public class TopologyHistoryInfo implements org.apache.storm.thrift.TBase<TopologyHistoryInfo, TopologyHistoryInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TopologyHistoryInfo> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("TopologyHistoryInfo");

  private static final org.apache.storm.thrift.protocol.TField TOPO_IDS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("topo_ids", org.apache.storm.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TopologyHistoryInfoStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TopologyHistoryInfoTupleSchemeFactory();

  private java.util.List<java.lang.String> topo_ids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    TOPO_IDS((short)1, "topo_ids");

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
        case 1: // TOPO_IDS
          return TOPO_IDS;
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
    tmpMap.put(_Fields.TOPO_IDS, new org.apache.storm.thrift.meta_data.FieldMetaData("topo_ids", org.apache.storm.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.storm.thrift.meta_data.ListMetaData(org.apache.storm.thrift.protocol.TType.LIST, 
            new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopologyHistoryInfo.class, metaDataMap);
  }

  public TopologyHistoryInfo() {
  }

  public TopologyHistoryInfo(
    java.util.List<java.lang.String> topo_ids)
  {
    this();
    this.topo_ids = topo_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyHistoryInfo(TopologyHistoryInfo other) {
    if (other.is_set_topo_ids()) {
      java.util.List<java.lang.String> __this__topo_ids = new java.util.ArrayList<java.lang.String>(other.topo_ids);
      this.topo_ids = __this__topo_ids;
    }
  }

  public TopologyHistoryInfo deepCopy() {
    return new TopologyHistoryInfo(this);
  }

  @Override
  public void clear() {
    this.topo_ids = null;
  }

  public int get_topo_ids_size() {
    return (this.topo_ids == null) ? 0 : this.topo_ids.size();
  }

  public java.util.Iterator<java.lang.String> get_topo_ids_iterator() {
    return (this.topo_ids == null) ? null : this.topo_ids.iterator();
  }

  public void add_to_topo_ids(java.lang.String elem) {
    if (this.topo_ids == null) {
      this.topo_ids = new java.util.ArrayList<java.lang.String>();
    }
    this.topo_ids.add(elem);
  }

  public java.util.List<java.lang.String> get_topo_ids() {
    return this.topo_ids;
  }

  public void set_topo_ids(java.util.List<java.lang.String> topo_ids) {
    this.topo_ids = topo_ids;
  }

  public void unset_topo_ids() {
    this.topo_ids = null;
  }

  /** Returns true if field topo_ids is set (has been assigned a value) and false otherwise */
  public boolean is_set_topo_ids() {
    return this.topo_ids != null;
  }

  public void set_topo_ids_isSet(boolean value) {
    if (!value) {
      this.topo_ids = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOPO_IDS:
      if (value == null) {
        unset_topo_ids();
      } else {
        set_topo_ids((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPO_IDS:
      return get_topo_ids();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOPO_IDS:
      return is_set_topo_ids();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyHistoryInfo)
      return this.equals((TopologyHistoryInfo)that);
    return false;
  }

  public boolean equals(TopologyHistoryInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_topo_ids = true && this.is_set_topo_ids();
    boolean that_present_topo_ids = true && that.is_set_topo_ids();
    if (this_present_topo_ids || that_present_topo_ids) {
      if (!(this_present_topo_ids && that_present_topo_ids))
        return false;
      if (!this.topo_ids.equals(that.topo_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_topo_ids()) ? 131071 : 524287);
    if (is_set_topo_ids())
      hashCode = hashCode * 8191 + topo_ids.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TopologyHistoryInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_topo_ids()).compareTo(other.is_set_topo_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topo_ids()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.topo_ids, other.topo_ids);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TopologyHistoryInfo(");
    boolean first = true;

    sb.append("topo_ids:");
    if (this.topo_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.topo_ids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
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

  private static class TopologyHistoryInfoStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public TopologyHistoryInfoStandardScheme getScheme() {
      return new TopologyHistoryInfoStandardScheme();
    }
  }

  private static class TopologyHistoryInfoStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<TopologyHistoryInfo> {

    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, TopologyHistoryInfo struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPO_IDS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.LIST) {
              {
                org.apache.storm.thrift.protocol.TList _list862 = iprot.readListBegin();
                struct.topo_ids = new java.util.ArrayList<java.lang.String>(_list862.size);
                java.lang.String _elem863;
                for (int _i864 = 0; _i864 < _list862.size; ++_i864)
                {
                  _elem863 = iprot.readString();
                  struct.topo_ids.add(_elem863);
                }
                iprot.readListEnd();
              }
              struct.set_topo_ids_isSet(true);
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

    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, TopologyHistoryInfo struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topo_ids != null) {
        oprot.writeFieldBegin(TOPO_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRING, struct.topo_ids.size()));
          for (java.lang.String _iter865 : struct.topo_ids)
          {
            oprot.writeString(_iter865);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopologyHistoryInfoTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public TopologyHistoryInfoTupleScheme getScheme() {
      return new TopologyHistoryInfoTupleScheme();
    }
  }

  private static class TopologyHistoryInfoTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<TopologyHistoryInfo> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, TopologyHistoryInfo struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_topo_ids()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_topo_ids()) {
        {
          oprot.writeI32(struct.topo_ids.size());
          for (java.lang.String _iter866 : struct.topo_ids)
          {
            oprot.writeString(_iter866);
          }
        }
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, TopologyHistoryInfo struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.storm.thrift.protocol.TList _list867 = new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRING, iprot.readI32());
          struct.topo_ids = new java.util.ArrayList<java.lang.String>(_list867.size);
          java.lang.String _elem868;
          for (int _i869 = 0; _i869 < _list867.size; ++_i869)
          {
            _elem868 = iprot.readString();
            struct.topo_ids.add(_elem868);
          }
        }
        struct.set_topo_ids_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

