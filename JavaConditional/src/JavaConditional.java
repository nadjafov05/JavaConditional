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
    public static void pratices6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int cem =0;
        int enter = sc.nextInt();

        for (int i=1;i<=enter;i++){
            cem+=i;
        }
        double ss  = cem / 5;
        System.out.println("daxil edilen cemin toplamini: " + cem);
        System.out.println("daxil edilen reqemin orta hesabini tap,bolunen qaliqi" + ss);
    }
    public static void pratices7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter max number");
        int enterN = sc.nextInt();
        for (int i=1;i<=enterN;i++){
            System.out.println(i*i*i);
        }
    }

    public static void pratices8(int n){
        for (int i=1;i<=n;i++){
            System.out.println(n + " * " + i + " = " + n*i);

        }
    }
    public static void pratices9(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void pratices10(int b){
        for (int i=1;i<=b;i++){
            for (int j=1;j<=i;j++){
                System.out.print(b);
            }
            System.out.println("");
        }
    }

    public static void pratices11(int b){
        for (int i=1;i<=b;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void pratices12(){
        int k = 1;
        for (int i=0;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println("");
        }
    }
    public static void pratices13(){
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
