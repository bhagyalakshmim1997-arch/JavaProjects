enum Laptop{
    Macbook(1000), Dell(400), ThinkPad(200), Lenovo;
     private int price;
     private Laptop(){

     }
     private Laptop(int price){
        this.price = price;
    }
    public void setPrice(int price){
      this.price = price;
    }
    public int getPrice(){
        return price;
    }

}

public class EnumPart2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Lenovo;
        lap.setPrice(20);
        System.out.println(lap + ":"+ lap.getPrice());
    }
}
