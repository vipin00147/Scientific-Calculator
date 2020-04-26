import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import static java.lang.Math.*;

import javax.swing.*;
class Calculator implements ActionListener{
    JMenuBar br;
    JMenu Help,Edit,View;
    JTextField t1,t2,t3,t4;
    JButton p_age,root,square,op_x,CE,C,X,div,b1,b2,b3,b4,b5,b6,b7;
    JButton b8,b9,mul,add,b0,add_min,min,dec,equal,calc_per;
    JButton sin,cos,tan,log,fact,pie,split;
    JMenuItem i1,i2,i3,i4,i5;
    JLabel l1,l2,l3,per,Total,result;
    int opt = 0, flag1 = 1, flag=1, i=0;
    double n1 , n2 , n3 , total=0;
    String oper = "",oper2 = "";
    JFrame f = new JFrame("Calculator");
    Calculator() {
        br = new JMenuBar();
        Edit = new JMenu("Select Type");
        br.add(Edit);
        i1 = new JMenuItem("Scientific");
        i2 = new JMenuItem("Exit");
        i3 = new JMenuItem("Standard");
        i4 = new JMenuItem("Split bill");
        i5 = new JMenuItem("Percentage");
        Edit.add(i3);
        Edit.add(i1);
        Edit.add(i4);
        Edit.add(i5);
        Edit.add(i2);
        
        f.setJMenuBar(br);
        
        t1 = new JTextField(""); 
        t1.setBounds(10,10,221,30);
        t1.setFont(new Font("Arial",Font.PLAIN,20));
        t1.setHorizontalAlignment(JTextField.RIGHT);
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
        X = new JButton("←");
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
        calc_per = new JButton("=");
        equal.setBounds(175, 190, 55, 30);
        f.add(equal);
        sin = new JButton("sin");
        sin.setBounds(240, 40, 55 ,30);
        cos = new JButton("cos");
        cos.setBounds(295, 40, 55, 30);
        tan = new JButton("tan");
        tan.setBounds(240, 70, 55, 30);
        log = new JButton("log");
        log.setBounds(295, 70, 55, 30);
        fact =  new JButton("x!");
        fact.setBounds(240, 100, 55, 30);
        pie = new JButton("π");
        pie.setBounds(295, 100, 55, 30);
        l1 = new JLabel("Amount : ");
        l1.setBounds(10, 70, 100,20);
        l2 = new JLabel("People : ");
        l2.setBounds(10, 100, 100, 20);
        t2 = new JTextField("");
        t2.setBounds(70, 70, 100, 20);
        t3 = new JTextField("");
        t3.setBounds(70, 100, 100, 20);
        t4 = new JTextField("");
                
        split = new JButton("Split");
        split.setBounds(80, 150, 70, 30);
        per = new JLabel("Percentage(%)");
        Total = new JLabel("Total");
        result = new JLabel("Result");
        l3 = new JLabel("Net Amount :");
        l3.setBounds(10, 75, 100, 20);
        f.add(l3);
        
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  
        f.setLayout(null);
        f.setSize(250,290);
        f.setVisible(true);
    }
         
    void add_actionlistner() {
        calc_per.addActionListener(this);
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
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        log.addActionListener(this);
        fact.addActionListener(this);
        pie.addActionListener(this);
        split.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
    }
        @Override
    public void actionPerformed(ActionEvent obj) {
        String str = "" , txt = "";
      
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
        else if(obj.getSource() == sin) {
            oper = t1.getText();
            double n = Double.parseDouble(oper);
            double rad = toRadians(n);
            double val = sin(rad);
            oper = String.valueOf("")+val;
            t1.setText(oper);
        }
        else if(obj.getSource() == cos) {
            oper = t1.getText();
            double n = Double.parseDouble(oper);
            double rad = toRadians(n);
            double val = cos(rad);
            val = round(val);
            oper = String.valueOf("")+val;
            t1.setText(oper);
        }
        else if(obj.getSource() == tan) {
            oper = t1.getText();
            double n = Double.parseDouble(oper);
            double rad = toRadians(n);
            double val = tan(rad);
            val = round(val);
            oper = String.valueOf("")+val;
            t1.setText(oper);
        }
        else if(obj.getSource() == log) {
            double n;
            oper = t1.getText();
            n = Double.parseDouble(oper);
            double l =  log(n);
            oper = String.valueOf("")+l;
            t1.setText(oper);
        }
        else if(obj.getSource() == fact) {
            int fact=1;
            double n;
            oper = t1.getText();
            n = Double.parseDouble(oper);
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            oper = String.valueOf("")+fact;
            t1.setText(oper);
        }
        else if(obj.getSource() == pie) {
            t1.setText("3.141592653589793238");
        }
        else if(obj.getSource() == split) {
            double num1,num2;
            oper2 = t2.getText();
            oper = t3.getText();
            num1 = Double.parseDouble(oper2);
            num2 = Double.parseDouble(oper);
            oper = String.valueOf("")+num1/num2;
            t1.setText(oper);
        }
        else if(obj.getSource() == i1) {
            f.setSize(370, 290);
            t1.setText("");
            t1.setBounds(10,10,340,30);
            f.add(sin); f.add(cos); f.add(tan);
            f.add(log); f.add(fact); f.add(pie);
            C.setBounds(65, 70, 55, 30);       
            X.setBounds(120, 70, 55, 30);
            dec.setBounds(120, 190, 55, 30);
            t1.setVisible(true);
            t2.setVisible(false);
            t3.setVisible(false);
            X.setVisible(true);
            C.setVisible(true);
            Total.setVisible(false);
            per.setVisible(false);
            result.setVisible(false);
            p_age.setVisible(true);
            root.setVisible(true);
            square.setVisible(true);
            op_x.setVisible(true);
            CE.setVisible(true);
            div.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            mul.setVisible(true);
            add.setVisible(true);
            b0.setVisible(true);
            add_min.setVisible(true);
            min.setVisible(true);
            dec.setVisible(true);
            equal.setVisible(true);
        }
        else if(obj.getSource() == i3) {
            f.setSize(245,290);
            t1.setText("");
            t1.setBounds(10,10,221,30);
            C.setBounds(65, 70, 55, 30);       
            X.setBounds(120, 70, 55, 30);
            dec.setBounds(120, 190, 55, 30);
            t1.setVisible(true);
            X.setVisible(true);
            C.setVisible(true);
            Total.setVisible(false);
            per.setVisible(false);
            calc_per.setVisible(false);
            result.setVisible(false);
            p_age.setVisible(true);
            root.setVisible(true);
            square.setVisible(true);
            op_x.setVisible(true);
            CE.setVisible(true);
            div.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            mul.setVisible(true);
            add.setVisible(true);
            b0.setVisible(true);
            add_min.setVisible(true);
            min.setVisible(true);
            dec.setVisible(true);
            equal.setVisible(true);
        }
        else if(obj.getSource() == i2) {
           System.exit(0);
        }
        else if(obj.getSource() == i4) {
            t1.setBounds(10,10,221,30);
            f.setSize(245,290);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            Total.setVisible(false);
            l3.setVisible(false);
            per.setVisible(false);
            result.setVisible(false);
            l1.setVisible(true);
            l2.setVisible(true);
            t1.setVisible(true);
            C.setVisible(false);
            X.setVisible(false);
            t2.setVisible(true);
            t3.setVisible(true);
            split.setVisible(true);
            p_age.setVisible(false);
            root.setVisible(false);
            square.setVisible(false);
            op_x.setVisible(false);
            CE.setVisible(false);
            calc_per.setVisible(false);
            div.setVisible(false);
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            t4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            mul.setVisible(false);
            add.setVisible(false);
            b0.setVisible(false);
            add_min.setVisible(false);
            min.setVisible(false);
            dec.setVisible(false);
            equal.setVisible(false);
            t2.setBounds(70, 70, 100, 20);
            t3.setBounds(70, 100, 100, 20);
            
            f.add(l1);
            f.add(t2);
            f.add(l2);
            f.add(t3);
            f.add(split);
        }
        else if(obj.getSource() == calc_per) {
            Double amount;
            oper = t1.getText();
            oper2 = t2.getText();
            n1 = Double.parseDouble(oper);
            n2 = Double.parseDouble(oper2);
            total = (n1/100)*n2;
            amount = n2 - total;
            oper = String.valueOf("")+total;
            t3.setText(oper);
            str = String.valueOf("")+amount;
            t4.setText(str);         
        }
        else if(obj.getSource() == i5) {
            f.setSize(245,290);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            l3.setVisible(true);
            p_age.setVisible(false);
            root.setVisible(false);
            square.setVisible(false);
            op_x.setVisible(false);
            CE.setVisible(false);
            div.setVisible(false);
            mul.setVisible(false);
            add.setVisible(false);
            add_min.setVisible(false);
            min.setVisible(false);
            equal.setVisible(false);
            split.setVisible(false);
            Total.setVisible(true);
            per.setVisible(true);
            result.setVisible(true);
            C.setVisible(true);
            X.setVisible(true);
            l1.setVisible(false);
            l2.setVisible(false);
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            split.setVisible(true);
            calc_per.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            b0.setVisible(true);
            dec.setVisible(true);
          
            per.setBounds(10, 5, 100, 15);
            Total.setBounds(10, 30, 100, 15);
            result.setBounds(10, 55, 100, 15);
            calc_per.setBounds(175, 190, 55, 30);
            C.setBounds(175, 130, 55, 30);
            X.setBounds(175, 160, 55, 30);
            dec.setBounds(175, 100, 55, 30);
            f.add(t4);
            f.add(per);
            f.add(Total);
            f.add(result);
            f.add(calc_per);
            f.add(dec);
            t1.setBounds(130, 5, 100, 20);
            t2.setBounds(130, 30, 100, 20);
            t3.setBounds(130, 55, 100, 20);
            t4.setBounds(130, 80, 100, 20);
            t2.setFont(new Font("Arial",Font.PLAIN,20));
            t3.setFont(new Font("Arial",Font.PLAIN,20));
            t4.setFont(new Font("Arial",Font.PLAIN,20));
            t2.setHorizontalAlignment(JTextField.RIGHT);
            t3.setHorizontalAlignment(JTextField.RIGHT);
            t4.setHorizontalAlignment(JTextField.RIGHT);
            f.add(t1);
            f.add(t2);
            f.add(t3);
            
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
