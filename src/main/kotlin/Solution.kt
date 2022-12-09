import java.math.BigInteger

object Solution {
    fun firstPart(input: String): BigInteger {
        val sumOfEachElfCalories = getSumOfEachElfCaloriesInDescending(input)
        return sumOfEachElfCalories[0]
    }

    fun secondPart(input: String): BigInteger {
        val sumOfEachElfCalories = getSumOfEachElfCaloriesInDescending(input)
        return sumOfEachElfCalories.take(3).sumOf { it }
    }

    private fun getSumOfEachElfCaloriesInDescending(input: String): List<BigInteger> {
        val inputList = input.split("\n")

        val sumOfEachElfCalories = mutableListOf<BigInteger>()
        var currentElfCalories = BigInteger.ZERO

        inputList.forEach { calorie ->
            currentElfCalories = if (calorie.isBlank()) {
                sumOfEachElfCalories.add(currentElfCalories)
                BigInteger.ZERO
            } else {
                currentElfCalories.add(BigInteger(calorie.trim()))
            }
        }

        sumOfEachElfCalories.add(currentElfCalories)
        sumOfEachElfCalories.sortDescending()
        return sumOfEachElfCalories
    }
}

