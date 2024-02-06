import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pocket Money - Application");
        JLabel lbl_input, lbl_result;
        lbl_input = new JLabel("Please input pocket money: ");
        lbl_result = new JLabel();

        JTextField textField = new JTextField();
        JButton submit = new JButton("Submit");

        frame.setLayout(new GridLayout(2, 2));

        frame.add(lbl_input);
        frame.add(lbl_result);
        frame.add(textField);
        frame.add(submit);


        frame.setSize(400, 100);
        frame.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int money = Integer.parseInt(textField.getText());

                if (money >= 100 && money <= 200){
                    lbl_result.setText("Can buy Barbie Dream Horse");
                }else if (money >= 50 && money < 100){
                    lbl_result.setText("Can buy LeGo");
                }else if (money >= 10 && money < 50){
                    lbl_result.setText("Can buy Disney Game.");
                }else {
                    lbl_result.setText("Need to continue to save money.");
                }

            }
        });
    }
}
