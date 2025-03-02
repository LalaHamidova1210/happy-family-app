package happyFamily;

public class Main {
    public static void main(String[] args) {
        Pet Leo=new Pet ("dog","Leo");
        Pet Moony=new Pet ("cat","Moony", 2, 80, new String[]{"eat", "sleep"});

        Human Mirza=new Human ("Mirza","Hamidov",1962 );
        Human Zulfiyya = new Human ("Zulfiyya", "Hamidova",1972);
        Human Gunel=new Human("Gunel", "Hamidova",1992, 80, Moony, Zulfiyya, Mirza, new String [][]{{"Monday", "Fitness"},{"Tuesday", "Reading"}});

        Family firstFamily= new Family(Zulfiyya,Mirza);
        firstFamily.setPet(Moony);
        firstFamily.addChild(Gunel);

        System.out.println(firstFamily);
        System.out.println(Gunel);
        System.out.println(Moony);


        Gunel.greetPet();
        Gunel.describePet();
        Gunel.feedPet(true);
        Gunel.feedPet(false);
        Moony.eat();
        Moony.respond();
        Moony.foul();


    }


}
