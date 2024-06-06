
package bank.server;
import javax.swing.*;
import java.awt.*;// package for image 
import java.awt.event.*;
public class Login extends JFrame  implements ActionListener {//JFrame implements ActionListener : is use for  implementing an make it action full 

    Login(){
           setTitle("ATM");
           setLayout(null);// for adjesting the icon with the permition of java 
               
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/logo.jpg"));//for giving path and initalizing it 
        Image  i2 =i1.getImage().getScaledInstance(100, 100, 100);// for giving the sive of a image 
        ImageIcon i3 =new ImageIcon(i2) ; // for assining the i1 value to i3 by adding it in i1,i2,i3;      
       
        JLabel label = new JLabel(i3);  //obj 
        label.setBounds(75,15,100,100); //for proper sidding (corner of a screen)
        add(label);// for adding  the label or bounds object
       
        
        JLabel text = new JLabel("Welcome to ATM"); // use for seting the  text 
        text.setFont(new Font("Osword",Font.BOLD,32 ));
        text.setBounds(250, 40, 290, 40);//initalizing the value of the text
        add(text); //for adding the obj of name text  
       
                
        
         JLabel cardno = new JLabel("Card No:-"); // use for seting the  text 
        cardno.setFont(new Font("Osword",Font.BOLD,29 ));
        cardno.setBounds(120,150,200, 40);//initalizing the value of the text
         add(cardno); //for adding the obj of name text  
         
           JTextField cardTextField =new JTextField();
           cardTextField.setBounds(300,153,228,30);
           add(cardTextField);
         
         
         JLabel pin = new JLabel("  PIN:- "); // use for seting the  text 
         pin.setFont(new Font("Osword",Font.BOLD,32 ));
         pin.setBounds(110,220, 400, 40);//initalizing the value of the text
         add(pin); //for adding the obj of name text  
        
         
           JTextField pinTextField =new JTextField();
           pinTextField.setBounds(300,226,228,30);
           add(pinTextField);
        
             JButton login =new JButton ("SING IN");
             login.setBounds(300,300,100,30);
             login.setBackground(Color.black);// use for seating the bagroun collor of the button
             login.setForeground(Color.WHITE);//use for setting the collor of the naame of the button
             login.addActionListener(this);//is use to add the  action list 
             add(login);
         
             JButton clear =new JButton ("  clear ");
             clear.setBounds(430,300,100,30);
             clear.setBackground(Color.black);// use for seating the bagroun collor of the button
             clear.setForeground(Color.WHITE);//use for setting the collor of the naame of the button
             clear.addActionListener(this);//is use to add the  action list 
             add(clear);
           
             
              JButton singup =new JButton ("  SING UP ");
             singup.setBounds(300,340,230,30);
             singup.setBackground(Color.blue);// use for seating the bagroun collor of the button
             singup.setForeground(Color.WHITE);//use for setting the collor of the naame of the button
             singup.addActionListener(this);//is use to add the  action list 
             
      getContentPane().setBackground(Color.white);
      
        setSize(800, 480);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        
        
    }
    public static void main(String args[]) {
        
           new Login();    
    }
}
