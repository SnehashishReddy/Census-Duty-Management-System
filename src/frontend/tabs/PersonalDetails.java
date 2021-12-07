package frontend.tabs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import frontend.Master;

public class PersonalDetails extends JPanel {
    public class temp {
        String name;
        String id;
        String mobile;
        String email;
        char gender;
        String dob;
        String address;
        String username;
        String password;
        String manager;
        String schoolname;
        int formsubmitted;
        String areas;

        public temp(String username, String password, String name, String id, String mobile, String email, char gender,
                String dob,
                String address, String manager, String schoolname, int formsubmitted, String areas) {
            super();
            this.name = name;
            this.id = id;
            this.mobile = mobile;
            this.email = email;
            this.gender = gender;
            this.dob = dob;
            this.address = address;
            this.username = username;
            this.password = password;
            this.manager = manager;
            this.schoolname = schoolname;
            this.formsubmitted = formsubmitted;
            this.areas = areas;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setAreas(String areas) {
            this.areas = areas;
        }

        public String getMobile() {
            return mobile;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        public String getDob() {
            return dob;
        }

        public String getAddress() {
            return address;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getManager() {
            return manager;
        }

        public String getSchoolname() {
            return schoolname;
        }

        public int getFormsubmitted() {
            return formsubmitted;
        }

        public String getAreas() {
            return areas;
        }

    }

    private JLabel username;
    private JTextField tusername;
    private JLabel password;
    private JTextField tpassword;
    private JLabel name;
    private JTextField tname;
    private JLabel id;
    private JTextField tid;
    private JLabel mobile;
    private JTextField tmobile;
    private JLabel email;
    private JTextField temail;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gendergrp;
    private JLabel dob;
    private JTextField tdob;
    private JLabel address;
    private JTextArea taddress;
    private JLabel heading;
    private JLabel numberofforms;
    private JLabel schoolname;
    private JLabel areas;
    private JLabel manager;
    private JTextField tnumberofforms;
    private JTextField tschoolname;
    private JTextField tmanager;
    private JTextArea tareas;

    public PersonalDetails() {

        temp temp = new temp("Username", "password", "Sid", "AM001", "0000000000", "abc@gmail.com", 'F', "25/02/2002",
                "Address", "manager", "school", 20, "areas");

        // Create new JLabel
        heading = new JLabel("Edit Profile");
        username = new JLabel("Username");
        password = new JLabel("Password");
        name = new JLabel("Name");
        id = new JLabel("ID");
        mobile = new JLabel("Mobile");
        gender = new JLabel("Gender");
        email = new JLabel("E-mail");
        dob = new JLabel("Date of Birth");
        address = new JLabel("Address");
        numberofforms = new JLabel("Submitted");
        schoolname = new JLabel("School Name");
        manager = new JLabel("Manager");
        areas = new JLabel("Area");

        // Create new JTextfield and JTextArea
        tusername = new JTextField();
        tname = new JTextField(temp.getName());
        tid = new JTextField(temp.getId());
        tmobile = new JTextField(temp.getMobile());
        temail = new JTextField(temp.getEmail());
        tdob = new JTextField(temp.getDob());
        tusername = new JTextField(temp.getUsername());
        tpassword = new JTextField(temp.getPassword());
        tnumberofforms = new JTextField(String.valueOf(temp.getFormsubmitted()));
        tschoolname = new JTextField(temp.getSchoolname());
        tmanager = new JTextField(temp.getManager());
        tareas = new JTextArea(temp.getAreas());
        taddress = new JTextArea(temp.getAddress());

        // setEditable(false) to non editable text fields
        tusername.setEditable(false);
        tschoolname.setEditable(false);
        tnumberofforms.setEditable(false);
        tmanager.setEditable(false);
        tareas.setEditable(false);

        // Create ButtonGroup and JRadioButton for gender.
        gendergrp = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        // Create JButton for back and save
        JButton backButton = new JButton("Back");
        JButton saveButton = new JButton("Save");

        // Set font and size of JLabel
        heading.setFont(new Font("Serif", Font.PLAIN, 20));
        heading.setSize(300, 40);
        username.setSize(100, 20);
        password.setSize(100, 20);
        name.setSize(100, 20);
        id.setSize(100, 20);
        mobile.setSize(100, 20);
        gender.setSize(100, 20);
        male.setSize(75, 20);
        female.setSize(80, 20);
        email.setSize(100, 20);
        dob.setSize(100, 20);
        address.setSize(100, 20);
        schoolname.setSize(100, 20);
        manager.setSize(100, 20);
        numberofforms.setSize(100, 20);
        areas.setSize(100, 20);

        // Set locations of JLabel
        heading.setLocation(350, 0);
        username.setLocation(50, 50);
        password.setLocation(50, 80);
        name.setLocation(50, 110);
        id.setLocation(50, 140);
        mobile.setLocation(50, 170);
        gender.setLocation(50, 200);
        male.setLocation(150, 200);
        female.setLocation(260, 200);
        email.setLocation(50, 230);
        dob.setLocation(50, 260);
        address.setLocation(50, 290);
        schoolname.setLocation(450, 50);
        manager.setLocation(450, 80);
        numberofforms.setLocation(450, 110);
        areas.setLocation(450, 140);

        // setbounds of JTextField and JTextArea =>(position-x,position-y,width,height)
        tusername.setBounds(150, 50, 200, 20);
        tpassword.setBounds(150, 80, 200, 20);
        tname.setBounds(150, 110, 200, 20);
        tid.setBounds(150, 140, 200, 20);
        tmobile.setBounds(150, 170, 200, 20);
        temail.setBounds(150, 230, 200, 20);
        taddress.setBounds(150, 290, 200, 50);
        tdob.setBounds(150, 260, 200, 20);
        tschoolname.setBounds(600, 50, 200, 20);
        tmanager.setBounds(600, 80, 200, 20);
        tnumberofforms.setBounds(600, 110, 200, 20);
        tareas.setBounds(600, 140, 200, 80);
        backButton.setBounds(250, 380, 100, 25);
        saveButton.setBounds(450, 380, 100, 25);

        // assign gender
        male.setSelected(temp.getGender() == 'M');
        female.setSelected(temp.getGender() == 'F');

        // Make the cursor move to next line when it hits the end of width
        taddress.setLineWrap(true);

        // add all JLabel,JTextField,JButton,JTextArea
        add(heading);
        add(username);
        add(tusername);
        add(password);
        add(tpassword);
        add(name);
        add(tname);
        add(id);
        add(tid);
        add(mobile);
        add(tmobile);
        add(gender);
        add(male);
        add(female);
        gendergrp.add(male);
        gendergrp.add(female);
        add(email);
        add(temail);
        add(dob);
        add(address);
        add(taddress);
        add(tdob);
        add(schoolname);
        add(tschoolname);
        add(manager);
        add(tmanager);
        add(numberofforms);
        add(tnumberofforms);
        add(areas);
        add(tareas);
        add(taddress);
        add(backButton);
        add(saveButton);

        // null layout
        setLayout(null);

        // button to save
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setEmail(temail.getText());
                temp.setMobile(tmobile.getText());
                temp.setAddress(taddress.getText());
                temp.setPassword(tpassword.getText());
            }
        });

        // button to go back
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("TeacherDashboard");
            }
        });

    }
}
