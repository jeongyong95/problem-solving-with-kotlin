package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val bufferedWriter = System.out.bufferedWriter()

    repeat(readLine().toInt()) {
        val (r, s) = readLine().split(" ")
        val repeat = r.toInt()
        bufferedWriter.write(s.toCharArray()
            .map { it.toString().repeat(repeat) }
            .joinToString(separator = "") { it } + "\n"
        )
    }
    this.close()
    bufferedWriter.close()
}