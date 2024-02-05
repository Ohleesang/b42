/**
 * 치킨 10 마리 -> 1개
 */


class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var coupon = chicken
        while (coupon>=10) {
            answer += coupon/10
            coupon = coupon%10 + coupon/10
        }
        return answer
    }
}

fun main() {
    val a = Solution()
    a.solution(100) //11
    a.solution(1081) // 120
}