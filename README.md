# Word Counter

This is a simple Java program that counts the occurrences of each word in a text file.

## Description

The `WordCounter.java` program prompts the user for the path to a text file. It then reads the file, processes the text to count the frequency of each word, and prints the results to the console. The program is case-insensitive and ignores punctuation, meaning "Word" and "word," are both treated as "word". The output displays each unique word in alphabetical order, followed by its count.

## How to Compile and Run

1.  **Compile the Java code:**
    Open your terminal or command prompt, navigate to the directory containing `WordCounter.java`, and run the following command:
    ```bash
    javac WordCounter.java
    ```

2.  **Run the program:**
    After successful compilation, run the program using this command:
    ```bash
    java WordCounter
    ```

## Usage

When you run the program, it will prompt you to enter the path to the text file you want to analyze.

```
What is the directory of the text file?
```

Provide the full or relative path to your file. For example, if `wordfile1.txt` is in the same directory, you can just type `wordfile1.txt`.

### Example

Given the `wordfile1.txt` with the following content:
```
“Map”, “map”, and “map.” are all “map”. Should print out the words in alphabetic order along with the occurrences of the words.
```

The program will produce the following output:
```
a=1
all=1
alphabetic=1
and=1
are=1
in=1
map=4
occurrences=1
order=1
out=1
print=1
should=1
the=2
words=2
```
