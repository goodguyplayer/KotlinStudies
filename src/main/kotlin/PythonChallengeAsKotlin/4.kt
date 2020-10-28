package PythonChallengeAsKotlin

import java.lang.Exception
import java.util.*
import kotlin.concurrent.schedule

// http://www.pythonchallenge.com/pc/def/linkedlist.php

/*
"And the next nothing is (number)"
Need a way to match this precise string in a different string. Then for each page, change
http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=nextNothing

 */


fun main() {
    val link: String = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing="
    //var nothing: String = "12345" -- Last interrupt stopped at 23053
    //var nothing: String = "16044"
    var nothing: String = (16044/2).toString()  // Stops at 66831
    val regex = """and the next nothing is (\d+)""".toRegex()
    val regex2 = """(\d+)""".toRegex()

    var matchResult = httpRequest(link+nothing)?.body()
    var regexFind = matchResult?.let { regex.find(it) }


    try {
        while (true){
            matchResult = httpRequest(link+nothing)?.body()
            regexFind = matchResult?.let { regex.find(it) }
            nothing = (regexFind?.value?.let { regex2.find(it)?.value }).toString()
            println(matchResult)
            println(nothing)
        }
    }catch (e: Exception){
        e.printStackTrace()
    }



}

