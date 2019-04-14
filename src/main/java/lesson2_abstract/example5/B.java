package lesson2_abstract.example5;

public class B extends A {
    //аннотация  @Override используется когда мы переопределяем метод из родительского класса
    // или пишем реализацию интерфейса
    @Override
    public void print() {
        super.print();
    }

    @Override
    //важна сигнатура метода + возвращаемый тип
    //относительно модификатор доступа.
    //модификаторы доступа остаются на том же уровне или делаем более открытими метоыд.
    //http://www.quizful.net/post/features-of-the-application-of-modifiers-in-java
    //PRIVATE->DEFAULT PACKAGED (если модификатор доступа не указан)->PROTECTED->PUBLIC
    //method with private access modifier could not override.
    //область видимости для приватного метода ограничена его классом, по этому в классах даже наследниках
    // приватные методы не видны, соответственно его нельзя переопределить.

    public void print(String blabla){
        System.out.println("blabla");
    }

//    @Override
//    //аннотация ругается и говорит, что метода с такой сигнатурой в родительском классе нету
//    public void privateMethod(){
//        System.out.println("private method");
//    }

//    @Override
//    //Статические методы не оверайдятся. Так как статика не наследывается, а пренадлежит целому классу.
//    public static void hello(){
//        System.out.println("hello from class B");
//    }
}
