# Android Anagram Programming Challenge

### Anagrams ###
Given two words in string format, A and B, determine if B is an anagram of A.
An anagram is a word formed by rearranging all of the letters of one word into another word.  Example:  binary → brainy

### How to complete this task ###
Complete the following steps:

1. Fork this project to your github
2. Add your logic to the isAnagram() method (details below); additional methods may be added if desired
3. Write unit tests to validate the code
4. Push changes to your remote
5. Reply to the given email immediately after changes are pushed with link to the repo

☝️ If the steps are not followed the task is considered incomplete

### The isAnagram() method ###
Create a method that returns a boolean based on the following criteria

1. The contents of the second EditText is an anagram of the contents of the first EditText
2. If both inputs are empty, the method should return false
3. White spaces shouldn't matter
4. Capitalization shouldn't matter

### Example results ###
- "Dormitory", "Dirty room" is true
- "Listen", "silent" is true
- "The eyes",  "They see  " is true
- "what", "what" is false <- same word is not an anagram
- "not", "same" is false

### Notes ###
1. This application has a single screen
2. It has two input EditText's
3. It has a "Check" button that, when pressed, evaluates the two inputs and reports "Yes" if the inputs form an anagram and "No" if they do not
4. The Yes/No result is displayed below the "Check" button
