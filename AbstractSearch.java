package classworkday1;

public abstract class AbstractSearch {
	public abstract boolean search(Object [] obj_list, Object obj);
	public static void main(String[] args) {
	    Integer[] integer_list = {1, 2, 3, 4, 5};
	    String[] string_list = {"Amirtha", "Sai", "Rajesh"};
 
	    IntegerSearch integerSearch = new IntegerSearch();
	    StringSearch stringSearch = new StringSearch();
 
	    System.out.println(integerSearch.search(integer_list, 3));  // True
	    System.out.println(integerSearch.search(integer_list, 6));  // False
 
	    System.out.println(stringSearch.search(string_list, "Amirtha"));  // True
	    System.out.println(stringSearch.search(string_list, "Ashwin"));   // False
	}
}
 
	

