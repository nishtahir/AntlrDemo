grammar Json;

@header{
package com.example;
}

json
    : jsonObject* EOF
    ;

jsonObject
    : '{' (keyValuePair (',' keyValuePair)*)? '}'
    ;

keyValuePair
    : IDENTIFIER ':' (primitive | jsonObject)
    ;

primitive
    : string
    | bool
    ;

string
    : SINGLE_STRING
    | DOUBLE_STRING
    ;

SINGLE_STRING
    : '\'' ~('\'')+ '\''
    ;

DOUBLE_STRING
    : '"' ~('"')+ '"'
    ;

bool
    : 'true'
    | 'false'
    ;

IDENTIFIER
    :   [A-Za-z0-9]+
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;