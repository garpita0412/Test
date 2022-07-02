import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.*;

public class PracticeTest {

    private Practice practice = new Practice();

    @Test
    public void check() {
        int a = 5;
        assertEquals(false, practice.isvalue(a));
    }

    @Test
    public void testSum() {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        assertEquals(5, practice.sum(a));

    }
}
