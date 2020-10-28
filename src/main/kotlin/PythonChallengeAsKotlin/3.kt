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
    countPop(readFile())
    
}


// To read file and return the whole string
// https://www.baeldung.com/kotlin-read-file
fun readFile(): String {
    //"This method isn't recommended for huge files and has an internal limitation of 2 GB file size."
    // Good thing that it's only 92 kb
    return (File("src/for3.txt").readText(Charsets.UTF_8))

}


// To read each character and pop them out of the string
// https://stackoverflow.com/questions/49846295/kotlin-count-occurrences-of-chararray-in-string
fun countPop(text: String){
    val occurrences = text.filter{ it in text}
            .groupingBy { it }
            .eachCount()

    println(occurrences)

}