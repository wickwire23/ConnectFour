import java.util.ArrayList;

public class MakeBoard
	{
		static String [][] connectBoard = new String [5][5];
		static String [][] boardSpots = new String [5][5];
		static ArrayList<String>charRow = new ArrayList<String>()
					{{
						add("A");
						add("B");
						add("C");
						add("D");
						add("E");
					}};
		static ArrayList<String>charCol = new ArrayList<String>()
					{{
						add("1");
						add("2");
						add("3");
						add("4");
						add("5");
					}};
		static int col;
		static int row;
		static int repeat;
		public static void main(String[] args)
			{
				fillSpaces();
				makeBoard();
				makeSpots();
			}
		public static void fillSpaces()
		{
			for(row =0;row<connectBoard.length;row++)
				{
					for(col =0;col<connectBoard[0].length;col++)
						{
							connectBoard[row][col]="";
						}
				}
		}
		
		public static void makeBoard()
		{
			System.out.println("    1     2    3     4     5  ");
			System.out.println(" -----------------------------");
			System.out.print("A");
			System.out.println("|" + connectBoard[0][0] + "     |" + connectBoard[0][1] + "     |" + connectBoard[0][2] + "     |" + connectBoard[0][3] + "     |" + connectBoard[0][4]+ "     |" );
			System.out.println(" -----------------------------");
			System.out.print("B");
			System.out.println("|" + connectBoard[1][0] + "     |" + connectBoard[1][1] + "     |" + connectBoard[1][2] + "     |" + connectBoard[1][3] + "     |" + connectBoard[1][4]+ "     |" );
			System.out.println(" ------------------------------");
			System.out.print("C");
			System.out.println("|" + connectBoard[2][0] + "     |" + connectBoard[2][1] + "     |" + connectBoard[2][2] + "     |" + connectBoard[2][3] + "     |" + connectBoard[2][4]+ "     |" );
			System.out.println(" ------------------------------");
			System.out.print("D");
			System.out.println("|" + connectBoard[3][0] + "     |" + connectBoard[3][1] + "     |" + connectBoard[3][2] + "     |" + connectBoard[3][3] + "     |" + connectBoard[3][4]+ "     |" );
			System.out.println(" ------------------------------");
			System.out.print("E");
			System.out.println("|" + connectBoard[4][0] + "     |" + connectBoard[4][1] + "     |" + connectBoard[4][2] + "     |" + connectBoard[4][3] + "     |" + connectBoard[4][4]+ "     |" );
			System.out.println(" ------------------------------");
		}
		public static void makeSpots()
		{
			for(row =0;row<connectBoard.length;row++)
				{
					
					for(col =0;col<connectBoard[0].length;col++)
						{
							boardSpots[row][col]=charRow.get(row)+charCol.get(col);
						}
				}
			
		}
		
		
	}
