import java.util.Scanner;

public class JavaConditional {
    public static String pratices1(int i){
        if (i < 0 || i == 0){
            return "negative number";
        }else {
            return "positive number";
        }
    }
    public static void pratices2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("reqem daxil edin: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 1 && b < 1 && c < 1) {
            System.out.println("daxil edilen reqem 1 den kicik ola bilmez..");
            System.exit(0);
        } else {
            if (a > b && a > c) {
                System.out.println("a reqemi b ve c  den boyukdur");
            } else if (b > a && b > c) {
                System.out.println("b reqemi a  ve c den boyukdur");
            } else if (c > a && c > b) {
                System.out.println("c reqemi a  ve b den boyukdur");
            } else {
                if (a == b) {
                    System.out.println("daxil edilen reqemlerler bir birine bereberdi");
                }
            }
        }
    }
}
