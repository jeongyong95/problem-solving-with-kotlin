package acmicpc.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))
    val builder = StringBuilder()
    while (true) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        val a = tokens.nextToken().toInt()
        val b = tokens.nextToken().toInt()
        if (a == 0 && b == 0) {
            break
        }
        builder.append("${a + b}\n")
    }
    bufferedWriter.write(builder.toString())
    bufferedWriter.flush()
}