package overriding;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); //new Animal() - это называется "экземпляр класса Animal"
        //в этом случае из-за того, что Animal - абстрактный класс, мы не можем создать экземпляр класса Animal


        Animal animal1 = new Dog("Ovcharka");
        Animal animal2 = new Cat("Sibirsky");

        animal1.display();
        animal1.voice();
        animal2.display();
        animal2.voice();

    }


}
