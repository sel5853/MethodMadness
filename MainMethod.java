// Stanley Liang Method Madness Due 10/12/17
public class MainMethod 
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
	public static void cutOut(String word, String word2)
	{
		String s1 = word.substring(0,(word.length()/2));
		String s2 = word2.substring((word2.length()/2));
		System.out.println(s1 + s2);
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