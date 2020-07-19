/**
 * 35. 搜索插入位置 level：简单
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 解题思路：二分查找
 */
fun main(args: Array<String>) {
    var start = System.currentTimeMillis()
    val nums = arrayOf(3, 5)
    val target = 5
    var left = 0
    var right = nums.size
    while (left < right) {
        var mid = left + (right -left)/2
        if (nums[mid] < target) {
            left = mid + 1
        } else {
            right = mid
        }
    }
    println("index = $left")
    var end = System.currentTimeMillis()
    println("cost time = ${end -start}")
}
