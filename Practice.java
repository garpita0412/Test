import java.util.*;

public class Practice {

    public int sum(List<Integer> a) {
        Integer res = 0;
        for (Integer i : a) {
            res += i;
        }
        return res;
    }

    public boolean isvalue(int a) {
        if (a == 10)
            return true;
        return false;
    }
}