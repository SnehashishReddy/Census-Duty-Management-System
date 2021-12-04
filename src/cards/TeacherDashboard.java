package cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TeacherDashboard extends JPanel {
    public TeacherDashboard() {
        JButton previousButton = new JButton("Dashboard");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("Login");
            }
        });
        add(previousButton);
    }
}
