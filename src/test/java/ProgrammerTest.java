import employees.Programmer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProgrammerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void setMonthlySalaryTest() {

        Programmer programmer = new Programmer(1, "John", "Swift");

        programmer.setMonthlySalary(10, 10000);

        double actual = programmer.getMonthlySalary();

        double expected = 2500;

        Assert.assertEquals(expected, actual, 0);

    }
}
