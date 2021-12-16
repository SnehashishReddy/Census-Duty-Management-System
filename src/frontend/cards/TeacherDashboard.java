package frontend.cards;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.View;

import backend.PostgreSQLAccess;
import backend.actors.Teacher;
import frontend.Master;
import frontend.tabs.Form;
import frontend.tabs.PersonalDetails;
import frontend.tabs.ViewForms;
import frontend.custom.RoundedBorder;

public class TeacherDashboard extends JPanel {
    public static Teacher teacher;
    public static String givenUsername;

    public static void assigning() {
        givenUsername = Login.givenUsername;
        String query1 = "select * from user_ where username=" + "\'" + givenUsername + "\';";
        ResultSet rs1 = PostgreSQLAccess.fetch(query1);
        try {
            while (rs1.next()) {

                teacher.setUsername(rs1.getString("username"));
                teacher.setName(rs1.getString("name"));
                teacher.setDateOfBirth(rs1.getDate("date_of_birth"));
                if (rs1.getString("gender") != null)
                    teacher.setGender(rs1.getString("gender").charAt(0));
                else
                    teacher.setGender('N');
                teacher.setAddress(rs1.getString("address"));
                teacher.setUsertype(rs1.getString("usertype"));
                teacher.setDesignation(rs1.getString("designation"));
                teacher.setEmail(rs1.getString("email_id"));
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        String query2 = "select * from phone_nos where username=" + "\'" + givenUsername + "\';";
        ResultSet rs2 = PostgreSQLAccess.fetch(query2);
        try {
            while (rs2.next()) {
                teacher.setPhoneNo(rs2.getString("phone_no"));
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        String query3 = "select * from teacher where username=" + "\'" + givenUsername + "\';";
        ResultSet rs3 = PostgreSQLAccess.fetch(query3);
        try {
            while (rs3.next()) {
                System.out.println(rs3.getString(1));
                teacher.setAreaCode(Integer.valueOf(rs3.getString("assigned_area_id")));
                teacher.setTeacherID(rs3.getString("teacher_id"));
                teacher.setSchoolID(rs3.getString("school_id"));
                teacher.setSchoolName(rs3.getString("school_name"));
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        String query4 = "select password from Authentication where username=" + "\'" + givenUsername + "\';";
        ResultSet rs4 = PostgreSQLAccess.fetch(query4);
        try {
            while (rs4.next()) {
                teacher.setPassword(rs4.getString(1));
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        ViewForms.onTeacherLogin();
    }

    public static void setValues(Teacher teacher) {
        String query1 = "Update user_ set email_id =" + "\'" + teacher.getEmail() + "\' , address =" + "\'"
                + teacher.getAddress() + "\', gender =" + "\'" + teacher.getGender() + "\'" + " where username=" + "\'"
                + givenUsername + "\';";
        String query3 = "Update Authentication set password=" + "\'" + teacher.getPassword() + "\' where username="
                + "\'" + givenUsername + "\';";
        PostgreSQLAccess.executeUpdate(query1);
        PostgreSQLAccess.executeUpdate(query3);
    }

    public static void setPhoneNo(Teacher teacher) {
        String query1 = "select * from phone_nos where username = '" + givenUsername + "' AND phone_no = '"
                + teacher.getPhoneNo() + "';";
        ResultSet rs1 = PostgreSQLAccess.fetch(query1);
        try {
            if (rs1.next() == false) {
                String query2 = "Insert into phone_nos values ('" + teacher.getUsername() + "','" + teacher.getPhoneNo()
                        + "');";
                PostgreSQLAccess.executeUpdate(query2);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public TeacherDashboard() {
        teacher = new Teacher();
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