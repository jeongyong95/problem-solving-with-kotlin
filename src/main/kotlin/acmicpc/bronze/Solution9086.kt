package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val bufferedWriter = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val string = readLine()
        bufferedWriter.write("${string.first()}${string.last()}\n")
    }
    this.close()
    bufferedWriter.close()
}