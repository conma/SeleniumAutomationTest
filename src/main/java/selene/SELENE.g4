grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get | clickButton |clickLink | sendKeys | verifyText | verifyTitle |
            updateTCs | testcaseId | 
            endTC ;

updateTCs     : 'updateTCs' string;

testcaseId    : 'testcaseId' string;
testcaseAuto  : 'testcaseAuto' string;
get           : 'get' url_with_q;
clickButton   : 'clickButton' string_with_q;
clickLink     : 'clickLink' string_with_q;
sendKeys      : 'sendKeys' element_with_q string_with_q;
verifyText    : 'verifyText' element_with_q string_with_q;
verifyTitle   : 'verifyTitle' string_with_q;
button        : 'button';
endTC         : 'endTC';


/*
https://github.com/antlr/grammars-v4/blob/master/url/url.g4
*/

/**
* scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
*/


url
   : uri
   ;

url_with_q
   : QUOTATION_MARKS uri QUOTATION_MARKS
   ;

uri
   : scheme '://' login? host (':' port)? ('/' path)? query? frag? WS?
   ;

scheme
   : string
   ;

host
   : '/'? (hostname | hostnumber)
   ;

hostname
   : string ('.' string)*
   ;

hostnumber
   : DIGITS '.' DIGITS '.' DIGITS '.' DIGITS
   ;

port
   : DIGITS
   ;

path
   : string ('/' string)*
   ;

user
   : string
   ;

login
   : user ':' password '@'
   ;

password
   : string
   ;

frag
   : ('#' string)
   ;

query
   : ('?' search)
   ;

search
   : searchparameter ('&' searchparameter)*
   ;

searchparameter
   : string ('=' (string | DIGITS | HEX))?
   ;

element
   : string
   ;

element_with_q
   : QUOTATION_MARKS string QUOTATION_MARKS
   ;

title
   : string+
   ;

string
   : STRING
   ;

string_with_q
   : QUOTATION_MARKS STRING QUOTATION_MARKS
   ;

DIGITS
   : [0-9] +
   ;


HEX
   : ('%' [a-fA-F0-9] [a-fA-F0-9]) +
   ;


STRING
   : ([a-zA-Z~0-9] | HEX) ([a-zA-Z0-9.-] | HEX)*
   ;

QUOTATION_MARKS: ["];

WS
   : [ \r\n\t] + -> skip
   ;
