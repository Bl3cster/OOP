package homeWorkOne;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputNotValid = true;
        String inputStr = "";
        String operators = "";
        String[] inputSplit = {};
        while (inputNotValid) {
            System.out.println("Введите математическое выражение. Поддерживаются знаки: [ + - * / ], порядок действий игнорируется.");
            inputStr = scanner.nextLine().replaceAll("[^0-9\\+\\-\\*\\/]", "");
            if (inputStr.equals("") ){
                System.out.println("Ошибка ввода!");
                continue;
            }
            inputSplit = inputStr.split("\\D");
            operators = inputStr.replaceAll("\\d", "");
            if (inputSplit.length > 0 && operators.length() > 0){
                inputNotValid =false;
            }
            else
                System.out.println("Ошибка ввода!");

        }
        scanner.close();

        int[] arguments = new int[inputSplit.length];
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = Integer.parseInt(inputSplit[i]);
        }

        double result = arguments[0];
        for (int i = 1; i < arguments.length; i++) {
            if (operators.charAt(i - 1) == '+') {
                result += arguments[i];
            } else {
                if (operators.charAt(i - 1) == '-') {
                    result -= arguments[i];
                } else {
                    if (operators.charAt(i - 1) == '*') {
                        result *= arguments[i];
                    } else {
                        if (operators.charAt(i - 1) == '/') {
                            if (arguments[i] == 0){
                                System.out.println("Ошибка. Деление на 0.");
                                System.exit(0);
                            }
                            result /= arguments[i];
                        } else {
                            System.out.println("Ошибка ввода.");
                            java.lang.System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
