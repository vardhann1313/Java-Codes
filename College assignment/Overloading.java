public class Overloading {

    public static void main(String ar[]){
        Print_me p1 = new Print_me();

        Print_me p2 = new Print_me("Harshvardhan");
        p2.info("Harshvardhan Mishra", 101);
        p2.info("Harshvardhan Mishra");
    }
    
}

class Print_me {
    public Print_me(){
        System.out.println("Initialized object of Print_me class");
    }

    public Print_me(String str){
        System.out.print("Initialized object | ");
        System.out.println("Hello " + str);
    }

    public void info(String name, int id){
        System.out.println("Name : " + name + " | Id " + id );
    }
    public void info(String name){
        System.out.println("Welcome " + name );
    }
}
