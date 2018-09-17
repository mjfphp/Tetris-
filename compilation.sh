cd TetrisAnt
javac -d bin/ -classpath lib/commons-lang3-3.5.jar  src/fr/ubo/tetris/*.java
cd bin
pwd
"=============================BIN========================" 
jar -cf Tetris.jar fr/ubo/tetris/*.class
"======================================= EXECUTION ======================="
java -cp "../lib/commons-lang3-3.5.jar:Tetris.jar" fr.ubo.tetris.Tetris 
