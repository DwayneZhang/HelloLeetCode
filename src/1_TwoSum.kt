/**
 * 1. 两数之和 level：简单
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
 * 并返回他们的数组下标。
 *
 * 解题思路：
 * hashMap空间换时间
 */
fun main(args: Array<String>) {
    val unms = intArrayOf(23, 333, 2, 13, 4, 45, 5)
    val target = 9
    val result = twoSum(unms, target)
    println("first = ${result[0]}, second = ${result[1]}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for(i in nums.indices) {
        val diff = target - nums[i]
        if(map.containsKey(diff)) {
            return intArrayOf(map[diff]!!, i)
        }
        map[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}