# File-Handling-Utility-Java

*COMPANY *: CODTECH IT SOLUTIONS

*NAME *: VISHALINI B

*INTERN ID *: CTIS8696

*DOMAIN *: Java Programming

*DURATION *: 4 WEEEKS

*MENTOR *: NEELA SANTOSH

## 📌 Overview
This project is a **File Handling Utility** built using the **Java programming language**.
The main objective of this project is to demonstrate how Java can be used to perform
essential file operations such as **writing**, **reading**, and **modifying** text files
through a simple and interactive menu-driven console application.

File handling is one of the most important concepts in any programming language,
as it allows programs to store and retrieve data permanently beyond the lifecycle
of a single program execution. This project explores that concept in a beginner-friendly
yet practical way, making it highly suitable for academic submissions and foundational
Java learning.

---

## 👨‍💻 Role
**Role: Java Developer**

In this project, the role undertaken is that of a **Java Developer** responsible for
designing, implementing, and documenting a fully functional file handling program.
The key responsibilities in this role included:

- Designing the overall structure of the program with clean and modular methods
- Implementing file write, read, and modify operations using core Java libraries
- Building an interactive console-based menu so users can choose operations easily
- Applying proper **exception handling** using `try-catch` blocks to prevent crashes
- Ensuring the code is well-commented and easy to understand for academic purposes
- Testing the program end-to-end within the Eclipse IDE environment

---

## 🛠️ Platform & Tools Used
| Tool | Details |
|------|---------|
| IDE | Eclipse IDE |
| Language | Java |
| JDK Version | JDK 17+ |
| Package Used | java.io, java.util |
| File Operated | sample.txt |
| OS | Windows / Linux / Mac |

**Eclipse IDE** is one of the most powerful and widely used Integrated Development
Environments for Java development. It provides real-time syntax checking, auto code
completion, an integrated console for viewing output, and a built-in Java compiler.
The entire project — from writing the code to compiling and running it — was done
inside Eclipse IDE, making the development process smooth and efficient.

---

## ⚙️ Features
- ✅ **Write Operation** — Allows the user to type any text and save it directly into `sample.txt`
- ✅ **Read Operation** — Reads and displays the current contents of `sample.txt` line by line
- ✅ **Modify Operation** — Searches for a specific word in the file and replaces it with a new word
- ✅ **Menu-Driven Interface** — A clean console menu loops continuously until the user exits
- ✅ **Exception Handling** — Every method is wrapped in `try-catch` to handle file errors gracefully
- ✅ **Beginner Friendly** — Uses simple and readable Java code suitable for academic learning

---

## 📂 Project Structure
```
FileHandlingUtility/
│
├── src/
│   └── FileHandlingUtility.java
├── sample.txt
└── README.md
```

---

## 🚀 How to Run the Project

Follow these steps to run the project in **Eclipse IDE**:

1. Download and install **Eclipse IDE for Java Developers** from [eclipse.org](https://www.eclipse.org)
2. Install **JDK 17 or later** from [adoptium.net](https://adoptium.net)
3. Open Eclipse and create a **New Java Project** (File → New → Java Project)
4. Name the project `FileHandlingUtility`
5. Right-click on the `src` folder → **New → Class**
6. Name the class `FileHandlingUtility` and paste the source code
7. Right-click the file → **Run As → Java Application**
8. The console will display the menu — choose options 1, 2, 3, or 4

---

## 📋 Menu Options
```
===================================
   FILE HANDLING UTILITY — MENU
===================================
1. Write  — Write new text to sample.txt
2. Read   — Read and display sample.txt
3. Modify — Search and replace a word
4. Exit   — Exit the program
===================================
```

---

## 🔍 How Each Method Works

### ✏️ writeFile()
This method uses the `FileWriter` class to create or overwrite `sample.txt` with
user-provided text. Once writing is complete, the file is closed and a success
message is printed to the console.

### 📖 readFile()
This method uses the `File` and `Scanner` classes to open `sample.txt` and read
it line by line. Each line is printed to the console until the end of the file
is reached, after which the scanner is closed.

### 🔄 modifyFile()
This method reads the entire content of `sample.txt` into a `StringBuilder` object,
performs a word-level search and replace using the `.replace()` method, and writes
the updated content back to the same file using `FileWriter`.

---

## 📚 Concepts & Classes Used
| Concept | Class / Method Used |
|---|---|
| Writing to file | `FileWriter` |
| Reading from file | `File`, `Scanner` |
| String manipulation | `StringBuilder`, `.replace()` |
| User input | `Scanner(System.in)` |
| Looping menu | `do-while` loop |
| Error handling | `try-catch`, `IOException` |

---

## 👩‍🎓 Author
**Vishalini B**
B.Tech — Third Year
Java Programming | File Handling Utility Project

## Output

<img width="1920" height="1020" alt="Image" src="https://github.com/user-attachments/assets/3ebf875d-7c92-4350-ad52-86698e6e1a29" />

<img width="1920" height="1020" alt="Image" src="https://github.com/user-attachments/assets/db355807-7e30-48e0-9cf7-a045525704be" />
