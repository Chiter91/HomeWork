package temp;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        // на каждом шаге слева будет появляться отсортированный элемент
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            // поиск минимального элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // перестановка минимального элемента с первым в подмассиве
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("");
        for(int i: arr)
            System.out.print(i + " ");
    }
}
