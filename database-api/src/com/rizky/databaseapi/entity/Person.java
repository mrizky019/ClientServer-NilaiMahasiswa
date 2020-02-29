/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizky.databaseapi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Muhamad Rizky
 */
public class Person implements Serializable{
    private Long idPerson;
    private String firstName;
    private String jenisKelamin;
    private Date birthday;
    private String nilaiTugas1;
    private String nilaiTugas2;
    private String nilaiUTS;
    private String nilaiUAS;
    private String nilaiAkhir;
    private String grade;
    private String mataKuliah;
    private String namaDosen;

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public Long getIdPerson() {
        return idPerson;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNilaiTugas1() {
        return nilaiTugas1;
    }

    public void setNilaiTugas1(String nilaiTugas1) {
        this.nilaiTugas1 = nilaiTugas1;
    }

    public String getNilaiTugas2() {
        return nilaiTugas2;
    }

    public void setNilaiTugas2(String nilaiTugas2) {
        this.nilaiTugas2 = nilaiTugas2;
    }

    public String getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(String nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public String getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(String nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public String getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(String nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    
}
