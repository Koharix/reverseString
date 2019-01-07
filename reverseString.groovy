/*
 I wanted to get back to you with a better solution to the code sample. I believe in implementing built practical solutions 
 like helper functions, libraries, frameworks, etc to rapidly produce stable, lightweight, and human-readable code.

 Spent ~5 minutes writing then >5 minutes optimizing this script.
 
 Hope you don't mind I wrote it in groovy. After some thought I may have more groovy experience than java experience though 
 the knowledge is largely transferable.
 
 The PubgArchiver repo is an open source python project I wrote which makes http calls to the PUBG api for stat updates and 
 inserts said updates into a google sheets spreadsheet based off config & authentication files. This is one example of my RESTful
 api experience. The project is currently being refactored to the PEP 8 coding style (reason for different naming conventions 
 within the project).
*/

def str = "A TECH COMPANY IS THE FUTURE"

println "Initial String:\n" + str

def words = str.split(" ")
str = ""

words.each {
    str = str + it.reverse() + " "
}

str = str.substring(0, str.size() -1)

println "\nReversed String:\n" + str
