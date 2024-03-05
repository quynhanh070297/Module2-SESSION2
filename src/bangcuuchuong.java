import java.util.Scanner;

public class bangcuuchuong
{
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao mot so");
        int num ;
//        num = Integer.parseInt(scanner.nextLine());
        for (int j = 1; j<=10 ; j++)
        {
            for (int i = 1; i <=10; i++)
            {
                System.out.printf("%-3d * %-3d = %-10d", j, i, j * i);
            }
            System.out.println();
        }
    }
}
