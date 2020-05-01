package com.adt.anagram3

object AnagramUtils {

    fun isAnagram(a:String, b:String): Boolean {
        var lowerA = a.trim().toLowerCase()
        var lowerB = b.trim().toLowerCase()
        return if(lowerA.length != lowerB.length || (lowerA.isEmpty() && lowerB.isEmpty())){
            false
        }else if(lowerA == lowerB ){
            false
        }else {
            var charlowerA = lowerA.toCharArray().sortedArray().joinToString("")
            var charlowerB = lowerB.toCharArray().sortedArray().joinToString("")
            charlowerA.equals(charlowerB)
        }
        return false
    }

    fun resultToString(result:Boolean): String {
        return when (result) {
            true -> Constants.YES
            false -> Constants.NO
        }
    }
}
