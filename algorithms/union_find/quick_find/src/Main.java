public class Main {

    public static void main(String args[]) {
        QuickFindUF quickFindUF = new QuickFindUF(10);

        System.out.println("Before (1, 5) union: " + quickFindUF.connected(1, 5));
        quickFindUF.union(1, 5);
        System.out.println("After (1, 5) union: " + quickFindUF.connected(1, 5));

        System.out.println("Before (5, 6) union: " + quickFindUF.connected(1, 5));
        quickFindUF.union(5, 6);
        System.out.println("After (5, 6) union: " + quickFindUF.connected(1, 5));
    }
}
