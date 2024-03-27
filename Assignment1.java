package classworkday1;

public class Assignment1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb1.capacity());
		sb1.append("apple");
		System.out.println(sb1.capacity());
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.charAt(15));
		String car = "Was it a car or a cat I saw?";
		String result1 = car.substring(9, 12);
		System.out.println(result1);
		
		String original = "software";
		StringBuffer result = new StringBuffer("hi");
		int index = original.indexOf('a');
		result.setCharAt(0, original.charAt(0));
		result.setCharAt(1, original.charAt(original.length()-1));
		result.insert(1, original.charAt(4));
		result.append(original.substring(1,4));
		result.insert(3, (original.substring(index, index+2) + " "));
		System.out.println(result);
		
		System.out.println("**************************************");
		String A = "Amirthavalli";
		System.out.println(A.charAt(0));
		
		String s = "Hi, ";
		String s1 = "Mom.";
		s = s.concat(s1);
		System.out.println(s);
		
		String Name = "Sai Anantha Lakshmi";
		String [] name = Name.split(" ");
		for( int i=0;i<name.length;i++) {
			System.out.println(name[i].charAt(0));
		}
		
		
		
	}
	
}
