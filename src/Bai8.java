import java.util.Scanner;

public class Bai8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Moi ban nhap vao 3 canh cua 1 tam giac");
            int canh1 = Integer.parseInt(scanner.nextLine());
            int canh2 = Integer.parseInt(scanner.nextLine());
            int canh3 = Integer.parseInt(scanner.nextLine());
            int chuVi, p;
            double dienTich;

            if (canh1 >0 && canh2>0 && canh3>0 && canh2+canh1>canh3
                    && canh2+canh3>canh1 && canh3+canh1>canh2)
            {
                //chu vi = a + b + c với a, b, c là lần lượt 3 cạnh tam giác
                // p = a+b+c/3
                chuVi = canh1+canh2+canh3;
                p= (canh1+canh2+canh3)/2;
                dienTich =Math.sqrt(p * (p - canh1)*(p - canh2)*(p - canh3));
                System.out.println("Chu vi la" + chuVi + " Dien Tich la " + dienTich);
            }
            else
            {
                System.out.println("Day khong phai la cac canh cua hinh tam giac");
            }

        }
        while (true);
    }
}
