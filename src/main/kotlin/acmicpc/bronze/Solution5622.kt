package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val numbers = readLine().toCharArray()

    var sum = 0;
    for (number in numbers) {
        sum += when (number) {
            'A', 'B', 'C' -> 3
            'D', 'E', 'F' -> 4
            'G', 'H', 'I' -> 5
            'J', 'K', 'L' -> 6
            'M', 'N', 'O' -> 7
            'P', 'Q', 'R', 'S' -> 8
            'T', 'U', 'V' -> 9
            else -> 10
        }
    }

    println(sum)
}