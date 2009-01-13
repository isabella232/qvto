/**
* <copyright>
*
* Copyright (c) 2005, 2008 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - 225493 Need ability to set CSTNode offsets
*
* </copyright>
*
* $Id: LightweightTypeParsersym.java,v 1.36 2009/01/13 20:22:20 radvorak Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: LightweightTypeParsersym.java,v 1.36 2009/01/13 20:22:20 radvorak Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: LightweightTypeParsersym.java,v 1.36 2009/01/13 20:22:20 radvorak Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: LightweightTypeParsersym.java,v 1.36 2009/01/13 20:22:20 radvorak Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.editor.ui.completion.cst.parser;

public interface LightweightTypeParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 71,
      TK_STRING_LITERAL = 54,
      TK_INTEGER_LITERAL = 55,
      TK_REAL_LITERAL = 56,
      TK_PLUS = 34,
      TK_MINUS = 35,
      TK_MULTIPLY = 14,
      TK_DIVIDE = 25,
      TK_GREATER = 20,
      TK_LESS = 21,
      TK_EQUAL = 4,
      TK_GREATER_EQUAL = 22,
      TK_LESS_EQUAL = 23,
      TK_NOT_EQUAL = 24,
      TK_LPAREN = 1,
      TK_RPAREN = 2,
      TK_LBRACE = 88,
      TK_RBRACE = 92,
      TK_LBRACKET = 95,
      TK_RBRACKET = 101,
      TK_ARROW = 110,
      TK_BAR = 89,
      TK_COMMA = 87,
      TK_COLON = 90,
      TK_COLONCOLON = 91,
      TK_SEMICOLON = 93,
      TK_DOT = 111,
      TK_DOTDOT = 112,
      TK_ATPRE = 102,
      TK_CARET = 113,
      TK_CARETCARET = 114,
      TK_QUESTIONMARK = 103,
      TK_QUOTE_STRING_LITERAL = 132,
      TK_ADD_ASSIGN = 115,
      TK_RESET_ASSIGN = 94,
      TK_AT_SIGN = 119,
      TK_EXCLAMATION_MARK = 104,
      TK_NOT_EQUAL_EXEQ = 97,
      TK_INTEGER_RANGE_START = 106,
      TK_break = 133,
      TK_class = 134,
      TK_composes = 135,
      TK_constructor = 136,
      TK_continue = 137,
      TK_datatype = 138,
      TK_default = 139,
      TK_derived = 140,
      TK_do = 141,
      TK_elif = 142,
      TK_enum = 143,
      TK_except = 144,
      TK_exception = 145,
      TK_from = 146,
      TK_literal = 147,
      TK_ordered = 148,
      TK_primitive = 149,
      TK_raise = 150,
      TK_readonly = 151,
      TK_references = 152,
      TK_tag = 153,
      TK_try = 154,
      TK_typedef = 155,
      TK_unlimited = 156,
      TK_invalid = 157,
      TK_STEREOTYPE_QUALIFIER_OPEN = 158,
      TK_STEREOTYPE_QUALIFIER_CLOSE = 159,
      TK_MULTIPLICITY_RANGE = 160,
      TK_TILDE_SIGN = 161,
      TK_self = 26,
      TK_inv = 162,
      TK_pre = 163,
      TK_post = 164,
      TK_endpackage = 165,
      TK_def = 166,
      TK_if = 72,
      TK_then = 116,
      TK_else = 107,
      TK_endif = 108,
      TK_and = 28,
      TK_or = 29,
      TK_xor = 30,
      TK_not = 57,
      TK_implies = 117,
      TK_let = 78,
      TK_in = 109,
      TK_true = 58,
      TK_false = 59,
      TK_body = 38,
      TK_derive = 39,
      TK_init = 40,
      TK_null = 31,
      TK_Set = 15,
      TK_Bag = 16,
      TK_Sequence = 17,
      TK_Collection = 18,
      TK_OrderedSet = 19,
      TK_iterate = 41,
      TK_forAll = 42,
      TK_exists = 43,
      TK_isUnique = 44,
      TK_any = 45,
      TK_one = 46,
      TK_collect = 47,
      TK_select = 48,
      TK_reject = 49,
      TK_collectNested = 50,
      TK_sortedBy = 51,
      TK_closure = 52,
      TK_oclIsKindOf = 60,
      TK_oclIsTypeOf = 61,
      TK_oclAsType = 62,
      TK_oclIsNew = 63,
      TK_oclIsUndefined = 64,
      TK_oclIsInvalid = 65,
      TK_oclIsInState = 66,
      TK_allInstances = 53,
      TK_String = 5,
      TK_Integer = 6,
      TK_UnlimitedNatural = 7,
      TK_Real = 8,
      TK_Boolean = 9,
      TK_Tuple = 32,
      TK_OclAny = 10,
      TK_OclVoid = 11,
      TK_Invalid = 12,
      TK_OclMessage = 13,
      TK_OclInvalid = 73,
      TK_end = 167,
      TK_while = 74,
      TK_when = 120,
      TK_var = 98,
      TK_log = 96,
      TK_assert = 99,
      TK_with = 121,
      TK_switch = 69,
      TK_case = 118,
      TK_xselect = 122,
      TK_xcollect = 123,
      TK_selectOne = 124,
      TK_collectOne = 125,
      TK_collectselect = 126,
      TK_collectselectOne = 127,
      TK_return = 100,
      TK_forEach = 128,
      TK_forOne = 129,
      TK_compute = 75,
      TK_new = 76,
      TK_List = 105,
      TK_Dict = 36,
      TK_out = 168,
      TK_object = 77,
      TK_transformation = 169,
      TK_import = 170,
      TK_library = 171,
      TK_metamodel = 172,
      TK_mapping = 173,
      TK_query = 174,
      TK_helper = 175,
      TK_inout = 176,
      TK_configuration = 177,
      TK_intermediate = 178,
      TK_property = 179,
      TK_opposites = 180,
      TK_population = 181,
      TK_map = 67,
      TK_xmap = 68,
      TK_late = 70,
      TK_resolve = 79,
      TK_resolveone = 80,
      TK_resolveIn = 81,
      TK_resolveoneIn = 82,
      TK_invresolve = 83,
      TK_invresolveone = 84,
      TK_invresolveIn = 85,
      TK_invresolveoneIn = 86,
      TK_modeltype = 182,
      TK_uses = 183,
      TK_where = 184,
      TK_refines = 185,
      TK_access = 186,
      TK_extends = 187,
      TK_blackbox = 188,
      TK_abstract = 189,
      TK_static = 190,
      TK_result = 27,
      TK_main = 130,
      TK_this = 33,
      TK_rename = 191,
      TK_inherits = 192,
      TK_merges = 193,
      TK_disjuncts = 194,
      TK_IDENTIFIER = 3,
      TK_ERROR_TOKEN = 37,
      TK_EOF_TOKEN = 131;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "RPAREN",
                 "IDENTIFIER",
                 "EQUAL",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "MULTIPLY",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "DIVIDE",
                 "self",
                 "result",
                 "and",
                 "or",
                 "xor",
                 "null",
                 "Tuple",
                 "this",
                 "PLUS",
                 "MINUS",
                 "Dict",
                 "ERROR_TOKEN",
                 "body",
                 "derive",
                 "init",
                 "iterate",
                 "forAll",
                 "exists",
                 "isUnique",
                 "any",
                 "one",
                 "collect",
                 "select",
                 "reject",
                 "collectNested",
                 "sortedBy",
                 "closure",
                 "allInstances",
                 "STRING_LITERAL",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "not",
                 "true",
                 "false",
                 "oclIsKindOf",
                 "oclIsTypeOf",
                 "oclAsType",
                 "oclIsNew",
                 "oclIsUndefined",
                 "oclIsInvalid",
                 "oclIsInState",
                 "map",
                 "xmap",
                 "switch",
                 "late",
                 "NUMERIC_OPERATION",
                 "if",
                 "OclInvalid",
                 "while",
                 "compute",
                 "new",
                 "object",
                 "let",
                 "resolve",
                 "resolveone",
                 "resolveIn",
                 "resolveoneIn",
                 "invresolve",
                 "invresolveone",
                 "invresolveIn",
                 "invresolveoneIn",
                 "COMMA",
                 "LBRACE",
                 "BAR",
                 "COLON",
                 "COLONCOLON",
                 "RBRACE",
                 "SEMICOLON",
                 "RESET_ASSIGN",
                 "LBRACKET",
                 "log",
                 "NOT_EQUAL_EXEQ",
                 "var",
                 "assert",
                 "return",
                 "RBRACKET",
                 "ATPRE",
                 "QUESTIONMARK",
                 "EXCLAMATION_MARK",
                 "List",
                 "INTEGER_RANGE_START",
                 "else",
                 "endif",
                 "in",
                 "ARROW",
                 "DOT",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "ADD_ASSIGN",
                 "then",
                 "implies",
                 "case",
                 "AT_SIGN",
                 "when",
                 "with",
                 "xselect",
                 "xcollect",
                 "selectOne",
                 "collectOne",
                 "collectselect",
                 "collectselectOne",
                 "forEach",
                 "forOne",
                 "main",
                 "EOF_TOKEN",
                 "QUOTE_STRING_LITERAL",
                 "break",
                 "class",
                 "composes",
                 "constructor",
                 "continue",
                 "datatype",
                 "default",
                 "derived",
                 "do",
                 "elif",
                 "enum",
                 "except",
                 "exception",
                 "from",
                 "literal",
                 "ordered",
                 "primitive",
                 "raise",
                 "readonly",
                 "references",
                 "tag",
                 "try",
                 "typedef",
                 "unlimited",
                 "invalid",
                 "STEREOTYPE_QUALIFIER_OPEN",
                 "STEREOTYPE_QUALIFIER_CLOSE",
                 "MULTIPLICITY_RANGE",
                 "TILDE_SIGN",
                 "inv",
                 "pre",
                 "post",
                 "endpackage",
                 "def",
                 "end",
                 "out",
                 "transformation",
                 "import",
                 "library",
                 "metamodel",
                 "mapping",
                 "query",
                 "helper",
                 "inout",
                 "configuration",
                 "intermediate",
                 "property",
                 "opposites",
                 "population",
                 "modeltype",
                 "uses",
                 "where",
                 "refines",
                 "access",
                 "extends",
                 "blackbox",
                 "abstract",
                 "static",
                 "rename",
                 "inherits",
                 "merges",
                 "disjuncts"
             };

    public final static boolean isValidForParser = true;
}
