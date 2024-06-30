package ordering

fun bubbleSort(data: MutableList<Int>) {
    for (i in 0 until data.size - 1) {
        var breakCount = 0
        for (j in 0 until data.size - 1 - i) {
            if (data[j] > data[j + 1]) {
                swap(j, j + 1, data)
                breakCount++
            }
        }
        if (breakCount == 0) {
            break
        }
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