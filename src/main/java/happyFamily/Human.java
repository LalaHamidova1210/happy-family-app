package happyFamily;

import java.util.Arrays;

public class Human {
private String name;
private String surname;
private Integer year;
private Integer iq;
private Pet pet;
private Human mother;
private Human father;
private String[][] schedule ;


    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String lala, String hamidova, int year, String zulfiyya, String mirza) {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public void greetPet (){
    System.out.println("Hello,"+pet.getNickname());
}
public void describePet(){

   String slyness;
    if ( pet.getTrickLevel()>50){
        slyness="very sly";
    }else {
        slyness="not sly";
    }
    System.out.println("I have a " + pet.getSpecies() + ", it's " + pet.getAge() +
            " years old, it's " + slyness + " ");
}

public boolean feedPet(boolean feedTime){
        if ( feedTime){
            System.out.println("I'll feed "+ pet.getNickname());
            return true;
        } else {
            System.out.println(pet.getNickname()+ " isn't hungry");
            return false;
        }

}
}
