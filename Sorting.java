class Bubble {
    int[] a;
    int n;

    public Bubble(int[] a) {
        this.a = a;
        n = a.length;
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

class selection {
    int[] a;
    int n;

    public selection(int[] a) {
        this.a = a;
        n = a.length;
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }
}

public class Sorting {
    public static void main(String args[]) {
        int[] a = new int[] { 1, 3, 6, 3, 8, 3, 5, 9, 10, 9 };
        Bubble b = new Bubble(a);
        // b.sort();
        b.display();

        selection c = new selection(a);
        // c.sort();
        System.out.println("after");
        b.display();
    }
}