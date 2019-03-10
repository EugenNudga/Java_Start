package homework12;

/**
 * 1.2 Нарисовать ромб с звёздочек заданной величины.
 * Пример: величина 3, значит максимальное кол-во звёзд в ряду будет 3.
 */

public class Main {
    public static void main(String[] args) {
        //если макс. кол-во звёздочек в ряду - 3, ну тогда в высоту тоже будет 3
        int n = 3;
        int i, j, spaces;


        for (i = 1; i <= n; ++i) {//первая часть ромба (ширина максимум n звёдздочек)
            for (spaces = n - i; spaces > 0; --spaces) {//пробелы
                System.out.print(" ");
            }
            for (j = 2*i-1; j > 0; --j) {//звёздочки
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = n-1; i >=0 ; --i) {//вторая часть ромба (ширина максимум n-1 звёдздочек)
            for (spaces = 0; spaces < n-i; ++spaces) {//пробелы
                System.out.print(" ");
            }
            for (j = 0; j < 2*i-1; ++j) {//звёздочки
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
