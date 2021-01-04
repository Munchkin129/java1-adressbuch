package adressbuch;

public class DirectoryEntry {

    /**
     * attributes
     */
    private String firstName;
    private String lastName;
    private String mailAddress;


    /**
     * constructor
     */
    public DirectoryEntry(String firstName, String lastName, String mailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
    }

    public DirectoryEntry() {
    }

    /**
     * getter & setter
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
