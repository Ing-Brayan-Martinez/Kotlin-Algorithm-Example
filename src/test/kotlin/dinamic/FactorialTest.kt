package dinamic

import org.example.dinamic.factorial
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FactorialTest {
    @Test
    fun testFactorial() {
        val num = 5
        val expectedValue = 120

        print("-- Factorial -- \n\n")

        val resultValue: Int = factorial(num)

        print("Factorial of $num  is $resultValue \n\n")

        Assertions.assertEquals(expectedValue, resultValue)

        println("Test Passed!")
    }
}