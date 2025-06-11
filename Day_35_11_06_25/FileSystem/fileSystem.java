package FileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CRUD - Create,Read,Update,Delete 

public class fileSystem {
    public static void main(String[] args) {
        File file = new File("Day_35_11_06_25/FileSystem/newFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created " + file.getName());
            } else {
                System.out.println("File Already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Writing inside a file
        try {
            FileWriter filew = new FileWriter("Day_35_11_06_25/FileSystem/newFile.txt");
            filew.write("Hello There, This is the message written using file Writer");
            filew.close();
            System.out.println("Successfuly written");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        try {
            File fileR = new File("Day_35_11_06_25/FileSystem/newFile.txt");
            Scanner sc = new Scanner(fileR);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Deleting file
        // File fileD = new File("Day_35_11_06_25/FileSystem/newFile.txt");
        // if (fileD.delete()) {
        //     System.out.println("Deleted the file: " + fileD.getName());
        // } else {
        //     System.out.println("Failed to delete the file.");
        // }
    }
}
