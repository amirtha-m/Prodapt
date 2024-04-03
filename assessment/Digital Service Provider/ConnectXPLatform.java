package assessment1;

public class ConnectXPLatform {
public static void main(String[] args) {
		
		System.out.println("StreamingService");
		DigitalService StreamingService = new StreamingService();
		StreamingService.login("userA", "passwordA2345");
        StreamingService.accessContent("ContentA2345");
        StreamingService.updateProfile(" Profile Updated");
        StreamingService.logout();	
        
        System.out.println();
        
        System.out.println("CloudStorageService");
		DigitalService CloudStorageService = new CloudStorageService();
		CloudStorageService.login("userB","passwordb4567");
		StreamingService.accessContent("Contentb4567");
        StreamingService.updateProfile(" Profile Updated");
        StreamingService.logout();		
        
        System.out.println("CloudStorageService");
        DigitalService SocialMediaService = new SocialMediaService();
        SocialMediaService.login("userC","passwordE3214");
        SocialMediaService.accessContent("ContentE3214");
        SocialMediaService.updateProfile(" Profile Updated");
        SocialMediaService.logout();
		
		
		
	}
 
}

