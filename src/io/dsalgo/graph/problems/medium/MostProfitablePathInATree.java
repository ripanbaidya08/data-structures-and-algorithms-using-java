package io.dsalgo.graph.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * According to the problem, we know that Bob's moving path is fixed, that is, starting from node <i>bob</i>
 * and finally reaching node 0. Therefore, we can first run a DFS to find out the time it takes for Bob to reach each node,
 * which we record in the array <i>ts<i/>.
 * <br>
 * Then we run another DFS to find the maximum score for each of Alice's moving paths. We denote the time for Alice to reach node
 * i as t, and the current cumulative score as v. After Alice passes node i , the cumulative score has three cases:
 * <br>
 * 1. The time t for Alice to reach node i is the same as the time ts[i] for Bob to reach node i.
 * In this case, Alice and Bob open the door at node i at the same time, and the score Alice gets is (v+ amount[i]/2).
 * <br>
 * 2. The time t for Alice to reach node i is less than the time ts[i] for Bob to reach node i.
 * In this case, Alice opens the door at node i, and the score Alice gets is (v + amount[i]).
 * <br>
 * 3. The time t for Alice to reach node i is greater than the time ts[i] for Bob to reach node i.
 * In this case, Alice does not open the door at node i, and the score Alice gets is v, which remains unchanged.
 *
 * <br> When Alice reaches a leaf node, update the maximum score.
 *
 * <br> The time complexity is O(n), and the space complexity is O(n), where n is the number of nodes in the tree.
 *
 */

// 2467. Most Profitable Path in a Tree
class MostProfitablePathInATree {
    private List<Integer>[] g;
    private int[] amount;
    private int[] ts;
    private int ans = Integer.MIN_VALUE;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = edges.length + 1;
        g = new List[n];
        ts = new int[n];
        this.amount = amount;
        Arrays.setAll(g, k -> new ArrayList<>());
        Arrays.fill(ts, n);
        for (var e : edges) {
            int a = e[0], b = e[1];
            g[a].add(b);
            g[b].add(a);
        }
        dfs1(bob, -1, 0);
        ts[bob] = 0;
        dfs2(0, -1, 0, 0);
        return ans;
    }

    private boolean dfs1(int i, int fa, int t) {
        if (i == 0) {
            ts[i] = Math.min(ts[i], t);
            return true;
        }
        for (int j : g[i]) {
            if (j != fa && dfs1(j, i, t + 1)) {
                ts[j] = Math.min(ts[j], t + 1);
                return true;
            }
        }
        return false;
    }

    private void dfs2(int i, int fa, int t, int v) {
        if (t == ts[i]) {
            v += amount[i] >> 1;
        } else if (t < ts[i]) {
            v += amount[i];
        }
        if (g[i].size() == 1 && g[i].get(0) == fa) {
            ans = Math.max(ans, v);
            return;
        }
        for (int j : g[i]) {
            if (j != fa) {
                dfs2(j, i, t + 1, v);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        int bob = 3;
        int[] amount = {-2, 4, 2, -4, 6};

        MostProfitablePathInATree obj = new MostProfitablePathInATree();
        System.out.println(obj.mostProfitablePath(edges, bob, amount));
    }
}