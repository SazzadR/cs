public class Main {

    public static void main(String args[]) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);

        quickUnionUF.union(1, 2);
        quickUnionUF.union(2, 3);
        quickUnionUF.union(5, 6);
        quickUnionUF.union(2, 6);
        quickUnionUF.union(1, 9);

        System.out.println("There is a connection between 6 and 9: " + quickUnionUF.connected(6, 9));
        System.out.println("There is a connection between 0 and 5: " + quickUnionUF.connected(0, 5));
        System.out.println("There is a connection between 1 and 3: " + quickUnionUF.connected(1, 3));
    }
}
