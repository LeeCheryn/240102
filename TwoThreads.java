
public class TwoThreads extends Thread {
  
    static TwoThreads t1 = new TwoThreads(){
        public void run(){
            try{
                for(int i=1; i<=10; i++){
                    System.out.print(i+" ");
                    if(i==5){
                        t2.start();
                    }
                    sleep(1000);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    };
    
    static TwoThreads t2 = new TwoThreads(){
        public void run(){
            try{
                for(int j=0; j<10; j++)
                    System.out.print("A"); 
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    };
    
    public static void main(String[] args) {
        t1.start();
    }
}
