grammar SELENE;
program   : 'begin' statement+ 'end';

statement : get  | access | click | sendKeys | verifyText | verifyTitle |
            hover | verifyEnable|
            quit;

updateTCs     : 'updateTCs' string;

get           : 'get' url_with_q;
access        : 'access' url_with_q;
click         : 'click' element_with_q;
sendKeys      : 'sendKeys' element_with_q string_with_q;
verifyText    : 'verifyText' element_with_q string_with_q;
verifyTitle   : 'verifyTitle' string_with_q;
hover         : 'hover' element_with_q;
verifyEnable  : 'verifyEnable' element_with_q;
quit          : 'quit';

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
   : scheme COLON ABRPATH login? host (COLON port)? (PATHSEP path)? query? frag? WS?
   ;

scheme
   : string
   ;

host
   : PATHSEP? (hostname | hostnumber)
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
   : string (PATHSEP string)*
   ;

user
   : string
   ;

login
   : user COLON password '@'
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
   : (string | xpath)
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

xpath_with_q
   : QUOTATION_MARKS xpath QUOTATION_MARKS
   ;

xpath
   : expr
   ;

locationPath 
  :  relativeLocationPath
  |  absoluteLocationPathNoroot
  ;

absoluteLocationPathNoroot
  :  '/' relativeLocationPath
  |  '//' relativeLocationPath
  ;

relativeLocationPath
  :  step (('/'|'//') step)*
  ;

step  :  axisSpecifier nodeTest predicate*
  |  abbreviatedStep
  ;

axisSpecifier
  :  AxisName '::'
  |  '@'?
  ;

nodeTest:  nameTest
  |  NodeType '(' ')'
  |  'processing-instruction' '(' Literal ')'
  ;

predicate
  :  '[' expr ']'
  ;

abbreviatedStep
  :  '.'
  |  '..'
  ;

expr  :  orExpr
  ;

primaryExpr
  :  variableReference
  |  '(' expr ')'
  |  Literal
  |  Number  
  |  functionCall
  ;

functionCall
  :  functionName '(' ( expr ( ',' expr )* )? ')'
  ;

unionExprNoRoot
  :  pathExprNoRoot ('|' unionExprNoRoot)?
  |  '/' '|' unionExprNoRoot
  ;

pathExprNoRoot
  :  locationPath
  |  filterExpr (('/'|'//') relativeLocationPath)?
  ;

filterExpr
  :  primaryExpr predicate*
  ;

orExpr  :  andExpr ('or' andExpr)*
  ;

andExpr  :  equalityExpr ('and' equalityExpr)*
  ;

equalityExpr
  :  relationalExpr (('='|'!=') relationalExpr)*
  ;

relationalExpr
  :  additiveExpr (('<'|'>'|'<='|'>=') additiveExpr)*
  ;

additiveExpr
  :  multiplicativeExpr (('+'|'-') multiplicativeExpr)*
  ;

multiplicativeExpr
  :  unaryExprNoRoot (('*'|'div'|'mod') multiplicativeExpr)?
  |  '/' (('div'|'mod') multiplicativeExpr)?
  ;

unaryExprNoRoot
  :  '-'* unionExprNoRoot
  ;

qName  :  nCName (':' nCName)?
  ;

// Does not match NodeType, as per spec.
functionName
  :  nCName ':' nCName
  |  NCName
  |  AxisName
  ;

variableReference
  :  '$' qName
  ;

nameTest:  '*'
  |  nCName ':' '*'
  |  qName
  ;

nCName  :  NCName
  |  AxisName
  |  NodeType
  ;

NodeType:  'comment'
  |  'text'
  |  'processing-instruction'
  |  'node'
  ;
  
Number  :  Digits ('.' Digits?)?
  |  '.' Digits
  ;

fragment
Digits  :  ('0'..'9')+
  ;

AxisName:  'ancestor'
  |  'ancestor-or-self'
  |  'attribute'
  |  'child'
  |  'descendant'
  |  'descendant-or-self'
  |  'following'
  |  'following-sibling'
  |  'namespace'
  |  'parent'
  |  'preceding'
  |  'preceding-sibling'
  |  'self'
  ;


  PATHSEP 
       :'/';
  ABRPATH   
       : '//';
  LPAR   
       : '(';
  RPAR   
       : ')';
  LBRAC   
       :  '[';
  RBRAC   
       :  ']';
  MINUS   
       :  '-';
  PLUS   
       :  '+';
  DOT   
       :  '.';
  MUL   
       : '*';
  DOTDOT   
       :  '..';
  AT   
       : '@';
  COMMA  
       : ',';
  PIPE   
       :  '|';
  LESS   
       :  '<';
  MORE_ 
       :  '>';
  LE   
       :  '<=';
  GE   
       :  '>=';
  COLON   
       :  ':';
  CC   
       :  '::';
  APOS   
       :  '\'';
  QUOT   
       :  '"';
  
Literal  :  '"' ~'"'* '"'
  |  '\'' ~'\''* '\''
  ;

Whitespace
  :  (' '|'\t'|'\n'|'\r')+ ->skip
  ;

NCName  :  NCNameStartChar NCNameChar*
  ;

fragment
NCNameStartChar
  :  'A'..'Z'
  |   '_'
  |  'a'..'z'
  |  '\u00C0'..'\u00D6'
  |  '\u00D8'..'\u00F6'
  |  '\u00F8'..'\u02FF'
  |  '\u0370'..'\u037D'
  |  '\u037F'..'\u1FFF'
  |  '\u200C'..'\u200D'
  |  '\u2070'..'\u218F'
  |  '\u2C00'..'\u2FEF'
  |  '\u3001'..'\uD7FF'
  |  '\uF900'..'\uFDCF'
  |  '\uFDF0'..'\uFFFD'
// Unfortunately, java escapes can't handle this conveniently,
// as they're limited to 4 hex digits. TODO.
//  |  '\U010000'..'\U0EFFFF'
  ;

fragment
NCNameChar
  :  NCNameStartChar | '-' | '.' | '0'..'9'
  |  '\u00B7' | '\u0300'..'\u036F'
  |  '\u203F'..'\u2040'
  ;


DIGITS
   : [0-9] +
   ;

UTF8
   : ('\u0100' .. '\u017E')+
   ;

HEX
   : ('%' [a-fA-F0-9] [a-fA-F0-9]) +
   ;

STRING
   : ([a-zA-Z~0-9] | HEX | UTF8) ([a-zA-Z0-9.-] | HEX| UTF8)*
   ;

QUOTATION_MARKS: ["];
UNDERSCORE: [_]; 
WS
   : [ \r\n\t] + -> skip
   ;

   