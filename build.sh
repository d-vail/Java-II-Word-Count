#!/bin/bash

javac ./src/com/lambdaschool/*.java
jar cvfe WordCountApp.jar ./src/com/lambdaschool.Main ./src/com/lambdaschool/*.class
java -jar ./src/WordCountApp.jar