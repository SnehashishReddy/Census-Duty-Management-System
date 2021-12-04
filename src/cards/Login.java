package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel implements ActionListener{
	String Type;
	JPanel panel = new JPanel();
	ImageIcon i = new ImageIcon(Master.class.getResource("/cards/Census-of-India-Recruitment.jpg"));
	Image scaleImage = i.getImage().getScaledInstance(28, 28,Image.SCALE_DEFAULT);
	JLabel label = new JLabel(i,SwingConstants.CENTER);
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("RESET");
    JCheckBox showPassword=new JCheckBox(" Show Password");
    Font font = new Font("arial",Font.BOLD,33);
    public Login(String str) {
    	Type = str;
    	setBackground(Color.white);
    	userLabel.setBounds(50,150,100,30);
        passwordLabel.setBounds(50,220,100,30);
        userTextField.setBounds(150,150,150,30);
        passwordField.setBounds(150,220,150,30);
        showPassword.setBounds(150,250,150,30);
        loginButton.setBounds(50,300,100,30);
        resetButton.setBounds(200,300,100,30);
    	userLabel.setPreferredSize(new Dimension(100,30));
        passwordLabel.setPreferredSize(new Dimension(100,30));
        userTextField.setPreferredSize(new Dimension(130,20));
        passwordField.setPreferredSize(new Dimension(130,20));
        showPassword.setPreferredSize(new Dimension(150,30));
        loginButton.setPreferredSize(new Dimension(100,30));
        resetButton.setPreferredSize(new Dimension(100,30));
        add(label);
        showPassword.setBackground(Color.white);
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(showPassword);
        panel.add(loginButton);
        panel.add(resetButton);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setPreferredSize(new Dimension(250,200));
        panel.setBackground(Color.white);
        panel.setFont(font);
        add(panel);
        
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	Object source = e.getSource();
    	if(source == resetButton) {
    		Master.goTo("Cover Page");
    	}
    	else if(source == loginButton) {
    		if(Type == "TD") {
    			Master.goTo("Teacher Dashboard");
    		}
    		else if(Type == "MD") {
    			Master.goTo("Manager Dashboard");
    		}
    	}
    }
}
