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
    public static void pratices3(){

        Scanner sc = new Scanner(System.in);
        System.out.println("1-7 araliginda her hansisa bir reqem yazin");
        String[] wednessDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int wednesDaysEnterNumber = sc.nextInt();
        if (wednesDaysEnterNumber < 1 || wednesDaysEnterNumber > 7){
            System.out.println("Daxil edilen reqem hefte ici cedveline uygun deyil,heftede 7 gun var..");
            System.exit(0);
        }

        if (wednesDaysEnterNumber == 1){
            System.out.println(wednessDays[0]);
        }else if (wednesDaysEnterNumber == 2){
            System.out.println(wednessDays[1]);
        }else if (wednesDaysEnterNumber == 3){
            System.out.println(wednessDays[2]);
        }else if (wednesDaysEnterNumber == 4){
            System.out.println(wednessDays[3]);
        }else if (wednesDaysEnterNumber == 5){
            System.out.println(wednessDays[4]);
        }else if (wednesDaysEnterNumber == 6){
            System.out.println(wednessDays[5]);
        }else if (wednesDaysEnterNumber == 7){
            System.out.println(wednessDays[6]);
        }
    }
    public static void  pratices4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("reqem daxil edin: ");
        int enterNumber = sc.nextInt();

        for (int i=1;i<=enterNumber;i++){
            System.out.println(i);
        }
    }
    public static void pratices5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("reqem daxil edin..");
        int cem = 0;
        int enter = sc.nextInt();

        for (int i=1;i<=enter;i++){
            System.out.println(i);
            cem+=i;
        }
        System.out.println(cem);
    }
}
