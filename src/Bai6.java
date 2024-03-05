import java.util.Scanner;

public class Bai6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag= false;
        do
        {
            System.out.println("============MENU============");
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4.Thoat");
            System.out.println("Moi ban nhap so ");
            int num = Integer.parseInt(scanner.nextLine());
            int sum= 0 ;
            System.out.println("Moi ban nhap choice ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice)
            {
                case 1 :
                    if (num%2==0)
                    {
                        System.out.println("Day la so chan");
                    }
                    else
                    {
                        System.out.println("Day la so le");
                    }
                    break;
                case 2 :
                    for (int i = 2; i < num ; i++)
                    {
                        if (num%i==0)
                        {
                         sum+=1;
                        }
                    }
                    if (sum==0)
                    {
                        System.out.println("La so nguyen to");
                    }
                    else {
                        System.out.println("Khong la so nguyen to");
                    }
                    break;
                case 3 :
                    if (num%3==0)
                    {
                        System.out.println("Chia het cho 3");
                    }
                    else
                    {
                        System.out.println("Khong chia het cho 3");
                    }
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default:
            }
        }
        while (true);
    }
}
