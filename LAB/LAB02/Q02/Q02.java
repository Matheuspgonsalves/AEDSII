class Q02 {
    public static void main(String[] args) {
        int n1, n2;

        n1 = MyIO.readInt();
        n2 = MyIO.readInt();
        
        for(int i = n1; i <= n2; i++) {
            MyIO.print(i);
        }

        for(int i = n2; i >= n1; i--) {
            MyIO.print(i);
        }
        MyIO.println("");
    }
}
