
public class CheckUnderneath
	{

		public static void main(String[] args)
			{
				checkBelow();

			}
		public static void checkBelow()
		{
		for(int i=0;i<MakeBoard.connectBoard.length;i++)
			{
				for(int p=0;p<MakeBoard.connectBoard[0].length;p++)
					{
						if(!MakeBoard.connectBoard[i][p].equals(""))
							{
								MakeBoard.connectBoard[i][p].equals(null);	
							}
					}
			}
		}
	}
