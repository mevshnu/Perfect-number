import java.util.*;
public class Perfect {
    public static void main (String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the last number");
        int b = sc.nextInt();
        for (i=1; i<=b; i++)
        {
            int x =i*i;
            if (x>a && x<b)
            {
                System.out.print(x+",");
            }
        }
    }
}
