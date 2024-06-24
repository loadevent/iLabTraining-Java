package Chapter2;

import javax.swing.JOptionPane;
public class GetUserInputDialog {
    public static void main(String[] args) {
       //Declare
        int age;
        String strName;
        //Assign
        strName = JOptionPane.showInputDialog("What is your name?");
        //use
        JOptionPane.showMessageDialog(null,"Hello, " + strName);
    }
}
