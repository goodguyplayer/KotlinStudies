package PythonChallengeAsKotlin

// http://www.pythonchallenge.com/pc/def/map.html
fun main() {
    var todecode :String = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj. "
    println(swapper(todecode, 3))

    // So initially we have a string and the image showing.: k -> m, o -> q, e -> g.
    // This is def a ceaser cypher, with a shift of x. I'd say that, considering the ascii table, k = 107 and m = 109,
    // that would mean x = 109-107?
}

fun swapper(todecode: String, shift: Int): String {
    var output :String = ""

    todecode.forEach { c: Char ->
        output += c
    }
    return output
}