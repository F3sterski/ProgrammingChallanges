/**
 * Created by szkol_000 on 8/23/2015.
 */
public class Credential {

    private String name;

    private String phoneNumber;

    @Override
    public String toString() {
        return "Credential [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    public Credential(String name, String phoneNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}