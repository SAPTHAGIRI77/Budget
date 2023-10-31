public class ArrayOrdered {
    int[] a;
    int size = 0;

    public ArrayOrdered(int max) {
        a = new int[max];
    }

    // insert
    public void insert(int ele) {
        if (size == 0) {
            a[size] = ele;
            size++;
        } else {
            int j;
            for (j = 0; j < size; j++) {
                if (a[j] > ele)
                    break;
            }
            for (int k = size; k > j; k--) {
                a[k] = a[k - 1];
            }
            a[j] = ele;
            size++;
        }
    }

    // delete
    public void delete(int ele) {
        int j;
        for (j = 0; j < size; j++) {
            if (a[j] == ele)
                break;
        }
        for (int k = j; k < size - 1; k++) {
            a[k] = a[k + 1];
        }
        size--;
    }

    // display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
