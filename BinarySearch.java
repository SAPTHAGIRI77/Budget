public class BinarySearch {
    // Recursive
    public boolean search(int[] a, int ele, int min, int max) {
        if (min <= max) {
            int mid = (min + max) / 2;
            if (a[mid] == ele) {
                return true;
            } else if (a[mid] > ele) {
                return search(a, ele, min, mid - 1);
            } else {
                return search(a, ele, mid + 1, max);
            }
        } else
            return false;
    }

    // loops
    public boolean find(int[] a, int ele, int min, int max) {
        while (true) {
            if (min <= max) {
                int mid = (min + max) / 2;
                if (a[mid] == ele) {
                    return true;
                } else if (a[mid] > ele) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            } else
                return false;
        }
    }

}
