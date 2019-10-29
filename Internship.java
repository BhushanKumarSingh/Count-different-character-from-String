import java.util.*;
class Internship
{
	static int countDiff(String s)
	{
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		int count=1;
		m.put(s.charAt(0),1);
		for(int i=1;i<s.length();i++)
		{
			if(m.put(s.charAt(i),i)==null)
				count++;
		}
		return count;
	}
	public static void main(String bks[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		System.out.print(countDiff(str));
	}
}
