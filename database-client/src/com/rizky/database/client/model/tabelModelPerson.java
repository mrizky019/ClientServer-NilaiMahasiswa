/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizky.database.client.model;

import com.rizky.databaseapi.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Muhamad Rizky
 */
public class tabelModelPerson extends AbstractTableModel{

    private List<Person> list = new ArrayList<Person>();
    
    public tabelModelPerson(){
    }
    
    public Person get(int row){
        return list.get(row);
    }
    
    public void insert(Person person){
        list.add(person);
        fireTableDataChanged();
    }
    
    public void update(int row, Person person){
         list.set(row, person);
         fireTableDataChanged();
    }
    
    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }
    
    public void setData(List<Person> list){
        this.list = list;
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 : 
                return "ID";
            case 1 : 
                return "Nama";
            case 2 : 
                return "Jenis Kelamin";
            case 3 : 
                return "Tanggal Lahir";
            case 4 : 
                return "Tugas 1";
            case 5 : 
                return "Tugas 2";
            case 6 : 
                return "UTS";
            case 7 : 
                return "UAS";    
            case 8 : 
                return "Nilai Akhir";
            case 9 : 
                return "Grade";
            case 10:
                return "Mata Kuliah";
            default:
                return null;
        }
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return list.get(rowIndex).getIdPerson();
            case 1 :
                return list.get(rowIndex).getFirstName();
            case 2 :
                return list.get(rowIndex).getJenisKelamin();
            case 3 :
                return list.get(rowIndex).getBirthday();
            case 4 :
                return list.get(rowIndex).getNilaiTugas1();
            case 5 :
                return list.get(rowIndex).getNilaiTugas2();
            case 6 :
                return list.get(rowIndex).getNilaiUTS();
            case 7 :
                return list.get(rowIndex).getNilaiUAS();
            case 8 :
                return list.get(rowIndex).getNilaiAkhir();
            case 9 :
                return list.get(rowIndex).getGrade();
            case 10 :
                return list.get(rowIndex).getMataKuliah();
            default:
                return null;
        }
    }
    
}
