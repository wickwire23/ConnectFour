
public class MoveUnderneath
	{

		public static void main(String[] args)
			{
				if(ArrayRunner.playerMove.equals("a1")||ArrayRunner.playerMove.equals("A1"))
					{
						checkOne();
					}
				else if (ArrayRunner.playerMove.equals("a2")||ArrayRunner.playerMove.equals("A2"))
					{
						checkTwo();
		
					}
				else if (ArrayRunner.playerMove.equals("a3")||ArrayRunner.playerMove.equals("A3"))
					{
						checkThree();
				
					}
				else if (ArrayRunner.playerMove.equals("a4")||ArrayRunner.playerMove.equals("A4"))
					{
						checkFour();
						
					}
				else if (ArrayRunner.playerMove.equals("a5")||ArrayRunner.playerMove.equals("A5"))
					{
						checkFive();
					}
			
			}
		public static void checkOne()
		{
			if(MakeBoard.connectBoard[1][0].equals(""))
				{
					if(MakeBoard.connectBoard[2][0].equals(""))
						{
							if(MakeBoard.connectBoard[3][0].equals(""))
								{
									if(MakeBoard.connectBoard[4][0].equals(""))
										{
											MakeBoard.connectBoard[0][0]=("");
											MakeBoard.connectBoard[4][0]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
									else
										{
											MakeBoard.connectBoard[0][0]=("");
											MakeBoard.connectBoard[3][0]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
								}
							else
								{
									MakeBoard.connectBoard[0][0]=("");
									MakeBoard.connectBoard[2][0]=ArrayRunner.character;
									ArrayRunner.aiMove();
								}
						}
					else
						{
							MakeBoard.connectBoard[0][0]=("");
							MakeBoard.connectBoard[1][0]=ArrayRunner.character;
							ArrayRunner.aiMove();
						}
				}
			else
				{
					ArrayRunner.aiMove();
				}
		}
		public static void checkTwo()
		{
			if(MakeBoard.connectBoard[1][1].equals(""))
				{
					if(MakeBoard.connectBoard[2][1].equals(""))
						{
							if(MakeBoard.connectBoard[3][1].equals(""))
								{
									if(MakeBoard.connectBoard[4][1].equals(""))
										{
											MakeBoard.connectBoard[0][1]=("");
											MakeBoard.connectBoard[4][1]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
									else
										{
											MakeBoard.connectBoard[0][1]=("");
											MakeBoard.connectBoard[3][1]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
								}
							else
								{
									MakeBoard.connectBoard[0][1]=("");
									MakeBoard.connectBoard[2][1]=ArrayRunner.character;
									ArrayRunner.aiMove();
								}
						}
					else
						{
							MakeBoard.connectBoard[0][1]=("");
							MakeBoard.connectBoard[1][1]=ArrayRunner.character;
							ArrayRunner.aiMove();
						}
				}
			else
				{
					ArrayRunner.aiMove();
				}
		}
		public static void checkThree()
		{
			if(MakeBoard.connectBoard[1][2].equals(""))
				{
					if(MakeBoard.connectBoard[2][2].equals(""))
						{
							if(MakeBoard.connectBoard[3][2].equals(""))
								{
									if(MakeBoard.connectBoard[4][2].equals(""))
										{
											MakeBoard.connectBoard[0][2]=("");
											MakeBoard.connectBoard[4][2]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
									else
										{
											MakeBoard.connectBoard[0][2]=("");
											MakeBoard.connectBoard[3][2]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
								}
							else
								{
									MakeBoard.connectBoard[0][2]=("");
									MakeBoard.connectBoard[2][2]=ArrayRunner.character;
									ArrayRunner.aiMove();
								}
						}
					else
						{
							MakeBoard.connectBoard[0][2]=("");
							MakeBoard.connectBoard[1][2]=ArrayRunner.character;
							ArrayRunner.aiMove();
						}
				}
			else
				{
					ArrayRunner.aiMove();
				}
		}
		public static void checkFour()
		{
			if(MakeBoard.connectBoard[1][3].equals(""))
				{
					if(MakeBoard.connectBoard[2][3].equals(""))
						{
							if(MakeBoard.connectBoard[3][3].equals(""))
								{
									if(MakeBoard.connectBoard[4][3].equals(""))
										{
											MakeBoard.connectBoard[0][3]=("");
											MakeBoard.connectBoard[4][3]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
									else
										{
											MakeBoard.connectBoard[0][3]=("");
											MakeBoard.connectBoard[3][3]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
								}
							else
								{
									MakeBoard.connectBoard[0][3]=("");
									MakeBoard.connectBoard[2][3]=ArrayRunner.character;
									ArrayRunner.aiMove();
								}
						}
					else
						{
							MakeBoard.connectBoard[0][3]=("");
							MakeBoard.connectBoard[1][3]=ArrayRunner.character;
							ArrayRunner.aiMove();
						}
				}
			else
				{
					ArrayRunner.aiMove();
				}
		}
		public static void checkFive()
		{
			if(MakeBoard.connectBoard[1][4].equals(""))
				{
					if(MakeBoard.connectBoard[2][4].equals(""))
						{
							if(MakeBoard.connectBoard[3][4].equals(""))
								{
									if(MakeBoard.connectBoard[4][4].equals(""))
										{
											MakeBoard.connectBoard[0][4]=("");
											MakeBoard.connectBoard[4][4]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
									else
										{
											MakeBoard.connectBoard[0][4]=("");
											MakeBoard.connectBoard[3][4]=ArrayRunner.character;
											ArrayRunner.aiMove();
										}
								}
							else
								{
									MakeBoard.connectBoard[0][4]=("");
									MakeBoard.connectBoard[2][4]=ArrayRunner.character;
									ArrayRunner.aiMove();
								}
						}
					else
						{
							MakeBoard.connectBoard[0][4]=("");
							MakeBoard.connectBoard[1][4]=ArrayRunner.character;
							ArrayRunner.aiMove();
						}
				}
			else
				{
					ArrayRunner.aiMove();
				}
		}
	}
