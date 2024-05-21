package threads;

public class SumTask implements Runnable {

    private int [] arr;
    private int startI;
    private int endI;
    private int sum;

    public int getSum() {
        return sum;
    }

    public SumTask(int[] arr, int startI, int endI) {
        this.arr = arr;
        this.startI = startI;
        this.endI = endI;
        this.sum = 0;
    }

    @Override
    public void run() {
            for (int i = startI; i <= endI; i++) {
                sum += arr[i];
            }
    }


}
