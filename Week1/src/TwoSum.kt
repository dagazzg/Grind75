class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complementsMap = mutableMapOf<Int,Int>()
        nums.forEachIndexed { index, value ->
            val complement = target - value
            if (complementsMap[complement] != null) {
                return intArrayOf(complementsMap[complement]!!, index)
            }
            complementsMap[value] = index
        }
        return intArrayOf(0,0)
    }
}