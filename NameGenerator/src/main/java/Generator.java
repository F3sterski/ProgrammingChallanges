/**
 * Created by szkol_000 on 8/23/2015.
 */
import java.util.Random;

public class Generator {

    private static 	Credential[] credentials = {
            new Credential("Adam","123456789"),
            new Credential("Klaudia","98763874325"),
            new Credential("Stanis?awa","11111111"),
            new Credential("Alicja","777777777"),
            new Credential("Janusz","66666666"),
            new Credential("Wojciech","990900909")};

    public Credential getRandomCredential(){
        Random generator = new Random();
        int randNameNo = generator.nextInt(credentials.length);
        return credentials[randNameNo];
    }
}