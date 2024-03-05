import java.util.Scanner;

public class Bai7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("============MENU============");
            System.out.println("1.Tinh Chu vi + Dien tich hinh Tron ");
            System.out.println("2.Tinh Chu vi + Dien tich hinh Chu Nhat");
            System.out.println("3.Tinh Chu vi + Dien tich hinh Tam Giac");
            System.out.println("4.Thoat chuong trinh");
            System.out.println("Moi ban nhap Hinh muon tinh");
            int choice = Integer.parseInt(scanner.nextLine());
            double chuVi,dienTich,p;
            double PI = 3.14;

            switch (choice)
            {
                case 1 :
                    //chu vi = 2 * PI * R, diện tích = PI *( R ^ 2) ,
                    // với PI ~ 3.14 và R là bán kính của hình tròn.
                    System.out.println("Moi ban nhap Bankinh ");
                    int banKinh = Integer.parseInt(scanner.nextLine());
                    chuVi= (int) (2*PI*banKinh);
                    dienTich = PI*Math.abs(banKinh);
                    System.out.println("Chu vi la" + chuVi + " Dien Tich la " + dienTich);
                    break;
                case 2 :
                    System.out.println("Moi ban nhap chieu dai ");
                    int chieuDai = Integer.parseInt(scanner.nextLine());
                    System.out.println("Moi ban nhap chieu rong ");
                    int chieuRong =  Integer.parseInt(scanner.nextLine());
                   // 2 * chiều dài * chiều rộng , diện tích = chiều dài * chiều rộng
                    chuVi = chieuDai*chieuRong;
                    dienTich = chieuDai*chieuRong;
                    System.out.println("Chu vi la" + chuVi + " Dien Tich la " + dienTich);
                    break;
                case 3 :
                    System.out.println("Moi ban nhap chieu dai canh 1 ");
                    int canh1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Moi ban nhap chieu dai canh 2 ");
                    int canh2 =  Integer.parseInt(scanner.nextLine());
                    System.out.println("Moi ban nhap chieu dai canh 3 ");
                    int canh3 =  Integer.parseInt(scanner.nextLine());
                    //chu vi = a + b + c với a, b, c là lần lượt 3 cạnh tam giác
                    // p = a+b+c/3
                    chuVi = canh1+canh2+canh3;
                    p= (canh1+canh2+canh3)/2;
                    dienTich =Math.sqrt(p * (p - canh1)*(p - canh2)*(p - canh3));
                    System.out.println("Chu vi la" + chuVi + " Dien Tich la " + dienTich);
                    break;
                case 4:
                    System.exit(0);
                default:
            }
        }
        while (true);
    }
}


