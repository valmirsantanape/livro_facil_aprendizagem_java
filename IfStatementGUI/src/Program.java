import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 2));
        JLabel lbl_input = new JLabel("Please input your scode: ");
        JLabel lbl_conceito = new JLabel();
        JTextField textField = new JTextField();
        JButton submit = new JButton("Submit");

        frame.add(lbl_input);
        frame.add(lbl_conceito);
        frame.add(textField);
        frame.add(submit);

        frame.setSize(400, 100);
        frame.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int score = Integer.parseInt(textField.getText());
                if (score == 5) {
                    lbl_conceito.setText("Excellet!");
                }else if (score == 4) {
                    lbl_conceito.setText("Good!");

                } else {
                    lbl_conceito.setText("Need to catch up!");
                }
            }
        });


    }
}
