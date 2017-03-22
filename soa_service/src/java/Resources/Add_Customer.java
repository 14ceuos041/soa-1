/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Controllers.CustomerService;
import Models.New_Customer;
import Models.Success;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dell pc
 */
@Path("register")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Add_Customer
{

    @POST
    public Success add_customer(New_Customer new_Customer)
    {
        return CustomerService.add_customer(new_Customer.getName(), new_Customer.getEmail(), new_Customer.getUsername(), new_Customer.getPassword());
    }
}
