package happyFamily;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Human {
private String name;
private String surname;
private Integer year;
private Integer iq;
private Map<String,String> schedule ;
private Family family;


    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Integer iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }


    public Human() {
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

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String,String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }


    public void greetPet() {
        if (family != null && family.getPets() != null && !family.getPets().isEmpty()) {
            Pet pet = family.getPets().iterator().next();
            System.out.println("Hello, " + pet.getNickname());
        } else {
            System.out.println("No pet ");
        }
    }

    public void describePet() {
        if (family != null && family.getPets() != null && !family.getPets().isEmpty()) {
            Pet pet = family.getPets().iterator().next();
            String slyness = (pet.getTrickLevel() > 50) ? "very sly" : "not sly";
            System.out.println("I have a " + pet.getSpecies() + ", it's " + pet.getAge() +
                    " years old, it's " + slyness + " ");
        } else {
            System.out.println("No pet ");
        }
    }

    public boolean feedPet(boolean feedTime) {
        if (feedTime) {
            System.out.println("I'll feed " + family.getPets().iterator().next().getNickname());
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            Pet pet = family.getPets().iterator().next();
            if (pet.getTrickLevel() > randomNumber) {
                System.out.println("I'll feed " + pet.getNickname());
                return true;
            } else {
                System.out.println( pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(year, human.year);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);


    }



}
