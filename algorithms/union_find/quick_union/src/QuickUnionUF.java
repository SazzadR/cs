import java.util.Arrays;

public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }

        return i;
    }

    public void union(int i, int j) {
        if (root(i) != root(j)) {
            id[j] = i;
        }
    }

    public boolean connected(int i, int j) {
        return root(i) == root(j);
    }

    public String getId() {
        return Arrays.toString(id);
    }
}
