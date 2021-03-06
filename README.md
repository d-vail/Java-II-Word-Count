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
cd ./src
jar cvfe ../WordCountApp.jar com.lambdaschool.Main com/lambdaschool/*.class
cd ../
````

To execute the application run:

```` bash
java -jar WordCountApp.jar
````

#### Import into IntelliJ IDEA

Ensure JDK 11 is configured properly in the IDE

##### Option 1 - Import Project From Existing Sources

1. Import into IntelliJ
    - _From Welcome Screen_: Import Project -> Select the project directory -> 
      Create Project from Existing Sources -> Move through the wizard until Finished
    - _From the Editor_: File -> New -> Project from Existing Sources -> Select the
      project directory -> Create Project from Existing Sources -> Move through the 
      wizard until Finished
2. Run Main

##### Option 2 - Import From Version Control

1. Import into IntelliJ
    - _From Welcome Screen_: Checkout From Version Control -> Git -> Paste in project 
    url -> Clone
    - _From the Editor_: File -> New -> Project from Version Control -> Git -> Paste 
    in project url -> Clone
2. Run Main
