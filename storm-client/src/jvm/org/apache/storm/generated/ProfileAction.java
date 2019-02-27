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


public enum ProfileAction implements org.apache.storm.thrift.TEnum {
  JPROFILE_STOP(0),
  JPROFILE_START(1),
  JPROFILE_DUMP(2),
  JMAP_DUMP(3),
  JSTACK_DUMP(4),
  JVM_RESTART(5);

  private final int value;

  private ProfileAction(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ProfileAction findByValue(int value) { 
    switch (value) {
      case 0:
        return JPROFILE_STOP;
      case 1:
        return JPROFILE_START;
      case 2:
        return JPROFILE_DUMP;
      case 3:
        return JMAP_DUMP;
      case 4:
        return JSTACK_DUMP;
      case 5:
        return JVM_RESTART;
      default:
        return null;
    }
  }
}
