package PythonChallengeAsKotlin

/*
Basic idea, we got many files in the zip file. First, find the right file. Start at 90052
 */

fun main() {
    var nothing: String = "90052"
    val regex = """and the next nothing is (\d+)""".toRegex()
    val regex2 = """(\d+)""".toRegex()

    var matchResult = readFile("src/channel/" + nothing + ".txt")
    var regexFind = regex2.find(matchResult)?.value
    println(matchResult)
    println(regexFind)
}