import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a deyisenine deyer verin ");
        double a = sc.nextDouble();
        System.out.print("b deyisenine deyer verin ");
        double b = sc.nextDouble();


        a = Math.round(a * 100) / 100;
        b = Math.round(b * 100) / 100;

        if (a == b){
            System.out.println("daxil edilen :" + a + " ve " + b + " reqemleri bereberdi");
        }else {
            System.out.println("daxil edilen :" + a + " ve " + b + " reqemleri bereber deyil");
        }
    }
}