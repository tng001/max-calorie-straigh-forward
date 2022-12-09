import java.io.File
import java.math.BigInteger

fun main() {
    val testInput = File("src/main/resources", "input_test.txt").readText()
    check(Solution.firstPart(testInput) == BigInteger.valueOf(24000))
    check(Solution.secondPart(testInput) == BigInteger.valueOf(45000))

    val input = File("src/main/resources", "input.txt").readText()
    println(Solution.firstPart(input))
    println(Solution.secondPart(input))
}
