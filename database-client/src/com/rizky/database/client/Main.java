/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizky.database.client;


import com.rizky.database.mainform.MainForm;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Muhamad Rizky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
     
}
