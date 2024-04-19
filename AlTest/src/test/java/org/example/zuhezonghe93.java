package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class zuhezonghe93 {
    //设置一个全局的列表来作为返回列表
    List<List<Integer>> result = new ArrayList<>();
    //        创建显示当前的 路径
    List<Integer> path = new ArrayList<>();

    @Test
//    public List<List<Integer>> combinationSum() {
    public void combinationSum() {
        int[] candidates = {8,7,4,3};
        int target = 11;

        //将传进来的数组进行累加那么，我们开始构造当前的sum,以及是否构造完成，大于就排除
        backtracking(candidates,target,0,0);
        System.out.println(result);
    }

    //当前的总和为sum
    void backtracking(int[] candidates,int target,int sum, int startIndex){
//        //首先书写终止条件
        //将这个判定移到for循环内
//        if(sum>target)return;
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            //
//            if(sum>target)break;
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            //这里递归为i,说明可重复
            backtracking(candidates,target,sum+candidates[i],i);
            path.remove(path.size() - 1);
        }
    }
}
