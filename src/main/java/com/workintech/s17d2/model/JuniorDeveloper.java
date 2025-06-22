package com.workintech.s17d2.model;

public class JuniorDeveloper  extends  Developer{
public  JuniorDeveloper(int id, String name, double salary){
    super(id,name,salary,Experience.JUNIOR);
}
    @Override
    public String toString() {
        return "Developer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" +getSalary() +
                ", experience=" + getExperience() +
                '}';
    }

}
