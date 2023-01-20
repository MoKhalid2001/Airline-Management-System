/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mokhalid
 */
public class Common {
   public static String DBURL = "jdbc:mysql://localhost:3306/AirlineSystem";
   public static String username = "root";
   public static Connection Con = null;
   public static PreparedStatement pst = null;
   public static ResultSet Rs,Rs1 = null;
   public static Statement st,st1 = null;
     
     
}
