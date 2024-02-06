import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        int [][] maps = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        frame.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < maps.length; i++){
            for (int j = 0; j < maps[i].length; j++){
                JButton button = new JButton();
                button.setName(Integer.toString(maps[i][j]));
                frame.add(button);
            }
        }
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
