package com.example.Student.Student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Stdroll;
    private String Stdname;
    private String Stdfaculty;

    public StdEntity() {
    }

    public StdEntity(int stdroll, String stdname, String stdfaculty) {
        this.Stdroll = stdroll;
        this.Stdname = stdname;
        this.Stdfaculty = stdfaculty;
    }

    public int getStdroll() {
        return Stdroll;
    }

    public void setStdroll(int stdroll) {
        this.Stdroll = stdroll;
    }



    public String getStdname() {
        return Stdname;
    }

    public void setStdname(String stdname) {
        this.Stdname = stdname;
    }

    public String getStdfaculty() {
        return Stdfaculty;
    }

    public void setStdfaculty(String stdfaculty) {
        this.Stdfaculty = stdfaculty;
    }
    @Override
    public String toString() {
        return "StdEntity{" +
                "Stdroll=" + Stdroll +
                ", Stdname='" + Stdname + '\'' +
                ", Stdfaculty='" + Stdfaculty + '\'' +
                '}';
    }
}
