public class Bai5
{
    public static void main(String[] args)
    {
        int n=1 ;
        while (true) {
            if (n%5==0 && n%7==0 && n%11==0)
            {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
