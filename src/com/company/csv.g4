grammar csv;

// name, moretext, moretext, ...
parse
    : line+ EOF      // + one or more, EOF end of file
    ;

line
    : TEXT (',' TEXT)*  '\n' // 0 or more times
    ;

TEXT
    :  [a-zA-Z0-9]+
    ;

WS
    : [ \t]+ -> skip
    ;