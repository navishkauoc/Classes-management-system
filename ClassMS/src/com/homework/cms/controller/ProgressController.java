/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.cms.controller;

import com.homework.cms.model.Progress;
import com.homework.cms.util.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class ProgressController {
    
    public static boolean save(Progress progress){
        try {
            //03.Create SQL Statement
            String sql = "INSERT INTO progress (progress, date, class_classid, status) VALUES (?,?,?,1)";

            //04.Create a database connection
            Connection con = DB.getConnection();

            //05.Create a prepared statement
            PreparedStatement ps = con.prepareStatement(sql);

            //06.Fill prepared statement
            ps.setDouble(1, progress.getName());
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
    
}
