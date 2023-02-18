public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Lion");
        animal.name = "Name:jorch";
        animal.breed = "Breed:African lion";
        animal.age = "Yaer:1";
        animal.gender = "Gender:Male";
        System.out.println(animal.name + "\n" + animal.breed + "\n" + animal.age + "\n" + animal.gender);
        System.out.println(animal.plus("htrh"));
        System.out.println(animal.minus("htsrh"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Chimpanzee");
        Animal animal1 = new Animal();
        animal1.name="Name:Bobo";
        animal1.breed="Breed:Amazion chimpanzee";
        animal1.age="Age:6-Month";
        animal1.gender="Gender:Femmale";
        System.out.println(animal1.name+"\n"+animal1.breed+"\n"+animal1.age+"\n"+animal1.gender);
        System.out.println(animal1.plus("gagga"));
        System.out.println(animal1.minus("ewag"));
        Animal animal2=new Animal();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Bear");
        animal2.name="Name:Jonothan";
        animal2.breed="Breed:Grizzly";
        animal2.age="Age:3-Month";
        animal2.gender="Gender:Male";
        System.out.println(animal2.name+"\n"+animal2.breed+"\n"+animal2.age+"\n"+animal2.gender);
        System.out.println(animal.plus("hsst"));
        System.out.println(animal.minus("gra"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }
}