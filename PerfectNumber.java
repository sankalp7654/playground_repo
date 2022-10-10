import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        isPerfectNumber(a);

        sc.close();

    }

    public static void isPerfectNumber(int a[])
    {
        
        for(int i=0; i<a.length; i++)
        {

            int n = a[i];
            int sum = 1;

            for(int j=2; j*j<n; j++)
            {
                if(n%j==0)
                {
                    if(j*j==n)
                    {
                        sum+=j;
                    } else {
                        sum+=j;
                        sum+=(n/j);
                    }
                }
            }

            if(sum==n)
            {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        
    }
}
