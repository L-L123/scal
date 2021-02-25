import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

public class Listener implements ActionListener {



    public void actionPerformed(ActionEvent e) {
        //boolean flag=true;

        String text1 = ResPanel.display1.getText();
        String text2 = ResPanel.display2.getText();

        if (CalPanel.start) {
            ResPanel.display1.setText("");
            ResPanel.display2.setText("");
            CalPanel.start = false;

            text1 = ResPanel.display1.getText();
            text2 = ResPanel.display2.getText();
        }
        if (e.getActionCommand().equals("0")) {
            ResPanel.display1.setText("");
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("1")) {
            ResPanel.display1.setText("");
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);


        }
        else if (e.getActionCommand().equals("2")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);

        }
        else if (e.getActionCommand().equals("3")) {
            ResPanel.display1.setText("");
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("4")) {
            ResPanel.display1.setText("");
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);

        }
        else if (e.getActionCommand().equals("5")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("6")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("7")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("8")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }
        else if (e.getActionCommand().equals("9")) {
            text1 += e.getActionCommand();
            ResPanel.display1.setText(text1);
            text2 += e.getActionCommand();
            ResPanel.display2.setText(text2);
        }

        if(e.getActionCommand().equals("+")){
            text1 +=e.getActionCommand();
            ResPanel.display1.setText(text1);
            ResPanel.display2.setText("");
        }
        if(e.getActionCommand().equals("-")){
            text1 +=e.getActionCommand();
            ResPanel.display1.setText(text1);
            ResPanel.display2.setText("");
        }
        if(e.getActionCommand().equals("*")){
            text1 +=e.getActionCommand();
            ResPanel.display1.setText(text1);
            ResPanel.display2.setText("");
        }
        if(e.getActionCommand().equals("/")){
            text1 +=e.getActionCommand();
            ResPanel.display1.setText(text1);
            ResPanel.display2.setText("");
        }
        if(e.getActionCommand().equals("C")){
            ResPanel.display1.setText("");
            ResPanel.display2.setText("0");
        }
        if(e.getActionCommand().equals("CE")){
            String s = text2;
            if(s.length()>0){
                ResPanel.display2.setText(s.substring(0,s.length()-1));
            }
        }
        if(e.getActionCommand().equals("%")){
            text1 +=e.getActionCommand();
            ResPanel.display1.setText(text1);
            ResPanel.display2.setText("");
        }
        if(e.getActionCommand().equals("=")){
            System.out.println(text1);
            if(ResPanel.display1.getText()!=null){
                text1 +=e.getActionCommand();
                ResPanel.display1.setText(text1);
                double calculate = calculate(ResPanel.display1);
                text2 =""+calculate;
                ResPanel.display2.setText(text2);
                CalPanel.start=true;

            }
        }

    }


    private double calculate(JLabel tf){
        Stack<Double> numstack = new Stack<>();
        Stack<Character> charstack = new Stack<>();
        //计算的标志
        boolean flag = false;
        //gettext
        String str = tf.getText();
        int begin = 0;
        int end = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                end = i;
                numstack.push(Double.parseDouble(str.substring(begin,end)));
                begin = end+1;
                if(flag==true){
                    double second = numstack.pop();
                    double first = numstack.pop();
                    char opt = charstack.pop();
                    double result = operation(first,second,opt);
                    numstack.push(result);

                }
                if(!charstack.empty()){
                    if(level(ch,charstack.get(charstack.size()-1))){
                        flag=true;
                    }
                }
                //push stack
                if(str.charAt(i)!='='){
                    charstack.push(ch);
                }
            }
        }
        //finish !start to calculator
        while(!numstack.empty()&&!charstack.empty()){
            //
            double first = numstack.remove(0);
            double second = numstack.remove(0);
            char opt = charstack.remove(0);
            double result = operation(first,second,opt);
            numstack.add(0,result);

        }
        return numstack.pop();

    }

    //calculator
    private  double operation(double first,double second,char opt){
        switch (opt){
            case '+':
                return first+second;
            case '-':
                return first-second;
            case '*':
                return first*second;
            case '/':
                return first / second;
            //case'%':
              //  return first/100;

        }
        return -1;
    }
    private  boolean level(char ch,Character chara){
        switch (ch){
            case '+':
                return false;
            case '-':
                return false;
            case '*':
                if(chara=='+'||chara=='-'){
                    return true;
                }

            case '/':
                if(chara=='+'||chara=='-'){
                    return true;
                }

        }
        return false;
    }
}
