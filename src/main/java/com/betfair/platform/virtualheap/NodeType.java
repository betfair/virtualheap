/*
 Copyright 2013, The Sporting Exchange Limited

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.betfair.platform.virtualheap;

public enum NodeType {

//    BOOLEAN(true),
//    INTEGER(true),
//    LONG(true),
//    DATE(true),
//    CHAR(true),
//    BYTE(true),
//    BYTE_ARRAY(true),
//    FLOAT(true),
//    DOUBLE(true),
//    STRING(true),
//    SHORT(true),
    LIST,
    MAP,
    OBJECT,
    SCALAR

//    private final boolean scalar;
//
//    private NodeType(boolean scalar) {
//        this.scalar = scalar;
//    }
//
//    public boolean isScalar() {
//        return scalar;
//    }
}