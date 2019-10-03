/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.cms.controller;

import com.homework.cms.model.ClassM;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

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
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
