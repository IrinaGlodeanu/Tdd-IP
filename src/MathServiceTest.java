import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest {

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @After
    public void tearDown() {
        mathService = null;
    }

    @Test
    public void leap_year_should_be_divisible_by_four() {
        // arrange && act
        boolean result = mathService.isLeapYear(4);
        //assert
        assertTrue(result);
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four() {
        // arrange && act
        boolean result = mathService.isLeapYear(3);
        //assert
        assertFalse(result);
    }

    @Test
    public void leap_year_should_not_be_divisible_by_one_hundred() {
        // arrange && act
        boolean result = mathService.isLeapYear(2100);
        //assert
        assertFalse(result);
    }

    @Test
    public void non_leap_year_should_be_divisible_one_hundred() {
        // arrange && act
        boolean result = mathService.isLeapYear(2016);
        //assert
        assertTrue(result);
    }

    @Test
    public void leap_year_should_be_divisible_by_four_hundred() {
        // arrange && act
        boolean result = mathService.isLeapYear(2400);
        //assert
        assertTrue(result);
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four_hundred() {
        // arrange && act
        boolean result = mathService.isLeapYear(2401);
        //assert
        assertFalse(result);
    }
}
