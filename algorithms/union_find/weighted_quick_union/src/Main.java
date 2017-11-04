class Main {
    public static void main(String args[]) {
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);

        weightedQuickUnionUF.union(1, 2);
        weightedQuickUnionUF.union(2, 7);
        weightedQuickUnionUF.union(3, 5);
        weightedQuickUnionUF.union(5, 9);
        weightedQuickUnionUF.union(0, 9);
        weightedQuickUnionUF.union(1, 5);
//        weightedQuickUnionUF.union(1, 0);

        System.out.println("Is 3 and 9 are connected? " + weightedQuickUnionUF.connected(3, 9));
        System.out.println("Is 6 and 0 are connected? " + weightedQuickUnionUF.connected(6, 0));
    }
}