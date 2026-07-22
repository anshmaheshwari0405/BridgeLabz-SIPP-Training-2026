class MaxHeap {
    void buildHeap(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    void heapify(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, size);
        }
    }

    void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] marketCap = {1200,3500,1800,5000,2700,4500};
        MaxHeap h = new MaxHeap();
        h.buildHeap(marketCap);
        h.print(marketCap);
    }
}