/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author dell pc
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application
{

    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources)
    {
        resources.add(Resources.Add_Customer.class);
        resources.add(Resources.Delete_Account.class);
        resources.add(Resources.GenericResource.class);
        resources.add(Resources.Signin.class);
        resources.add(Resources.Update_Password.class);
        resources.add(Resources.available.class);
        resources.add(org.manan.sample.mavenproject1.MyResource.class);
    }

}
