package homeWorkOne;

public class TaskTwo {
    public static void main(String[] args) {
        int n = 1000;
        findPrimeNumbers(n);
    }

    public static void findPrimeNumbers(int n) {
        if (n < 2) {
            System.out.println("в данном диапазоне нет простых чисел");
            return;
        }
        System.out.println(2);
        for (int i = 3; i <= n; i += 2) {
            boolean flag = true;
            for (int j = 2; j * j <= n; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
