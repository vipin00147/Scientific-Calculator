import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.*;
class Calculator implements ActionListener{
    JMenuBar br;
    JMenu Help,Edit,View;
    JTextField t1;
    JButton p_age,root,square,op_x,CE,C,X,div,b1,b2,b3,b4,b5,b6,b7,b8,b9,mul,add,b0,add_min,min,dec,equal,on_off;
    
    int opt = 0, flag1 = 1, flag=1, i=0;
    double n1 , n2 , n3 , total=0;
    String oper = "";
    void MenuBar() {
        
    }
    Calculator() {
        JFrame f = new JFrame("Calculator");
        br = new JMenuBar();
         
        Help = new JMenu("Help");
        Edit = new JMenu("Edit");
        View = new JMenu("View");
        br.add(Edit);
        br.add(View);
        br.add(Help);
        f.setJMenuBar(br);
        
        t1 = new JTextField("");
        t1.setFont(new Font("Arial",Font.PLAIN,20));
        t1.setBounds(10,10,221,30);
        f.add(t1);
        //1st Row...
        p_age =new JButton("%");
        p_age.setBounds(10,40,55,30);
        f.add(p_age);
        root = new JButton("√");
        root.setBounds(65,40,55,30);
        f.add(root);
        square = new JButton("x2");
        square.setBounds(120,40,55,30);
        f.add(square);
        op_x = new JButton("1/x");
        op_x.setBounds(175,40,55,30);
        f.add(op_x);
       //2nd Row... 
        CE = new JButton("CE");
        CE.setBounds(10, 70, 55, 30);
        f.add(CE);
        C = new JButton("C");
        C.setBounds(65, 70, 55, 30);
        f.add(C);
        X = new JButton("X");
        X.setBounds(120, 70, 55, 30);
        f.add(X);
        div = new JButton("÷");
        div.setBounds(175, 70, 55, 30);
        f.add(div);
        //3rd Row...
        b7 = new JButton("7");
        b7.setBounds(10, 100, 55, 30);
        f.add(b7);
        b8 = new JButton("8");
        b8.setBounds(65, 100, 55, 30);
        f.add(b8);
        b9 = new JButton("9");
        b9.setBounds(120, 100, 55, 30);
        f.add(b9);
        mul = new JButton("*");
        mul.setBounds(175, 100, 55, 30);
        f.add(mul);
        //4th Row...
        b4 = new JButton("4");
        b4.setBounds(10, 130, 55, 30);
        f.add(b4);
        b5 = new JButton("5");
        b5.setBounds(65, 130, 55, 30);
        f.add(b5);
        b6 = new JButton("6");
        b6.setBounds(120, 130, 55, 30);
        f.add(b6);
        min = new JButton("-");
        min.setBounds(175, 130, 55, 30);
        f.add(min);
        //5th Row...
        b1 = new JButton("1");
        b1.setBounds(10, 160, 55, 30);
        f.add(b1);
        b2 = new JButton("2");
        b2.setBounds(65, 160, 55, 30);
        f.add(b2);
        b3 = new JButton("3");
        b3.setBounds(120, 160, 55, 30);
        f.add(b3);
        add = new JButton("+");
        add.setBounds(175, 160, 55, 30);
        f.add(add);
        //6th Row...
        add_min = new JButton("±");
        add_min.setBounds(10, 190, 55, 30);
        f.add(add_min);
        b0 = new JButton("0");
        b0.setBounds(65, 190, 55, 30);
        f.add(b0);
        dec = new JButton(".");
        dec.setBounds(120, 190, 55, 30);
        f.add(dec);
        equal = new JButton("=");
        equal.setBounds(175, 190, 55, 30);
        f.add(equal);
        on_off = new JButton("On");
        on_off.setBounds(65, 220,110 ,30);
        f.add(on_off);   
        
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
        f.setLayout(null);
        f.setSize(250,310);
        f.setVisible(true);
    }
    void add_actionlistner() {
        p_age.addActionListener(this);
        root.addActionListener(this);
        square.addActionListener(this);
        op_x.addActionListener(this);
        CE.addActionListener(this);
        C.addActionListener(this);
        X.addActionListener(this);
        div.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add_min.addActionListener(this);
        min.addActionListener(this);
        dec.addActionListener(this);
        equal.addActionListener(this);
        mul.addActionListener(this);
        add.addActionListener(this);
        on_off.addActionListener(this);
    }
        @Override
    public void actionPerformed(ActionEvent obj) {
        String str = "" , txt = "";
        if(i == 0) {
            
        }
        
        if(obj.getSource() == b0) {
            str = String.valueOf(t1.getText())+0;
            txt = txt + str;
            str = "";
            t1.setText(txt);
         }
        else if(obj.getSource() == b1) {
            str = String.valueOf(t1.getText())+1;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b2) {
            str = String.valueOf(t1.getText())+2;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b3) {
            str = String.valueOf(t1.getText())+3;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b4) {
            str = String.valueOf(t1.getText())+4;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b5) {
            str = String.valueOf(t1.getText())+5;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b6) {
            str = String.valueOf(t1.getText())+6;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b7) {
            str = String.valueOf(t1.getText())+7;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b8) {
            str = String.valueOf(t1.getText())+8;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == b9) {
            str = String.valueOf(t1.getText())+9;
            txt = txt + str;
            str = "";
            t1.setText(txt);
        }
        else if(obj.getSource() == add) {
           opt = 1;
            if(flag1 == 1) {
                oper = String.valueOf(t1.getText());
                n1 =  Double.parseDouble(oper);
                t1.setText("");
                total = n1;
                flag1++;
            } 
            else {
                oper = String.valueOf(t1.getText());
                n3 =  Double.parseDouble(oper);
                total = n1 + n3;
                n1 = total;
                t1.setText("");
                flag1++;
            }
        }
        else if(obj.getSource() == min) {
            opt = 2;
            if(flag1 == 1) {
                oper = String.valueOf(t1.getText());
                n1 =  Double.parseDouble(oper);
                t1.setText("");
                total = n1;
                flag1++;
            } 
            else {
                oper = String.valueOf(t1.getText());
                n3 =  Double.parseDouble(oper);
                total = n1 - n3;
                n1 = total;
                t1.setText("");
                flag1++;
            }
        }
        else if(obj.getSource() == mul) {
            opt = 3;
            if(flag1 == 1) {
                oper = String.valueOf(t1.getText());
                n1 =  Double.parseDouble(oper);
                t1.setText("");
                total = n1;
                flag1++;
            } 
            else {
                oper = String.valueOf(t1.getText());
                n3 =  Double.parseDouble(oper);
                total = n1 * n3;
                n1 = total;
                t1.setText("");
                flag1++;
            }
        }
        else if(obj.getSource() == div) {
            opt = 4;
            if(flag1 == 1) {
                oper = String.valueOf(t1.getText());
                n1 =  Double.parseDouble(oper);
                t1.setText("");
                total = n1;
                flag1++;
            } 
            else {
                oper = String.valueOf(t1.getText());
                n3 =  Double.parseDouble(oper);
                total = n1 / n3;
                n1 = total;
                t1.setText("");
                flag1++;
            }
        }
        else if(obj.getSource() == p_age) {
            oper = String.valueOf(t1.getText());
            n2 =  Double.parseDouble(oper);
            t1.setText("");
            
            total=(n1*n2)/100;
            oper = String.valueOf("")+total;
            t1.setText(oper);
        }
        else if(obj.getSource() == root) {
            oper = String.valueOf(t1.getText());
            n1 =  Double.parseDouble(oper);
            t1.setText("");
            total=Math.sqrt(n1);
            oper = String.valueOf("")+total;
            t1.setText(oper);
        }
        else if(obj.getSource() == square) {
            oper = String.valueOf(t1.getText());
            n1 =  Double.parseDouble(oper);
            t1.setText("");
            total=n1*n1;
            oper = String.valueOf("")+total;
            t1.setText(oper);
        }
        else if(obj.getSource() == op_x) {
            oper = String.valueOf(t1.getText());
            n1 =  Double.parseDouble(oper);
            t1.setText("");
            total=1/n1;
            oper = String.valueOf("")+total;
            t1.setText(oper);
        }
        else if(obj.getSource() == CE || obj.getSource() == C) {
            t1.setText("");
        }
        else if(obj.getSource() == X) {
            int flag=1;
            oper = String.valueOf(t1.getText());
            int len = oper.length();
            if(len >= 1) {
               oper = oper.substring(0,len-flag);
               flag++;
            }
            t1.setText(oper);
        }
        else if(obj.getSource() == dec) {
            int len;
            oper = String.valueOf(t1.getText());
            len=oper.length();
            if(flag == 1 && len >= 1){
                oper = oper + ".";
                t1.setText(oper);
                flag++;
            }
        }
        else if(obj.getSource() == add_min) {
            oper = String.valueOf(t1.getText());
            n1=Double.parseDouble(oper);
            n1=-n1;
            oper = String.valueOf("")+n1;
            t1.setText(oper);
        }
        else if(obj.getSource() == on_off) {
            
            if(i==0){
                on_off.setText("Off");
                on_off.setBackground(Color.RED);
                p_age.setEnabled(false);
                root.setEnabled(false);
                square.setEnabled(false);
                op_x.setEnabled(false);
                CE.setEnabled(false);
                C.setEnabled(false);
                X.setEnabled(false);
                div.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b0.setEnabled(false);
                add_min.setEnabled(false);
                min.setEnabled(false);
                dec.setEnabled(false);
                equal.setEnabled(false);
                mul.setEnabled(false);
                add.setEnabled(false);
                t1.setEnabled(false);
                i++;
            }
            else if(i==1) {
                on_off.setText("On");
                on_off.setBackground(Color.GREEN);
                p_age.setEnabled(true);
                root.setEnabled(true);
                square.setEnabled(true);
                op_x.setEnabled(true);
                CE.setEnabled(true);
                C.setEnabled(true);
                X.setEnabled(true);
                div.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b0.setEnabled(true);
                add_min.setEnabled(true);
                min.setEnabled(true);
                dec.setEnabled(true);
                equal.setEnabled(true);
                mul.setEnabled(true);
                add.setEnabled(true);
                t1.setEnabled(true);
                i--; 
            }
       }
        else if(obj.getSource() == equal) {
            switch(opt){
                case 1:{
                    oper = String.valueOf(t1.getText());
                    n2 =  Double.parseDouble(oper);
                    t1.setText("");
                    flag1 = 1;
                    addition();
                    break; 
                }  
                case 2:{
                    oper = String.valueOf(t1.getText());
                    n2 =  Double.parseDouble(oper);
                    t1.setText("");
                    flag1 = 1;
                    sub();
                    break;
                }
                case 3: {
                    oper = String.valueOf(t1.getText());
                    n2 =  Double.parseDouble(oper);
                    t1.setText("");
                    flag1 = 1;
                    mul();
                    break;
                }
                case 4:{
                    oper = String.valueOf(t1.getText());
                    n2 =  Double.parseDouble(oper);
                    t1.setText("");
                    flag1 = 1;
                    div();
                    break; 
                }           
            }
        }       
}
    void addition() {
        total = n1 + n2;
        oper = String.valueOf("")+total;
        t1.setText(oper);
    }
    void sub() {
        total = n1 - n2;
        oper = String.valueOf("")+total;
        t1.setText(oper);
    }
    void mul() {
        total = n1 * n2;
        oper = String.valueOf("")+total;
        t1.setText(oper);
    }
    void div() {
        if(n1>0 && n2>0){
            total = n1 / n2;
            oper = String.valueOf("")+total;
            t1.setText(oper);
        }
        else if(n1 >= 0 && n2 == 0) {
            t1.setText("=Can't divide by Zero");
        }         
    }
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        obj.add_actionlistner();
    }
}