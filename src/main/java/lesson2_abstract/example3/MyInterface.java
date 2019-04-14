package lesson2_abstract.example3;

//Отличиче интерфейсов от абстрактных классов, это возможнось асбтрактных классов хранить состояние.
public interface MyInterface {
    // String name;// это расценивается как онстанта и требует присвоение сразу значения
    public static final String NAME = "name";

    //в интерфейсах методам не нужны public, private and protected
    void print();

    void hi();

}
