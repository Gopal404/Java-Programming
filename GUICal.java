import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
// <applet code=GUICal.class width = 400 height=400> </applet>
public class GUICal extends Applet implements ActionListener
{
    TextField t1;
    Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,s,d,m,ee,p;
    Label p1,p2;
    int a,b,c,dd;
    public void init()
    {
        setLayout(new GridLayout(7,3));
        p1=new Label();
        add(p1);
        t1=new TextField(20);
        add(t1);
        p2=new Label();
        add(p2);
        f1=new Button("1");
        add(f1);
        f1.addActionListener(this);

        f2=new Button("2");
        add(f2);
        f2.addActionListener(this);

        f3=new Button("3");
        add(f3);
        f3.addActionListener(this);

        f4=new Button("4");
        add(f4);
        f4.addActionListener(this);

        f5=new Button("5");
        add(f5);
        f5.addActionListener(this);

        f6=new Button("6");
        add(f6);
        f6.addActionListener(this);

        f7=new Button("7");
        add(f7);
        f7.addActionListener(this);

        f8=new Button("8");
        add(f8);
        f8.addActionListener(this);

        f9=new Button("9");
        add(f9);

        f10.addActionListener(this);
        f10=new Button("0");
        add(f10);
        
        s=new Button("-");
        add(s);
        s.addActionListener(this);

        p=new Button("+");
        add(p);
        p.addActionListener(this);

        d=new Button("/");
        add(d);
        d.addActionListener(this);

        m=new Button("*");
        add(m);
        m.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==f1)
        {
            t1.setText(t1.getText()+1);
        }
        if(e.getSource()==f2)
        {
            t1.setText(t1.getText()+2);
        }
        if(e.getSource()==f3)
        {
            t1.setText(t1.getText()+3);
        }
        if(e.getSource()==f4)
        {
            t1.setText(t1.getText()+4);
        }
        if(e.getSource()==f5)
        {
            t1.setText(t1.getText()+5);
        }
        if(e.getSource()==f6)
        {
            t1.setText(t1.getText()+6);
        }
        if(e.getSource()==f7)
        {
            t1.setText(t1.getText()+7);
        }
        if(e.getSource()==f8)
        {
            t1.setText(t1.getText()+8);
        }
        if(e.getSource()==f9)
        {
            t1.setText(t1.getText()+9);
        }
        if(e.getSource()==f10)
        {
            t1.setText(t1.getText()+0);
        }

        if(e.getSource()==p)
        {
            dd=1;
            a=Integer.parseInt(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==m)
        {
            dd=2;
            a=Integer.parseInt(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==d)
        {
            dd=3;
            a=Integer.parseInt(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==s)
        {
            dd=4;
            a=Integer.parseInt(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==ee)
        {
           b=Integer.parseInt(t1.getText());
           if(dd==1)
            {
               c=a+b;
               t1.setText(""+c);
            }
            else if(dd==2)
            {
               c=a*b;
               t1.setText(""+c);
            }
            else if(dd==3)
            {
               c=a/b;
               t1.setText(""+c);
            }
            if(dd==4)
            {
               c=a-b;
               t1.setText(""+c);
            }
            else
            {
                t1.setText("Error");
            }
        }

    }
}