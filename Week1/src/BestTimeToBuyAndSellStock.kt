class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var lowestPrice = Int.MAX_VALUE
        var maxProfit = 0
        prices.forEach {
            if(it < lowestPrice) lowestPrice = it
            if(it > lowestPrice) maxProfit = maxOf(it - lowestPrice,  maxProfit)
        }
        return maxProfit
    }
}