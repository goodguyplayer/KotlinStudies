package PythonChallengeAsKotlin

import java.io.File

// http://www.pythonchallenge.com/pc/def/ocr.html

/*
Here's what we'll do.
    - Load file with the text in it.
    - Create a list that will take all possible characters
    - For every character found in it, count how many of those there are. Store in list, then remove the character from string
    - Considering we're meant to "find rare characters", will make list print only those characters that shows 40 times or less.

    - Rather, we don't /need/ to save the characters. We can just count and pop them out.
 */
fun main() {
    countPop(readFile("src/for3.txt"))
    
}


// Moved to it's own class



// To read each character and pop them out of the string
// https://stackoverflow.com/questions/49846295/kotlin-count-occurrences-of-chararray-in-string
fun countPop(text: String){
    val occurrences = text.filter{ it in text}
            .groupingBy { it }
            .eachCount()

    println(occurrences)

}