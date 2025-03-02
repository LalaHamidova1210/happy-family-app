package happyFamily;

public class Main {
    public static void main(String[] args) {
        Pet Moony=new Pet ("cat","Moony", 2, 80, new String[]{"eat", "sleep"});

        Human father=new Human ("Mirza","Hamidov",1962 );
        Human mother = new Human ("Zulfiyya", "Hamidova",1972);
        Human child=new Human("Gunel", "Hamidova",1992, 80, Moony, father,mother, new String [][]{{"Monday", "Fitness"},{"Tuesday", "Reading"}});

        Family firstFamily= new Family(mother,father);
        firstFamily.setPet(Moony);
        firstFamily.addChild(child);

        System.out.println(firstFamily.toString());
        System.out.println("Family count: " + firstFamily.countFamily());

        firstFamily.deleteChild(child);
        System.out.println("After delete child: " + firstFamily.toString());
        System.out.println("Family members count: " + firstFamily.countFamily());




    }


}
