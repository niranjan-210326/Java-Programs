import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates,int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> tempList,int[] candidates, int remainingTarget,int start) {
        if(remainingTarget==0) {
            result.add(new ArrayList<>(tempList));
            return;
        } 
        else if(remainingTarget<0) {
            return;
        }
        for(int i=start;i<candidates.length;i++) {
            tempList.add(candidates[i]);
            backtrack(result,tempList,candidates,remainingTarget-candidates[i],i);
            tempList.remove(tempList.size()-1);
        }
    }
}