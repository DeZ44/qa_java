import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodMockTest {

    @Mock
    Feline feline;


    @Test
    public void getFoodMockTest2() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Хищник");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);

        List<String> actualResult = cat.getFood();
        assertEquals(expectedResult, actualResult);
    }
}
