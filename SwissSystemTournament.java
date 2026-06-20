import java.util.*;
public class SwissSystemTournament {
    static class Player {
        int id;
        int wins;
        String hands;
        Player(int id, String hands) {
            this.id=id;
            this.hands=hands;
            this.wins=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int totalPlayers=2*N;
        Player[] players=new Player[totalPlayers];
        for (int i=0;i<totalPlayers;i++) {
            players[i]=new Player(i+1,sc.next());
        }
        for(int j=0;j<M;j++) {
            Arrays.sort(players,(p1,p2) -> {
                if(p1.wins!=p2.wins) return p2.wins-p1.wins;
                return p1.id-p2.id;
            });
            for(int k=0;k<N;k++) {
                Player p1=players[2*k];
                Player p2=players[2*k+1];
                char h1=p1.hands.charAt(j);
                char h2=p2.hands.charAt(j);
                if(winsAgainst(h1,h2)) {
                    p1.wins++;
                } else if(winsAgainst(h2,h1)) {
                    p2.wins++;
                }
            }
        }
        Arrays.sort(players,(p1,p2) -> {
            if(p1.wins!=p2.wins) return p2.wins-p1.wins;
            return p1.id-p2.id;
        });
        for(Player p:players) {
            System.out.println(p.id);
        }
    }
    private static boolean winsAgainst(char h1, char h2) {
        if(h1=='G' && h2=='C') return true;
        if(h1=='C' && h2=='P') return true;
        if(h1=='P' && h2=='G') return true;
        return false;
    }
}