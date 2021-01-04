package java1examples;

public class MyFirstClass {
    public static void main(String[] args) {
        int StartNumber = 1;
        int EndNumber = 100;
        for (int count = StartNumber; count <= EndNumber; count++)
        {
            boolean alreadyPrinted = false;
            if (count % 5 == 0)
            {
                System.out.print("Fitz");
                alreadyPrinted = true;
            }
            if (count % 7 == 0)
            {
                System.out.print("Quark");
                alreadyPrinted = true;
            }
            if (!alreadyPrinted)
            {
                System.out.print(count);
            }
            System.out.println("");
        }


        }


    }


