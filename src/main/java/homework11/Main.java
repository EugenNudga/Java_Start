package homework11;

import java.util.Scanner;

/**
 1.1 С помощью тернарного оператора написать функцию, которая будет считать исход матча.
 Метод будет принимать 4 параметра и возвращать целое число. Футбольный матч.
 4 параметра метода - результат матча и то, что поставил пользователь.
 Пример: 0,2,1,1. Что значит: команды сыграли в счёт 0:2, а пользователь ставил 1:1.
 Задача: если пользователь угадал 100% результат - возвращать 2, если угадал,
 что выиграла какая-либо команда (пр. сыграли 1:2, а ставил 0:3 - то пользователь у выиграше),
 то возвращать 1, если не угадал ничего - возвращать 0.
 **/
public class Main {
    public static void main(String[] args) {
        int resultGuessed1 = 1;
        int resultGuessed2 = 1;
        System.out.println("Please enter first team's amount of goals:");
        Scanner scanner = new Scanner(System. in);
        int firstTeamActualGoals1 = scanner.nextInt();
        System.out.println("Please enter second team's amount of goals:");
        //Scanner scanner = new Scanner(System. in);
        int firstTeamActualGoals2= scanner.nextInt();

        int result = isWin(firstTeamActualGoals1,firstTeamActualGoals2,resultGuessed1,resultGuessed2);

        System.out.println(result);
    }

    private static int isWin(int firstTeamActualGoals1, int firstTeamActualGoals2, int resultGuessed1, int resultGuessed2) {
        return ( ( (firstTeamActualGoals1 == resultGuessed1) && (firstTeamActualGoals2 == resultGuessed2) )  ? 2 :
                ( (firstTeamActualGoals1 < resultGuessed1) || (firstTeamActualGoals2 < resultGuessed2) ) ? 1 : 0);
    }


}
