package com.workintech.s17d2.model;


public class Developer {

    private int id;
    private  String name;
    private  double salary;
    private  Experience  experience;

    public  Developer(int id, String name, double salary, Experience experience){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.experience=experience;
    }
    public void setId(int id) {

        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(double salary) {

        this.salary = salary;
    }
    public double getSalary() {

        return salary;
    }
    public void setExperience(Experience experience) {

        this.experience = experience;
    }
    public Experience getExperience() {

        return experience;
    }
    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
