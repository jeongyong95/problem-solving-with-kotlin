package acmicpc.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var t = bufferedReader.readLine().toInt()

    while (t-- > 0) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        bufferedWriter.write("${tokens.nextToken().toInt() + tokens.nextToken().toInt()}\n")
    }
    bufferedWriter.flush()
}