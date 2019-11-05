public class Ramanujan {
    public static void main(String[] args) {
        int i = 10000;
        for (int a = 1; a < i; a++){
            int a3 = a * a * a;
            if (a3 > i) break;

            for (int b = a; b < i; b++){
                int b3 = b * b * b;
                if (a3 + b3 > i) break;

                for (int c = a + 1; c < i; c++){
                    int c3 = c * c * c;
                    if (c3 > a3 + b3) break;

                    for (int d = c; d < i; d++){
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3)
                            System.out.printf("%d^3 + %d^3 = %d^3 + %d^3 = %d\n", a, b, c, d, a3 + b3);
                    }
                }
            }
        }
    }
}
