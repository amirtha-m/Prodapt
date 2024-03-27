package classworkday1;

public class StringR {
	public static void main(String[] args) {
		String str = "Amirtha";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
}
