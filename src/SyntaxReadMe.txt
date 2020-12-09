Statements:
remember <type> <var-name> = <expression>;
question <test-expression> do <true-statement> otherwise <false-statement>;
update <var-name> = <expression>;
while <test-expression> do <statement>;
print <expression>;

Expressions:
resolve expressions - int-literal or var-env-lookup-int
do-math <expression> <math-op> <expression> //add for HW 5
test <expression> <arithmetic-boolean-op> <expression>

Types:
int
boolean

Math-ops:
+,-,*,/ //add for HW 5
% (modulo int division remainder) //add for HW 5

Arithmetic-boolean-ops:
>, >=, <, <=, ==, !=






remember int a = 5;
remember int count = 0;
remember int b = 7;
remember int e = do-math do-math do-math 2 + 3 * 2 + do-math 4 - do-math a + b;
question test e <= 0 do remember int c = 1 otherwise remember int c = 2;
update e = 20;
while test e > 0 do update e = do-math e - 1;
print a;