package com.adt.anagram3

import org.junit.Test

import org.junit.Assert.*
import com.adt.anagram3.AnagramUtils.isAnagram

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun isAnagramFunctionHappyPath() {
        assertTrue(isAnagram("Binary", "brainy"))
        assertTrue(isAnagram("Binary     ", "brainy"))
        assertTrue(isAnagram("binary", "brainy"))
        assertTrue(isAnagram("bi nary", "brainy"))
    }

    @Test
    fun isAnagramFunctionNegativePath() {
        assertFalse(isAnagram("Binar", "brainy"))
        assertFalse(isAnagram("Binara", "brainy"))
        assertFalse(isAnagram("brainy", "brainy"))
        assertFalse(isAnagram("", ""))
        assertFalse(isAnagram("Ro om", "rom"))
    }
}
