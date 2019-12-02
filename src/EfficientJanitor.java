import java.util.ArrayList;
import java.util.List;

public class EfficientJanitor {
    public static void main(String[] args) {
    }

    public int Solution(List<Float> weight) {
        int trips = weight.size();
        float max = 2.02f;
        float max1 = 1.01f;
        float max2 = 1.01f;

        for (int i = 0; i < weight.size(); i++)
            if (weight.get(i) > 1.99)
                weight.remove(i);

        while (!weight.isEmpty()) {
            for (int i = 0; i < weight.size(); i++) {
                for (int j = 0; j < weight.size(); j++) {
                    if (i == j)
                        continue;
                    if (weight.get(i) + weight.get(j) > max) {
                        max = weight.get(i) + weight.get(j);
                        max1 = weight.get(i);
                        max2 = weight.get(j);
                    }
                }
            }
            weight.remove(max1);
            weight.remove(max2);
            trips--;
            max = 2.02f;
        }
        return trips;
    }

    public int solution2(List<Float> weight){
        float sum = 0.0f;

        for (Float bag : weight) {
            sum += bag;
        }
        double sum1 = (double) sum;
        return (int) Math.ceil(sum1/3.00);
    }
}