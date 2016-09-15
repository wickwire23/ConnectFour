import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayRunner
	{
		static String name;
		static String character;
		static String aiCharacter;
		static boolean game;
		static String playerMove;
		public static void main(String[] args)
			{
				greetUser();
				explainRules();
				MakeBoard.main(args);
				pickCharacter();
				makeMove();
			}
		public static void greetUser()
			{
				System.out.println("Hi Whats your name?");
				Scanner sc = new Scanner(System.in);
				name = sc.nextLine();
				System.out.println("Hi there " + name + "! " + "Lets play Connect 3!(Not confused with Connect 4)");
			}
		public static void explainRules()
			{
				System.out.println("The object of he game is to connect 3 of your characters vertically, horizontally, or diagaonally");
				System.out.println("First one to 3 wins!");
				System.out.println("Click enter if you are ready! If not type (Not) to repeat the rules");
				Scanner sc = new Scanner(System.in);
				String understanding = sc.nextLine();
				if(understanding.equalsIgnoreCase("not"))
							{
								explainRules();
							}
				else if (!understanding.equalsIgnoreCase("not"))
					{
						return;
					}
			}
		public static void pickCharacter()
		{
			System.out.println("This is your board! "+ name);
			System.out.println("Would you like to be your character?");
			game =true;
			while(game)
				{
			System.out.println("(1) @ ");
			System.out.println("(2) $");
			System.out.println("Please type the number");
			Scanner sc = new Scanner(System.in);
			int charChoice = sc.nextInt();
			if(charChoice==1)
				{
					System.out.println("Good Choice! You shall be the @");
					character="@";
					aiCharacter="$";
					game=false;
				}
			else if (charChoice==2)
				{
					System.out.println("Good Choice! You shall be the $");
					character="$";
					aiCharacter="@";
					game=false;
				}
			else
				{
					System.out.println("Please choose a number");
				}
			}
		}
		public static void makeMove()
		{
			System.out.println("Make your move!");
			System.out.println("The moves available are ");
			for(int i =0;i>MakeBoard.boardSpots.length;i++)
				{
					System.out.println("("+ i +")" + MakeBoard.boardSpots[i]);
				}
			
			Scanner sc = new Scanner(System.in);
			playerMove = sc.nextLine();
			switch(playerMove)
			{
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
			}
		}
		
	}
