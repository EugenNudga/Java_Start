package homework13;

public class BaseNumberAndItsPower {


    // what if power<0? method should be fixed
    // should be 2^3=8 and 2^-3=1/8. In your case it will be 2^3=8 and 2^-3=8
    //Method should be  simplified
    public double pow(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < abs(exponent); i++) {
            result *= base;
        }
        return exponent > 0 ? result : (1 / result);//if exponent is -3 => less than 0 => 2^-3=1/8

    }

    private int abs(int number) {
        return number > 0 ? number : -number;
    }

}
