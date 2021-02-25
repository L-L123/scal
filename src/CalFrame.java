import javax.swing.*;
import java.awt.*;

public class CalFrame extends JFrame {
    public CalFrame(){
        setTitle("计算器");
        setSize(400,650);
        CalPanel calPanel=new CalPanel();
        getContentPane().add(calPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
