package lesson2_abstract.example1;

// если класс В не переопределяет все методы, то он тоже должен быть абстрактным
public abstract class B extends A {
    @Override
    void hello() {
        System.out.println("hello");
    }

    //!!! примечание !!!
    //если метод внизу раскомментировать, то класс В может не быть абстрактным
    //зато если метод закомментировать, то класс В должен быть абстрактным
//
//    @Override
//    void hi() {
//
//    }
}
