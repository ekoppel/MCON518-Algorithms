public class CollatzConjecture {
    private static boolean goesToOneRecursively(int n) {
        System.out.print(n + " ");
        if (n == 1)
            return true;
        if (n % 2 == 0)
            if (goesToOneRecursively(n / 2))
                return true;
        return goesToOneRecursively(3 * n + 1);
    }

    private static boolean goesToOneIteratively(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        System.out.print(n);
        return true;
    }

    private static int choose(int n, int k){
        if (n == k)
            return 1;
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static int factorial(int n){
        if (n == 1)
            return 1;
        return factorial(n - 1) * n;
    }



    public static void main(String[] args) {
//        goesToOneRecursively(476);
//        System.out.println("\n");
//        for (int i = 2; i < 10000; i++) {
//            System.out.println();
//            goesToOneIteratively(i);
//        }
        System.out.println(choose(9, 5));
    }
}