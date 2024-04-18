package org.example.dinamic

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    }
    return n * factorial(n - 1)
}