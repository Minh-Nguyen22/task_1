import employees.Manager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ManagerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void setMonthlySalaryTest() {

        Manager manager = new Manager(3, "Kate", "Arrow");

        manager.setMonthlySalary(10, 10000);

        double actual = manager.getMonthlySalary();

        double expected = 2500;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void getPercentOfSalary() {

        Manager manager = new Manager(3, "Kate", "Arrow");

        manager.setMonthlySalary(36, 10000);

        double actual = manager.getPercentOfSalary();

        double expected = -10;

        Assert.assertEquals(expected, actual, 0);

    }
}
