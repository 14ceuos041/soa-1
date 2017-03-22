/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Controllers.CustomerService;
import Models.Customer;
import Models.Success;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dell pc
 */
@Path("update_password")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Update_Password
{

    @PUT
    public Success delete_acc(Customer customer)
    {
        return CustomerService.update_password(customer.getUsername(), customer.getPassword());
    }
}
