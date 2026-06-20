import java.util.*;
import java.io.*;
public class ExpensiveExpense {
    static class Edge {
        int to;
        long weight;
        Edge(int to,long weight) {this.to=to; this.weight=weight; }
    }
    static List<Edge>[] adj;
    static long[] D;
    static long[] maxDist; 
    static long[] ans;     

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        adj = new ArrayList[N + 1];
        for (int i=1;i<=N;i++) adj[i] = new ArrayList<>();
        for (int i=0;i<N-1;i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            long c=Long.parseLong(st.nextToken());
            adj[u].add(new Edge(v,c));
            adj[v].add(new Edge(u,c));
        }
        D=new long[N+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i=1;i<=N;i++) D[i]=Long.parseLong(st.nextToken());
        maxDist=new long[N+1];
        ans=new long[N+1];
        dfs1(1,-1);
        dfs2(1,-1,-1);
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=N;i++) sb.append(ans[i]).append("\n");
        System.out.print(sb);
    }
    static void dfs1(int u,int p) {
        maxDist[u]=D[u];
        for (Edge e:adj[u]) {
            if (e.to==p) continue;
            dfs1(e.to,u);
            maxDist[u]=Math.max(maxDist[u],maxDist[e.to]+e.weight);
        }
    }
    static void dfs2(int u,int p,long distFromParent) {
        List<Edge> children=new ArrayList<>();
        for(Edge e:adj[u]) if(e.to!=p) children.add(e);
        int m=children.size();
        long[] vals=new long[m];
        for (int i=0;i<m;i++) vals[i]=maxDist[children.get(i).to]+children.get(i).weight;
        long[] pre=new long[m+1];
        long[] suf=new long[m+1];
        Arrays.fill(pre,-1); Arrays.fill(suf,-1);
        for(int i=0;i<m;i++) pre[i+1]=Math.max(pre[i],vals[i]);
        for(int i=m-1;i>=0;i--) suf[i]=Math.max(suf[i+1],vals[i]);
        long best=distFromParent;
        for(long v:vals) best=Math.max(best,v);
        ans[u]=best;
        for(int i=0;i<m;i++) {
            long bestOutside=Math.max(distFromParent,D[u]);
            bestOutside=Math.max(bestOutside,Math.max(pre[i],suf[i+1]));
            dfs2(children.get(i).to,u,bestOutside+children.get(i).weight);
        }
    }
}