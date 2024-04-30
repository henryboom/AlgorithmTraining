
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 这个类用于解决找到从给定起点到终点的最短路径的问题。
 * 它通过构建一个地图（Map）来存储所有的航班，并使用深度优先搜索（DFS）来遍历这些航班，
 * 从而找到一个有效的路径。
 */
class Solution {
    // 使用HashMap来存储航班，其中key是出发地，value是按优先级排序的目的地队列
    Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    // 用来存储最终的行程
    List<String> itinerary = new LinkedList<String>();

    /**
     * 根据提供的机票列表，找到一个有效的行程路线。
     *
     * @param tickets 机票列表，每个列表包含两个字符串，表示出发地和目的地。
     * @return 返回一个行程列表，表示从起点到终点的路径。
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        // 遍历机票列表，构建航班地图
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            // 如果地图中不存在出发地，则添加一个新的PriorityQueue
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<String>());
            }
            //添加相同的出发地的  最近目的地
            // 将目的地加入到对应的出发地队列中
            map.get(src).offer(dst);
        }
        // 从起点开始深度优先搜索
        dfs("JFK");
        // 行程列表需要倒序输出，才能得到正确的路径
        Collections.reverse(itinerary);
        return itinerary;
    }

    /**
     * 使用深度优先搜索遍历航班地图。
     *
     * @param curr 当前遍历的城市
     */
    public void dfs(String curr) {
        // 当前城市存在后续航班时，继续递归搜索
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll(); // 获取下一个目的地
            dfs(tmp); // 递归搜索下一个目的地
        }
        // 将当前城市加入到行程列表中
        itinerary.add(curr);
    }
}


//leetcode submit region end(Prohibit modification and deletion)
