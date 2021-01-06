package adressbuch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectoryEntryTest {

    @Test
    public void should_return_LastName() {
        // Given
        DirectoryEntry test = new DirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");

        //When
        String result = test.getLastName();

        //Then
        assertEquals("Hofmann", result, "Should give Hofmann");
    }
/*
    @Test
    public void should_create_an_instance_of_Directory() {
        // Given
        Directory testDirectory = new Directory(directoryEntries);

        // When
        String className = testDirectory.getClass().getTypeName();

        //Then
        assertEquals("adressbuch.Directory", className, "Wrong");
    }

    @Test
    public void should_add_a_entry() {
        // Given
        Directory testDirectory2 = new Directory();

        // When
        testDirectory2.addDirectoryEntry("Dirk","Hofmann","dirk.hofmann@fh-erfurt.de");

        // Then
        assertEquals(1, testDirectory2.getDirectorySize(), "Wrong");

    }*/
}
