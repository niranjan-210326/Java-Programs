import java.util.*;
public class BetweenTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        for(int i=0;i<N;i++) B[i]=sc.nextInt();
        int MOD=998244353;
        int maxVal=3000;
        long[] dp=new long[maxVal+1];
        for (int j=A[0]; j<=B[0];j++) {
            dp[j]=1;
        }
        for(int i=1;i<N;i++) {
            long[] nextDp=new long[maxVal + 1];
            long[] pref=new long[maxVal + 2];
            for (int j=0;j<=maxVal;j++) {
                pref[j+1]=(pref[j]+dp[j])%MOD;
            }
            for (int j=A[i];j<=B[i];j++) {
                nextDp[j]=(pref[j+1]-pref[A[i-1]]+MOD)%MOD;
            }
            dp=nextDp;
        }
        long ans=0;
        for (int j=0;j<=maxVal;j++) {
            ans=(ans+dp[j])%MOD;
        }
        System.out.println(ans);
    }
}