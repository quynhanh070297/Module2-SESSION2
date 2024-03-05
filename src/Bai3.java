import java.util.Scanner;

public class Bai3
{
    public static void main(String[] args)
    {
        // in ra so nguyen to trong khoang tu 1-100

        int num =0;
        int x = 0;
        for (int i = 1; i <= 100; i++)
        {
            int counter=0;

            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter +=1;
                }
            }
            if (counter ==2)
            {
                System.out.println(i);
                x++;

            }
            if (x==20)
            {
                break;
            }

        }

    }
}
