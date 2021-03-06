package PythonChallengeAsKotlin

// http://www.pythonchallenge.com/pc/def/map.html
fun main() {
    var todecode :String = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj. "


    // So initially we have a string and the image showing.: k -> m, o -> q, e -> g.
    // This is def a ceaser cypher, with a shift of x. I'd say that, considering the ascii table, k = 107 and m = 109,
    // that would mean x = 109-107?
    println(swapper(todecode, 2))
    println(swapper("map", 2))
}

fun swapper(todecode: String, shift: Int): String {
    var output :String = ""
    var helper :Char

    todecode.forEach { c: Char ->
        //output += (c.toByte().toInt() + shift).toChar()
        output += if (Regex("[A-Za-z]").containsMatchIn(""+c)) ((c.toByte().toInt() + shift).toChar()) else c
    }
    return output
}

/*
Stackoverflow links used.:

https://stackoverflow.com/questions/47234812/how-to-convert-char-to-ascii-value-in-kotlin-language

 */