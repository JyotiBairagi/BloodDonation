/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blooddonation;
import java.sql.*;

/**
 *
 * @author TECHOCEAN-2
 */
public class BloodDonation {

    
    public static Connection getcon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Blood","root","Shreya1915");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
       
        }
    }
    public static void main(String[] args) {
        new Homepage1().setVisible(true);
     }
}
