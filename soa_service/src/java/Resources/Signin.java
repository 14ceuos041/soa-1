/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Controllers.CustomerService;
import Models.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dell pc
 */
@Path("verify")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public class Signin
{

    @POST
    public int verify(Customer customer)
    {
        return CustomerService.verify(customer.getUsername(), customer.getPassword());
    }
}
