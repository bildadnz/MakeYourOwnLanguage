grammar G;

program:(statement  | functionDef)+;

statementwa:expression | print | print2 | print3 | varDeclaration | assignment | varDeclarationArray | assignarray | object | objectAssign;

statement: (statementwa ';') | branch | whileloop | forloop | objectDec;

expression:expressionint | expressiondoub | expressionall
           |expressionst;

expressionint:  left=expressionint '/' right=expressionint #Div
              | left=expressionint '*' right=expressionint #Mul
              | left=expressionint '-' right=expressionint #Minus
              | left=expressionint '+' right=expressionint #Plus
              | left=expressionint '<' right=expressionint #Lessthan
              | left=expressionint '>' right=expressionint #Greaterthan
              | left=expressionint '>=' right=expressionint #Greaterorequal
              | left=expressionint '<=' right=expressionint #Lessorequal
              | left=expressionint '==' right=expressionint #Equal
              | Num=NUM #Num
              | var=IDENTIFIER#Variable
              | arraycall#Arrayname
              | varlocal= IDENTIFIER#Varlocal
              | functionCall #funcCallExpression
              | objectcall #callObjectint
              | lengthcall #calllength
              ;

expressionall:  left=expressionint '/' right=expressiondoub #Divid
              | left=expressiondoub '/' right=expressionint #Divdi
              | (expressionint | expressiondoub) '*' (expressionint | expressiondoub) #Mulid
              | left=expressionint '-' right=expressiondoub #Minusid
              | left=expressiondoub '-' right=expressionint #Minusdi
              | (expressionint | expressiondoub) '+' (expressionint | expressiondoub) #Plusid
              ;

expressiondoub: left=expressiondoub '/' right=expressiondoub #Divdo
              | left=expressiondoub '*' right=expressiondoub #Muldo
              | left=expressiondoub '-' right=expressiondoub #Minusdo
              | left=expressiondoub '+' right=expressiondoub #Plusdo
              | left=expressiondoub '<' right=expressiondoub #Lessthando
              | left=expressiondoub '>' right=expressiondoub #Greaterthando
              | left=expressiondoub '>=' right=expressiondoub #Greaterorequaldo
              | left=expressiondoub '<=' right=expressiondoub #Lessorequaldo
              | left=expressiondoub '==' right=expressiondoub #Equaldo
              | Double=DOUBLE#Doub
              | var=IDENTIFIER#Variabledo
              | arraycall#Arraynamedo
              | varlocal= IDENTIFIER#Varlocaldo
              | functionCall #funcCallExpressiondo
              | objectcall #callObjectdo
              ;
expressionst: left=expressionst '+' right=expressionst #Addst
            | txt=STRING#String
            | var=IDENTIFIER#Variablest
            | arraycall#Arraynamest
            | varlocal= IDENTIFIER#Varlocaldst
            | functionCall #funcCallExpressionst
            | objectcall #callObject
             ;

branch: 'if' '(' condition=expression ')' onTrue=blockTrue 'else' onFalse=blockFalse;

trueblockstart:'{';

falseblockstart:'{';

trueblockstop:'}';

falseblockstop:'}';

blockTrue: trueblockstart (statement |statementlocal)* trueblockstop;

blockFalse: falseblockstart (statement |statementlocal)* falseblockstop;

whileloop: 'while' loopbegin condition=expression ')' blockloop;

whileblockstart:'{';

loopbegin:'(';

whileblockstop:'}';

forloop: 'for' '(' (assignment|assignmentlocal) starti condition=expression ';' varcalc')'forblock;

forend:'}';

starti:';';

forblock:'{' (statement |statementlocal)* forend;

varcalc:IDENTIFIER'++';

blockloop:whileblockstart (statement |statementlocal)* whileblockstop;

varDeclaration: TYPE varName=IDENTIFIER;

varDeclarationlocal: TYPE varNamelocal=IDENTIFIER;

paramDeclaration: TYPE paramName=IDENTIFIER;

objectDec: 'Class' classname=IDENTIFIER '{' classctx=program '}';


objectAssign:objname=IDENTIFIER equals expression;

equals:'=';

varDeclarationArray: TYPE '[' ']' arrayName=IDENTIFIER '=' 'new' TYPE '[' length=expression']';

paramDeclarationArray: TYPE'['']' paramarrayName=IDENTIFIER;

assignment: varName=IDENTIFIER equals expr=expression;

arraycall:arrayName=IDENTIFIER'['']'#arraycall1
         |arrayName=IDENTIFIER arraycal index=expression arraycale #arraycall2
         ;

arraycal:'[';

arraycale:']';

assignarray: arrayName=IDENTIFIER brace1 index=expression brace2 '=' assignval=expression#assign1
           | arrayName=IDENTIFIER '['']' '=' asstart assignlistval=assignlist asstop#assign2
           | arrayName=IDENTIFIER '['']' '=' assignarrayexpr=expression#assign3
           ;

brace1:'[';

brace2:']';

asstart:'{';

asstop:'}';

assignlist:count+=expression (comma count+=expression)*
          |
          ;

comma:',';

assignmentlocal: varNamelocal=IDENTIFIER '=' exprlocal=expression;

print: 'println' '('expressionint ')';

print2: 'printlns' '('expressionst ')';

print3: 'printlnd' '('expressiondoub ')';

functionDef: (type1=TYPE'['']'|type2=TYPE) funcName=IDENTIFIER '(' ')' startpoint=start statements=statementList 'return' returnVal=expression';' '}'#Method1
           | (type1=TYPE'['']'|type2=TYPE) funcName=IDENTIFIER '('params=parameters ')' startpoint=start statements=statementList 'return' returnVal=expression';' '}'#Methodparams
           | 'void' funcName=IDENTIFIER '(' ')' startpoint=start statements=statementList '}'#methodvoid
           | 'void' funcName=IDENTIFIER '(' params=parameters')' startpoint=start statements=statementList '}'#methodvoidparams
           | (type1=TYPE'['']'|type2=TYPE) funcName=IDENTIFIER '(' ')' 'return' returnVal=expression';' '}'#methodnostatement
           | funcName=IDENTIFIER '(' params=parameters ')'  startpoint=start statements=statementList  '}'#methodnameparam
           | funcName=IDENTIFIER '(' ')'  startpoint=start statements=statementList  '}'#methodname
           ;

start: START;

parameterDeclaration:paramDeclaration|paramDeclarationArray;

parameters:declarations+=parameterDeclaration (',' declarations+=parameterDeclaration)*
          |
          ;

statementlocal:expression | print | print2 | print3 | varDeclarationlocal | assignmentlocal | varDeclarationArray | assignarray | object | objectAssign;

statementList:((statementlocal ';') | branch | whileloop | forloop | objectDec)*;

functionCall: funcName=IDENTIFIER '(' ')'#Call1
            | funcName=IDENTIFIER '(' arguments=expressionList ')'#Callparams
            ;

expressionList: expression (',' expression)*
              |
              ;

object:classname=IDENTIFIER instancename=IDENTIFIER;

objectcontext:cont+=expression ('.' cont+=expression)*
             |
             ;

objectcall:objectname=IDENTIFIER '.' objectcontext;

lengthcall:arrayname=IDENTIFIER '.' length='arraylength';

TYPE:'int'|'double'|'string'|'Object';

START:'{';
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
NUM: [0-9]+;
WS     : [ \t\r\n]+ -> skip;
DOUBLE: [0-9]+ '.' [0-9]*
      | '.' [0-9]+;
STRING:'"' .*? '"';
