public class InterThreadComTwo {
    public static void main(String[] args) {

        WhiteBoard b = new WhiteBoard();
        Teacher t = new Teacher(b);
        Student s1 = new Student(b, "1>Harsh");
        Student s2 = new Student(b, "2>Mohit");
        Student s3 = new Student(b, "3>Manish");
        Student s4 = new Student(b, "4>New");

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }
}

class WhiteBoard {
    String content ;
    int count = 0 ;
    int no_of_stud = 0 ;

    public void attendence(){
        no_of_stud++ ;
    }

    WhiteBoard(){
        System.out.println("WhiteBoard created ! ");
    }

    synchronized String read(){

        while (count == 0) {
            try{wait();}catch(Exception e){System.out.println(e);}
        }

        String note = this.content ;
        count-- ;

        if(count == 0){
            notify();
        }

        return note ;
    }

    synchronized void write(String content){

        while(count != 0){
            try{wait();}catch(Exception e){System.out.println(e);}  
        }

        System.out.println("Teacher is writing > " + content);
        this.content = content;
        count = no_of_stud ;
        notifyAll();
    }

}

class Teacher extends Thread {
    WhiteBoard b ;

    Teacher(WhiteBoard b){
        this.b = b ;
    }

    public void run(){
        String [] text = {"Hello class ! ", "Welcome to java multithreading ", "Next lecture will be ", "held tomorrow ", "end"};
        int i = 0 ;

        while(text[i] != "end"){
            b.write(text[i]);
            i++;
        }
    }
}

class Student extends Thread{
    WhiteBoard b ;
    String name ;

    Student(WhiteBoard b, String name){
        this.b = b ;
        this.name = name ;
        b.attendence();
    }

    public void run(){
        String note ;

        do{
            note = b.read();
            System.out.println("Name : " + this.name + " - " + note);
            System.out.flush();
            try{Thread.sleep(100);}catch(Exception e){}
        }while(!note.equals("end"));
    }
}
