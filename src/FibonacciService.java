public class FibonacciService {
    /**
     * Находит числа Фибоначчи в массиве.
     *
     * @param numbers массив целых чисел
     * @return массив чисел Фибоначчи, найденных в массиве
     */
    public Number[] findFibonacciNumbers(Number[] numbers) {
        // Создаем массив для хранения чисел Фибоначчи
        Number[] fibonacciNumbers = new Number[numbers.length];
        int count = 0; // Счетчик для заполнения массива

        for (Number number : numbers) {
            if (isFibonacci(number)) {
                fibonacciNumbers[count] = number;
                count++;
            }
        }

        // Создаем новый массив с точным размером, удаляя пустые элементы
        Number[] result = new Number[count];
        for (int i = 0; i < count; i++) {
            result[i] = fibonacciNumbers[i];
        }
        return result;
    }
    /**
     * Проверяет, является ли число элементом ряда Фибоначчи.
     *
     * @param number число, которое нужно проверить
     * @return true, если число принадлежит ряду Фибоначчи, иначе false
     */
    public boolean isFibonacci(Number number) {
        if (number.getValue() <= 0) {
            return false; // Числа меньше или равные 0 не принадлежат ряду Фибоначчи
        }
        if (number.getValue() == 1 || number.getValue() == 2) {
            return true; // Первые два числа ряда Фибоначчи - 1
        }
        int a = 1;
        int b = 1;
        while (b < number.getValue()) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == number.getValue(); // Проверяем, совпадает ли текущее число с заданным
    }
}