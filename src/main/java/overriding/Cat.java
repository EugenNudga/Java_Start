package overriding;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

//    @Override
//    public void display() {
//        // есть смысл. если добавлять или изменять логику
//        //super.display();
//        System.out.println("hello");
//    }

    @Override
    public void voice() {
        System.out.println("Meow!!!");
    }
}
