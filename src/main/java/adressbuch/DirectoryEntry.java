package adressbuch;


public class DirectoryEntry implements Comparable<DirectoryEntry>
{

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



    @Override
    public int compareTo(DirectoryEntry o) {
        String ownLastName = getLastName();
        String otherLastName = o.getLastName();
        char firstLetterOfOwnLastName = ownLastName.charAt(0);
        char firstLetterOfOtherLastName = otherLastName.charAt(0);
        if (firstLetterOfOwnLastName < firstLetterOfOtherLastName) {
            return -1;
        } else if (firstLetterOfOwnLastName > firstLetterOfOtherLastName) {
            return 1;
        }
        return 0;
    }

}
