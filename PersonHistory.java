/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class PersonHistory {
     private static ArrayList<Person> personhistory;

    public PersonHistory() {
        this.personhistory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonhistory() {
        return personhistory;
    }

    public void setPersonhistory(ArrayList<Person> personhistory) {
        this.personhistory = personhistory;
        System.out.println(personhistory);
    }

    public Person addnewPerson() {
        Person newPerson = new Person();
        personhistory.add(newPerson);
        return newPerson;
    }

    public void deletePerson(Person ps) {
        personhistory.remove(ps);
    }
}
