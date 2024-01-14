public class Main {
    public static void main(String[] args) {

        int[] array1 = { 1, 12, 455, 689, 4, 90};
        int[] array2 = {70, 95, 5, 29, 444};
        int[] array3 = {100, 24, 46, 5, 52};

        SelectionSort selectionSort = new SelectionSort(array1, "Selection sort");
        InsertionSort insertionSort = new InsertionSort(array2, "Insertion sort");
        BubbleSort bubbleSort = new BubbleSort(array3, "Bubble sort");

        selectionSort.start();
        insertionSort.start();
        bubbleSort.start();

        try {
            selectionSort.getThread().join();
            insertionSort.getThread().join();
            bubbleSort.getThread().join();
        }
        catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        selectionSort.print();
        insertionSort.print();
        bubbleSort.print();
    }
}
