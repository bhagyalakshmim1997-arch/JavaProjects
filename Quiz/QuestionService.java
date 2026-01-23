import java.util.Scanner;

public class QuestionService {

    Question[] q = new Question[3];
    String selection[] = new String[3];

    public QuestionService() {
    q[0] = new Question(1, "How many days are there in a week", "2", "5","7 ", "8", "7");
    q[1] = new Question(2, "Which animal is known as the 'King of the Jungle'?", "Elephant", "Lion ", "Tiger","Giraffe" , "Lion");
    q[2] = new Question(3, "5. How many legs does a spider have?","6", "8", "10", "4",  "8");
    }
   
    public void playQuiz(){
        System.out.println("Welocome to the quiz! Please Answer the below Questions");
        for(int i=0; i<3; i++){
            System.out.println("Question: " + q[i].getId() + q[i].getQuestion());
            System.out.println("1" + ":" + q[i].getOpt1());
            System.out.println("2" + ":" + q[i].getOpt2());
            System.out.println("3" + ":" + q[i].getOpt3());
            System.out.println("4" + ":" + q[i].getOpt4()); 
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
        }
        for(int i=0; i<selection.length ; i++){
        System.out.println("Your Answers are: " + selection[i]);
        }
    }

    
    public void scoreCheck(){
        int score = 0;
        for (int i= 0; i<q.length; i++){
        String acutalAnswer = q[i].getAnswer();
        String userAnswer = selection[i];
        if(acutalAnswer.equals(userAnswer))
        {
           score++;
        }
       
        }
         score = (score*100)/q.length;
        System.out.println("Your Score: " + score + "%");
    }
        
    }

