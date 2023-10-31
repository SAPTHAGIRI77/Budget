import java.lang.reflect.Array;

class ArrayMain {
    public static void main(String arg[]) {
        ArrayUnorder a = new ArrayUnorder(10);
        a.insert(1);
        a.insert(2);
        a.insert(4);
        a.insert(3);

        a.display();
        System.out.println(a.search(4) ? "found" : "not found");
        a.delete(1);
        a.display();

        // ordered
        System.out.println("ordered");
        ArrayOrdered b = new ArrayOrdered(10);
        b.insert(1);
        b.insert(8);
        b.insert(2);
        b.insert(4);
        b.insert(20);
        // b.display();
        b.delete(20);
        // b.display();

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int min = 0;
        int max = arr.length - 1;
        BinarySearch c = new BinarySearch();
        System.out.println("element:" + c.search(arr, 5, min, max));
        System.out.println("element:" + c.find(arr, 7, min, max));
    }
}