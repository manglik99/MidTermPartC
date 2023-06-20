/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author mangl
 */
public class TestUserProfile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        System.out.println("Choose your favorite genre:");
        
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        System.out.print("Enter your name: ");
        
        String userName = scanner.nextLine();
        
        System.out.print("Enter the number of your favorite genre: ");
        
        int selectedGenre = scanner.nextInt();
        
        if (selectedGenre < 1 || selectedGenre > genres.length) {
            
            System.out.println("Invalid!");
            
            return; // Exit the program
            
        }
        
        UserProfile userProfile = new UserProfile(userName, genres[selectedGenre - 1]);
        
         System.out.println("User profile created for " + userProfile.getUserID() +
                " with favorite genre: " + userProfile.getGenre());
        
    }
    
}
