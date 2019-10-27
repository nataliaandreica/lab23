package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rex = new Dog();
        System.out.println(rex.name);

        rex.name = "Rex";

        rex.bark();

        Dog rexa = new Dog();
//        rexa.name = "Rexa";
        System.out.println(rexa.name);



        Cat odita = new Cat();
        odita.name = "Odita";

        System.out.println(odita.name);
        System.out.println(odita.color);

        System.out.println(odita.age);
        System.out.println(odita.gender);

        System.out.println(odita.weight);


        odita.meows();
        odita.run();
        odita.sleep();

        Cat sisi = new Cat();
        sisi.name = "Sisi";
        System.out.println(sisi.name);
    }

}