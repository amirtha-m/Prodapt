package assessment1;

public class StreamingService implements DigitalService{
	 
		@Override
		public void login(String username, String password) {
			 System.out.println("Logged in to streaming service with username:abc " );
		}
	 
		@Override
		public void logout() {
			System.out.println("Logged Out.....");
			
		}
	 
		@Override
		public void accessContent(String content) {
			System.out.println("Accessing content:instagram ");
			
		}
	 
		@Override
		public void updateProfile(String updateinfo) {
			System.out.println("Updating profile: profile updated");
			
		}
	 
}

