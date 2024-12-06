public class Main {
    public static void main(String[] args) {
        System.out.println("23ВП2, 1л.р., 6в, Шунин Е.А., Рейимов М., Джораев А.,\n" +
                "Ввести с консоли и целых чисел и поместить их в массив. \n" +
                "На консоль вывести числа, принадлежащие \n" +
                "ряду Фибоначчи: f0 = f1 = 1, f (n) = f (nl) + f (n-2). ");
        InputOutputService inputOutputService = new InputOutputService();
        FibonacciService fibonacciService = new FibonacciService();
        try {
            Number[] numbers = inputOutputService.readNumbersFromConsole();
            Number[] fibonacciNumbers = fibonacciService.findFibonacciNumbers(numbers);
            inputOutputService.printFibonacciNumbers(fibonacciNumbers);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Введено некорректное число. Введите целые числа.");
        } catch (Exception e) {
            System.err.println("Ощибка: Отрицательное число " + e.getMessage());
        }
    }
}