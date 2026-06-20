import java.util.*;
public class RedAndBlueTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long K=sc.nextLong();
        int[] A=new int[M];
        for (int i=0;i<M;i++) A[i]=sc.nextInt()-1;
        List<int[]>[] adj=new ArrayList[N];
        for (int i=0;i<N;i++) adj[i]=new ArrayList<>();
        for (int i=0;i<N-1;i++) {
            int u=sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[u].add(new int[]{v,i});
            adj[v].add(new int[]{u,i});
        }
        long[] t=new long[N-1];
        for(int i=0;i<M-1;i++) {
            getPath(A[i],A[i+1],-1,adj,t);
        }
        long sumT=0;
        for (long val:t) sumT+=val;
        long target=K+sumT;
        if (target<0 || target%2!=0 || target>2*sumT) {
            System.out.println(0);
            return;
        }
        long MOD=998244353;
        int targetSum=(int)(target/2);
        long[] dp=new long[targetSum+1];
        dp[0]=1;
        for(long val:t) {
            for (int j=targetSum;j>=val;j--) {
                dp[j]=(dp[j]+dp[j-(int)val])%MOD;
            }
        }
        System.out.println(dp[targetSum]);
    }
    private static boolean getPath(int curr,int target,int parent,List<int[]>[] adj,long[] t) {
        if(curr==target) return true;
        for(int[] edge:adj[curr]) {
            if(edge[0]!=parent) {
                if(getPath(edge[0],target,curr,adj,t)) {
                    t[edge[1]]++;
                    return true;
                }
            }
        }
        return false;
    }
}