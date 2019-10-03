/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */
public class DB {
    public static Connection getConnection() throws Exception{
            String url= "jdbc:mysql://localhost:3307/class2db?characterEncoding=latin1&useConfigs=maxPerformance" ;
            String userName = "root";
            String password = "1234";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,userName,password);
            
            return con;
    }
}
