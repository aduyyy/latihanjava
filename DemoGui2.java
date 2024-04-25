
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usER
 */
public class DemoGui2 extends JFrame{
    JPanel jp=new JPanel();
    JTextField jt=new JTextField();
    JLabel jl=new JLabel("contoh label");
    
    public DemoGui2(){
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jl.setBounds(120,20,80,25);
    }

    public static void main(String[]args){
        DemoGui2 demo2=new DemoGui2();
        
        demo2.setTitle("form dengan label dan textfield");
        demo2.setSize(300,300);
        demo2.setVisible(true);
        
    }
}

