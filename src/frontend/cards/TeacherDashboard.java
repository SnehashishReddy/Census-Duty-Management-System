package frontend.cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import frontend.Master;
import frontend.tabs.Form;
import frontend.tabs.PersonalDetails;
import frontend.tabs.ViewForms;
import frontend.custom.RoundedBorder;

public class TeacherDashboard extends JPanel {
    public TeacherDashboard() {
        setLayout(new BorderLayout(0, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        JLabel l1 = new JLabel("Teacher Dashboard ");
        topPanel.add(l1, BorderLayout.WEST);
        l1.setPreferredSize(new Dimension(400, 30));

        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBorder(new RoundedBorder(10));
        logoutButton.setPreferredSize(new Dimension(80, 3));
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("Login");
            }
        });

        topPanel.add(logoutButton, BorderLayout.EAST);

        topPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        add(topPanel, BorderLayout.NORTH);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0, 0, 850, 450);

        Form form = new Form();
        ViewForms viewForms = new ViewForms();
        PersonalDetails personalDetails = new PersonalDetails();

        tp.addTab("Submit Form", form);
        tp.addTab("View Submitted Forms", viewForms);
        tp.addTab("Personal Details", personalDetails);

        add(tp);
    }
}