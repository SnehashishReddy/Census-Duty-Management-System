package frontend.cards;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.event.*;

import frontend.Master;
import frontend.tabs.RegPart;
import frontend.tabs.TeacherManagement;
import frontend.custom.RoundedBorder;

import backend.actors.*;
import backend.PostgreSQLAccess;

public class ManagerDashboard extends JPanel {
    public static Manager managingActor;

    public ManagerDashboard() {
        setLayout(new BorderLayout(0, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        JLabel l1 = new JLabel("     Manager Dashboard ");
        topPanel.add(l1, BorderLayout.WEST);
        l1.setPreferredSize(new Dimension(400, 30));

        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBorder(new RoundedBorder(10));
        logoutButton.setPreferredSize(new Dimension(80, 3));
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Login.givenUsername);
                Login.givenUsername = "";
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

    public static void onLogin() {
        String userTypeQuery = "select usertype from user_ where username=\'" + Login.givenUsername + "\';";
        String designationQuery = "select designation from user_ where username=\'" + Login.givenUsername + "\';";
        String userType = "";
        String designationType = "";
        try {
            ResultSet rs1 = PostgreSQLAccess.fetch(userTypeQuery);
            while (rs1.next()) {
                userType = rs1.getString(1);
            }
            ResultSet rs2 = PostgreSQLAccess.fetch(designationQuery);
            while (rs2.next()) {
                designationType = rs2.getString(1);
            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        if ("Head Master".equals(designationType)) {
            managingActor = new Headmaster();
        } else if ("Director".equals(designationType)) {
            managingActor = new Director();
        } else if ("Commissioner".equals(designationType)) {
            managingActor = new Commissioner();
        }

        managingActor.setDesignation(designationType);
        managingActor.setUsertype(userType);

        RegPart.onManagerLogin();
    }
}