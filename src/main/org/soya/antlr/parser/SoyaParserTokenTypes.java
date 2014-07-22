// $ANTLR 2.7.7 (20060906): "soya.g" -> "SoyaParser.java"$

package org.soya.antlr.parser;
import java.util.*;
import java.io.InputStream;
import java.io.Reader;
import antlr.InputBuffer;
import org.soya.antlr.SoyaTokenSource;
import org.soya.ast.SoyaCST;
import antlr.LexerSharedInputState;
import antlr.TokenStreamRecognitionException;

import org.soya.antlr.SoyaToken;

public interface SoyaParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int INDENT = 4;
	int DEDENT = 5;
	int INTEGER = 6;
	int ID = 7;
	int ID_LPAREN = 8;
	int URL = 9;
	int STRING_PART = 10;
	int STR_TQ_START = 11;
	int STR_SQ_START = 12;
	int STR_PART_MIDDLE = 13;
	int STR_PART_END = 14;
	int REGEX_NUM_PART = 15;
	int REGEX_START = 16;
	int REGEX_END = 17;
	int REGEX_MIDDLE = 18;
	int REGEX_CONSTRUCTIOR = 19;
	int FILE_PATH = 20;
	int FILE_PATH_START = 21;
	int FILE_PATH_MIDDLE = 22;
	int FILE_PATH_END = 23;
	int FILE_CONSTRUCTOR = 24;
	int LPAREN = 25;
	int RPAREN = 26;
	int LBRACK = 27;
	int RBRACK = 28;
	int STRING_CONSTRUCTOR = 29;
	int LCURLY = 30;
	int RCURLY = 31;
	int EMAIL = 32;
	int TIME = 33;
	int LIST_PREFIX = 34;
	int PERCENTAGE = 35;
	int NLS = 36;
	int FLOAT = 37;
	int PAIR = 38;
	int DATE = 39;
	int PAIR_LCURLY = 40;
	int WELL_LCURLY = 41;
	int RCURLY_X_PAIR = 42;
	int RCURLY_X_PAIR_LCURLY = 43;
	int RCURLY_X_LCURLY = 44;
	int SINGLE_LINE_COMMENT = 45;
	int ASSIGN = 46;
	int PLUS = 47;
	int MINUS = 48;
	int EQUAL = 49;
	int NOT = 50;
	int NOT_EQUAL = 51;
	int MOD = 52;
	int COLON = 53;
	int COMMAR = 54;
	int SEMI = 55;
	int DOT = 56;
	int DB_DOT = 57;
	int QUESTION = 58;
	int TILDE = 59;
	int GT = 60;
	int LT = 61;
	int GE = 62;
	int LE = 63;
	int SR = 64;
	int SL = 65;
	int INC = 66;
	int DEC = 67;
	int DB_STAR = 68;
	int DB_COLON = 69;
	int STAR_DOT = 70;
	int OPTIONAL_DOT = 71;
	int XML_START = 72;
	int XML_END = 73;
	int PLUS_ASSIGN = 74;
	int MINUS_ASSIGN = 75;
	int STAR_ASSIGN = 76;
	int DIV_ASSIGN = 77;
	int MOD_ASSIGN = 78;
	int DB_STAR_ASSIGN = 79;
	int RFC822 = 80;
	int U_DB_DOT = 81;
	int U_DB_DOT_LT = 82;
	int U_GT_DB_DOT = 83;
	int U_GT_DB_DOT_LT = 84;
	int DIV = 85;
	int REGEX_MATCH = 86;
	int REGEX_NOT_MATCH = 87;
	int K_NULL = 88;
	int K_NEW = 89;
	int K_TRUE = 90;
	int K_FALSE = 91;
	int IN = 92;
	int XOR = 93;
	int INSTANCEOF = 94;
	int K_STEP = 95;
	int K_IF = 96;
	int K_ELSE = 97;
	int K_FOR = 98;
	int WHILE = 99;
	int DO = 100;
	int DEF = 101;
	int K_CLASS = 102;
	int K_EXTENDS = 103;
	int K_TRY = 104;
	int K_CATCH = 105;
	int K_IMPORT = 106;
	int K_ENVIRONMENT = 107;
	int K_PATTERN = 108;
	int K_PACKAGE = 109;
	int K_AS = 110;
	int K_RETURN = 111;
	int K_BREAK = 112;
	int K_MATCH = 113;
	int K_ASSERT = 114;
	int K_THROW = 115;
	int THIS = 116;
	int SUPER = 117;
	int IS = 118;
	int KAND = 119;
	int KOR = 120;
	int K_INIT = 121;
	int DATE_SLASH_LCURLY = 122;
	int DATE_BSLASH_LCURLY = 123;
	int DATE_SUB_LCURLY = 124;
	int DATE_DOT_LCURLY = 125;
	int DATE_SLASH_DATE_SLASH_LCURLY = 126;
	int REFRENCE_NAME = 127;
	int DATE_BSLASH_DATE_BSLASH_LCURLY = 128;
	int DATE_SUB_DATE_SUB_LCURLY = 129;
	int DATE_DOT_DATE_DOT_LCURLY = 130;
	int RCURLY_SLASH_LCURLY = 131;
	int RCURLY_SLASH_DATE = 132;
	int RCURLY_SLASH_DATE_SLASH = 133;
	int RCURLY_SLASH_DATE_SLASH_LCURLY = 134;
	int RCURLY_BSLASH_LCURLY = 135;
	int RCURLY_BSLASH_DATE = 136;
	int RCURLY_BSLASH_DATE_BSLASH = 137;
	int RCURLY_BSLASH_DATE_BSLASH_LCURLY = 138;
	int RCURLY_SUB_LCURLY = 139;
	int RCURLY_SUB_DATE = 140;
	int RCURLY_SUB_DATE_SUB = 141;
	int RCURLY_SUB_DATE_SUB_LCURLY = 142;
	int RCURLY_DOT_LCURLY = 143;
	int RCURLY_DOT_DATE = 144;
	int RCURLY_DOT_DATE_DOT = 145;
	int RCURLY_DOT_DATE_DOT_LCURLY = 146;
	int STATEMENTS = 147;
	int HASH = 148;
	int HASH_ENTRY = 149;
	int DATE_TIME = 150;
	int U_MINUS = 151;
	int U_PLUS = 152;
	int PAIR_CONSTRUCTOR = 153;
	int LIST = 154;
	int ARG_LIST = 155;
	int METHOD_CALL = 156;
	int INDEX_OP = 157;
	int MATCH_ATTR = 158;
	int MATCH_VAR_DEF = 159;
	int BLOCK = 160;
	int CALL_BLOCK = 161;
	int POSTFIX = 162;
	int POST_INC = 163;
	int POST_DEC = 164;
	int ASSERT = 165;
	int IF = 166;
	int FOR = 167;
	int PARAM = 168;
	int PARAM_LIST = 169;
	int METHOD_DEF = 170;
	int CONSTRUCTOR_DEF = 171;
	int CLOSURE = 172;
	int ALIAS = 173;
	int THROW = 174;
	int NEW = 175;
	int MATCH = 176;
	int MATCH_ITEM = 177;
	int MATCH_ELSE_ITEM = 178;
	int MATCH_BLOCK = 179;
	int EXTENDS_TYPE = 180;
	int TRY = 181;
	int CATCH = 182;
	int FIELD = 183;
	int CATCH_LIST = 184;
	int NAMED_ARG = 185;
	int ANNOTATION_FIELD = 186;
	int TYPE = 187;
	int CLASS_STATEMENTS = 188;
	int CLASS_BLOCK = 189;
	int CLASS = 190;
	int MODIFIERS = 191;
	int IMPORT = 192;
	int ANNOTATION = 193;
	int ANNOTATION_LIST = 194;
	int COMPILATION_UNIT = 195;
	int START_TAG = 196;
	int TAG_ATTR = 197;
	int TAG_ATTR_LIST = 198;
	int END_TAG = 199;
	int TAG_CONTENT = 200;
	int TAG = 201;
	int TAG_TEXT = 202;
	int MARKUP = 203;
	int PACKAGE = 204;
	int SUPER_COTR_CALL = 205;
	int UNIX_HEADER = 206;
	int EQ_GT = 207;
	int MOR = 208;
	int RARROW = 209;
	int INIT_ASSIGN = 210;
	int AT = 211;
	int LITERAL_public = 212;
	int LITERAL_private = 213;
	int LITERAL_protected = 214;
	int LITERAL_static = 215;
	int LITERAL_abstract = 216;
	int LITERAL_final = 217;
	int COLCON = 218;
	int STAR = 219;
	int QUESTION_COLON = 220;
	int MAND = 221;
	int LOR = 222;
	int LAND = 223;
	int BOR = 224;
	int BAND = 225;
	int DB_DOT_LT = 226;
	int GT_DB_DOT = 227;
	int GT_DB_DOT_LT = 228;
	int BSL = 229;
	int BSR = 230;
	int POW = 231;
	int LNOT = 232;
	int STRING = 233;
	int K_FLASE = 234;
	int ELSE = 235;
	int SIGN_LPAREN = 236;
	int SIGN_LCURLY = 237;
	int THREE_DOT = 238;
	int REGEX = 239;
	int DB_COLON_LBRACK = 240;
	int AND_ASSIGN = 241;
	int OR_ASSIGN = 242;
	int LETTER = 243;
	int EXPONENT = 244;
	int HEX_DIGIT = 245;
	int DIGIT = 246;
	int DIGIT_UNDERLINE = 247;
	int DIGITS = 248;
	int DIGITS_UNDERLINE = 249;
	int DECIMAL_DIGITS = 250;
	int DOT_FLOAT_DIGITS = 251;
	int URL_CHAR = 252;
	int DATE_CHAR = 253;
	int NARKUP_ELEMENT = 254;
	int MARKUP_ATTRS = 255;
	int MARKUP_WS = 256;
	int MARKUP_CONTENT_CHAR = 257;
	int MARKUP_NAME = 258;
	int FILE_START_CHAR = 259;
	int FILE_CHAR = 260;
	int FILE_PATH_PART = 261;
	int NL = 262;
	int STRING_CHAR = 263;
	int ESC = 264;
	int MULTI_COMMENT = 265;
	int REGEGX_ATTRUBTE = 266;
	int REGEGX_START = 267;
	int REGEX_PART = 268;
	int REGEX_START_CHAR = 269;
	int REGEX_CHAR = 270;
	int DQ_STRING_CHAR = 271;
	int REGEXP_CHAR = 272;
	int WS = 273;
}
