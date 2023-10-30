import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean expected;


    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getDoesHaveMane() {
        return new Object[][]{
                {/*sex*/ "Самец",/*expected*/ true},
                {/*sex*/ "Самка",/*expected*/ false},
        };
    }


    @Test
    public void lionTest() throws Exception {

        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();

        assertEquals(expected, actualResult);
    }


}

