public class BubbleSort extends Thread{
    private int[] array;
    private Thread thread;

    public BubbleSort(int[] array, String threadName) {
        this.array = array;

        thread = new Thread(this, threadName);
    }

    public void start() {
        thread.start();
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void run() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public Thread getThread() {
        return thread;
    }

    public void print() {
        System.out.print(thread.getName() + " - ");

        for (int sort : array) {
            System.out.print(sort + " ");
        }
        System.out.println();
    }
}
