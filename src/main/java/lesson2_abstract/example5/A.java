package lesson2_abstract.example5;

public class A {
    //Название методов одинаковое, а вот колличесвто параметров разное (нету, и один)
    //В данном случае это оверлоуд.
    public void print(){
        System.out.println("print");
    }

    public void print(String message){
        System.out.println(message);
    }
    //если ты думаешь что так можно, то так нельзя сделать с помощью @Override:
//    @Override
//    public void print(String message){
//        System.out.println(message);
//    }

    //так тоже нельзя. Методы не могут иметь одинаковую сигнатуру.
    //К сигнатуре метода(в данном случае print(String))
    // относится его имя, последовательность параметров
    // и типы параметров(название параметра не учитывается)
    //к сигнатуре не относится возвращаемый тип
    //сигнатура этого метода
    // print(String)
//    public String print(String mes){
//        return mes;
//    }

    private void privateMethod(){
        System.out.println("private method");
    }

    //и последнее это статические методы

    public static void hello(){
        System.out.println("hello from class A");
    }
}
