import java.util.Arrays;

class WeightedQuickUnionUF {
    private int[] parent;
    private int[] sizes;

    public WeightedQuickUnionUF(int n) {
        parent = new int[n];
        sizes = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            sizes[i] = 1;
        }
    }

    public int root(int i) {
        while (i != parent[i]) {
            i = parent[i];
        }

        return i;
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ) return;

        // Make smaller root point to larger one
        if (sizes[rootP] < sizes[rootQ]) {
            parent[rootP] = rootQ;
            sizes[rootQ] += sizes[rootP];
        } else {
            parent[rootQ] = rootP;
            sizes[rootP] += sizes[rootQ];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public String getParent() {
        return Arrays.toString(parent);
    }

    public String getSizes() {
        return Arrays.toString(sizes);
    }
}