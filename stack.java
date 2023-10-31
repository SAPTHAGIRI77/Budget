class stack {
    public void stackpush(Stack<Integer> s) {
        for (int i = 0; i < 5; i++) {
            s.push(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> s = new Stack<Integer>();
        stackpush(s);
        System.out.println(s);
    }
}