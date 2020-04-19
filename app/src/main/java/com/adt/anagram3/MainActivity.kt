package com.adt.anagram3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import com.adt.anagram3.Constants.EMPTY_STRING
import com.adt.anagram3.Constants.NO
import com.adt.anagram3.Constants.YES
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

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
        val result = isAnagram(in1, in2)

        // Display anagram results
        when (result) {
            true -> answer.text = YES
            false -> answer.text = NO
        }
    }

    private fun isAnagram(a:String, b:String): Boolean {
        // TODO: Perform anagram check
        return true
    }

}
