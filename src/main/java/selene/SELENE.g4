grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get  | access | click | sendKeys | verifyText | verifyTitle |
            hover | verifyEnable|
            quit;

get           : 'get' url;
access        : 'access' url;
click         : 'click' element;
sendKeys      : 'sendKeys' element string;
verifyText    : 'verifyText' element string;
verifyTitle   : 'verifyTitle' string;
hover         : 'hover' element;
verifyEnable  : 'verifyEnable' element;
enableElement : element;
waitSecond    : 'waitSecond' string;

quit          : 'quit';

/*
* reference from
* https://github.com/antlr/antlr4/blob/master/doc/wildcard.md
*/

string
  : STRING+
  ;

element
  : string
  ;

url
  : string
  ;

STRING : '"' ( '\\"' | . )*? '"' ; // match "foo", "\"", "x\"\"y", ...
WS : [ \r\t\n]+ -> skip ;