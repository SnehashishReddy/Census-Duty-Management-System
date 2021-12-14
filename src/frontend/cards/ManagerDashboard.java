package frontend.cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import frontend.Master;
import frontend.tabs.RegPart;
import frontend.tabs.TeacherManagement;

public class ManagerDashboard extends JPanel {
    public ManagerDashboard() {
        setLayout(new BorderLayout(0, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        JLabel l1 = new JLabel("     Manager Dashboard ");
        topPanel.add(l1, BorderLayout.WEST);
        l1.setPreferredSize(new Dimension(400, 30));

        JButton logoutButton = new JButton("Log Out");
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

        TeacherManagement teachermanagement = new TeacherManagement();
        RegPart regpart = new RegPart();

        tp.addTab("Teacher Management", teachermanagement);
        tp.addTab("Local Registry Partition", regpart);

        add(tp);
    }
}