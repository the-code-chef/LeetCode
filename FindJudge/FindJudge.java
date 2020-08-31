package FindJudge;

class FindJudge {
    public int findJudge(int N, int[][] trust) {
        int[] truster = new int[N + 1];
        int[] trustee = new int[N + 1];
        for (int[] t : trust) {
            int t1 = truster[t[0]]++;
            int t2 = trustee[t[1]]++;
            System.out.println(t1);
            System.out.println(t2);
        }
        for (int i = 1; i <= N; i++) {
            if (truster[i] == 0 && trustee[i] == N - 1) {
                System.out.println("find");
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}