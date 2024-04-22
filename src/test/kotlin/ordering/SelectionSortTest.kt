package ordering

import org.junit.jupiter.api.Test
import util.Data

internal class SelectionSortTest {
    @Test
    fun testSelectionSort() {
        val data: MutableList<Int> = Data.data

        print("-- SelectionSort -- \n\n")

        //before
        println("Before Sorting: ")
        Data.printData(data)

        //sort
        print('\n')
        selectionSort(data)

        //after
        println("After Sorting: ")
        Data.printData(data)

        print("\nTest Passed!")
    }
}