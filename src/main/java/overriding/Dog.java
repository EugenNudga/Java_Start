package overriding;

public class Dog extends Animal {

    //private String sound;

    public Dog(String name) {
        super(name);
    }

    //@Override -используется для оверрайда метода(перезаписи метода из родительского класса, интерфейса)
    // То есть в родительском классе или интерфейсе метод с такой сигнатурой должен быть.
//    public void voice(String sound) {
//        System.out.println("Bark!!!");
//    }

//    @Override
//    public String getName() {
//        // нужно написать свою реализацию
//        //если логику изменять не нужно, то можно не переопределять метод, а использовать как есть
//        //return super.getName();
//    }

//    @Override
//    public void display() {
//        //такое писать нету смысла, ибо метод и так будет братся из родительского класса
//        super.display();
//    }

    @Override
    public void voice() {
        System.out.println("Gaf");
    }


}
