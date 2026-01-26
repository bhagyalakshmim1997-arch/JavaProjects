enum Status{
    running, success, failed, pending;
}

public class Enum {
    public static void main(String[] args) {
        /*Status[] s = Status.values();
        for (Status ss: s)
        System.out.println(ss + ":"+ ss.ordinal() );*/
        Status s = Status.success;
     /*   if (s ==Status.failed){
        System.out.println("Excection failed");
        }
        else if(s== Status.success){
             System.out.println("Excection Scucess");
            
        }else if(s== Status.running){
             System.out.println("Excection running");

        }else {
            System.out.println("Excecution pending");
        }*/

            switch (s) {
                case running:
        System.out.println("Excection Running");
                    break;
             case failed:
        System.out.println("Excection failed");
                    break;
                     case success:
        System.out.println("Excection success");
                    break;
                default:
                    System.out.println("Pending");
                    break;
            }
    }
    
}
