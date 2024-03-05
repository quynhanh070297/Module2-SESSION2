public class Bai4
{
    public static void main(String[] args)
    {

        int num =0;
        for (int i = 1; i <= 100; i++)
        {
            int counter=0;
            int next = 0;
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


            }

        }
    }

}
