import java.util.Random;
import java.util.Scanner;

public class TreapRun
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Treap myTreap = new Treap();
        System.out.println("Treap Run");
        myTreap.insert(3, 10);
        myTreap.insert(4, 9);
        myTreap.insert(2, 12);
        myTreap.insert(1, 11);
        myTreap.insert(8, 12);
        myTreap.print();
        myTreap.bypass();
        System.out.println("Enter key to search");
        System.out.println("Search result : " + myTreap.search(scan.nextInt()));
    }
}