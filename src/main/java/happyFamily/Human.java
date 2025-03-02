package happyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Human {
private String name;
private String surname;
private Integer year;
private Integer iq;
private String[][] schedule ;
private Family family;


    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family=family;
    }

    public Human(String Lala, String Hamidova, int year, String Zulfiyya, String Mirza) {
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


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }


    public void greetPet (){
    System.out.println("Hello,"+family.getPet().getNickname());
}
public void describePet(){

   String slyness;
    if ( family.getPet().getTrickLevel()>50){
        slyness="very sly";
    }else {
        slyness="not sly";
    }
    System.out.println("I have a " + family.getPet().getSpecies() + ", it's " + family.getPet().getAge() +
            " years old, it's " + slyness + " ");
}

public boolean feedPet(boolean feedTime){
        if ( feedTime){
            System.out.println("I'll feed "+ family.getPet().getNickname());
            return true;
        } else {
            System.out.println(family.getPet().getNickname()+ " isn't hungry");
            return false;
        }

}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(year, human.year) && Objects.equals(iq, human.iq) && Objects.deepEquals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, Arrays.deepHashCode(schedule), family);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public void setFamily(Family family) {
    }
}
