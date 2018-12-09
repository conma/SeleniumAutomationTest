grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get | getTitle | getCurrentUrl | close | quit |
            navigate_back | navigate_to | navigate_forward | navigate_refresh |
            findElementById | findElementByName | findElementByXPath | 
            findElementByClassName |findElementByLinkText |
            findElementByPartialLinkText |
            clear | sendKeys | click | submit | getText | getTagName |
            getCssValue | getAttribute | getSize | getLocation |
            assertText | assertTitle | verifyText | verifyTitle
            ;

get                                 : 'get' URL;
getTitle                            : 'getTitle'; 
getCurrentUrl                       : 'getCurrentUrl' 
close                               : 'close';
quit                                : 'quit';
navigate_back                       : 'navigate_back'; 
navigate_to                         : 'navigate_to';
navigate_forward                    : 'navigate_forward'; 
navigate_refresh                    : 'navigate_refresh';
findElementById                     : 'findElementById' VARIABLENAME ID;
findElementByName                   : 'findElementByName' VARIABLENAME NAME;
findElementByXPath                  : 'findElementByXPath' VARIABLENAME XPATH;
findElementByClassName              : 'findElementByClassName' VARIABLENAME CLADDNAME;
findElementByLinkText               : 'findElementByLinkText' VARIABLENAME LINKTEXT;
findElementByPartialLinkText        : 'findElementByPartialLinkText' VARIABLENAME PARTIALLINKTEXT;
clear                               : 'clear' ELEMENT;
sendKeys                            : 'sendKeys' TEXT;
click                               : 'click' ELEMENT;
submit                              : 'submit'FORM;
getText                             : 'getText' ELEMENT;
getTagName                          : 'getTagName' TAG;
getCssValue                         : 'getCssValue' ELEMENT;
getAttribute                        : 'getAttribute' ELEMENT;
getSize                             : 'getSize' ELEMENT;
getLocation                         : 'getLocation' ELEMENT;
assertText                          : 'assertText' ELEMENT TEXT;
assertTitle                         : 'assertTitle' TITLE;
verifyText                          : 'verifyText' ELEMENT TEXT;
verifyTitle                         : 'verifyTitle' TITLE;
;

ID        : [a-z]+ ;
NUMBER     : [0-9]+ ;
WS     : [ \n\t]+ -> skip;
