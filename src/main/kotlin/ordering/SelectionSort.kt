package ordering

fun selectionSort(data: MutableList<Int>): Void? {
    for (i in 0 until data.size - 1) {
        var min_index = i
        for (j in i + 1 until data.size) {
            if (data[min_index] > data[j]) {
                min_index = j
            }
        }
        if (min_index != i) {
            swap(i, min_index, data)
        }
    }
    return null
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