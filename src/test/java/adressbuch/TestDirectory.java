package adressbuch;

import java.util.ArrayList;
import java.util.List;



public class TestDirectory {
    public static void main (String[] args)
    {
        List<DirectoryEntry> test = new ArrayList<DirectoryEntry>();

        test.add( new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de"));
        test.add( new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de"));
        test.add( new DirectoryEntry("Greta","Mittermeier","greta.mittermeier@uni-erfurt.de"));
        test.add( new DirectoryEntry("Frank","Hofmann","hofmann.f@t-online.de"));

        System.out.println("Anzahl der Einträge: " + test.size());

        /*
        System.out.println(test.get(0).compareTo((test.get(1))));
        System.out.println(test.get(0).compareTo(test.get(2)));
        System.out.println(test.get(0).compareTo(test.get(3)));
        System.out.println(test.get(1).compareTo(test.get(2)));*/

        for (int i = 0; i < test.size(); i++)
            System.out.println(test.get(i).getFirstName() + " " + test.get(i).getLastName() + " " + test.get(i).getMailAddress());

        DirectoryEntry dirk = new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");
        DirectoryEntry matze = new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de");
        int result = dirk.compareTo(matze);
        System.out.println(result);

    }


   /* @Test
    public void should_return_LastName(){
        // Given
        DirectoryEntry directoryEntry = new DirectoryEntry();

        // When
        String result = "0";

        // Then
        Assertions.assertEquals();

    }*/
}
