import javax.swing.*;
import java.security.SecureRandom;

public class QuestionBank {

    //random generator
    private SecureRandom randomNumbers = new SecureRandom();
    private int rightAnswers, wrongAnswers = 0;

    //questions
    private final String[] questions = {"The access modifier 'private' means:",
            "A driver class can be defined as:", 
            "Every complete java statement ends with:",
            "An instance of a class can be defined as:", 
            "The numbers -12, 0, 45, 999 are:",}; 

    //options
    private final String[] options = {"a) Can only be used by that class \nb) Available to all classes \nc) Requires a password to be used \nd) None of the above",
            "a) A class instance creation expression \nb) A class that creates an object of another class, then calls the object’s methods \nc) The command to compile multiple classes at once \nd) None of the above",
            "a) period \nb) parenthesis \nc) semicolon \nd)None of the above",
            "a) constant \nb) Object \nc) Initial \nd)None of the above",
            "a) Float \nb) Double \nc) Int \nd) None of the above"};


    //right answers array
    private final String[] answerKey = {"a", "b", "c", "b", "c"};


    //questions popup
    public void Questions() throws NullPointerException{
    	
    	//right or wrong value
        boolean value;

        
        //questions stated
        for (int i = 0; i < this.questions.length; i++) {
            String ans = JOptionPane.showInputDialog("Question " + (i + 1) + "!\n\n" + this.questions[i] + "\n\n" + this.options[i]);
            if(ans.equals(null))
                return;
            value = answer(ans,i);
            if (value)
                messages(value);

            else
                messages(value);
        }
    }

    //if answer is right or wrong
    public boolean answer(String answer, int questionNum) {

        if (this.answerKey[questionNum].equals(answer)) {
            this.rightAnswers++;
            return true;
        } else {
            this.wrongAnswers++;
            return false;
        }
    }
    //Messages

    public void messages(boolean value) {

        //right answer
        if (value) {

            switch (this.randomNumbers.nextInt(4)) {

                case 0:
                    JOptionPane.showMessageDialog(null, "Excellent!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Keep up the good work");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nice work!");
                    break;
            }
        }
        //wrong answer
        else {

            switch (this.randomNumbers.nextInt(4)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "No. Please try again");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Don't give up");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No. Keep trying");
                    break;
            }
        }

    }

    public void inputAnswer(){

        try{
            this.Questions();
        }
            catch (NullPointerException e){
                return;
            }

        }
        //start questions
        public void startQuestions(){

            JOptionPane.showMessageDialog(null,"Questions for Java Programming");
            inputAnswer();

            JOptionPane.showMessageDialog(null, "Results:\n"+"You have answered " + this.rightAnswers + " questions correctly and "
                    + this.wrongAnswers + " questions incorrectly.\n"
                    +"Final grade is:"+(((double) this.rightAnswers / (double) this.questions.length) * 100) + "%","marks",1);

            if(((double) this.rightAnswers / (double) this.questions.length) * 100<50)
                JOptionPane.showMessageDialog(null, "Test failed", "Failed", 0);

            else
                JOptionPane.showMessageDialog(null, "Test passed", "passed!", 1);
        }

    }
