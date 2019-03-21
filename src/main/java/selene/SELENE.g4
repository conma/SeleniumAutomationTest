grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get  | access | click | sendKeys | verifyText | verifyTitle |
            hover | verifyEnable| verifyDisable |
            enableElementByName | enableElementById | enableElementByXPath |
            waitSecond |
            quit;

get           : 'get' url;
access        : 'access' url;
click         : 'click' element;
sendKeys      : 'sendKeys' element string;
verifyText    : 'verifyText' element string;
verifyTitle   : 'verifyTitle' string;
hover         : 'hover' element;
verifyEnable  : 'verifyEnable' element;
verifyDisable : 'verifyDisable' element;
enableElementByName  : 'enableElementByName' element;
enableElementById    : 'enableElementById' element;
enableElementByXPath : 'enableElementByXPath' element;
waitSecond    : 'waitSecond' string;

quit          : 'quit';

/*
* reference from
* https://github.com/antlr/antlr4/blob/master/doc/wildcard.md
* https://github.com/antlr/antlr4/blob/master/doc/lexer-rules.md
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
COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;
