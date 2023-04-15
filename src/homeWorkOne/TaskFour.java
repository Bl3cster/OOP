package homeWorkOne;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение следующего типа 2? + ?5 = 69: ");
        String[] input = in.nextLine().split(" ");
        in.close();

        for (int i = 0; i < 10; i++) {
                if (Integer.parseInt(input[0].replace("?", String.valueOf(i)))
                        + Integer.parseInt(input[2].replace("?", String.valueOf(i)))
                        == Integer.parseInt(input[4].replace("?", String.valueOf(i)))) {
                    System.out.println(input[0].replace("?", String.valueOf(i)) + input[1]
                            + input[2].replace("?", String.valueOf(i)) + " = "
                            + input[4].replace("?", String.valueOf(i)));
                    return;
            }
        }
        System.out.println("Решения уравниения нет");
    }
}
