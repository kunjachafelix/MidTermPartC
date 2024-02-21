/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class TestUserprofile {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favorite genre from the following list:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
        
        String genre = "";
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
                break;
            default:
                System.out.println("Invalid choice, setting genre to Comedy.");
                genre = "Comedy";
        }
        
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("UserProfile created for " + userProfile.getUserID() + " with favorite genre: " + userProfile.getGenre());
    }
}

