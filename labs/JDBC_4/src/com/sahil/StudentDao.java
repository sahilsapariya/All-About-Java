package com.sahil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class StudentDao {
    public static boolean insertStudentToDB(Student student) {
        try {
            Connection conn = ConnectionProvider.createConnection();
            String query = "INSERT INTO student (id, name, phone, city) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            Random r = new Random();

            preparedStatement.setInt(1, r.nextInt(10000));
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getCity());

            preparedStatement.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getStudentToDB() {
        String s = new String();

        try {
            Connection conn = ConnectionProvider.createConnection();
            String query = "SELECT * FROM student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String city = rs.getString("city");
                s += "ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nCity:" + city + "\n\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static boolean updateStudentToDB(int sid, Student student) {
        try {
            Connection con = ConnectionProvider.createConnection();
            String query = "update student set name = ?, phone = ?, city = ? where id = ? ;"; PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(4, sid);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getPhone());
            pstmt.setString(3, student.getCity());
            pstmt.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public static boolean deleteStudentToDB(int id) {
        try {
            Connection con = ConnectionProvider.createConnection();
            String query = "delete from student where id=?;";

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
