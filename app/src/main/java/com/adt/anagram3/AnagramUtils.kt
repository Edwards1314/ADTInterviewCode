package com.adt.anagram3

object AnagramUtils {

    fun isAnagram(a:String, b:String): Boolean {
        // TODO: Perform anagram check
        return true
    }

    fun resultToString(result:Boolean): String {
        return when (result) {
            true -> Constants.YES
            false -> Constants.NO
        }
    }
}
