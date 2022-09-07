import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Keith", "ZZZ", 102030.00, 506070.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(506070.00, director.getBudget(), 0.00);
    }

    @Test
    public void bonusIs2percent() {
        assertEquals(2040.60, director.payBonus(), 0.0);
    }

}
