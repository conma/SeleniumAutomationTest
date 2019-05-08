// generate code for SELENE:
// cd /path/to/project/src/main/java/selene/
// java -cp "../../../../lib/antlr-4.7.1-complete.jar"  org.antlr.v4.Tool -package selene SELENE.g4

grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get  | access | click | doubleClick |sendKeys | verifyText | verifyTitle |
            hover | verifyEnable| verifyDisable | verifyNotFound |
            enableElementByName | enableElementById | enableElementByXPath |
            selectByIndex | selectByText |
            waitSecond |
            quit;

get           : 'get' url;
access        : 'access' url;
click         : 'click' element;
doubleClick   : 'doubleClick' element;
sendKeys      : 'sendKeys' element string;
verifyText    : 'verifyText' element string;
verifyTitle   : 'verifyTitle' string;
hover         : 'hover' element;
verifyEnable  : 'verifyEnable' element;
verifyDisable : 'verifyDisable' element;
verifyNotFound: 'verifyNotFound' element;
enableElementByName  : 'enableElementByName' element;
enableElementById    : 'enableElementById' element;
enableElementByXPath : 'enableElementByXPath' element;
selectByIndex : 'selectByIndex' element string;
selectByText  : 'selectByText' element string;
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
