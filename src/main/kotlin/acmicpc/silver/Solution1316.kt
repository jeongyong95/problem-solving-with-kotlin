package acmicpc.silver

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt();
    var result = 0;
    repeat(t) {
        val word = readLine()
        var alphabet = word[0];
        val set = mutableSetOf<Char>()
        var ok = true
        for (c in word) {
            if (alphabet != c) {
                if (set.contains(c)) {
                    ok = false
                    break;
                }
                set.add(alphabet)
                alphabet = c
            }
        }

        if (ok) result += 1
    }

    println(result)
}