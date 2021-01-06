package adressbuch;


import java.util.*;



public class main {
    public static void main (String[] args)
    {
        /*
        List<DirectoryEntry> test = new ArrayList<DirectoryEntry>();

        test.add( new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de"));
        test.add( new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de"));
        test.add( new DirectoryEntry("Greta","Mittermeier","greta.mittermeier@uni-erfurt.de"));
        test.add( new DirectoryEntry("Frank","Hofmann","hofmann.f@t-online.de"));

        System.out.println("Anzahl der Einträge: " + test.size());

        for (int i = 0; i < test.size(); i++)
            System.out.println(test.get(i).getFirstName() + " " + test.get(i).getLastName() + " " + test.get(i).getMailAddress());


        System.out.println(test.get(0).compareTo((test.get(1))));
        System.out.println(test.get(0).compareTo(test.get(2)));
        System.out.println(test.get(0).compareTo(test.get(3)));
        System.out.println(test.get(1).compareTo(test.get(2)));

        Collections.sort(test);

        System.out.println("Anzahl der Einträge: " + test.size());

        for (DirectoryEntry count : test) System.out.println(count.getFirstName() + " " + count.getLastName() + " " + count.getMailAddress());
*/

        Directory var1 = new Directory();
        DirectoryEntry var2 = new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");


        var1.addDirectoryEntry(var2);
        var1.addDirectoryEntry(new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de"));
        var1.addDirectoryEntry(new DirectoryEntry("Greta","Mittermeier","greta.mittermeier@uni-erfurt.de"));
        var1.addDirectoryEntry(new DirectoryEntry("Frank","Hofmann","hofmann.f@t-online.de"));


        var1.printOutAllDirectroyEntrys();
        var1.sortDirectory();
        var1.printOutPartingLine();
        var1.printOutAllDirectroyEntrys();
        var1.printOutPartingLine();
        var1.printOutNameOverview();








    }
}
