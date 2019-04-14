package lesson2_abstract.example3;

public abstract class MyAbstractClass {
    //Отличие абстрактного класса от интерфейса в том, что этот класс может хранить состояние
    // Состояние объекта описывется его полями. В абстрактном классе можно создавать поля. а в интерфейсе нет.
    protected String name;

    public MyAbstractClass(String name) {
        this.name = name;
    }

    public MyAbstractClass() {
        this.name="DIDi";
    }

    public abstract void print();

    public abstract void hi();
}
