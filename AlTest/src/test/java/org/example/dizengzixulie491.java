package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    //leetcode submit region begin(Prohibit modification and deletion)
    public class dizengzixulie491 {
        // 定义全局变量保存结果
        List<List<Integer>> res = new ArrayList<>();

        //nums是输入的数组
        @Test
        public void findSubsequences() {
            int[] nums={4,6,7,6,7};
            // idx 初始化为 -1，开始 dfs 搜索。
            dfs(nums, -1, new ArrayList<>());
//            return res;
            System.out.println(res);
        }

        private void dfs(int[] nums, int idx, List<Integer> curList) {
            // 只要当前的递增序列长度大于 1，就加入到结果 res 中，然后继续搜索递增序列的下一个值。
            if (curList.size() > 1) {
                res.add(new ArrayList<>(curList));
            }

            // 在 [idx + 1, nums.length - 1] 范围内遍历搜索递增序列的下一个值。
            // 借助 set 对 [idx + 1, nums.length - 1] 范围内的数去重。
            Set<Integer> set = new HashSet<>();
            for (int i = idx + 1; i < nums.length; i++) {
                // 1. 如果 set 中已经有与 nums[i] 相同的值了，说明加上 nums[i] 后的所有可能的递增序列之前已经被搜过一遍了，因此停止继续搜索。
                if (set.contains(nums[i])) {
                    continue;
                }
                set.add(nums[i]);
                // 2. 如果 nums[i] >= nums[idx] 的话，说明出现了新的递增序列，因此继续 dfs 搜索（因为 curList 在这里是复用的，因此别忘了 remove 哦）
                if (idx == -1 || nums[i] >= nums[idx]) {
                    curList.add(nums[i]);
                    dfs(nums, i, curList);
                    curList.remove(curList.size() - 1);
                }
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)


