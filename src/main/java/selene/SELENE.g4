grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get | click | sendKeys | verifyText | verifyTitle | updateDB;

get           : 'get' url;
click         : 'click' string;
sendKeys      : 'sendKeys' string string;
verifyText    : 'verifyText' element string;
verifyTitle   : 'verifyTitle' string;
updateDB      : 'updateDB' string;

/*
https://github.com/antlr/grammars-v4/blob/master/url/url.g4
*/

/**
* scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
*/


url
   : uri
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

title
   : string+
   ;

string
   : STRING
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


WS
   : [\r\n] + -> skip
   ;
