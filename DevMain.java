interface Computer{
     void coding();
}
class Desktop implements Computer{
    public void coding(){
        System.out.println("Coding, running---Faster");
    } 
}
class Laptop implements Computer{
   public void coding(){
        System.out.println("Coding, running");
    }
}
class Developer{
   void developerWork(Computer lap){
        lap.coding();
    }
}

public class DevMain {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Computer lap = new Laptop();
        Computer des = new Desktop();
        dev.developerWork( des);
    }
}
