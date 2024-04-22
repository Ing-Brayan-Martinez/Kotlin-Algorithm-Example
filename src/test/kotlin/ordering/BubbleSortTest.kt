package ordering

import org.junit.jupiter.api.Test
import util.Data

internal class BubbleSortTest {
    @Test
    fun testBubbleSort() {
        val data: MutableList<Int> = Data.data

        print("-- BubbleSort -- \n\n")

        //before
        println("Before Sorting: ")
        Data.printData(data)

        //sort
        print('\n')
        bubbleSort(data)

        //after
        println("After Sorting: ")
        Data.printData(data)

        print("\nTest Passed!")
    }
}