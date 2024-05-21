package threads;

public class SumTaskTest {
    /*
    Напишите программу, которая разделяет массив на несколько частей и вычисляет сумму каждой части в отдельных потоках.
    Затем объедините результаты и получите общую сумму массива.

    Инструкция:

    Создайте класс SumTask, реализующий интерфейс Runnable, который будет принимать часть массива и вычислять его сумму.
    В основном классе создайте несколько потоков для вычисления суммы каждой части массива.
    Объедините результаты из всех потоков, чтобы получить общую сумму массива.*/

    public static void main(String[] args) throws InterruptedException {
        //1. create an array of numbers
        int [] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        //2. create an array of clients & threads with loop
        SumTask [] tasks = new SumTask[4];
        Thread [] threads = new Thread[4];


        for (int i = 0; i < tasks.length; i++) {
            int start = array.length / tasks.length * i;
            int end = (i == threads.length - 1)? array.length - 1 : start + array.length / tasks.length;
            tasks[i] =  new SumTask(array, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        int sum2 = 0;
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();

            sum2 += tasks[i].getSum();
        }
        System.out.println(sum2);

    }
}
