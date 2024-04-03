package assessment1;

public class SocialMediaService implements DigitalService {

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Logged in to streaming service with username:tuv ");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout");
	}

	@Override
	public void accessContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("Accessing content:propel");
	}

	@Override
	public void updateProfile(String updateinfo) {
		// TODO Auto-generated method stub
		System.out.println("Update profile:Profile updated");
	}

}
