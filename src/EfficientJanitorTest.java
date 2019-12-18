import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EfficientJanitorTest {

    @Test
    public void testJanitor(){
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

        int trips = janitor.Solution(weight);

        assertEquals(9, trips);
    }

    @Test
    public void janitor2(){
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

        int trips = janitor2.solution2(weight);

        assertEquals(8, trips);
    }
}
