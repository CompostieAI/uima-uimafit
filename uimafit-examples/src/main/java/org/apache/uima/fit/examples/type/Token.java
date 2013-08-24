/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/* First created by JCasGen Wed Jul 14 10:08:01 MDT 2010 */
package org.apache.uima.fit.examples.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

/**
 * Updated by JCasGen Wed Jul 14 10:08:01 MDT 2010 XML source: C:/Users/Philip/Documents
 * /Academic/workspace/uimafit-parent/uimaFIT-examples/src
 * /main/resources/org/apache/uima/fit/examples/TypeSystem.xml
 * 
 * @generated
 */
public class Token extends Annotation {
  /**
   * @generated
   * @ordered
   */
  public final static int typeIndexID = JCasRegistry.register(Token.class);

  /**
   * @generated
   * @ordered
   */
  public final static int type = typeIndexID;

  /** @generated */
  @Override
  public int getTypeIndexID() {
    return typeIndexID;
  }

  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected Token() {
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /**
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   * 
   * @generated modifiable
   */
  private void readObject() {
  }

  // *--------------*
  // * Feature: pos

  /**
   * getter for pos - gets
   * 
   * @generated
   */
  public String getPos() {
    if (Token_Type.featOkTst && ((Token_Type) jcasType).casFeat_pos == null) {
      jcasType.jcas.throwFeatMissing("pos", "org.apache.uima.fit.examples.type.Token");
    }
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type) jcasType).casFeatCode_pos);
  }

  /**
   * setter for pos - sets
   * 
   * @generated
   */
  public void setPos(String v) {
    if (Token_Type.featOkTst && ((Token_Type) jcasType).casFeat_pos == null) {
      jcasType.jcas.throwFeatMissing("pos", "org.apache.uima.fit.examples.type.Token");
    }
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type) jcasType).casFeatCode_pos, v);
  }
}
