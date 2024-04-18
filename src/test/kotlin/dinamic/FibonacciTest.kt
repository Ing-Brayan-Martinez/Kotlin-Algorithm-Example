package dinamic

import org.example.dinamic.fibonacci
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FibonacciTest {
    @Test
    fun testFibonacci() {
        val num = 20
        val expectedValue = 6765

        val resultValue: Int = fibonacci(num)

        print("-- Fibonacci -- \n\n")

        print("Fibonacci of $num  is $resultValue \n\n")

        Assertions.assertEquals(expectedValue, resultValue)

        println("Test Passed!")
    }
}