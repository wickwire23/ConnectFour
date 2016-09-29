import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayRunner
	{
		static String name;
		static String character;
		static String aiCharacter;
		static boolean game;
		static String playerMove;
		static boolean gameContinues;
		public static void main(String[] args)
			{
				greetUser();
				explainRules();
				MakeBoard.main(args);
				pickCharacter();
					
				//CheckUnderneath.main(args);
				while(gameContinues)
					{
				makeMove();
				MoveUnderneath.main(args);
					}
			}
		public static void greetUser()
			{
				gameContinues =true;
				System.out.println("Hi, Whats your name?");
				//fixed minor grammar error^^^
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
//			System.out.println("The moves available are ");
//			
//			for(int i =0;i<MakeBoard.boardSpots.length;i++)
//				{
//					for(int p =0;p<MakeBoard.boardSpots[0].length;p++)
//						{
//					System.out.println("("+ i +")" + MakeBoard.boardSpots[i][p]);
//						}
//				}
			Scanner sc = new Scanner(System.in);
			playerMove = sc.nextLine();
			switch(playerMove)
			{
				case "A1":
				case "a1":
						{
							if(!MakeBoard.connectBoard[0][0].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[0][0]= character;
								
							}
							break;
						}
				case "A2":
				case "a2":
						{
							if(!MakeBoard.connectBoard[0][1].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[0][1]= character;
								
							}
							break;
						}
				case "A3":
				case "a3":
						{
							if(!MakeBoard.connectBoard[0][2].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[0][2]= character;
								
							}
							break;
						}
				case "A4":
				case "a4":
						{
							if(!MakeBoard.connectBoard[0][3].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[0][3]= character;
								
							}
							break;
						}
				case "A5":
				case "a5":
						{
							if(!MakeBoard.connectBoard[0][4].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[0][4]= character;
								
							}
							break;
						}
				case "B1":
				case "b1":
						{
							if(!MakeBoard.connectBoard[1][0].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[1][0]= character;
								
							}
							break;
						}
				case "B2":
				case "b2":
						{
							if(!MakeBoard.connectBoard[1][1].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[1][1]= character;
								
							}
							break;
						}
				case "B3":
				case "b3":
						{
							if(!MakeBoard.connectBoard[1][2].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[1][2]= character;
								
							}
							break;
						}
				case "B4":
				case "b4":
						{
							if(!MakeBoard.connectBoard[1][3].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[1][3]= character;
								
							}
							break;
						}
				case "B5":
				case "b5":
						{
							if(!MakeBoard.connectBoard[1][4].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[1][4]= character;
								
							}
							break;
							
						}
				case "C1":
				case "c1":
						{
							if(!MakeBoard.connectBoard[2][0].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[2][0]= character;
							
							}
							break;
							
						}
				case "C2":
				case "c2":
						{
							if(!MakeBoard.connectBoard[2][1].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[2][1]= character;
								
							}
							break;
						}
				case "C3":
				case "c3":
						{
							if(!MakeBoard.connectBoard[2][2].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[2][2]= character;
								
							}
							break;
						}
				case "C4":
				case "c4":
						{
							if(!MakeBoard.connectBoard[2][3].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[2][3]= character;
								
							}
							
							break;
						}
				case "C5":
				case "c5":
						{
							if(!MakeBoard.connectBoard[2][4].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[2][4]= character;
								
							}
							break;
						}
				case "D1":
				case "d1":
						{
							if(!MakeBoard.connectBoard[3][0].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[3][0]= character;
								
							}
							break;
						}
				case "D2":
				case "d2":
						{
							if(!MakeBoard.connectBoard[3][1].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[3][1]= character;
								
							}
							break;
						}
				case "D3":
				case "d3":
						{
							if(!MakeBoard.connectBoard[3][2].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[3][2]= character;
								
							}
							break;
						}
				case "D4":
				case "d4":
						{
							if(!MakeBoard.connectBoard[3][3].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[3][3]= character;
								
							}
							break;
						}
				case "D5":
				case "d5":
						{
							if(!MakeBoard.connectBoard[3][4].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[3][4]= character;
								
							}
							break;
						}
				case "E1":
				case "e1":
						{
							if(!MakeBoard.connectBoard[4][0].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[4][0]= character;
								
							}
							break;
						}
				case "E2":
				case "e2":
						{
							if(!MakeBoard.connectBoard[4][1].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[4][1]= character;
								
							}
							break;
						}
				case "E3":
				case "e3":
						{
							if(!MakeBoard.connectBoard[4][2].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[4][2]= character;
								
							}
							break;
						}
				case "E4":
				case "e4":
						{
							if(!MakeBoard.connectBoard[4][3].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[4][3]= character;
								
							}
							break;
						}
				case "E5":
				case "e5":
						{
							if(!MakeBoard.connectBoard[4][4].equals(""))
								{
									System.out.println("Invalid Move!");
									makeMove();
								}
							else
							{
								MakeBoard.connectBoard[4][4]= character;
								
							}
							break;
						}
			}
			MakeBoard.makeBoard();
		}
		public static void aiMove()
		{
			int randomRow =(int)(Math.random()*4);
			int randomCol = (int)(Math.random()*4);
			if(!MakeBoard.connectBoard[randomRow][randomCol].equals(""))
				{
					aiMove();
				}
			else
				{
					MakeBoard.connectBoard[randomRow][randomCol]=aiCharacter;
				}
			
			MakeBoard.makeBoard();
		}
		
	}
