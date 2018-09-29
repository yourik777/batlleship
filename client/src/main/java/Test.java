import javax.swing.*;
import java.awt.*;

public class Test {
    //swing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Морской бой");
        JPanel panel = new JPanel();
        JPanel panelButton = new JPanel();
        frame.setSize(500,310);
        panelButton.setSize(100,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        panel.setLayout(new GridLayout(9,9));

        int k=1;

        JButton []buttons = new JButton[81];
        for (int i=0; i< buttons.length; i++){
           if (i>0 & i<9) {
               buttons[i] = new JButton("b"+i);
               panel.add(buttons[i]);
           } else {
               if (i == 9 || i == 18 || i==27 || i == 36 || i==45 || i == 54 || i==63 || i==72){
                   buttons[i] = new JButton("a"+k);
                   panel.add(buttons[i]);
                   k++;
               }else {
                   buttons[i] = new JButton();
                   panel.add(buttons[i]);
               }
           }


        }

        JButton editbutton = new JButton("Расставить");
        JButton gamebutton = new JButton("Играть");

        panelButton.add(editbutton);
        panelButton.add(gamebutton);

        frame.add(panel, new GridBagConstraints(0,0,0,0,0,1,GridBagConstraints.NORTH, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));
        frame.add(panelButton, new GridBagConstraints(0,0,0,0,0,1,GridBagConstraints.SOUTH, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));

        frame.setVisible(true);

    }
}
