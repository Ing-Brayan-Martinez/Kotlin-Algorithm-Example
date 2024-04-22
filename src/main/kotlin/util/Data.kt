package util

import java.util.function.Consumer

object Data {
    val data: MutableList<Int>
        get() {
            val list: MutableList<Int> = ArrayList()
            list.add(6)
            list.add(2)
            list.add(26)
            list.add(12)
            list.add(1)
            list.add(5)
            list.add(8)
            list.add(14)
            list.add(10)
            list.add(17)
            list.add(32)
            return list
        }

    fun printData(data: MutableList<Int>) {
        data.forEach(Consumer { x: Int -> println(x) })
    }
}