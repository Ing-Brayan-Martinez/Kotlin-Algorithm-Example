package ordering

fun bubbleSort(data: MutableList<Int>): Void? {
    var swap_check = true
    val n = data.size

    var i = 0
    while ((i < n) && (swap_check)) {
        swap_check = false
        for (j in 0 until n - 1 - i) {
            if (data[j] > data[j + 1]) {
                swap_check = true
                swap(j, j + 1, data)
            }
        }
        i++
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