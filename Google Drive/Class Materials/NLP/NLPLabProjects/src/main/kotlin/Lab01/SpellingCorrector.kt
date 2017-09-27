package Lab01

import java.io.File
import java.io.InputStream
/**
Spelling Corrector Object,
**/
class SpellingCorrector(
    val filePath: String,
    val dictionaryPath: String,
    val sampleFilePath: String,
    val editDistance: Int
) {
    private val dictionary = HashSet<String>()
    private val occurences = HashMap<String, Int>()
    init {
        populateDictionary()
    }

    private fun populateDictionary(){
        val dictionaryFile = File(dictionaryPath)
        val inputStream: InputStream = dictionaryFile.inputStream()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { dictionary.add(it) } }
    }
}
