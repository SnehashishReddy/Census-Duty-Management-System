package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel {
    public Login() {
        JButton nextButton = new JButton("Login");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("TeacherDashboard");
            }
        });
        add(nextButton);
    }
}
