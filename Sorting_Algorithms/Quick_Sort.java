import java.util.ArrayList;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a list of numbers to sort : ");
        while(sc.hasNextInt()) {
           list.add(sc.nextInt());
        }
        for(int n : list) {
            System.out.println(n);
        }
    }
}
