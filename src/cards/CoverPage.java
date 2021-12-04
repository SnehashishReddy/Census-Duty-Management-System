package cards;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CoverPage extends JPanel implements ActionListener{
	JPanel panel = new JPanel();
	ImageIcon i = new ImageIcon(Master.class.getResource("/cards/logo.png"));
	JLabel label = new JLabel(i,SwingConstants.HORIZONTAL);
    JButton nextButton = new JButton("View Popolation Statstics");
    JButton TButton = new JButton("Teacher Dashboard Login");
    JButton MButton = new JButton("Manager Dashboard Login");
    public CoverPage() {
    	setBackground(Color.white);
        add(label);
        add(Box.createRigidArea(new Dimension(500,25)));
        panel.add(nextButton);
        panel.add(TButton);
        panel.add(MButton);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setPreferredSize(new Dimension(200,125));
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createTitledBorder("Main Menu"));
        add(panel);
        
        nextButton.addActionListener(this);
        TButton.addActionListener(this);
        MButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	Object source = e.getSource();
    	if(source == TButton) {
    		
    		Master.goTo("Teacher Login");
    	}
    	else if(source == MButton) {
    		Master.goTo("Manager Login");
    	}
    	else if(source == nextButton) {
    		Master.goTo("View Statstics");
    	}
    }
}
