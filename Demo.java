 interface A {

    String name = "Bha" ;

void show();
void config();
    
}
class B implements A{
    public void show(){
      System.out.println("its intermace implements in A");
    
    }
    public void config(){
        System.out.println("config");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        System.out.println(obj.name);
    }
}
