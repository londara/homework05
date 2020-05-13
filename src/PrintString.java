public class PrintString {
    synchronized void Print(String n){
        for (int i = 0; i < n.length(); i++) {
            System.out.print(n.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
    synchronized void Download(String n){
        for(int i=0;i<n.length();i++){
            System.out.print(n.charAt(i));
            try{
                Thread.sleep(300);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    synchronized void Completd(String n){
        for(int i=0;i<n.length();i++){
            System.out.print(n.charAt(i));
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
