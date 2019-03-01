import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	public static void main (String args[]) throws IOException {
		
		GamePlay myGame = new GamePlay(); 
		
		System.out.println("***************************");
		System.out.println("WELCOME TO PACMAN SIMULATOR");
		System.out.println("***************************");
		System.out.println("Select Game Mode (Enter 1 or 2):");
		System.out.println("1. Standard Input Type");
		System.out.println("2. File Input Type");
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		// Standard Input Type
		if(option == 1) {
			System.out.println("Let's Begin, Type in the Command");
			myGame.standardGamePlay();
		}
		
		// File Input Type
		else if(option == 2) {
			System.out.println("Enter the File Name");
			String fileName = scan.next();
			myGame.fileGamePlay(fileName);
		}
		
		// Unidentified Request - ERROR
		else {
			System.out.println("ERROR! Please Try Again...");
		}
	}
}