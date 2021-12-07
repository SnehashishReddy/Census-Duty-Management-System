package frontend.cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import frontend.Master;

public class Login extends JPanel implements ActionListener {
    JPanel panel = new JPanel();
    ImageIcon i = new ImageIcon(Master.class.getResource("/assets/Census-of-India-Recruitment.jpg"));
    JLabel label = new JLabel(i, SwingConstants.CENTER);
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton nextButton = new JButton("View Population Statstics");
    JButton TButton = new JButton("Teacher Dashboard Login");
    JButton MButton = new JButton("Manager Dashboard Login");
    JCheckBox showPassword = new JCheckBox(" Show Password");
    Font font = new Font("Arial", Font.BOLD, 15);

    public Login() {
        setBackground(Color.white);
        nextButton.setFont(font);
        TButton.setFont(font);
        MButton.setFont(font);
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);

        userLabel.setPreferredSize(new Dimension(100, 30));
        passwordLabel.setPreferredSize(new Dimension(100, 30));
        userTextField.setPreferredSize(new Dimension(130, 20));
        passwordField.setPreferredSize(new Dimension(130, 20));
        showPassword.setPreferredSize(new Dimension(150, 30));

        userLabel.setFont(font);
        passwordLabel.setFont(font);
        add(label, BorderLayout.CENTER);
        showPassword.setBackground(Color.white);
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(showPassword);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setPreferredSize(new Dimension(250, 100));
        panel.setBackground(Color.white);
        panel.setFont(font);
        add(Box.createRigidArea(new Dimension(800, 2)));
        add(panel, BorderLayout.CENTER);
        add(Box.createRigidArea(new Dimension(800, 1)));
        add(nextButton);
        add(TButton);
        add(MButton);
        showPassword.addActionListener(this);
        nextButton.addActionListener(this);
        TButton.addActionListener(this);
        MButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (showPassword.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
        if (source == TButton) {
            Master.goTo("TeacherDashboard");
        } else if (source == MButton) {
            Master.goTo("ManagerDashboard");
        } else if (source == nextButton) {
            Master.goTo("Statistics");
        }
    }
}