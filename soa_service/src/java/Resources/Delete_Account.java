/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Controllers.CustomerService;
import Models.Success;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dell pc
 */
@Path("delete_account")
@Produces(MediaType.APPLICATION_JSON)
public class Delete_Account
{

    @DELETE
    @Path("/{username}")
    public Success delete_acc(@PathParam("username") String username)
    {
        return CustomerService.delete_acc(username);
    }
}
