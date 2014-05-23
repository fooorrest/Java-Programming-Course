
public class Threading extends Thread {
    int n;
    public Threading(int n){
        this.n = n;
    }
  
    public void run(){
        for(int i = 0; i <= 30; i++){ //this is what is really doing the work. This is what is actually counting to 30. 
            System.out.println("Thread " + n + " starting.");
            System.out.println(i);
            System.out.println("Thread " + n + " done starting. Thread stopping."); //alerting when the thread is stopping
            try {
                Thread.sleep(1); //set for 1 milisecond so I wouldn't waste your time! 
            } catch (InterruptedException e) {
                 
                System.out.println("Thread " + n + "wasn't done.");
            }
        }
    }
    public static void main(String [] args){
        new Threading(1).start();
        new Threading(2).start();
        new Threading(3).start();
    }
}

//////////

public class Threading1 extends Thread {
    int n;
    public Threading(int x){
        this.x = x;
    }

    public void run(){
        for (int y = 0; y <= 100; y++){ //different formula. This one is counting to 100. 
            System.out.println("Thread " + x + " starting.");
            System.out.println(y);
            System.out.println("Thread " + x + "wasn't done.");
        }
    }
    public static void main(String [] args){
        new Threading(4).start();
        new Threading(5).start(); //different thread names. 
        new Threading(6).start();
    }
}

/////////


public class Threading2 extends Thread {
    int f;
    public Threading(int f){
        this.f = f;
    }

    public void run(){
        for (int e = 0; e <= 37; e++){ //different formula. This one is counting to 100. 
            System.out.println("Thread " + x + " starting.");
            System.out.println(e);
            System.out.println("Thread " + x + "wasn't done.");
        }
    }
    public static void main(String [] args){
        new Threading(7).start();
        new Threading(8).start(); //different thread names. 
        new Threading(9).start();
    }
}



