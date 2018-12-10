grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get | quit |
            findElementById | findElementByName |
            findElementByLinkText | findElementByPartialLinkText |
            clear | sendKeys | click |
            assertText | assertTitle | verifyText | verifyTitle
            ;

get                                 : 'get' URL;
quit                                : 'quit';
findElementById                     : 'findElementById' VARIABLENAME ID;
findElementByName                   : 'findElementByName' VARIABLENAME NAME;
findElementByLinkText               : 'findElementByLinkText' VARIABLENAME LINKTEXT;
findElementByPartialLinkText        : 'findElementByPartialLinkText' VARIABLENAME PARTIALLINKTEXT;
clear                               : 'clear' ELEMENT;
sendKeys                            : 'sendKeys' TEXT;
click                               : 'click' ELEMENT;
assertText                          : 'assertText' ELEMENT TEXT;
assertTitle                         : 'assertTitle' TITLE;
verifyText                          : 'verifyText' ELEMENT TEXT;
verifyTitle                         : 'verifyTitle' TITLE;

URL         : [a-zA-Z:/.0-9-]+|[0-9+] ;
ID          : [a-zA-Z_]+ ;
NAME        : [a-zA-Z_]+ ;
VARIABLENAME: [a-zA-Z_]+ ;
LINKTEXT    : [a-zA-Z_]+ ;
ELEMENT     : [a-zA-Z_]+ ;
PARTIALLINKTEXT:[a-zA-Z_]+ ;
TEXT        : [.]+ ;
TITLE       : [.]+ ;
NUMBER     : [0-9]+ ;
WS     : [ \r\n\t]+ -> skip;
