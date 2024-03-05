import java.util.Scanner;

public class Menuchoice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("============MENU============");
            System.out.println("1.Tim uoc chung lon nhat");
            System.out.println("2.Tinh tong cac uoc do");
            System.out.println("3.Tim cac so chia het cho 3 va 5 trong khoang tu 1 den n");
            System.out.println("Moi ban nhap so ");
            int num = Integer.parseInt(scanner.nextLine());
            int sum= 0 ;
            System.out.println("Moi ban nhap choice ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1 :
                    for (int i = 1; i < num; i++)
                    {
                        if (num%i==0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 2 :
                    for (int i = 1; i < num; i++)
                    {
                        if (num%i==0) {
                           sum +=i;
                            System.out.println(sum);
                        }
                    }
                    break;
                case 3 :
                    for (int i = 1; i < num; i++)
                    {
                        if (i%3==0 && i%5==0 ){
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
        while (true);
    }
}
