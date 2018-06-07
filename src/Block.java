import java.util.Date;

//This is a block model
public class Block {
    private String hash;
    private String previousHash;
    private String data;//Just a simple message
    private long dateTime;//Calculates time in milliseconds

    //This is a block constructor
    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.dateTime = new Date().getTime();
    }
}
