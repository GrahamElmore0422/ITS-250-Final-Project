//Samuel Elmore, Ricky Haase
//Final Project, ITS 250 - Dr. Munoz
//Submission November 26, 2019

package finalProject;

import java.util.Scanner;

public class HonusMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //Establishes a scanner to get info on user's card
		HonusCard user = new HonusCard(); //Stores the user's information

		//Greet the user and request the quality of their card
		System.out.println("Welcome to the Honus Wagner Card Value Calculator!\n" +
				"I am Honus Wagner Card Man, a highly sophistic algorithm designed to help you estimate the value " +
				"of your T206 Honus Wagner cards!\n");
		System.out.print("Please enter the quality of your T206 Honus Wagner card\n"
				+ "(1- Poor to Fair, 2- Good, 3- Very Good, 4+- Anything Better): ");

		user.quality = input.nextInt(); //Store quality
		while (user.quality < 1) //Ask until given an acceptable input
		{
			System.out.print("Please enter a positive integer: ");
			user.quality = input.nextInt(); //Store quality
		}
		System.out.println(); //Line break

		//Ask for the year they're selling the card
		System.out.print("Please enter the year in which you would like to sell your T206 Honus Wagner card: ");
		user.salesDate = input.nextInt(); //Store year of sale

		//Put out a price based on what the user put in
		System.out.println(); //Line break
		FindValue.returnStuff(user); //Send the card to the class that does all the work
			//It even does the printing

		input.close(); //Close memory leak

	}

}