package ordering

import org.junit.jupiter.api.Test
import util.Data

internal class QuickSortTest {
    @Test
    fun testQuickSort() {
        val data: MutableList<Int> = Data.data

        print("-- QuickSort -- \n\n")

        //before
        println("Before Sorting: ")
        Data.printData(data)

        //sort
        print('\n')
        quickSort(data)

        //after
        println("After Sorting: ")
        Data.printData(data)

        print("\nTest Passed!")
    }
}