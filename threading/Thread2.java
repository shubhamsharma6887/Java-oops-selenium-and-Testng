package threading;

public class Thread2 extends Hello implements Runnable{
    Thread2(){
        Thread t = new Thread1();
        t.start();
    }
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
        Thread2 t1= new Thread2();
        //t1.start();
        Thread2 t2= new Thread2();
        //t2.start();
        Hello h = new Hello();
        h.msg();
    }
}
