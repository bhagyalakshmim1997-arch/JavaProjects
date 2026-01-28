public class AgeCheck {
   
    void checkAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Exception caught: age must be greater than 18");
        }
        else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        AgeCheck age = new AgeCheck();
        try{
        age.checkAge(15);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        try{
        age.checkAge(18);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
