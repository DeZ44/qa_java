import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getSoundCorrectValueTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";

        String actualResult = cat.getSound();

        assertEquals(expectedResult, actualResult);
    }


}
