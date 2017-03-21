public class MathService {

    private boolean isDivisibleByFour(int year) {
        return (year % 4 == 0);
    }

    private boolean isDivisibleByOneHundred(int year) {
        return (year % 100 == 0);
    }

    private boolean isDivisibleByFourHundred(int year) {
        return (year % 400 == 0);
    }

    private boolean isDivisibleByFourButNotByOneHundred(int year) {
        return (isDivisibleByFour(year) && !isDivisibleByOneHundred(year));
    }

    public boolean isLeapYear(int year) {
        return (isDivisibleByFourButNotByOneHundred(year) || isDivisibleByFourHundred(year));
    }

}
