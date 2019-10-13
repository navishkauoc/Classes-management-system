/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.cms.controller;

import com.homework.cms.model.ClassM;
import com.homework.cms.util.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author acer
 */
public class ClassController {
    static public boolean save(ClassM classm){
        try {
            //02.Generate Non-fillables
        
            //03.Create SQL Statement
            String sql = "INSERT INTO class (class_name, students, start_date, status) VALUES (?,?,?,0)";

            //04.Create a database connection
            String url= "jdbc:mysql://localhost:3307/class2db?characterEncoding=latin1&useConfigs=maxPerformance" ;
            //String url = "jdbc:mysql://localhost:3307/tcrdb";
            String userName = "root";
            String password = "1234";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,userName,password);

            //05.Create a prepared statement
            PreparedStatement ps = con.prepareStatement(sql);

            //06.Fill prepared statement
            ps.setString(1, classm.getName());
            ps.setInt(2, classm.getStudents());
            java.sql.Date startDate = new java.sql.Date(classm.getStartDate().getTime());
            ps.setDate(3, startDate);

            //07.Execute statement
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static List<ClassM> list(){
        try {
            List<ClassM> list = new ArrayList<ClassM>();
            //01.SQL
            String sql = "SELECT * FROM class";
            
            //02. DB Connection
            Connection con = DB.getConnection();
            
            //03. Create PS
            PreparedStatement ps = con.prepareStatement(sql);
            
            //04. Set PS parameter
            //05. Execute SQL
            ResultSet rs = ps.executeQuery();
            
            //06. Create target objects and add to the list
            while(rs.next()){
                String name = rs.getString("class_name");
                int students = rs.getInt("students");
                Date startDate = rs.getDate("start_date");
                
                ClassM classm = new ClassM();
                classm.setName(name);
                classm.setStudents(students);
                classm.setStartDate(startDate);
                
                list.add(classm);
            }
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
