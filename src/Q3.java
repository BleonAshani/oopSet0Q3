import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {

        String name,IncomeAsString;
        int Income;

        name = JOptionPane.showInputDialog(null,"Please enter your name: ");

        IncomeAsString = JOptionPane.showInputDialog(null,"Please enter your income: ");
        Income = Integer.parseInt(IncomeAsString);


        if(Income <= 20000){
            JOptionPane.showMessageDialog(null,"Your Tax Rate is 0%" ,"Tax Rate", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Income <= 36000){
            JOptionPane.showMessageDialog(null,"Your Tax Rate is 20%" ,"Tax Rate" ,JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(null,"Your Tax Rate is 41%" ,"Tax Rate", JOptionPane.INFORMATION_MESSAGE);

        }




    }
}
