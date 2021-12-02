package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel {
    public Login() {
    	ImageIcon i = new ImageIcon("http://www.dataforall.org/dashboard/censusinfoindia_pca/img/logo.png");
    	JLabel label = new JLabel(i,SwingConstants.HORIZONTAL);
        JButton nextButton = new JButton("View Stats");
        JButton TButton = new JButton("Teacher Dashboard Login");
        JButton MButton = new JButton("Manager Dashboard Login");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Object source = e.getSource();
            	if(source == TButton) {
            		Master.goTo("Teacher Dashboard");
            	}
            	else if(source == MButton) {
            		Master.goTo("Master Dashboard");
            	}
            	else if(source == nextButton) {
            		Master.goTo("Stats View");
            	}
            }
        });
        add(label);
        add(nextButton);
        add(TButton);
        add(MButton);
    }
}
