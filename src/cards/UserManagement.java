package cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class UserManagement extends JPanel {

    UserManagement() {

        /**
         * This method helps to generate Table with buttons like Add, Update, Delete
         */

        // create JFrame and JTable
        final JTable table = new JTable();

        // create a table model and set a Column Identifiers to this model
        Object[] columns = { "Username", "First Name", "Last Name", "Password" };
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.CYAN.brighter());
        table.setForeground(Color.black);
        Font font = new Font("", 1, 18);
        table.setFont(font);
        table.setRowHeight(30);

        // create JTextFields to hold the value
        final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
        final JTextField textLname = new JTextField();
        final JTextField textAge = new JTextField();

        // create JButtons to add the action
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        textId.setBounds(20, 320, 100, 25);
        textFname.setBounds(20, 350, 100, 25);
        textLname.setBounds(20, 380, 100, 25);
        textAge.setBounds(20, 410, 100, 25);

        btnAdd.setBounds(150, 320, 100, 25);
        btnUpdate.setBounds(150, 365, 100, 25);
        btnDelete.setBounds(150, 410, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 300);

        add(pane);

        setLayout(null);
        // add JTextFields to the jframe
        add(textId);
        add(textFname);
        add(textLname);
        add(textAge);

        // add JButtons to the jframe
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);

        // create an array of objects to set the row data
        final Object[] row = new Object[4];

        // button add row - Clicked on Add Button
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = textId.getText();
                row[1] = textFname.getText();
                row[2] = textLname.getText();
                row[3] = textAge.getText();

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

                textId.setText(model.getValueAt(i, 0).toString());
                textFname.setText(model.getValueAt(i, 1).toString());
                textLname.setText(model.getValueAt(i, 2).toString());
                textAge.setText(model.getValueAt(i, 3).toString());
            }
        });

        // button update row - Clicked on Update Button
        btnUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(textId.getText(), i, 0);
                    model.setValueAt(textFname.getText(), i, 1);
                    model.setValueAt(textLname.getText(), i, 2);
                    model.setValueAt(textAge.getText(), i, 3);
                } else {
                    System.out.println("Update Error");
                }
            }
        });

    }
}