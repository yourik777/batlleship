import javax.swing.*;
import java.awt.*;

public class Test {

    //swing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Морской бой");
        JPanel panelYou = new JPanel();
        JPanel panelEnemy = new JPanel();
        JPanel panelButton = new JPanel();
        JLabel LabelYou = new JLabel("Ваше поле");
        JLabel LabelEnemy = new JLabel("Поле Противника");
        frame.setSize(1200,400);
        panelButton.setSize(100,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(3,2));
        panelYou.setLayout(new GridLayout(9,9));
        panelEnemy.setLayout(new GridLayout(9,9));
        int k=1;
        int l=1;

        JButton []buttons = new JButton[81];
        for (int i=0; i< buttons.length; i++){
            if (i>0 & i<9) {
                buttons[i] = new JButton("b"+i);
                panelYou.add(buttons[i]);
            } else {
                if (i == 9 || i == 18 || i==27 || i == 36 || i==45 || i == 54 || i==63 || i==72){
                    buttons[i] = new JButton("a"+k);
                    panelYou.add(buttons[i]);
                    k++;
                }else {
                    buttons[i] = new JButton();
                    panelYou.add(buttons[i]);
                }
            }
        }
        for (int j=0; j< buttons.length; j++){
            if (j>0 & j<9) {
                buttons[j] = new JButton("b"+j);
                panelEnemy.add(buttons[j]);
            } else {
                if (j == 9 || j == 18 || j==27 || j == 36 || j==45 || j == 54 || j==63 || j==72){
                    buttons[j] = new JButton("a"+l);
                    panelEnemy.add(buttons[j]);
                    l++;
                }else {
                    buttons[j] = new JButton();
                    panelEnemy.add(buttons[j]);
                }
            }
        }
        JButton editbutton = new JButton("Расставить");
        JButton gamebutton = new JButton("Играть");

        panelButton.add(editbutton);
        panelButton.add(gamebutton);
        frame.add(LabelYou, new GridBagConstraints(0,0,0,0,0,1,GridBagConstraints.NONE, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));
        frame.add(LabelEnemy, new GridBagConstraints(1,0,0,0,0,1,GridBagConstraints.NONE, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));

        frame.add(panelYou, new GridBagConstraints(0,1,0,0,0,0,GridBagConstraints.NORTH, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));
        frame.add(panelEnemy, new GridBagConstraints(1,1,0,0,0,0,GridBagConstraints.NORTH, GridBagConstraints.NORTH, new Insets(0,0,0,0),0,0));
        frame.add(panelButton, new GridBagConstraints(0,2,0,0,0,1,GridBagConstraints.NONE, GridBagConstraints.REMAINDER, new Insets(0,0,0,0),0,0));
        //   frame.add(panel);
        //   frame.add(panel1);
        frame.add(panelButton);
        frame.setVisible(true);

    }
}
