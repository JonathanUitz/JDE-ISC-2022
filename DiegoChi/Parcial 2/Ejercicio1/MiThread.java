public class MiThread extends Thread{
    private String message;
    
    public MiThread(String threadName){
        ths.message = "Hola mundo";
    }
    public void run()
    {
        System.out.println(message);
    }
    public static void main(String args[]){
        MiThread t1 = new MiThread("t1");
        MiThread t2 = new MiThread("t2");

        t1.start();
        try{
            t1.sleep(millis:500);
        }catch(InterruptedException iex){
            iex.printStackTrace();
        }
        t2.start();
    }
}
