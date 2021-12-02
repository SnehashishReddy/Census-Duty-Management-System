package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherDashboard extends JPanel {
    public TeacherDashboard() {
        JButton previousButton = new JButton("TeacherDashboard");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("Login");
            }
        });
        add(previousButton);
    }
}
