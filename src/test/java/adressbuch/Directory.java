package adressbuch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Directory {

    private ArrayList<DirectoryEntry> directory = new ArrayList<DirectoryEntry>();

    public Directory() {
    }

    public void addDirectoryEntry(DirectoryEntry directoryEntry) {
        this.directory.add(directoryEntry);
    }

    public void printOutPartingLine() {
        System.out.println("------------------------------");
    }

    public void sortDirectory() {
        Collections.sort(this.directory);
    }

    public DirectoryEntry getDirectoryEntry(int index) {
        return this.directory.get(index);
    }

    public void printOutNameOverview() {
        ArrayList<String> usedNames = new ArrayList<String>();
        int timesRun = 1;
        for (int count = 0; count < this.directory.size(); count++) {
            DirectoryEntry firstDirectoryEntry = getDirectoryEntry(count);
            if (!(usedNames.contains(firstDirectoryEntry.getLastName()))) {
                int occurrence = 1;
                for (int index = timesRun; index < this.directory.size(); index++) {
                    DirectoryEntry secondDirectoryEntry = getDirectoryEntry(index);
                    if (firstDirectoryEntry.getLastName() == secondDirectoryEntry.getLastName()) {
                        occurrence++;
                    }
                }
                System.out.print(firstDirectoryEntry.getLastName() + " - " + occurrence + "   ");
                timesRun++;
                usedNames.add(firstDirectoryEntry.getLastName());
            } else timesRun++;
        }
        System.out.println(" ");
        for (int i = 0; i < usedNames.size(); i++) {
            System.out.println(usedNames.get(i));
        }
    }

    public void printOutDirectroyEntry(int index) {
        if (this.directory.size() > index) {
            DirectoryEntry directoryEntry = getDirectoryEntry(index);
            System.out.println(directoryEntry.getFirstName() + " " + directoryEntry.getLastName() + " " + directoryEntry.getMailAddress());
        } else error(1);
    }

    public void printOutAllDirectroyEntrys() {
        if (this.directory.isEmpty()) {
            error(2);
        } else {
        for (int count = 0; count < this.directory.size(); count++)
        printOutDirectroyEntry(count);
        }
    }

    public void error(int error) {
        System.out.println("Error " + error);
    }

/*
Matzes Stack Overflow
    public ArrayList<DirectoryEntry> getDirectoryEntrys() {
        return this.directory;
    }

    public void sortDirectoryEntrys() {
        ArrayList<DirectoryEntry> directory = this.getDirectoryEntrys();
        Collections.sort(directory);
    }

 */

}
