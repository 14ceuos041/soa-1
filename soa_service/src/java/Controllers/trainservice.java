/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Trains;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dell pc
 */
public class trainservice
{

    public static ArrayList<Trains> getTrains(String src, String dest)
    {
        ArrayList<Trains> trains = new ArrayList<>();
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainreservation", "root", "");
            String query = "select a.train_no,c.name,a.dept_time,b.arrival_time from schedule a,schedule b,trains c where a.stops=? and b.stops=? and a.kilometers < b.kilometers and a.train_no = b.train_no and a.train_no=c.train_no";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, src);
            preparedStatement.setString(2, dest);

            ResultSet resultSet = null;
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                Trains t = new Trains();
                t.setTrain_no(resultSet.getInt(1));
                t.setTrain_name(resultSet.getString(2));
                t.setArr_time(resultSet.getString(3));
                t.setDept_time(resultSet.getString(4));
                trains.add(t);
            }

        }
        catch (ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex);
        }
        finally
        {
            try
            {
                con.close();
            }
            catch (SQLException ex)
            {
                System.err.println(ex);
            }
        }
        return trains;
    }
}
