package dinamic

import org.example.dinamic.fizzbuzz
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        val num = 20
        val expectedValue = "Buzz"

        print("-- FizzBuzz -- \n\n")

        val resultValue: String = fizzbuzz(num)

        print("FizzBuzz of $num  is $resultValue \n\n")

        Assertions.assertEquals(expectedValue, resultValue)

        println("Test Passed!")
    }
}