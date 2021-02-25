import javax.swing.*;
import java.awt.*;

public class BtPanel extends JPanel {

    JButton[] button=new JButton[10];
    public BtPanel(){
        //setSize(400,500);
        setLayout(new GridLayout(5,4));
        //创建功能键
        JButton butadd=new JButton("+");
        JButton butsub=new JButton("-");
        JButton butmul=new JButton("*");
        JButton butdiv=new JButton("/");
        JButton butequ=new JButton("=");
        JButton butdel=new JButton("CE");
        JButton butpoi=new JButton(".");
        JButton butc = new JButton("C");
        JButton butper=new JButton("%");
        JButton butne = new JButton("+/-");
        //
        butadd.setFont(new Font("黑体",Font.BOLD,15));
        butsub.setFont(new Font("黑体",Font.BOLD,15));
        butmul.setFont(new Font("黑体",Font.BOLD,15));
        butdiv.setFont(new Font("黑体",Font.BOLD,15));
        butequ.setFont(new Font("黑体",Font.BOLD,15));
        butdel.setFont(new Font("黑体",Font.BOLD,15));
        butpoi.setFont(new Font("黑体",Font.BOLD,15));
        butc.setFont(new Font("黑体",Font.BOLD,15));
        butper.setFont(new Font("黑体",Font.BOLD,15));
        butne.setFont(new Font("黑体",Font.BOLD,15));

        butadd.setBackground(Color.white) ;
        butsub.setBackground(Color.white) ;
        butmul.setBackground(Color.white) ;
        butdiv.setBackground(Color.white) ;
        butequ.setBackground(Color.white) ;
        butdel.setBackground(Color.white) ;
        butpoi.setBackground(Color.white) ;
        butc.setBackground(Color.white) ;
        butper.setBackground(Color.white) ;
        butne.setBackground(Color.white) ;
        //创建数字按钮
        for(int i=9;i>=0;i--){
            String s= i+"";
             button[i]=new JButton (s);
             button[i].setFont(new Font("黑体",Font.BOLD,15));
             button[i].setBackground(Color.white) ;
             button[i].addActionListener(new Listener());

        }
        //添加到面板
        add(butper);
        add(butdiv);
        add(butdel);
        add(butc);
        add(button[7]);
        add(button[8]);
        add(button[9]);
        add(butmul);
        add(button[4]);
        add(button[5]);
        add(button[6]);
        add(butsub);
        add(button[1]);
        add(button[2]);
        add(button[3]);
        add(butadd);
        add(butne);
        add(button[0]);
        add(butpoi);
        add(butequ);

        //添加监听事件
        butper.addActionListener(new Listener());
        butdiv.addActionListener(new Listener());
        butdel.addActionListener(new Listener());
        butc.addActionListener(new Listener());
        butmul.addActionListener(new Listener());
        butsub.addActionListener(new Listener());
        butadd.addActionListener(new Listener());
        butne.addActionListener(new Listener());
        butpoi.addActionListener(new Listener());
        butequ.addActionListener(new Listener());



    }
}
