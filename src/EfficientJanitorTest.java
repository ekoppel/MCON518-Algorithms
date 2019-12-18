import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EfficientJanitorTest {

    @Test
    public void testJanitor() {
        EfficientJanitor janitor = new EfficientJanitor();
        List<Float> weight = new ArrayList<>();
        weight.add(1.92f);
        weight.add(1.01f);

        weight.add(1.06f);
        weight.add(1.84f);

        weight.add(1.51f);
        weight.add(1.45f);

        weight.add(1.51f);
        weight.add(1.26f);

        weight.add(1.72f);
        weight.add(1.27f);

        weight.add(2.10f);

        weight.add(2.72f);

        weight.add(1.78f);

        weight.add(1.28f);
        weight.add(1.15f);

        long start = System.nanoTime();
        int trips = janitor.solution(weight);
        long end = System.nanoTime() - start;
        System.out.println("time of solution 1 : " + end);

        assertEquals(9, trips);
    }

    @Test
    public void janitor2() {
        EfficientJanitor janitor2 = new EfficientJanitor();
        List<Float> weight = new ArrayList<>();
        weight.add(1.92f);
        weight.add(1.01f);

        weight.add(1.06f);
        weight.add(1.84f);

        weight.add(1.51f);
        weight.add(1.45f);

        weight.add(1.51f);
        weight.add(1.26f);

        weight.add(1.72f);
        weight.add(1.27f);

        weight.add(2.10f);

        weight.add(2.72f);

        weight.add(1.78f);
        weight.add(1.15f);

        weight.add(1.28f);

        long start = System.nanoTime();
        int trips = janitor2.solution2(weight);
        long end = System.nanoTime() - start;
        System.out.println("time of solution 2 : " + end);

        assertEquals(9, trips);
    }
}
