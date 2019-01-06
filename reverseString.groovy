/*
 I wanted to get back to you with an appropriate solution to the code sample. I believe in implementing built practical solutions 
 like helper functions, libraries, frameworks, etc to rapidly progress with stable, lightweight, and human-readable code.

 Spent ~10 minutes writing then optimizing this script.
 
 Hope you don't mind I wrote it in groovy.
 
 The other link is to a python service I wrote that checks the PUBG api for updates and inserts said updates into a google sheets
 spreadsheet. This is an example of the kind of api experience I have when dealing with http calls. The project is currently being
 refactored to the PEP 8 coding style (cause of different naming conventions within the project).
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
