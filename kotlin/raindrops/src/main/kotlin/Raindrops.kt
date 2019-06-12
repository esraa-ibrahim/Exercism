object Raindrops {
    fun convert(number: Int): String {
        var strOutput = ""
        if (number.rem( 3) == 0) {
            strOutput += "Pling"
        }
        if (number.rem(5) == 0) {
            strOutput += "Plang"
        }
        if (number.rem(7) == 0) {
            strOutput += "Plong"
        }
        return if (strOutput.isNotEmpty()) {
            strOutput
        } else {
            number.toString()
        }
    }
}