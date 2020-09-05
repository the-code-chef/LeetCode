package FindCenterOfStarGraph;

public class FindCenterStarGraph {

    private static int findCenter(int[][] edges) {
        // since it's a star graph, take any two edges and return common
        // first edge
        int[] edge1 = edges[0];
        int u = edge1[0];
        int v = edge1[1];
        
        // second edge
        int[] edge2 = edges[1];
        int x = edge2[0];
        int y = edge2[1];
        
        int res = Integer.MIN_VALUE;
        
        if(u == x || u == y) {
            res = u;
        }
        
        if(v == x || v == y) {
            res = v;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2},{5,1},{1,3},{1,4}};
        int center = findCenter(graph);
        System.out.println(center);
    }
}
