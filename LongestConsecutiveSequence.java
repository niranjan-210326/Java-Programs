import java.util.HashSet;
import java.util.Set;
class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        int best=0;
        for(int x:set) {
            if (!set.contains(x - 1)) {
                int currentNum = x;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                best=Math.max(best,currentStreak);
            }
        }
        return best;
    }
}