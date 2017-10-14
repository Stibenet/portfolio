package ru.ugrasu.tableDB;

/**
 * Created by Марсель on 01.10.2017.
 */
public class User {
    private int id;
    private String fname;
    private String name;
    private String lname;
    private String infouser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getInfouser() {
        return infouser;
    }

    public void setInfouser(String infouser) {
        this.infouser = infouser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", infouser='" + infouser + '\'' +
                '}';
    }
}
