import javax.swing.*;
public class LottoTest {
    public  static  void main(String[] args)
    {
    	//creating array
        Lotto lotto = new Lotto();
        int[] lottoArray = lotto.getArray();
        int sum =0;
        for (int i = 0; i <lottoArray.length ; i++) {
            sum = sum+lottoArray[i];
        }
        int num =0;
        //defines winner ir loser
        boolean wins = false;
        System.out.print(sum);

        //counter for 5 numbers max
        for (int i = 0; i <5 ; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
            while (num < 3 || num > 27) {
                JOptionPane.showMessageDialog(null, "Please enter a number between 3 - 27");
                num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
            }
            if (num == sum)
            {
                JOptionPane.showMessageDialog(null,"Winner!");
                wins = true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry. Please try again.");
            }
        }
        if(!wins)
        {
            JOptionPane.showMessageDialog(null,"Sorry you have lost the game.");
        }

    }
}