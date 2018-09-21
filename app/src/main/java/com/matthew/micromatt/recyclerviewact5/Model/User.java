package com.matthew.micromatt.recyclerviewact5.Model;

public class User {

    private String Name;

    private String LastName;

    private int Age;

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }


    public User(){
        this.Age = 0;
        this.LastName = "";
        this.Name = "";
    }

    public User(String Name, String LastName, int Age){
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;
    }
}
