package dinamic

import org.example.dinamic.fizzbuzz
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        val num = 20

        print("-- FizzBuzz -- \n\n")

        fizzbuzz(num)

        println("Test Passed!")
    }
}