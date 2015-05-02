import java.util.Random;
public class MonteFiveDie
{
	public static void main(String args[])
	{
		int numOfHEAD = 0;
		int numOfTAIL = 0;
		int total = 100000;
		double prob = 0;
		for(int i = 0; i < total; i++)
		{
			if(monte())//result of flipping 5 coins 
			{
				
				numOfHEAD++;
			}
			else
			{
				numOfTAIL++;
			}
		}
		System.out.println("numOfHEAD = " + numOfHEAD +"\n  total = " + total + "\n");
		System.out.println("numOfTAIL = " + numOfTAIL);
		
		System.out.println(prob +"% \n");
		
		
	}//main 
	public static boolean monte()
	{
		boolean[] coins = new boolean [5];
		Random rand = new Random();
		boolean[] result = new boolean[5];
		int head = 0;
		for(int i = 0; i < coins.length; i++)
		{
			//flip coins 5 times 
			result[i] = rand.nextBoolean();
		}
		String r = ""; 
		for(int index = 0; index < result.length; index++)
		{
			
			r +=  result[index] + " ";
		}
		System.out.println("r = " + r );
		for(int i = 0; i < result.length; i++)
		{
			if(result[i])
			{
				head++;
				
			}
		}
		System.out.println("head = " + head );
		
		if(head == 3)
		{
			System.out.println(true);
			return true;
		}
		else
		{
			System.out.println(false);
			return false;
		}
		
	}

}//class
