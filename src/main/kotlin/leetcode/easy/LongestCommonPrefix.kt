package leetcode.easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strings: Array<String>): String {
        val trie = Trie()
        strings.forEach { if (!trie.insertString(it)) return "" }
        return trie.getPrefix()
    }
}

class Trie(
    val character: Char? = null,
    val nexts: MutableMap<Char, Trie> = mutableMapOf(),
) {

    var count: Int = 1
    val isRoot: Boolean
        get() = this.character == null

    fun getPrefix(): String {
        if (isRoot) {
            if (nexts.size == 1) {
                return nexts.values.first().getPrefix()
            }
            return ""
        }
        val prefix = character.toString();
        if (nexts.size == 1) {
            val next = nexts.values.first()
            if (next.count == count) {
                return prefix + next.getPrefix()
            }
        }
        return prefix
    }

    fun insertString(string: String): Boolean {
        if (string.isBlank()) return false
        val character = string.first()
        this.addCharacter(character)
        if (string.length > 1) {
            nexts[character]?.insertString(string.substring(1))
        }
        return true
    }

    private fun addCharacter(character: Char) {
        nexts[character]?.let { it.count++ } ?: nexts.put(character, Trie(character))
    }
}

fun main() {
    val solution = LongestCommonPrefix()
    println(solution.longestCommonPrefix(arrayOf("", "a")))
}