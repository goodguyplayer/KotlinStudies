package PythonChallengeAsKotlin

import java.io.File

// http://www.pythonchallenge.com/pc/def/equality.html

/*
"One small letter, surrounded by EXACTLY three big bodyguards on each of its sides"
AAAbAAA. Would be best to use regex for this, filter all occurrences and print string
 */

// ... Regex can be annoying at times.
fun main() {
    var text = readFile("src/for4.txt")
    val reg = """[^A-Z]+[A-Z]{3}([a-z])[A-Z]{3}[^A-Z]+""".toRegex()
    val matchResults = reg.findAll(text)
    for (char in matchResults){
        println(char.value)
    }
}