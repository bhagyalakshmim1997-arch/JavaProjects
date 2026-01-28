class BhagyaException extends Exception{
    BhagyaException(String string){
        super(string);
    }
}

public class ExcepMain {
    public static void main(String[] args) {
       int x= 0;
try
{
            
if(x==0)
            throw new BhagyaException("New custom exception");

} 
 catch (BhagyaException e) {
   System.out.println("Can't divide by 0" + e.getMessage());
}
finally{
    System.out.println("Bye");
}
    }
}
    
