package adressbuch;

import java.util.*;



public class TestDirectory {
    public static void main (String[] args)
    {
        List<DirectoryEntry> test = new ArrayList<DirectoryEntry>();

        test.add( new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de"));
        test.add( new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de"));
        test.add( new DirectoryEntry("Greta","Mittermeier","greta.mittermeier@uni-erfurt.de"));
        test.add( new DirectoryEntry("Frank","Hofmann","hofmann.f@t-online.de"));

        System.out.println("Anzahl der Einträge: " + test.size());

        for (int i = 0; i < test.size(); i++)
            System.out.println(test.get(i).getFirstName() + " " + test.get(i).getLastName() + " " + test.get(i).getMailAddress());

        for (DirectoryEntry count : test) System.out.println(count.getFirstName() + " " + count.getLastName() + " " + count.getMailAddress());


        Directory var1 = new Directory();
        DirectoryEntry var2 = new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");

        var1.printOut222();
        var1.addDirectoryEntry(new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de"));

        //for (DirectoryEntry count : Adressbuch) System.out.println(count.getFirstName() + " " + count.getLastName() + " " + count.getMailAddress());


        /*
        System.out.println(test.get(0).compareTo((test.get(1))));
        System.out.println(test.get(0).compareTo(test.get(2)));
        System.out.println(test.get(0).compareTo(test.get(3)));
        System.out.println(test.get(1).compareTo(test.get(2)));*/



        //Collections.sort(test);

        String hofmann = "Hofmann";
        String mittermeier = "Mittermeier";

        char firstLetterHofmann = hofmann.charAt(0);
        char firstLetterMittermeier = mittermeier.charAt(0);

        if (firstLetterHofmann > firstLetterMittermeier)
        {
            System.out.println("H > M");
        } else if (firstLetterHofmann < firstLetterMittermeier) {
            System.out.println("H < M");
        }


        /*
        DirectoryEntry dirk = new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");
        DirectoryEntry matze = new DirectoryEntry("Matthias","Gabel","matthias.gabel@fh-erfurt.de");
        int result = dirk.compareTo(matze);
        System.out.println(result);
        */
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
