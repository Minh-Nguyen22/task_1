import employees.Accountant;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountantTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addToMapTest() {
        Accountant accountant = new Accountant();

        accountant.addToMap(1, 6000.0);
        accountant.addToMap(2, 4000.3);
        accountant.addToMap(3, 8540.9);

        Map<Integer, Double> actual = accountant.getMapOfEmployees();

        Map<Integer, Double> expected = new LinkedHashMap<>();
        expected.putAll(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSumOfSalariesTest() {
        Accountant accountant = new Accountant();

        accountant.addToMap(1, 6000.0);
        accountant.addToMap(2, 4000.34);
        accountant.addToMap(3, 8540.9);

        double actual = accountant.getSumOfSalaries();

        double expected = 18541.2;

        Assert.assertEquals(expected, actual, 1);
    }
}
