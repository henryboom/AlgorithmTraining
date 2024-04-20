//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != 
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请 
//
// 你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 双指针 排序 👍 6422 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//java:三数之和
class P15ThreeSum{
    public static void main(String[] args){
        Solution solution = new P15ThreeSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);

            List<List<Integer>> res = new ArrayList<>();

            for(int k = 0; k < nums.length - 2; k++){

                if(nums[k] > 0) break;

                if(k > 0 && nums[k] == nums[k - 1]) continue;

                int i = k + 1, j = nums.length - 1;

                while(i < j){

                    int sum = nums[k] + nums[i] + nums[j];

                    if(sum < 0){

                        while(i < j && nums[i] == nums[++i]);

                    } else if (sum > 0) {

                        while(i < j && nums[j] == nums[--j]);

                    } else {

                        res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));

                        while(i < j && nums[i] == nums[++i]);

                        while(i < j && nums[j] == nums[--j]);

                    }

                }

            }

            return res;

        }

    }
//class Solution {
//        //先使用哈希法来操作
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        //创建二维数组
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//
//    for(int i=0;i<nums.length;i++){
//        //如果第一个就大于零，此数组不存在和为零的三位数
//        if(nums[i]>0){break;}
//        if (i > 0 && nums[i] == nums[i - 1]) {
//            continue;
//        }
//
//        //创建集合，去重
//        HashSet<Integer> set = new HashSet<>();
//        for (int j=i+1;j<nums.length;j++){
//            //j指向i+3，判断三项均不相等才放行，若只判断前两项，那么-1001将无法得出结果，001时候就被排除
//            if (j>i+2&&nums[j]==nums[j - 1]&& nums[j - 1] == nums[j - 2]){
//                continue;
//            }
//        int c= 0-(nums[i]+nums[j]);
//            //
//            if (set.contains(c)){
//                result.add(Arrays.asList(nums[i],nums[j],c));
//                set.remove(c);
//            }else {
//                //未找到c,没有组成三元组，将访问到的j加入集合
//                set.add(nums[j]);
//            }
//        }
//    }
//        // 对每个内部列表进行排序
//        for (List<Integer> innerList : result) {
////            Collections.sort(innerList, Collections.reverseOrder());
//            Collections.sort(innerList);
//        }
//        return result;
//
//    }
//}


//leetcode submit region end(Prohibit modification and deletion)

}