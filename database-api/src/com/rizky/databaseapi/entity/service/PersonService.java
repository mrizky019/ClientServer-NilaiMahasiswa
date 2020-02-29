/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizky.databaseapi.entity.service;

import com.rizky.databaseapi.entity.Person;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Muhamad Rizky
 */
public interface PersonService extends Remote {
    
    Person insertPerson(Person person) throws RemoteException;
    void updatePerson(Person person) throws RemoteException;
    void deletePerson(Long idPerson) throws RemoteException;
    Person getPerson(Long idPerson) throws RemoteException; //medapatkan data person berdasarkan id
    List<Person> getPerson(String namaKelas) throws RemoteException; //menampilkan semua list person di database
}
