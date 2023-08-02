import java.util.ArrayList;

class Printer{

    public static <T> void printElement(T e)
    {
        System.out.println(e);
    }

    public static <T> void printArray(T[] a)
    {
        for(T item: a)
        {
            printElement(item);
        }
    }
}