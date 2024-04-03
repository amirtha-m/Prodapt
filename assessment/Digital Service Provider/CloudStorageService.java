package assessment1;

public class CloudStorageService implements DigitalService {

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Logged in to streaming service with username:pqr ");

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Override
	public void accessContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("Accessing content:whatsapp ");
	}

	@Override
	public void updateProfile(String updateinfo) {
		// TODO Auto-generated method stub
		System.out.println("Updating profile: profile updated" + updateinfo);

	}
	
}
