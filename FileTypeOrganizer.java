

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileTypeOrganizer {

    public static String userDirectoryLocation = System.getProperty("user.dir");

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
        System.out.print("Enter your choice: ");
        validationDirectory();
    
    }


    public static void folderProcess() {
        System.out.println("========================");
        System.out.println("Type 'N' to create a new folder");
        System.out.println("Type 'E' to use an existing folder");
        System.out.println("Type 'R' to reselect directory");
        System.out.print("Enter your choice: ");
        String mainProcessChoice = validationMainProcess();
    }


    public static void validationDirectory() {
        String userOperatingSystem = System.getProperty("os.name").toLowerCase();
        while(true) {
            int directoryChoice = userInput.nextInt();
            switch(directoryChoice) {
            case 1: 
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationWindows = userDirectoryLocation + "\\Downloads";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Downloads";
                }
                break;
            case 2:
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationWindows = userDirectoryLocation + "\\Documents";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Documents";
                }
                break;
            case 3:
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationWindows = userDirectoryLocation + "\\Desktop";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Desktop";
                }
                break;
            case 4:
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "\\Music";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Music";
                }
                break;
            case 5:
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "\\Picture";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Picture";
                }
                break;
            case 6:
                if (userOperatingSystem.contains("windows")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "\\Videos";
                } else if (userOperatingSystem.contains("mac") || userOperatingSystem.contains("linux")) {
                    String downloadsLocationLinuxMac = userDirectoryLocation + "/Videos";
                }
                break;
            default:
                System.out.println("Invalid input");
                continue;
            }
        }
    } 

    public static String validationMainProcess() {
        String folderProcessChoiceValidated;
        while (true) {
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