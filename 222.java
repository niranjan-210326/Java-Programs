//222
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0) {
            long K=sc.nextLong();
            long M=9*K/gcd(2,9*K);
            if(gcd(10,M)!=1) {
                System.out.println("-1");
                continue;
            }
            long phi=getPhi(M);
            List<Long> divisors=getDivisors(phi);
            Collections.sort(divisors);
            long ans=-1;
            for(long d:divisors) {
                if(modPow(10,d,M)==1) {
                    ans=d;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    static long gcd(long a,long b) {return b ==0 ? a : gcd(b,a%b); }
    static long getPhi(long n) {
        long res=n;
        for(long i=2;i*i<=n;i++) {
            if(n%i==0) {
                res=res/i*(i-1);
                while(n%i==0) n/=i;
            }
        }
        if(n>1) resres/n*(n-1);
        return res;
    }
    static List<Long> getDivisors(long n) {
        List<Long> divs=newArrayList<>();
        for (long i=1;i*i<=n;i++) {
            if(n%i==0) {
                divs.add(i);
                if(i*i!=n) divs.add(n/i);
            }
        }
        return divs;
    }
    static long modPow(long base,long exp,long mod) {
        long res=1;
        base%=mod;
        while(exp>0) {
            if(exp%2==1) res=multiply(res,base,mod);
            base=multiply(base,base,mod);
            exp/=2;
        }
        return res;
    }
    static long multiply(long a,long b,long mod) {
        return java.math.BigInteger.valueOf(a).multiply(java.math.BigInteger.valueOf(b)).remainder(java.math.BigInteger.valueOf(mod)).longValue();
    }
}