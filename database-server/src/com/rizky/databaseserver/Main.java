package com.rizky.databaseserver;

import com.rizky.databaseserver.service.PersonServiceServer;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Muhamad Rizky
 **/

public class Main {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        Registry server = LocateRegistry.createRegistry(6789);
        PersonServiceServer personService = new PersonServiceServer();
        server.rebind("service", personService);
        
        System.out.println("Server Berhasil Berjalan");
    } 
    
}
