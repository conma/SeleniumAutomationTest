grammar any;
program   : 'begin' statement+ 'end';

statement : click;

click: 'click' main;

main  :  s
  ;
s : STRING+ ;
STRING : '"' ( '\\"' | . )*? '"' ; // match "foo", "\"", "x\"\"y", ...
WS : [ \r\t\n]+ -> skip ;