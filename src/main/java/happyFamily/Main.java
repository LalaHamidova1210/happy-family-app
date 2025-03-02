package happyFamily;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> habits = new HashSet<>(Arrays.asList("eat", "sleep"));
        Pet Moony = new Pet("cat", "Moony", 2, 80, habits);


        Human father = new Human("Mirza", "Hamidov", 1962);
        Human mother = new Human("Zulfiyya", "Hamidova", 1972);


        Map<String, String> schedule = new HashMap<>();
        schedule.put("Monday", "Fitness");
        schedule.put("Tuesday", "Reading");
        Human child = new Human ("Gunel", "Hamidova", 1992, 100, schedule);


        Family firstFamily = new Family(mother, father);
        firstFamily.setPets(new HashSet<>(Collections.singletonList(Moony)));
        firstFamily.addChild(child);
        child.setFamily(firstFamily);


        System.out.println(firstFamily.toString());
        System.out.println("Family count: " + firstFamily.countFamily());


        child.greetPet();
        child.describePet();


        child.feedPet(true);
        child.feedPet(false);


        firstFamily.deleteChild(child);
        System.out.println("After delete child: " + firstFamily.toString());
        System.out.println(" members count: " + firstFamily.countFamily());
    }
}