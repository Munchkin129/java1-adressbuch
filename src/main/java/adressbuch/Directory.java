package adressbuch;

import java.util.ArrayList;
import java.util.List;

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
}
