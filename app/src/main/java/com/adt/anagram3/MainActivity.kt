package com.adt.anagram3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adt.anagram3.Constants.EMPTY_STRING
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        btnCheck.setOnClickListener() {
            //Toast.makeText(this@MainActivity, "Check input", Toast.LENGTH_SHORT).show()
            checkForAnagram()
        }
    }

    private fun checkForAnagram() {
        // Get values from input edit texts ensuring none are NULL
        val in1 = input1.text?.toString() ?: EMPTY_STRING
        val in2 = input2.text?.toString() ?: EMPTY_STRING

        // Check if the inputs are an anagram
        val result = AnagramUtils.isAnagram(in1, in2)

        // Display anagram results
        answer.text = AnagramUtils.resultToString(result)
    }
}
