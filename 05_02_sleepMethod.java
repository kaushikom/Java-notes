class MyThread extends Thread{
    public void run(){
        for(int i = 1; i < 6; i++){
            // sleep method can not be used without exception handling.
            try{
                Thread.sleep(1500); // puts the current thread to sleep state
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Main{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}