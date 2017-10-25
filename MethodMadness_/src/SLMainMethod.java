// Stanley Liang Method Madness Due 10/12/17
public class SLMainMethod 
{
	public static boolean isPalindrome(String word)
	{
		String backwardsword = "";
		int x = word.length()-1;
		while(x>=0)
		{
			backwardsword += word.substring(x, x+1);
			x--;
		}
		if(word.equals(backwardsword));
		{return true;}
	}
	public static String cutOut(String mainStr, String subStr)
	{
		int M = mainStr.length();
		int S = subStr.length();
		for(int x = 0; x < M-S; x++)
		{
			if(M >= S && mainStr.substring(x,x+S).equals(subStr))
			{
				return(mainStr.substring(0,x) + mainStr.substring(x+S));
			}
		}
		return mainStr;
	}
	public static boolean isFibonacci(int num)
    {
        int prev=1;
        int current=1;
        int temp=0;
        int number=1;
        int counter=0;
        while(counter<400)
        {
            if(number==num)
            {
                return true;
            }
            else
            {
                number=prev+current;
                temp=current;
                current+=prev;
                prev=temp;
            }
            counter++;
        }
        return false;
    }	
}	