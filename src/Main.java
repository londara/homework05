import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        final PrintString obj = new PrintString();
        Scanner sc = new Scanner(System.in);
        System.out.print("-> Geeting Start :");
        String Geeting = sc.nextLine();
        if(Geeting.length()>0==true) {
            Thread t1 = new Thread() {
                public void run() {
                    obj.Print("Hi KSHRD!");
                }
            };
            Thread t2 = new Thread() {
                public void run() {
                    obj.Print("*************************************");
                }
            };
            Thread t3 = new Thread() {
                public void run() {
                    obj.Print("I will try my best to be here at HRD.");
                }
            };
            Thread t4 = new Thread() {
                public void run() {
                    obj.Print("-------------------------------------");
                }
            };
            Thread t5 = new Thread() {
                public void run() {
                    obj.Download("Downloading...........");
                }
            };
            Thread t6 = new Thread() {
                public void run() {
                    obj.Completd("Completed 100%!");
                }
            };
            t1.start();
            t6.start();
            t5.start();
            t4.start();
            t3.start();
            t2.start();
        }else{
            System.out.println("Sorry Input again!!!");
        }
    }
}
