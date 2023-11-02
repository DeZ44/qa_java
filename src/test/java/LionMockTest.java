import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensMockTest() {
        Lion lion = new Lion(feline);
        int expectedResult = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);

        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodMockTest() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);

        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void lionExceptionTest() throws Exception {
            Lion lion = new Lion("Кот");
    }
}
