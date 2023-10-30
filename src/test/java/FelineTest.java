import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyCorrectValueTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";

        String actualResult = feline.getFamily();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensCorrectValueTest() {
        Feline feline = new Feline();
        int expectedResult = 1;

        int actualResult = feline.getKittens();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(50);
        int expectedResult = 50;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eatMockTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Животные");
        expectedResult.add("Птицы");
        expectedResult.add("Рыба");

        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }
}
