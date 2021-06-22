/* A Bison parser, made by GNU Bison 3.5.1.  */

/* Bison interface for Yacc-like parsers in C

   Copyright (C) 1984, 1989-1990, 2000-2015, 2018-2020 Free Software Foundation,
   Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* Undocumented macros, especially those whose name start with YY_,
   are private implementation details.  Do not rely on them.  */

#ifndef YY_YY_PROYECTOG_TAB_H_INCLUDED
# define YY_YY_PROYECTOG_TAB_H_INCLUDED
/* Debug traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif
#if YYDEBUG
extern int yydebug;
#endif

/* Token type.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
  enum yytokentype
  {
    CHAR = 258,
    INT = 259,
    LONG = 260,
    FLOAT = 261,
    DOUBLE = 262,
    SHORT = 263,
    DIGITO = 264,
    SUMA = 265,
    RESTA = 266,
    MUL = 267,
    DIV = 268,
    LETRA = 269,
    PUNTO_COMA = 270,
    MAS_MAS = 271,
    MENOS_MENOS = 272,
    IF = 273,
    ELSE = 274,
    DO = 275,
    WHILE = 276,
    FOR = 277,
    SWITCH = 278,
    VOID = 279,
    THEN = 280,
    PAR_IZQ = 281,
    PAR_DER = 282,
    LLAVE_IZQ = 283,
    LLAVE_DER = 284,
    BREAK = 285,
    CONST = 286,
    CONTINUE = 287,
    DEFAULT = 288,
    RETURN = 289,
    TYPEDEF = 290,
    STRUCT = 291,
    CASE = 292,
    REFER = 293,
    LEFT_OP = 294,
    RIGHT_OP = 295,
    EXPRESION = 296,
    DEC = 297,
    AND_OP = 298,
    OR_OP = 299,
    EQ_OP = 300,
    IDENTIFIER = 301,
    CONSTANT = 302,
    STRING_LITERAL = 303,
    DEC_OP = 304,
    INC_OP = 305,
    PTR_OP = 306,
    LE_OP = 307,
    GE_OP = 308,
    NE_OP = 309,
    ADD_OR_DEC = 310
  };
#endif

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef int YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;

int yyparse (void);

#endif /* !YY_YY_PROYECTOG_TAB_H_INCLUDED  */
