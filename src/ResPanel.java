import javax.swing.*;
import java.awt.*;

public class ResPanel extends JPanel {
    public static JLabel display1;
    public static JLabel display2;
    public ResPanel(){

        display1=new JLabel("0",SwingConstants.RIGHT);
        display2=new JLabel("0",SwingConstants.RIGHT);
        display1.setFont(new Font("黑体",Font.BOLD,25));
        display2.setFont(new Font("黑体",Font.BOLD,40));
        //display1.setSize(400,100);
        display1.setPreferredSize(new Dimension(400,60));
        display2.setPreferredSize(new Dimension(400,80));
        //display1.setBackground(Color.BLUE);
        setLayout(new BorderLayout());
        add(display1,BorderLayout.NORTH);
        add(display2,BorderLayout.CENTER);
    }
}
