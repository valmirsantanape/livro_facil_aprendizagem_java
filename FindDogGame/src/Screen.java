import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    public Screen(){

        int [][] maps = {
                {1,1,1,1},
                {1,2,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        setLayout(new GridLayout(4, 4));

        for (int i = 0; i < maps.length; i++){
            for (int j = 0; j < maps[i].length; j++) {
                final JButton button = new JButton();
                button.setName(Integer.toString(maps[i][j]));
                add(button);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(button.getName().equals("1")){
                            button.setText("#");
                        }else{
                            button.setText("Dog");
                        }
                    }
                });

            }
        }


        setSize(250, 250);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false); //Desabilita opções de maximizar tela
        setLocationRelativeTo(null); //App inicializa no meio da tela
    }
}
