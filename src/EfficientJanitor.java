import java.util.ArrayList;
import java.util.List;

public class EfficientJanitor {
    public static void main(String[] args) {
    }

    int solution(List<Float> weight) {
        int trips = weight.size();
        float max = 2.02f;
        float max1 = 1.01f;
        float max2 = 1.01f;
        boolean maxWasChanged;

        for (int i = 0; i < weight.size(); i++)
            if (weight.get(i) > 1.99)
                weight.remove(i);

        while (weight.size() > 1) {
            maxWasChanged = false;
            for (int i = 0; i < weight.size(); i++) {
                for (int j = 0; j < weight.size(); j++) {
                    if (i == j)
                        continue;
                    if (weight.get(i) + weight.get(j) > max && weight.get(i) + weight.get(j) <= 3.00f) {
                        max = weight.get(i) + weight.get(j);
                        max1 = weight.get(i);
                        max2 = weight.get(j);
                        maxWasChanged = true;
                    }
                }
            }
            if (maxWasChanged) {
                weight.remove(max1);
                weight.remove(max2);
                trips--;
                max = 2.02f;
            } else {
                return trips;
            }
        }
        return trips;
    }

    int solution2(List<Float> weight) {
        int trips = weight.size();
        sort(weight);

        for (int i = 0; i < weight.size(); i++)
            if (weight.get(i) > 1.99f)
                weight.remove(i);

        for (int i = weight.size() - 1; i >= 0; i--) {
            for (int j = weight.size() - 1; j >= 0; j--) {
                if (i == j)
                    continue;
                if (weight.get(i) + weight.get(j) <= 3.00f) {
                    weight.remove(weight.get(i));
                    weight.remove(weight.get(j));
                    trips--;
                    while (i >= weight.size())
                        i--;
                    while (j >= weight.size())
                        j--;
                }
            }
        }
        return trips;
    }

    private void sort(List<Float> weight) {
        for (int i = 1; i < weight.size(); i++) {
            int j = 0;
            int k = i - j;
            float value = weight.get(i);
            while (k > 0 && weight.get(k - 1) > value) {
                weight.set(k, weight.get(k - 1));
                j++;
                k--;
            }
            weight.set(k, value);
        }
    }
}