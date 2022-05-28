import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2,a;

        System.out.print("İlk Sayıyı Giriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        a = Math.min(number1,number2);

        while (a>0) {
            if(number1%a==0 && number2%a==0){break;}
            a--;
        }
        System.out.println("EBOB = " + a);
        int b = 1;
        while (b>0) {
            if (b%number1 ==0 && b%number2 == 0) {break;}
            b++;
        }
        System.out.println("EKOK = " + b);
    }
}
