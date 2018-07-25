public class StringOne{
	public static void main(String[] args)
	{
		String s = "gsg1232424sfsdfwef3243sdf";
		for(int i= 0;i<s.length();i++)
		{
			if( s.charAt(i) > 47 && s.charAt(i) < 58)
			{
        		System.out.print(s.charAt(i));
			}
		}
	}
}