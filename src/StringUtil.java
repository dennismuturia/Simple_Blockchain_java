import java.security.MessageDigest;

public class StringUtil {
    //Gonna make it apply the SHA256 to a string and return the results
    public static String applySHA256(String input){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Apply SHA-256 to our input
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
