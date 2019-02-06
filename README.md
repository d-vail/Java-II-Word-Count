# Java II - IntelliJ and Language Fundamentals

## Top Word Count Project

### Introduction

Reading in some text and counting word appearances is a very common Java
interview question. So, let's practice that!

### Project Specs

From a given string ([United Nation’s Declaration of Human Rights provided here](./text/example.txt)),
make a HashMap of each unique word and the frequency it appears in the text. A word
is delimited by a space or punctuation mark(s). The spaces and punctuation marks do
NOT appear in the word list. The word list is NOT case sensitive: Lambda / lambda
will count as the same word. Words such as co-operation that contain a hyphen are
considered one word. A hyphen alone does not separate words. Numbers count as one word,
so 23 is a word.

Print to the console the top 50 appearing words along with their counts. 
Remember that HashMaps are not sorted not easily sortable. You could convert
the HashMap to an array list and then sort the array list. Alternatively, 
you can find the most common word, print it, remove it, 
and repeat the process.

### Project Commands

| Command               | Description                                       |
| --------------------- | ------------------------------------------------- |
| _file PATH_           | Load a file to analyze. `file ./text/example.txt` |
| _input STRING_        | Input a string to analyze. `input Hello World!`   |
| _top INTEGER_         | Get a list of the top recurring words. `top 50`   |
| _exit_                | Exit the app.                                     |


### Build from Source

#### Build from the Command Line

To compile, build the jar, and run the program in one go use:

```` bash
bash build.sh
````

To compile use:

```` bash
javac ./src/com/lambdaschool/*.java
````

To prepare a shippable application (JAR file) use:

```` bash
jar cvfe WordCountApp.jar ./src/com/lambdaschool.Main ./src/com/lambdaschool/*.class
````

To execute the application run:

```` bash
java -jar ./src/WordCountApp.jar
````

#### Import into IntelliJ IDEA

1. Ensure JDK 11 is configured properly in the IDE
2. Import into IntelliJ (File -> New -> Project from Existing Sources -> Select the
   project directory -> Move through the wizard until Finish)
3. Run Main