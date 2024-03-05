public class Bai2
{
    public static void main(String[] args)
    {
        System.out.println("Hinh chu nhat");
        for (int i = 0; i < 3 ; i++)
        {
            for (int j = 1; j < 7; j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        };

        System.out.println("Hinh Tam giac");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        };

        System.out.println("Hinh Tam giac nguoc");

        for (int i = 0; i <5; i++)
        {
            for (int j = 4;i<j; j--)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println("Hinh Tam giac can");

        for (int i = 0; i < 5; i++)
        {
            System.out.println();
            for (int j = 5; j>i; j--)
            {
                System.out.print("   ");
            }
            for (int k = 0; k < 2*i+1; k++)
            {
                System.out.print(" * ");
            }
        }






    }
}
