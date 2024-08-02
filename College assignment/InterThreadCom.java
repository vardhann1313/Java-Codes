public class InterThreadCom {
    public static void main(String[] args) {

        Mydata d = new Mydata();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
        
    }
}

class Mydata {
    int val = 0 ;
    boolean flag = true ;

    synchronized void set(int val){
        while (flag != true) {
            try {wait();}catch(Exception e){System.out.println(e);}
        }

        this.val = val ;
        flag = false ;
        notify();
    }

    synchronized int get(){
        int val = 0 ;

        while (flag != false) {
            try {wait();}catch(Exception e){System.out.println(e);}
        }
        
        val = this.val ;
        flag = true ;
        notify();
        return val ;
    }
}

class Producer extends Thread {
    Mydata d ;
    int val = 1 ;

    Producer(Mydata d){
        this.d = d ;
    }

    public void run(){

        while(true){
            d.set(val);
            System.out.println("Producer " + val++);
        }
    }
}

class Consumer extends Thread {
    Mydata d ;
    int val = 0 ;

    Consumer(Mydata d){
        this.d = d ;
    }

    public void run(){

        while(true){
            val = d.get();
            System.out.println("Consumer " + val);
        }
    }
}