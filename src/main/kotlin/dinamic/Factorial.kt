package org.example.dinamic

fun factorial(n: Int): Int {
    return when (n) {
        0 -> 1
        else -> n * factorial(n - 1)
    }
}