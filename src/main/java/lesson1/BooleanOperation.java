package lesson1;

public class BooleanOperation {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        boolean result1 = a && b;// && -краткая форма, &-полная форма
        //табличку истиности для and
        // true and true = true в других случаях false

        int c = 10;
        int d = 10;
        //мы все рассматрвиаем в контексте таблицы истиности and
        boolean result2 = (10 < 2) && (c++ > 0);//краткая форма очень ленивая. если первая
        // часть false то она понимает, что вторую часть можно и не смотреть
        boolean result3 = (10 < 2) & (d++ > 0);// полная форма не оптимальная даже если первая часть
        //false она будет проверять и вторую, по этому инкремента отработала.
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        //что мы получим в консоле? то есть

        // аналогично будет для ||

        int e=10;
        int f=10;
        //можешь аналог написать для или? нужно акцентировать внимание на таблицу истинности
        // для или достаточно чтобы одно значение было true
        boolean result4 = (10 > 2) || (e++ > 0);
        boolean result5 = (10 > 2) | (f++ > 0);
        System.out.println("e=" + e);//10
        System.out.println("f=" + f);//11
        //нужно будет про это почитать тебе

    }
}
