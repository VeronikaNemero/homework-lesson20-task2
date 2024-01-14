public class SelectionSort extends Thread{
    private int[] array;
    private Thread thread;

    public SelectionSort(int[] array, String threadName) {
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
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
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
