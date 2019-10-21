// generate code for SELENE:
// cd /path/to/project/src/main/java/selene/
// java -cp "../../../../lib/antlr-4.7.1-complete.jar"  org.antlr.v4.Tool -package selene SELENE.g4

grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get  | access | click | doubleClick |sendKeys | hover |
            clear | removeAttr |
            selectByIndex | selectByText |
            waitSecond |
            enableElementByName | enableElementById | enableElementByXPath |
            createNewTab | switchNextTab |
            exec |

            verifyText | verifyTitle | verifyEnable| verifyDisable | verifyNotFound |
            verifyChecked | verifyCheckeds | verifyNotChecked | verifyNotCheckeds |

            quit;

get                 : 'get' url;
access              : 'access' url;
click               : 'click' element;
doubleClick         : 'doubleClick' element;
sendKeys            : 'sendKeys' element string;
hover               : 'hover' element;
clear               : 'clear' element;
removeAttr          : 'removeAttr' element attribute;

enableElementByName : 'enableElementByName' element;
enableElementById   : 'enableElementById' element;
enableElementByXPath: 'enableElementByXPath' element;
selectByIndex       : 'selectByIndex' element string;
selectByText        : 'selectByText' element string;
waitSecond          : 'waitSecond' string;
createNewTab        : 'createNewTab';
switchNextTab       : 'switchNextTab';

verifyText          : 'verifyText' element string;
verifyTitle         : 'verifyTitle' string;
verifyEnable        : 'verifyEnable' element;
verifyDisable       : 'verifyDisable' element;
verifyNotFound      : 'verifyNotFound' element;
verifyChecked       : 'verifyChecked' element;
verifyCheckeds      : 'verifyCheckeds' elements;
verifyNotChecked    : 'verifyNotChecked' element;
verifyNotCheckeds   : 'verifyNotCheckeds' elements;

exec                : 'exec' string;

quit                : 'quit';

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

elements
  : string
  ;

attribute
  : string
  ;

url
  : string
  ;

STRING : '"' ( '\\"' | . )*? '"' ; // match "foo", "\"", "x\"\"y", ...
WS : [ \r\t\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;
