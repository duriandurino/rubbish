import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JavaGui extends JFrame implements ActionListener{
    private JFrame f;
    private JLabel l;
    
    public JavaGui(){
        f = new JFrame();
        l = new JLabel();
        
        l.setText("dgsfhfjhdgjfhjfh");
        l.setForeground(Color.black);
        l.setFont(new Font("Times New Roman",Font.BOLD,50));
        l.setBounds(50,50,50,50);
        l.setVisible(true);
        
        f.add(l);
        f.setSize(800,600);
        setWindow();
    }
    
    public void setWindow(){
        f.getContentPane().setBackground(new Color(242, 150, 63));
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void close(){
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public static void main(String[] args){
        new JavaGui();
    }
}
