#!/bin/bash

#!/bin/bash

javac ./src/com/lambdaschool/*.java
cd ./src
jar cvfe ../WordCountApp.jar com.lambdaschool.Main com/lambdaschool/*.class
cd ../
java -jar WordCountApp.jar