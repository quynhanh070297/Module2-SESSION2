import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        //Tính tổng các số chẵn cho trước

        int soBatdau, soKetthuc, soChan=0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số bắt đầu");
        soBatdau = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số kết thúc ");
        soKetthuc = Integer.parseInt(scanner.nextLine());

        for (int i = soBatdau; i < soKetthuc ; i++)
        {
            if (i%2==0) {
                soChan += i ;
            }
            else {
                System.out.println("So khong hop le");
            }
        }
        System.out.println("Tong so chan la" + soChan );


    }
}
