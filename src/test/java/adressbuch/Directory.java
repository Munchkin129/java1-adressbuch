package adressbuch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Directory {

    private List<DirectoryEntry> directory = new ArrayList<DirectoryEntry>();

    public Directory() {
    }

    public void addDirectoryEntry(DirectoryEntry directoryEntry) {
        this.directory.add(directoryEntry);
    }

    public void printOut222() {
        System.out.println("Okay, es funktioniert!");
    }

    public void sortDirectory() {
        Collections.sort(this.directory);
    }

    public DirectoryEntry getDirectoryEntry(int index) {
        return this.directory.get(index);
    }

    public void printOutDirectroyEntry(int index) {
        if (this.directory.size() > index) {
            DirectoryEntry directoryEntry = getDirectoryEntry(index);
            System.out.println(directoryEntry.getFirstName() + " " + directoryEntry.getLastName() + " " + directoryEntry.getMailAddress());
        } else error(1);
    }

    public void error(int error) {
        System.out.println("Error " + error);
    }
}
