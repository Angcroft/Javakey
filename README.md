# Javakey: CLI Password Generator in Java

## Introduction

JavaKey is a command-line interface (CLI) application written in Java for generating passwords. This project was created to learn about Java and is made public for those who are also interested in this programming language and want to understand some of its syntax. JavaKey is good for Java learners as it offers a variety of options for generating and customizing passwords to some extend.

## Features

To run this project, you'll need a Java Development Kit (JDK) installed on your system. The project was developed using the last JDK to this daste, so it should work with the recent versions.

## Project Structure

The project consists of the following files:
- 'JavaKey.java': Contains the main logic and CLI menus.
- 'PasswordGenerator.java': Implements the password generation logic.
- 'Interfacer.java': Handles user interaction and displays menus.

## Instructions

1. **Clone the repository:**
    ```sh
    git clone https://github.com/Angcroft/JavaKey.git
    ```

2. **Navigate to the project directory:**
    ```sh
    cd JavaKey
    ```

3. **Compile the code:**
    ```sh
    javac JavaKey.java PasswordGenerator.java Interfacer.java
    ```

4. **Run the application:**
    ```sh
    java JavaKey
    ```
    
## How It Works

When you run the program, you'll see the main menu with options for different types of operations, selected by numeric characters.

### Main Menu Options

1. **Generate Password:** Create a new random password.
2. **Customize Settings:** Modify the character sets used for password generation.
3. **Exit Program:** Close the application.

### Generating a Password

- Select "Generate Password" from the main menu.
- A 16-character password will be generated and displayed.
- You will then have options to:
  - Perform another action (if implemented).
  - Exit the program.

### Customizing Settings

- Select "Customize Settings" from the main menu.
- You can then choose to:
  - Remove Characters: Remove specific characters from the character sets.
  - Add Characters: Add new characters to the character sets.
  - Return to the Main Menu.

### Removing Characters

- Choose the category from which to remove characters (uppercase, lowercase, digits, special characters).
- Enter the characters to be removed.
- The program will ensure only valid characters are removed.

### Adding Characters

- Choose the category to which you want to add characters (uppercase, lowercase, digits, special characters).
- Enter the characters to be added.
- The program will ensure no duplicate characters are added.

## Examples

### Basic Password Generation
```sh
Main Menu:

1. Generate Password
2. Customize Settings
3. Exit Program
Enter choice: 1
Generated Password: aB3$dEfG1hIjK2L!
```

### Customizing Settings - Removing Characters
```sh
Main Menu:

1. Generate Password
2. Customize Settings
3. Exit Program
Enter choice: 2

Customize Menu:

1. Remove Characters
2. Add Characters
3. Return to Main Menu
Enter choice: 1

Remove Characters:

1. Uppercase
2. Lowercase
3. Digits
3. Special Characters
Enter choice: 4
Enter characters to remove: !@#
Characters removed: !@#
```

### Customizing Settings - Adding Characters
```sh
Main Menu:

1. Generate Password
2. Customize Settings
3. Exit Program
Enter choice: 2

Customize Menu:

1. Remove Characters
2. Add Characters
3. Return to Main Menu
Enter choice: 2

Add Characters:

1. Uppercase
2. Lowercase
3. Digits
4. Special Characters
Enter choice: 1
Enter characters to add: XYZ
Characters added: XYZ
```

## About the Use of This Project

This project is not intended for contributions, but you are free to use the code for your own projects. In accordance with the MIT License, I grant everyone the freedom to use this code for any beneficial purpose.
