/* Generated By:JavaCC: Do not edit this line. XWikiScannerConstants.java */
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
package org.wikimodel.wem.xwiki.javacc;

public interface XWikiScannerConstants {

  int EOF = 0;
  int INTERNAL_VERBATIM_START = 1;
  int INTERNAL_VERBATIM_END = 2;
  int INTERNAL_VERBATIM_CONTENT = 3;
  int INTERNAL_MACRO_START = 4;
  int INTERNAL_MACRO_END = 5;
  int INTERNAL_MACRO_CONTENT = 6;
  int LI = 7;
  int HEADER = 8;
  int BR = 9;
  int VERBATIM_START = 10;
  int VERBATIM_END = 11;
  int VERBATIM_CONTENT = 12;
  int MACRO_NAME = 13;
  int MACRO_DEF = 14;
  int MACRO_EMPTY = 15;
  int MACRO_START = 16;
  int MACRO_END = 17;
  int MACRO_CONTENT = 18;
  int REFERENCE_IMAGE = 19;
  int REFERENCE = 20;
  int HORLINE = 21;
  int PARAMS = 22;
  int CELL = 23;
  int QUOT_LINE = 24;
  int FORMAT_SYMBOL = 25;
  int XWIKI_URI = 26;
  int XWIKI_URI_URIS = 27;
  int XWIKI_SPECIAL_SYMBOL = 28;
  int XWIKI_CHAR = 29;
  int NEW_LINE = 30;
  int SPACE = 31;
  int SPECIAL_SYMBOL = 32;
  int CHAR = 33;
  int URI = 34;
  int ALPHA = 35;
  int DIGIT = 36;
  int HEXDIG = 37;
  int URI_GEN_DELIMS = 38;
  int URI_SUB_DELIMS = 39;
  int URI_UNRESERVED = 40;
  int URI_RESERVED = 41;
  int URI_SCHEME = 42;
  int URI_SCHEME_COMPOSITE = 43;
  int URI_PCT_ENCODED = 44;
  int URI_PCHAR_FIRST = 45;
  int URI_PCHAR = 46;
  int URI_QUERY = 47;
  int URI_FRAGMENT = 48;
  int URI_HIER_PART = 49;
  int URI_AUTHORITY = 50;
  int URI_USERINFO = 51;
  int URI_PATH_ABEMPTY = 52;
  int URI_PATH_ABSOLUTE = 53;
  int URI_PATH_ROOTLESS = 54;
  int URI_SEGMENT = 55;
  int URI_SEGMENT_NZ = 56;
  int URI_SEGMENT_NZ_NC = 57;
  int URI_PORT = 58;
  int URI_HOST = 59;
  int URI_REG_NAME = 60;
  int I_LIST_ITEM = 61;
  int I_HEADER_BEGIN = 62;
  int I_HEADER_END = 63;
  int I_HORLINE = 64;
  int I_TABLE_ROW = 65;
  int I_TABLE_CELL = 66;
  int I_REFERENCE = 67;
  int I_VERBATIM_START = 68;
  int I_VERBATIM_INLINE_START = 69;
  int I_MACRO_EMPTY_BLOCK = 70;
  int I_MACRO_BLOCK_START = 71;
  int I_MACRO_EMPTY_INLINE = 72;
  int I_MACRO_INLINE_START = 73;
  int I_FORMAT_SYMBOL = 74;
  int I_BR = 75;
  int I_BLOCK_PARAMS = 76;
  int I_INLINE_PARAMS = 77;
  int I_QUOT_LINE = 78;
  int I_XWIKI_URI = 79;
  int I_NL = 80;
  int I_SPACE = 81;
  int I_WORD = 82;
  int I_SPECIAL_SYMBOL = 83;
  int D_LIST_ITEM = 84;
  int D_HEADER_BEGIN = 85;
  int D_HEADER_END = 86;
  int D_HORLINE = 87;
  int D_TABLE_ROW = 88;
  int D_TABLE_CELL = 89;
  int D_REFERENCE = 90;
  int D_VERBATIM_START = 91;
  int D_VERBATIM_INLINE_START = 92;
  int D_MACRO_EMPTY_BLOCK = 93;
  int D_MACRO_BLOCK_START = 94;
  int D_MACRO_EMPTY_INLINE = 95;
  int D_MACRO_INLINE_START = 96;
  int D_FORMAT_SYMBOL = 97;
  int D_BR = 98;
  int D_BLOCK_PARAMS = 99;
  int D_INLINE_PARAMS = 100;
  int D_QUOT_LINE = 101;
  int D_XWIKI_URI = 102;
  int D_NL = 103;
  int D_SPACE = 104;
  int D_WORD = 105;
  int D_SPECIAL_SYMBOL = 106;

  int VERBATIM_CONTEXT = 0;
  int MACRO_CONTEXT = 1;
  int DEFAULT = 2;
  int INITIAL_CONTEXT = 3;

  String[] tokenImage = {
    "<EOF>",
    "<INTERNAL_VERBATIM_START>",
    "<INTERNAL_VERBATIM_END>",
    "<INTERNAL_VERBATIM_CONTENT>",
    "<INTERNAL_MACRO_START>",
    "<INTERNAL_MACRO_END>",
    "<INTERNAL_MACRO_CONTENT>",
    "<LI>",
    "<HEADER>",
    "\"\\\\\\\\\"",
    "\"{{{\"",
    "\"}}}\"",
    "<VERBATIM_CONTENT>",
    "<MACRO_NAME>",
    "<MACRO_DEF>",
    "<MACRO_EMPTY>",
    "<MACRO_START>",
    "<MACRO_END>",
    "<MACRO_CONTENT>",
    "<REFERENCE_IMAGE>",
    "<REFERENCE>",
    "<HORLINE>",
    "<PARAMS>",
    "<CELL>",
    "<QUOT_LINE>",
    "<FORMAT_SYMBOL>",
    "<XWIKI_URI>",
    "<XWIKI_URI_URIS>",
    "<XWIKI_SPECIAL_SYMBOL>",
    "<XWIKI_CHAR>",
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
    "<URI_SCHEME_COMPOSITE>",
    "<URI_PCT_ENCODED>",
    "<URI_PCHAR_FIRST>",
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
    "<I_LIST_ITEM>",
    "<I_HEADER_BEGIN>",
    "<I_HEADER_END>",
    "<I_HORLINE>",
    "<I_TABLE_ROW>",
    "<I_TABLE_CELL>",
    "<I_REFERENCE>",
    "<I_VERBATIM_START>",
    "<I_VERBATIM_INLINE_START>",
    "<I_MACRO_EMPTY_BLOCK>",
    "<I_MACRO_BLOCK_START>",
    "<I_MACRO_EMPTY_INLINE>",
    "<I_MACRO_INLINE_START>",
    "<I_FORMAT_SYMBOL>",
    "<I_BR>",
    "<I_BLOCK_PARAMS>",
    "<I_INLINE_PARAMS>",
    "<I_QUOT_LINE>",
    "<I_XWIKI_URI>",
    "<I_NL>",
    "<I_SPACE>",
    "<I_WORD>",
    "<I_SPECIAL_SYMBOL>",
    "<D_LIST_ITEM>",
    "<D_HEADER_BEGIN>",
    "<D_HEADER_END>",
    "<D_HORLINE>",
    "<D_TABLE_ROW>",
    "<D_TABLE_CELL>",
    "<D_REFERENCE>",
    "<D_VERBATIM_START>",
    "<D_VERBATIM_INLINE_START>",
    "<D_MACRO_EMPTY_BLOCK>",
    "<D_MACRO_BLOCK_START>",
    "<D_MACRO_EMPTY_INLINE>",
    "<D_MACRO_INLINE_START>",
    "<D_FORMAT_SYMBOL>",
    "<D_BR>",
    "<D_BLOCK_PARAMS>",
    "<D_INLINE_PARAMS>",
    "<D_QUOT_LINE>",
    "<D_XWIKI_URI>",
    "<D_NL>",
    "<D_SPACE>",
    "<D_WORD>",
    "<D_SPECIAL_SYMBOL>",
  };

}
