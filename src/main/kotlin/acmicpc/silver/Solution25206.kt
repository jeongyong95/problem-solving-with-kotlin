package acmicpc.silver

fun main() = with(System.`in`.bufferedReader()) {
    val map = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )

    var targets = 0.0
    var sum = 0.0
    repeat(20) {
        val line = readLine().split(" ")
        val grade = line[2]
        val score = line[1].toDouble()
        if (grade == "P") {
            return@repeat
        }

        sum += score * map[grade]!!
        targets += score
    }

    println("%.6f".format(sum / targets))
}