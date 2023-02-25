package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.RoundingMode
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val tokens = StringTokenizer(bufferedReader.readLine())
    println(
        tokens.nextToken().toBigDecimal()
            .divide(
                tokens.nextToken().toBigDecimal(),
                10,
                RoundingMode.HALF_UP
            )
    )
}