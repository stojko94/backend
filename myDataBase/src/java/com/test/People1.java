/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erik
 */
@Entity
@Table(name = "PEOPLE1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "People1.findAll", query = "SELECT p FROM People1 p")
    , @NamedQuery(name = "People1.findById", query = "SELECT p FROM People1 p WHERE p.id = :id")
    , @NamedQuery(name = "People1.findByName", query = "SELECT p FROM People1 p WHERE p.name = :name")
    , @NamedQuery(name = "People1.findBySurname", query = "SELECT p FROM People1 p WHERE p.surname = :surname")
    , @NamedQuery(name = "People1.findByAge", query = "SELECT p FROM People1 p WHERE p.age = :age")
    , @NamedQuery(name = "People1.findByAdress", query = "SELECT p FROM People1 p WHERE p.adress = :adress")
    , @NamedQuery(name = "People1.findByCity", query = "SELECT p FROM People1 p WHERE p.city = :city")
    , @NamedQuery(name = "People1.findByState", query = "SELECT p FROM People1 p WHERE p.state = :state")})
public class People1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 20)
    @Column(name = "ADRESS")
    private String adress;
    @Size(max = 20)
    @Column(name = "CITY")
    private String city;
    @Size(max = 20)
    @Column(name = "STATE")
    private String state;

    public People1() {
    }

    public People1(Integer id) {
        this.id = id;
    }

    public People1(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof People1)) {
            return false;
        }
        People1 other = (People1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.People1[ id=" + id + " ]";
    }
    
}
