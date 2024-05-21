package threads.cafeteria;

import exercises1_2.Arrays;
import threads.SumTask;

public class Cafeteria {
    public static void main(String[] args) throws InterruptedException {
       /* Задание: Симуляция работы кафетерия
        Вам нужно написать программу, которая будет симулировать работу кафетерия. Ваша задача — создать несколько потоков,
        каждый из которых будет представлять собой клиента, который заказывает еду. Каждый клиент будет делать заказ и ждать, пока его заказ будет выполнен.

        Шаги выполнения:
        Создайте класс Cafeteria, который будет управлять клиентами и заказами.
                Создайте класс Client, реализующий интерфейс Runnable, который будет представлять собой клиента, делающего заказ.
                Каждый клиент должен делать случайный заказ из меню и ждать, пока заказ будет выполнен.
                Создайте класс OrderProcessor, реализующий интерфейс Runnable, который будет обрабатывать заказы клиентов.
        Используйте потоки, чтобы клиенты могли делать заказы одновременно, а процессор заказов мог обрабатывать их параллельно.*/


        Client[] clients = new Client[4];
        Thread [] threadsCl = new Thread[4];

        for (int i = 0; i < threadsCl.length; i++) {
            clients[i] =  new Client();
            threadsCl[i] = new Thread(clients[i]);
            threadsCl[i].start();
        }


        OrderProcessor[] cooking = new OrderProcessor[4];
        Thread [] threadsCooking = new Thread[4];

        for (int i = 0; i < cooking.length; i++) {
            cooking[i] = new OrderProcessor(clients[i].order);
            threadsCooking[i] = new Thread(cooking[i]);
            threadsCooking[i].start();
        }


    }

}
