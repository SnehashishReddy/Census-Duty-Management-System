package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form implements ActionListener{
	String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",  "26", "27", "28", "29", "30", "31" };
	String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
	String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",  "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };
	JFrame frame = new JFrame("Census Data Collection Form");
	JPanel panel = new JPanel();
	JButton submit = new JButton("Submit");
	JLabel houseID = new JLabel("HouseID : ");
	JLabel Address = new JLabel("Address : ");
	JLabel No_of_Members = new JLabel("Total Number of House Members : ");
	JLabel name = new JLabel("Name : ");
	JLabel DOB = new JLabel("Date of Birth : ");
	JLabel aadhar = new JLabel("Aadhar No. : ");
	JLabel gender = new JLabel("Gender : ");
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	JRadioButton others = new JRadioButton("Others");
	ButtonGroup gengrp = new ButtonGroup();
	JTextField ID = new JTextField();
	JTextField TotalMembers = new JTextField();
	JTextField AadNo = new JTextField();
	JTextField nm = new JTextField();
	TextArea Add = new TextArea(10,11); 
	JComboBox date = new JComboBox(dates);
	JComboBox month  = new JComboBox(months);
	JComboBox year = new JComboBox(years);
	Form(){
		gengrp.add(male);
		gengrp.add(female);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
	}
}
