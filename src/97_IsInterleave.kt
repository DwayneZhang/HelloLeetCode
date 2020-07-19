/**
 * 97.交错字符串 level：困难
 *
 * 给定三个字符串 s1, s2, s3, 验证 s3 是否是由 s1 和 s2 交错组成的。
 *
 * 解题思路：
 * 动态规划算法,s3的前i+j位，一定是由s1的前i位、s2的前j位组成。
 */
fun main(args: Array<String>) {
    val s1 = "aabcc"
    val s2 = "dbbca"
    val s3 = "aadbbcbcac"
    println(isInterleave(s1, s2, s3))
}

fun isInterleave(s1: String, s2: String, s3: String): Boolean {
    val len1 = s1.length
    val len2 = s2.length
    val len3 = s3.length
    if (len1 + len2 != len3) return false
    val f = Array(len3 +1){BooleanArray(len3 +1)}
    f[0][0] = true
    for (i in 0..len1) {
        for (j in 0..len2) {
            val p = i + j - 1
            if (i > 0) {
                f[i][j] = f[i - 1][j] && s1[i - 1] == s3[p]
            }
            if (j > 0) {
                f[i][j] = f[i][j] || (f[i][j - 1] && s2[j - 1] == s3[p])
            }
        }
    }
    return f[len1][len2]
}