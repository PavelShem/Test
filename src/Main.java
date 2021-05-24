public class Main {

    public static void main(String[] args) {
       Arithmetic arithmetic = new Arithmetic(20,12);
        arithmetic.sumNum();
        arithmetic.diff();
        arithmetic.avg();
        arithmetic.minNum();
        arithmetic.maxNum();
        System.out.println("\n\t\t Математические вычисления двух чисел " + arithmetic.numOne + " и " +
                arithmetic.numTwo + ":\n\n" +
                "\t Сумма чисел: " + arithmetic.numOne + " + " + arithmetic.numTwo + " = " + arithmetic.sumNum() +
                "\n\t Разность чисел: " + arithmetic.numOne + " - " + arithmetic.numTwo + " = " + arithmetic.diff() +
                "\n\t Проиведение чисел: " + arithmetic.numOne + " * " + arithmetic.numTwo + " = " + arithmetic.avg() +
                "\n\t Максимальное из двух чисел " + arithmetic.numOne + " и " + arithmetic.numTwo + ": " +
                arithmetic.maxNum() +
                "\n\t Минимальное из двух чисел " + arithmetic.numOne + " и " + arithmetic.numTwo + ": " +
                arithmetic.minNum());
    }


    public static void homework1(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Salt",30, 0.5);
        basket.add("apple", 120,1);
        basket.add("Orange", 125, 1, 2);
        basket.print("Salt");
    }

}
