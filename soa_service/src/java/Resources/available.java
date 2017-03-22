/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Controllers.trainservice;
import Models.Stations;
import Models.Trains;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dell pc
 */
@Path("available")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class available
{

    @POST
    public ArrayList<Trains> getTrains(Stations station)
    {
        return trainservice.getTrains(station.getSource(), station.getDestination());
    }

//    @POST
//    public Trains mysample(Trains t)
//    {
//        return t;
//    }
    @GET
    public String getSample()
    {
        return "no trains";
    }
}
