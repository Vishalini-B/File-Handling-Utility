package task1;
import java.io.*;
import java.util.Scanner;

public class Filehandlingutility {

    // method to write to file ,here we will use try-catch to catch the error when occured
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("file written successfully.");
        } catch (IOException e) {
            System.out.println("error writing file.");
        }
    }

    // method to read file ,here we will use try-catch to catch the error when occured
    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            System.out.println("\nfile content:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        }
    }

    // method to modify file (replace word) ,here we will use try-catch to catch the error when occured
    public static void modifyFile(String fileName, String oldWord, String newWord) {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while (sc.hasNextLine()) {
                content.append(sc.nextLine()).append("\n");
            }
            sc.close();

            String modifiedContent = content.toString().replace(oldWord, newWord);

            FileWriter writer = new FileWriter(fileName);
            writer.write(modifiedContent);
            writer.close();

            System.out.println("file modified successfully.");
        } catch (IOException e) {
            System.out.println("error modifying file.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String fileName = "sample.txt";

        do {
            System.out.println("\n--- file handling utility ---");
            System.out.println("1. write file");
            System.out.println("2. read file");
            System.out.println("3. modify file");
            System.out.println("4. exit");
            System.out.print("enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer
            //use the switvh case to give option to the user on which option to perform
            switch (choice) {
                case 1:
                    System.out.print("enter content to write: ");
                    String content = input.nextLine();
                    writeFile(fileName, content);
                    break;

                case 2:
                    readFile(fileName);
                    break;

                case 3:
                    System.out.print("enter word to replace: ");
                    String oldWord = input.nextLine();
                    System.out.print("enter new word: ");
                    String newWord = input.nextLine();
                    modifyFile(fileName, oldWord, newWord);
                    break;

                case 4:
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
