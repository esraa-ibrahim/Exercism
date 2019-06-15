object Isogram {
    fun isIsogram(input: String): Boolean {
        val inputTextWithoutSpecialChars = input.filter { it.isLetter() }.toLowerCase()
        return inputTextWithoutSpecialChars.length == inputTextWithoutSpecialChars.toSet().size
    }
}