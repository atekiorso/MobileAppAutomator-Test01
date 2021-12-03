import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
    private int actualLocalNumber;

    @Before
    public void getActualLocalNumber() {
        this.actualLocalNumber = MainClass.getLocalNumber();
    }

    @Test
    public void testGetLocalNumber() {
        final int expectedLocalNumber = 14;
        final String errorMessage = "Результат функции MainClass.getLocalNumber() не соответствует ожидаемому значению.";

        Assert.assertEquals(errorMessage, expectedLocalNumber, actualLocalNumber);
    }
}
