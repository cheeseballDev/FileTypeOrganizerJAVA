
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileTypeOrganizer {

    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        String text = "FILETYPE ORGANIZING SYSTEM made by cheeseballDev";
        char[] chars = text.toCharArray();
        for(int i=0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(40); 
        }
        System.out.println("");
        directoryLocation();
    }

    public static void directoryLocation() {
        System.out.println("========================");
        System.out.println("Select the directory you want to operate on to get started:");
        System.out.println("1 - Downloads");
        System.out.println("2 - Documents");
        System.out.println("3 - Desktop");
        System.out.println("4 - Music");
        System.out.println("5 - Picture");
        System.out.println("6 - Videos");
        System.out.println("0 - Custom directory");
        System.out.print("Enter your choice: ");
        int directoryLocationChoice = validationDirectory();
    }




    public static void folderProcess() {
        System.out.println("========================");
        System.out.println("Type 'N' to create a new folder");
        System.out.println("Type 'E' to use an existing folder");
        System.out.println("Type 'R' to reselect directory");
        System.out.print("Enter your choice: ");
        String mainProcessChoice = validationMainProcess();
    }

    public static int validationDirectory() {
        int directoryLocationValidated;
        while(true) {
            try {
                String tempValue0 = userInput.nextLine();
                directoryLocationValidated = Integer.parseInt(tempValue0);
                if(directoryLocationValidated >= 1 && directoryLocationValidated <= 6 || directoryLocationValidated == 0) {
                    break;
                } else {
                    System.out.print("Invalid choice, please try again: ");
                    continue;
                }
            } catch(NumberFormatException e) {
                System.out.print("Invalid choice, please try again: ");
                continue;
            }
        }
        return directoryLocationValidated;
    } 

    public static String validationMainProcess() {
        String folderProcessChoiceValidated;
        while(true) {
            folderProcessChoiceValidated = userInput.nextLine();
        if(folderProcessChoiceValidated.equals("N") || folderProcessChoiceValidated.equals("E") || folderProcessChoiceValidated.equals("R")) {
            break;
        } else {
            System.out.print("Invalid choice, please try again: ");
            continue;
        }
        }
        return folderProcessChoiceValidated;


    } 
}
