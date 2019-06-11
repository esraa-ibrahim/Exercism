object Pangram {
  fun isPangram(sentence: String): Boolean {
    // returns true if all entries matches the given predicate
    return ('a'..'z').all { sentence.contains(it, ignoreCase = true) }
  }
}