/* Generated By:JavaCC: Do not edit this line. CommonWikiScannerConstants.java */
/*******************************************************************************
 * Copyright (c) 2005,2007 Cognium Systems SA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Contributors:
 *     Cognium Systems SA - initial API and implementation
 *******************************************************************************/
package org.wikimodel.wem.common.javacc;

public interface CommonWikiScannerConstants {

  int EOF = 0;
  int INTERNAL_VERBATIM_START = 1;
  int INTERNAL_VERBATIM_END = 2;
  int INTERNAL_VERBATIM_CONTENT = 3;
  int LI_COMMON = 4;
  int LI_SPECIAL = 5;
  int LIST_ITEM = 6;
  int PROPERTY = 7;
  int PROPERTY_DOC = 8;
  int DOC_BEGIN = 9;
  int DOC_END = 10;
  int VERBATIM_START = 11;
  int VERBATIM_END = 12;
  int VERBATIM_CONTENT = 13;
  int INFO = 14;
  int EXTENSION = 15;
  int PARAMS = 16;
  int HEADER = 17;
  int BR = 18;
  int ESCAPE = 19;
  int VERBATIM_INLINE = 20;
  int REFERENCE = 21;
  int HORLINE = 22;
  int CELL = 23;
  int QUOT_BLOCK = 24;
  int QUOT_LINE = 25;
  int FORMAT_SYMBOL = 26;
  int NEW_LINE = 27;
  int SPACE = 28;
  int SPECIAL_SYMBOL = 29;
  int CHAR = 30;
  int URI = 31;
  int ALPHA = 32;
  int DIGIT = 33;
  int HEXDIG = 34;
  int URI_GEN_DELIMS = 35;
  int URI_SUB_DELIMS = 36;
  int URI_UNRESERVED = 37;
  int URI_RESERVED = 38;
  int URI_SCHEME = 39;
  int URI_PCT_ENCODED = 40;
  int URI_PCHAR = 41;
  int URI_QUERY = 42;
  int URI_FRAGMENT = 43;
  int URI_HIER_PART = 44;
  int URI_AUTHORITY = 45;
  int URI_USERINFO = 46;
  int URI_PATH_ABEMPTY = 47;
  int URI_PATH_ABSOLUTE = 48;
  int URI_PATH_ROOTLESS = 49;
  int URI_SEGMENT = 50;
  int URI_SEGMENT_NZ = 51;
  int URI_SEGMENT_NZ_NC = 52;
  int URI_PORT = 53;
  int URI_HOST = 54;
  int URI_REG_NAME = 55;
  int I_DOC_BEGIN = 56;
  int I_DOC_END = 57;
  int I_BR = 58;
  int I_ESCAPE = 59;
  int I_HORLINE = 60;
  int I_TABLE_ROW = 61;
  int I_TABLE_CELL = 62;
  int I_LIST_ITEM = 63;
  int I_VERBATIM_INLINE = 64;
  int I_VERBATIM_START = 65;
  int I_QUOT_BLOCK = 66;
  int I_QUOT_LINE = 67;
  int I_INFO = 68;
  int I_EXTENSION_BLOCK = 69;
  int I_EXTENSION_INLINE = 70;
  int I_PROPERTY = 71;
  int I_PROPERTY_DOC = 72;
  int I_PROPERTY_INLINE = 73;
  int I_HEADER_BEGIN = 74;
  int I_REFERENCE = 75;
  int I_HEADER_END = 76;
  int I_FORMAT_SYMBOL = 77;
  int I_BLOCK_PARAMS = 78;
  int I_URI = 79;
  int I_NL = 80;
  int I_SPACE = 81;
  int I_WORD = 82;
  int I_SPECIAL_SYMBOL = 83;
  int D_DOC_BEGIN = 84;
  int D_DOC_END = 85;
  int D_BR = 86;
  int D_ESCAPE = 87;
  int D_HORLINE = 88;
  int D_TABLE_ROW = 89;
  int D_TABLE_CELL = 90;
  int D_LIST_ITEM = 91;
  int D_VERBATIM_INLINE = 92;
  int D_VERBATIM_START = 93;
  int D_QUOT_BLOCK = 94;
  int D_QUOT_LINE = 95;
  int D_INFO = 96;
  int D_EXTENSION_BLOCK = 97;
  int D_EXTENSION_INLINE = 98;
  int D_PROPERTY = 99;
  int D_PROPERTY_DOC = 100;
  int D_PROPERTY_INLINE = 101;
  int D_HEADER_BEGIN = 102;
  int D_REFERENCE = 103;
  int D_HEADER_END = 104;
  int D_FORMAT_SYMBOL = 105;
  int D_BLOCK_PARAMS = 106;
  int D_URI = 107;
  int D_NL = 108;
  int D_SPACE = 109;
  int D_WORD = 110;
  int D_SPECIAL_SYMBOL = 111;

  int VERBATIM_CONTEXT = 0;
  int DEFAULT = 1;
  int INITIAL_CONTEXT = 2;

  String[] tokenImage = {
    "<EOF>",
    "<INTERNAL_VERBATIM_START>",
    "<INTERNAL_VERBATIM_END>",
    "<INTERNAL_VERBATIM_CONTENT>",
    "<LI_COMMON>",
    "<LI_SPECIAL>",
    "<LIST_ITEM>",
    "<PROPERTY>",
    "<PROPERTY_DOC>",
    "<DOC_BEGIN>",
    "<DOC_END>",
    "\"{{{\"",
    "\"}}}\"",
    "<VERBATIM_CONTENT>",
    "<INFO>",
    "<EXTENSION>",
    "<PARAMS>",
    "<HEADER>",
    "<BR>",
    "<ESCAPE>",
    "<VERBATIM_INLINE>",
    "<REFERENCE>",
    "<HORLINE>",
    "<CELL>",
    "<QUOT_BLOCK>",
    "<QUOT_LINE>",
    "<FORMAT_SYMBOL>",
    "<NEW_LINE>",
    "<SPACE>",
    "<SPECIAL_SYMBOL>",
    "<CHAR>",
    "<URI>",
    "<ALPHA>",
    "<DIGIT>",
    "<HEXDIG>",
    "<URI_GEN_DELIMS>",
    "<URI_SUB_DELIMS>",
    "<URI_UNRESERVED>",
    "<URI_RESERVED>",
    "<URI_SCHEME>",
    "<URI_PCT_ENCODED>",
    "<URI_PCHAR>",
    "<URI_QUERY>",
    "<URI_FRAGMENT>",
    "<URI_HIER_PART>",
    "<URI_AUTHORITY>",
    "<URI_USERINFO>",
    "<URI_PATH_ABEMPTY>",
    "<URI_PATH_ABSOLUTE>",
    "<URI_PATH_ROOTLESS>",
    "<URI_SEGMENT>",
    "<URI_SEGMENT_NZ>",
    "<URI_SEGMENT_NZ_NC>",
    "<URI_PORT>",
    "<URI_HOST>",
    "<URI_REG_NAME>",
    "<I_DOC_BEGIN>",
    "<I_DOC_END>",
    "<I_BR>",
    "<I_ESCAPE>",
    "<I_HORLINE>",
    "<I_TABLE_ROW>",
    "<I_TABLE_CELL>",
    "<I_LIST_ITEM>",
    "<I_VERBATIM_INLINE>",
    "<I_VERBATIM_START>",
    "<I_QUOT_BLOCK>",
    "<I_QUOT_LINE>",
    "<I_INFO>",
    "<I_EXTENSION_BLOCK>",
    "<I_EXTENSION_INLINE>",
    "<I_PROPERTY>",
    "<I_PROPERTY_DOC>",
    "<I_PROPERTY_INLINE>",
    "<I_HEADER_BEGIN>",
    "<I_REFERENCE>",
    "<I_HEADER_END>",
    "<I_FORMAT_SYMBOL>",
    "<I_BLOCK_PARAMS>",
    "<I_URI>",
    "<I_NL>",
    "<I_SPACE>",
    "<I_WORD>",
    "<I_SPECIAL_SYMBOL>",
    "<D_DOC_BEGIN>",
    "<D_DOC_END>",
    "<D_BR>",
    "<D_ESCAPE>",
    "<D_HORLINE>",
    "<D_TABLE_ROW>",
    "<D_TABLE_CELL>",
    "<D_LIST_ITEM>",
    "<D_VERBATIM_INLINE>",
    "<D_VERBATIM_START>",
    "<D_QUOT_BLOCK>",
    "<D_QUOT_LINE>",
    "<D_INFO>",
    "<D_EXTENSION_BLOCK>",
    "<D_EXTENSION_INLINE>",
    "<D_PROPERTY>",
    "<D_PROPERTY_DOC>",
    "<D_PROPERTY_INLINE>",
    "<D_HEADER_BEGIN>",
    "<D_REFERENCE>",
    "<D_HEADER_END>",
    "<D_FORMAT_SYMBOL>",
    "<D_BLOCK_PARAMS>",
    "<D_URI>",
    "<D_NL>",
    "<D_SPACE>",
    "<D_WORD>",
    "<D_SPECIAL_SYMBOL>",
  };

}