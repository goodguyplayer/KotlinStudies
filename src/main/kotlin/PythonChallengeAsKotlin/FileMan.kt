package PythonChallengeAsKotlin

import java.io.File

// To read file and return the whole string
// https://www.baeldung.com/kotlin-read-file
fun readFile(filepath: String): String {
    //"This method isn't recommended for huge files and has an internal limitation of 2 GB file size."
    // Good thing that it's only 92 kb
    return (File(filepath).readText(Charsets.UTF_8))
}