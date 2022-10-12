
import java.util.*;

public class RecursiveAsalSayi {
   static int i=2;
    public static int asalSayi(int a)
    {

        if(a==i) {

            return 1;
        }
        else if(a%i!=0)
        {
            i++;
           return asalSayi(a);
        }

        return 0;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number=in.nextInt();
        int state=asalSayi(number);
        //System.out.println(state);
        if(state==1)
            System.out.println(number+ " sayısı ASALDIR");
        else
            System.out.println(number+ " sayısı ASAL değildir.");



    }
}