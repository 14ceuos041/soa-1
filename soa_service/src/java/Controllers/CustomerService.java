/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Success;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell pc
 */
public class CustomerService
{

    public static int verify(String Username, String Password)
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainreservation", "root", "");
            String query = "select Password from customer where Username = ?";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, Username);

            ResultSet resultSet = null;
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next())
            {
                String db_Password = resultSet.getString("Password");
                if (db_Password.equals(Password))
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
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
        return 0;
    }

    public static Success delete_acc(String username)
    {
        Connection con = null;
        Success success = new Success();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainreservation", "root", "");
            String query = "delete from customer where Username=?";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, username);

            int count = preparedStatement.executeUpdate();
            if (count >= 1)
            {
                success.setIssuccess(1);
            }
            else
            {
                success.setIssuccess(0);
            }
            return success;
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
        return success;
    }

    public static Success update_password(String username, String password)
    {
        Connection con = null;
        Success success = new Success();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainreservation", "root", "");
            String query = "update customer set Password=? where Username=?";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);

            int count = preparedStatement.executeUpdate();
            if (count >= 1)
            {
                success.setIssuccess(1);
            }
            else
            {
                success.setIssuccess(0);
            }
            return success;
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
        return success;
    }

    public static Success add_customer(String name, String email, String username, String password)
    {
        Connection con = null;
        Success success = new Success();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/trainreservation", "root", "");
            String query = "insert into customer(Name,Email,Username,Password) values(?,?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);

            int count = preparedStatement.executeUpdate();
            if (count >= 1)
            {
                success.setIssuccess(1);
            }
            else
            {
                success.setIssuccess(0);
            }
            return success;
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
        return success;
    }

}
