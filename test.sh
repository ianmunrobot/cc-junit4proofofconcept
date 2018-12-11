#!/bin/bash

if [ "$1" != "" ]; then

  echo "Compiling Classes and Tests"
  javac -cp ./$1:junit-4.12.jar:hamcrest-core-1.3.jar $1/*.java

  echo "Executing Tests"
  java -cp ./$1:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore $1Test
else
  echo "No param!"
fi
