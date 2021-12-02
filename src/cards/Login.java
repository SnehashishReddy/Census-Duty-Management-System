package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel {
    public Login() {
    	JPanel panel = new JPanel();
    	ImageIcon i = new ImageIcon(Master.class.getResource("/cards/logo.png"));
    	JLabel label = new JLabel(i,SwingConstants.HORIZONTAL);
        JButton nextButton = new JButton("View Stats");
        JButton TButton = new JButton("Teacher Dashboard Login");
        JButton MButton = new JButton("Manager Dashboard Login");
        
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Object source = e.getSource();
            	if(source == TButton) {
            		Master.goTo("TeacherDashboard");
            	}
            	else if(source == MButton) {
            		Master.goTo("ManagerDashboard");
            	}
            	else if(source == nextButton) {
            		Master.goTo("Statstics");
            	}
            }
        });
        
        add(label);
        panel.add(nextButton);
        panel.add(TButton);
        panel.add(MButton);
        add(panel);
        
    }
}
