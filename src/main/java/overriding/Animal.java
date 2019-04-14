package overriding;

// по хорошему это класс должен быть абстрактным.
// Например если мы говорим у меня есть животное, подразумевается конкретное животное(кот, собака, конь,ююю)
// Абстрактный класс - это класс экземпляр которого создать нет возможности.
// В абстрактного класса могут быть абстрактные методы.
//Если в классе есть абстрактные методы, то он обязательно должен быть абстрактным.
//Если же класс абстрактный, то не обязательно в нем должны быть абстрактные методы.
public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display(){

        System.out.println("Name of animal: " + name);
    }

    //он может быть и не абстрактным. Но если нету мыслей
    // как его определить в абстрактном классе не для галочки,
    //а для функциональности, делаем его абстрактным.
    public abstract void voice();

    //пример из проекта bank
    //этот метод - абстрактный, хотя там и не написано abstract
    //// (т.к. здесь интерфейс, а не класс)
    //int sum(int x, int y);
}
