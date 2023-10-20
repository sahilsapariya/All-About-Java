package com.sahil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements ActionListener {

    TextArea textArea = new TextArea(20, 30);

    TextField insertName = new TextField("Enter your name");
    TextField insertPhone = new TextField("Enter your phone number");
    TextField insertCity = new TextField("Enter your city");

    TextField deleteId = new TextField("Enter ID to delete");

    TextField updateId = new TextField("Enter ID for update it's value");
    TextField updateName = new TextField("Enter new name");
    TextField updatePhone = new TextField("Enter new phone");
    TextField updateCity = new TextField("Enter new city");


    Button read = new Button("Read");
    Button insert = new Button("Insert");
    Button delete = new Button("Delete");
    Button update = new Button("Update");

    Main() {
        setSize(800, 600);
        setVisible(true);
        setLayout(new FlowLayout());
        textArea.setVisible(true);
        add(read);
        add(textArea);

        read.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(StudentDao.getStudentToDB());
            }
        });

        add(insertName);
        add(insertPhone);
        add(insertCity);
        add(insert);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = insertName.getText();
                String phone = insertPhone.getText();
                String city = insertCity.getText();

                if (StudentDao.insertStudentToDB(new Student(name, phone, city))) {
                    textArea.setText("Student data inserted successfully!");
                } else {
                    textArea.setText("Something went wrong!!");
                }
            }
        });

        add(deleteId);
        add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = deleteId.getText().toString();

                if (StudentDao.deleteStudentToDB(Integer.parseInt(id))) {
                    textArea.setText("Student deleted successfully!");
                } else {
                    textArea.setText("Something went wrong!");
                }
            }
        });

        add(updateId);
        add(updateName);
        add(updatePhone);
        add(updateCity);
        add(update);

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(updateId.getText().toString());
                String name = updateName.getText();
                String phone = updatePhone.getText();
                String city = updateCity.getText();

                if (StudentDao.updateStudentToDB(id, new Student(name, phone, city))) {
                    textArea.setText("Student updated successfully!");
                } else {
                    textArea.setText("Something went wrong!");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }



    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}