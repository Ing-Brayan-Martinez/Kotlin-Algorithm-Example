package org.example.dinamic

fun fizzbuzz(n: Int): String {
    return if (n % 3 == 0 && n % 5 == 0) {
        "FizzBuzz"
    } else if (n % 3 == 0) {
        "Fizz"
    } else if (n % 5 == 0) {
        "Buzz"
    } else {
        "$n"
    }
}