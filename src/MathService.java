public class MathService {


    public static boolean isDivisibleByFour(int year) {
        return (year % 4 == 0);
    }

    public static boolean isDivisibleByOneHundred(int year) {
        return (year % 100 == 0);
    }

    public static boolean isDivisibleByFourHundred(int year) {
        return (year % 400 == 0);
    }

    public static boolean isDivisibleByFourButNotByOneHundred(int year) {
        return (isDivisibleByFour(year) && !isDivisibleByOneHundred(year));
    }

    public static boolean isLeapYear(int year) {
        return (isDivisibleByFourButNotByOneHundred(year) || isDivisibleByFourHundred(year));
    }


}
