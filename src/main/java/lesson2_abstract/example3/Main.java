package lesson2_abstract.example3;

public class Main {
    public static void main(String[] args) {
        //рассмотрим аннонимные классы еще раз на примере интерфейса и асбтрактного класса

        //аннонимный класс на основе интерфейса
        //екзепляр аннонимного класса только один
        MyInterface myInterface = new MyInterface(/*String name*/) {
            //создать контурктор не удастся. По сему автоматически конструктор дефолтный
            private String name;

            @Override
            public void print() {
                System.out.println("print");
            }

            @Override
            public void hi() {
                System.out.println("hello");
            }
        };
        myInterface.print();
        myInterface.hi();
        String name = myInterface.NAME;//так лучше не вызывать констану, так как она пренадлежит
        //целому интерфейсу
        //Не нужно ее вызывать через объект
        System.out.println(MyInterface.NAME);

        //аннонимный класс на основании абстрактного класса
        //это не использование. По сути наследование. Но как такой класс новый не создаем, только его
        // объект.
        MyAbstractClass myAbstractClass=new MyAbstractClass("Alex") {
        /*пробуй убирать Alex и тогда выведет другое имя*/
            @Override
            public void print() {
                System.out.println(this.name + " (check if it will be printed)");
            }

            @Override
            public void hi() {
                System.out.println(this.name+ " hi");
            }
        };
        myAbstractClass.hi();
        myAbstractClass.print();
    }
}
