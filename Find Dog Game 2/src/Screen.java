import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Screen extends JFrame {
    public  Screen() {

        final int[][] maps = {
                {0 , 0, 0, 0},
                {0 , 0, 0, 0},
                {0 , 0, 0, 0},
                {0 , 0, 0, 0}
        };
        Random rn = new Random();
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                maps[i][j] = rn.nextInt(2) + 1;
            }
        }

        setLayout(new GridLayout(4, 4));
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                JButton button = new JButton();
                button.setName(Integer.toString(maps[i][j]));
                add(button);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(button.getName().equals("1")){
                            button.setText("#");
                        }else {
                            button.setText("dog");
                        }
                    }
                });
            }
        }

        setVisible(true);
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

    }
}
