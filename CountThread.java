
public class CountThread extends Thread {
    
    @Override
    public void run(){
        try{
            for(int i=0; i<=10500; i++){
                if(i%50==0 && i!=0)
                    System.out.println("Hello");
            System.out.println(i);
            sleep(5000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        new Thread(new CountThread()).start();
        
    }
}
