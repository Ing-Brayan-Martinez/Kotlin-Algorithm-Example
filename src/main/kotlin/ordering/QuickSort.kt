package ordering

fun quickSort(data: MutableList<Int>) {
    val lower = 0
    val upper = data.size - 1

    if (upper > lower) {
        val partitionIndex: Int = partition(data, lower, upper)

        internalQuickSort(data, lower, partitionIndex - 1)
        internalQuickSort(data, partitionIndex + 1, upper)
    }
}

private fun partition(data: MutableList<Int>, lower: Int, upper: Int): Int {
    var i = (lower - 1)
    val pivot = data[upper]

    for (j in lower until upper) {
        if (data[j] <= pivot) {
            i++
            swap(i, j, data)
        }
    }

    swap(i + 1, upper, data)
    return (i + 1)
}

private fun internalQuickSort(data: MutableList<Int>, lower: Int, upper: Int) {
    if (upper > lower) {
        // partitioning index is returned by the partition method , partition
        // element is at its correct poition

        val partitionIndex: Int = partition(data, lower, upper)

        // Sorting elements before and after the partition index
        internalQuickSort(data, lower, partitionIndex - 1)
        internalQuickSort(data, partitionIndex + 1, upper)
    }
}

private fun swap(first: Int, second: Int, data: MutableList<Int>) {
    var value1 = data[first]
    var value2 = data[second]
    val temp = value1
    value1 = value2
    value2 = temp
    data[first] = value1
    data[second] = value2
}