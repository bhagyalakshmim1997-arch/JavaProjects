abstract class A {
    abstract void show();
    abstract void config();
    void show1(){
        System.out.println("Class A show1");
    }
}
class Demo {
public static void main(String[] args) {
    A objA= new A(){
        void show(){
            System.out.println("Main");
        }

void config() {
    System.out.println("Main Config");
}
    };
    objA.show();
    objA.config();
    objA.show1();
}
}