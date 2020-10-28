package PythonChallengeAsKotlin

// http://www.pythonchallenge.com/pc/def/linkedlist.php

/*
"And the next nothing is (number)"
Need a way to match this precise string in a different string. Then for each page, change
http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=nextNothing

 */


fun main() {
    val link: String = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing="
    var nothing: String = "12345"
    val regex = """and the next nothing is (\d+)""".toRegex()
    val regex2 = """(\d+)""".toRegex()

    var matchResult = httpRequest(link+nothing)?.body()?.let { regex.find(it) }
    var next = matchResult!!.destructured
    println(regex2.find(matchResult.value)?.value)
}