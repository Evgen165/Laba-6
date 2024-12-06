import java.util.InputMismatchException;
import java.util.Scanner;
public class InputOutputService {
    /**
     * Считывает целые числа с консоли и помещает их в массив.
     *
     * @return массив целых чисел, введенных с консоли
     */
    public Number[] readNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества чисел с обработкой исключений
        int size = 0;
        while (true) {
            try {
                System.out.print("Введите количество чисел: ");
                size = scanner.nextInt();
                break; // Выход из цикла, если ввод был корректным
            } catch (InputMismatchException e) {
                System.err.println("Ошибка: Введено некорректное количество чисел. Введите целое число.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }
        // Создание массива и ввод чисел с обработкой исключений
        Number[] numbers = new Number[size];
        System.out.println("Введите числа:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    numbers[i] = new Number(scanner.nextInt());
                    break; // Выход из цикла, если ввод был корректным
                } catch (InputMismatchException e) {
                    System.err.println("Ошибка: Введено некорректное число. Введите целое число.");
                    scanner.nextLine(); // Очищаем буфер ввода
                }
            }
        }
        return numbers;
    }
    /**
     * Выводит на консоль числа из массива.
     *
     * @param numbers массив целых чисел
     */
    public void printFibonacciNumbers(Number[] numbers) {
        System.out.println("Числа, принадлежащие ряду Фибоначчи:");
        for (Number number : numbers) {
            if (number != null) { // Проверяем, не пустой ли элемент
                System.out.print(number.getValue() + " ");
            }
        }
        System.out.println();
    }
}