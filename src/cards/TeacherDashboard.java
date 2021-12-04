package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherDashboard extends JPanel {
    public TeacherDashboard() {
        JButton previousButton = new JButton("Teacher Dashboard");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("Cover Page");
            }
        });
        add(previousButton);
    }
}
