echo "----- Test $1"
java -classpath .:./AST TestHL ~cps710/public_html/doc/Now/A5/Tests/$1.hl >Tests/$1.out
diff -b Tests/$1.out ~cps710/public_html/doc/Now/A5/Tests/$1.expected
