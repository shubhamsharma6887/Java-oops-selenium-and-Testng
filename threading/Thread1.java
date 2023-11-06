package threading;

public class Thread1 extends Thread{
    public void run(){
        for (int i=0;i<=10;i++){
            try {
                System.out.println("process : "+i+" "+Thread.currentThread().getName());
                Thread.sleep(250);
            }
            catch (InterruptedException s){

            }
        }
    }

    public static void main(String[] args) {
        Thread t1= new Thread1();
        t1.start();
        Thread t2= new Thread1();
        //t2.Start();
    }
}
