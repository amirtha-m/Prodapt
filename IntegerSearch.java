package classworkday1;

public class IntegerSearch extends AbstractSearch {

	@Override
	public boolean search(Object[] obj_list, Object obj) {
		// TODO Auto-generated method stub
		 if (obj instanceof Integer) {
	            int target = (int) obj;
	            for (Object item : obj_list) {
	                if (item instanceof Integer && (int) item == target) {
	                    return true;
	                }
	            }
	        }
		return false;
	} 
}
