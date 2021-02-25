import javax.swing.*;
import java.awt.*;

public class CalPanel extends JPanel {
    //public static boolean flag = true;
    public static boolean start=true;

    public CalPanel(){
        setLayout(new BorderLayout());
        ResPanel resPanel1 = new ResPanel();
       //resPanel1.setSize(400,150);
        BtPanel btPanel = new BtPanel();
      // btPanel.setSize(400,500);
        add(resPanel1,BorderLayout.NORTH);
        add(btPanel,BorderLayout.CENTER);
        //add(resPanel1);
       // add(btPanel);

    }
}
