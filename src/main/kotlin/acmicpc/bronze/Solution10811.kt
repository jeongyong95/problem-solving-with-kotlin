package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()/* IOStreams */) {
    // destructuring
    val (n, m) = this.readLine()
        .split(" ")
        .map { it.toInt() }
    val arr = IntArray(n + 1) { it }

    repeat(m) {
        var (i, j) = readLine()
            .split(" ")
            .map { it.toInt() }

        while (i < j) {
            arr[i] = arr[j].also { arr[j] = arr[i] }
            i++
            j--
        }
    }
    println(arr.copyOfRange(1, arr.size).joinToString(" "))
}