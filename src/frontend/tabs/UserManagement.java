package frontend.tabs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class UserManagement extends JPanel {

    public UserManagement() {

        /**
         * This method helps to generate Table with buttons like Add, Update, Delete
         */

        // create JFrame and JTable
        final JTable table = new JTable();

        // create a table model and set a Column Identifiers to this model
        Object[] columns = { "Username", "Password", "ID", "First Name", "Middle name", "Last Name", "Manager" };
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.YELLOW.brighter());
        table.setForeground(Color.black);
        Font font = new Font("", 1, 13);
        table.setFont(font);
        table.setRowHeight(20);

        final JLabel username = new JLabel("Username");
        final JLabel password = new JLabel("Password");
        final JLabel Id = new JLabel("ID");
        final JLabel Fname = new JLabel("First Name");
        final JLabel Mname = new JLabel("Middle Name");
        final JLabel Lname = new JLabel("Last Name");
        final JLabel Manager = new JLabel("Manager");

        // create JTextFields to hold the value
        final JTextField textusername = new JTextField();
        final JTextField textpassword = new JTextField();
        final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
        final JTextField textMname = new JTextField();
        final JTextField textLname = new JTextField();
        final JTextField textManager = new JTextField();

        // create JButtons to add the action
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        username.setBounds(20, 310, 100, 25);
        password.setBounds(280, 310, 100, 25);
        Id.setBounds(530, 310, 100, 25);
        Fname.setBounds(20, 340, 100, 25);
        Mname.setBounds(280, 340, 100, 25);
        Lname.setBounds(530, 340, 100, 25);
        Manager.setBounds(280, 370, 100, 25);

        textusername.setBounds(120, 310, 125, 25);
        textpassword.setBounds(380, 310, 125, 25);
        textId.setBounds(630, 310, 125, 25);
        textFname.setBounds(120, 340, 125, 25);
        textMname.setBounds(380, 340, 125, 25);
        textLname.setBounds(630, 340, 125, 25);
        textManager.setBounds(380, 370, 125, 25);

        btnAdd.setBounds(150, 425, 100, 25);
        btnUpdate.setBounds(350, 425, 100, 25);
        btnDelete.setBounds(550, 425, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 850, 300);

        add(pane);

        setLayout(null);
        // add JLabels to the jframe
        add(username);
        add(password);
        add(Id);
        add(Fname);
        add(Mname);
        add(Lname);
        add(Manager);

        // add JTextFields to the jframe
        add(textusername);
        add(textpassword);
        add(textId);
        add(textFname);
        add(textLname);
        add(textMname);
        add(textManager);
        // add JButtons to the jframe
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);

        // create an array of objects to set the row data
        final Object[] row = new Object[9];

        // button add row - Clicked on Add Button
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = textusername.getText();
                row[1] = textpassword.getText();
                row[2] = textId.getText();
                row[3] = textFname.getText();
                row[4] = textMname.getText();
                row[5] = textLname.getText();
                row[6] = textManager.getText();

                // add row to the model
                model.addRow(row);
            }
        });

        // button remove row - Clicked on Delete Button
        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                if (i >= 0) {
                    // remove a row from jtable
                    model.removeRow(i);
                } else {
                    System.out
                            .println("There were issues while Deleting the Row(s).");
                }
            }
        });

        // get selected row data From table to textfields
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                textusername.setText(model.getValueAt(i, 0).toString());
                textpassword.setText(model.getValueAt(i, 1).toString());
                textId.setText(model.getValueAt(i, 2).toString());
                textFname.setText(model.getValueAt(i, 3).toString());
                textMname.setText(model.getValueAt(i, 4).toString());
                textLname.setText(model.getValueAt(i, 5).toString());
                textManager.setText(model.getValueAt(i, 6).toString());
            }
        });

        // button update row - Clicked on Update Button
        btnUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(textusername.getText(), i, 0);
                    model.setValueAt(textpassword.getText(), i, 1);
                    model.setValueAt(textId.getText(), i, 2);
                    model.setValueAt(textFname.getText(), i, 3);
                    model.setValueAt(textMname.getText(), i, 4);
                    model.setValueAt(textLname.getText(), i, 5);
                    model.setValueAt(textManager.getText(), i, 6);
                } else {
                    System.out.println("Update Error");
                }
            }
        });

    }
}