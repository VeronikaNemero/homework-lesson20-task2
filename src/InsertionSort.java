public class InsertionSort extends Thread{
    private int[] array;
    private Thread thread;

    public InsertionSort(int[] array, String threadName) {
        this.array = array;

        thread = new Thread(this, threadName);
    }

    public void start() {
        thread.start();
    }

    public void run() {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i;

            for (i = left - 1; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
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
