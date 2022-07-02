import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PracticeTest {

    private Practice practice = new Practice();

    @Test
    public void check() {
        int a = 5;
        assertEquals(false, practice.isvalue(a));
    }
}
