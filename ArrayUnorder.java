import java.io.*;
import java.util.*;

public class ArrayUnorder {
    int[] a;
    int size = 0;

    public ArrayUnorder(int s) {
        a = new int[s];
    }

    // search
    public boolean search(int key) {
        for (int i = 0; i < size; i++) {
            if (a[i] == key) {
                return true;
            }
        }
        return false;
    }

    // Delete
    public void delete(int ele) {
        int j;
        for (j = 0; j < size; j++) {
            if (a[j] == ele)
                break;
        }
        if (j == size)
            System.out.println("Element not found for deletion");
        for (int i = j; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;

    }

    // insert
    public void insert(int ele) {
        a[size] = ele;
        size++;
    }

    // display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
