package acmicpc.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()
        if (input.isNullOrBlank()) break;
        bufferedWriter.write(input + "\n")
    }
    close()
    bufferedWriter.close()
}