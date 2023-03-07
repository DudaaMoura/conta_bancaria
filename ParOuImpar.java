public class ParOuImpar {
    public static void main(String[] args) {

        int x = 13;

        if (x > 1) {

            for (int i = x; i > 1; i--) {

                if (x % 2 == 0) {
                    x = x / 2;
                    System.out.print(x + " ");
                } else {
                    x = 3 * x + 1;
                    System.out.print(x + " ");
                }

            }

        } else {
            System.out.println(x);
        }

    }
}