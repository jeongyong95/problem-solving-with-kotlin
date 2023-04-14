package acmicpc.silver

fun main() = with(System.`in`.bufferedReader()) {
    val alternatives = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var alphabets = readLine()
    alternatives.forEach { alphabets = alphabets.replace(it, "*") }

    println(alphabets.length)
}