package lesson2_abstract.example4;

//что бы не реализировать методы, используем модификатор abstract
public  /*abstract*/ class FunctionalClass implements FunctionInterface {

    //без переопределения метода приходится ставить модификатор abstract над классом
    @Override
    public Object function(Object element) {
        return null;
    }

}
