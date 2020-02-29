package com.rizky.databaseserver.service;


import com.rizky.databaseapi.entity.Person;
import com.rizky.databaseapi.entity.service.PersonService;
import com.rizky.databaseserver.utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Muhamad Rizky
 **/

public class PersonServiceServer extends UnicastRemoteObject implements PersonService{

    public PersonServiceServer() throws RemoteException {   
    }
    
    @Override
    public Person insertPerson(Person person) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert");
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "INSERT INTO person (idPerson, firstName, jenisKelamin, birthday, "
                        + "nilaiTugas1, nilaiTugas2, nilaiUTS, nilaiUAS, nilaiAkhir, grade, mataKuliah) "
                        + "VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,person.getFirstName());
            statement.setString(2,person.getJenisKelamin());
            statement.setDate(3, new Date(person.getBirthday().getTime()));
            statement.setString(4,person.getNilaiTugas1());
            statement.setString(5,person.getNilaiTugas2());
            statement.setString(6,person.getNilaiUTS());
            statement.setString(7,person.getNilaiUAS());
            statement.setString(8,person.getNilaiAkhir());
            statement.setString(9,person.getGrade());
            statement.setString(10,person.getMataKuliah());
            
            statement.executeUpdate();
            try (ResultSet result = statement.getGeneratedKeys()) {
                if (result.next()) {
                    person.setIdPerson(result.getLong(1));
                }
            }
            return person;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    
                }
            }
        }
    }

    @Override
    public void updatePerson(Person person) throws RemoteException {
        System.out.println("Client Melakukan Proses Update");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "UPDATE person SET "
                        + "firstName = ?, jenisKelamin = ?, birthday = ?, "
                        + "nilaiTugas1 = ?, nilaiTugas2 = ?, nilaiUTS = ?, "
                        + "nilaiUAS = ?, nilaiAkhir = ?, grade = ? "
                        + "WHERE idPerson = ?"
            );
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getJenisKelamin());
            statement.setDate(3, new Date(person.getBirthday().getTime()));
            statement.setString(4, person.getNilaiTugas1());
            statement.setString(5, person.getNilaiTugas2());
            statement.setString(6, person.getNilaiUTS());
            statement.setString(7, person.getNilaiUAS());
            statement.setString(8, person.getNilaiAkhir());
            statement.setString(9, person.getGrade());
            statement.setLong(10, person.getIdPerson());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deletePerson(Long idPerson) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "DELETE FROM person WHERE idPerson = ?"
            );
            statement.setLong(1, idPerson);
            statement.executeUpdate(); 
        } catch (SQLException exception) {
            exception.printStackTrace();
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    @Override
    public Person getPerson(Long idPerson) throws RemoteException {
        System.out.println("Client Melakukan Proses Get-by idPerson");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "SELECT * FROM person WHERE idPerson = ?"
            );
            ResultSet result = statement.executeQuery();
            Person person = null;
            if (result.next()) {
                person = new Person();
                person.setIdPerson(result.getLong("idPerson"));
                person.setFirstName(result.getString("firstName"));
                person.setJenisKelamin(result.getString("jenisKelamin"));
                person.setBirthday(result.getDate("birthday"));
                person.setNilaiTugas1(result.getString("nilaiTugas1"));
                person.setNilaiTugas2(result.getString("nilaiTugas2"));
                person.setNilaiUTS(result.getString("nilaiUTS"));
                person.setNilaiUAS(result.getString("nilaiUAS"));
                person.setNilaiAkhir(result.getString("nilaiAkhir"));
                person.setGrade(result.getString("grade"));
                person.setMataKuliah(result.getString("mataKuliah"));
            }
            result.close();
            return person;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
    
    @Override
    public List<Person> getPerson(String namaKelas) throws RemoteException{
        System.out.println("Client Melakukan Proses Get-All-Id");
        
        PreparedStatement statement = null;
        try {
            
            statement = DatabaseUtilities.getConnection().prepareStatement("SELECT * FROM person WHERE person.mataKuliah = ?");
            statement.setString(1, namaKelas);
            ResultSet result = statement.executeQuery();
            List<Person> list = new ArrayList<Person>();
            while(result.next()){
                Person person = new Person();
                person.setIdPerson(result.getLong("idPerson"));
                person.setFirstName(result.getString("firstName"));
                person.setJenisKelamin(result.getString("jenisKelamin"));
                person.setBirthday(result.getDate("birthday"));
                person.setNilaiTugas1(result.getString("nilaiTugas1"));
                person.setNilaiTugas2(result.getString("nilaiTugas2"));
                person.setNilaiUTS(result.getString("nilaiUTS"));
                person.setNilaiUAS(result.getString("nilaiUAS"));
                person.setNilaiAkhir(result.getString("nilaiAkhir"));
                person.setGrade(result.getString("grade"));
                person.setMataKuliah(result.getString("mataKuliah"));
                list.add(person);
            }
            result.close();
            return list;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }finally{ 
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
