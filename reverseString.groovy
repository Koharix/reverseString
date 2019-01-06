/*
 I wanted to get back to you with an appropriate solution to the code test you gave to me. I believe in already built practical 
 solutions like helper functions, libraries, frameworks, etc to produce lightweight and human-readable code.
 
 Spent ~10 minutes writing then optomizing this script.

 Hope you don't mind I wrote it in groovy.

 The other link is to a python service I wrote that checks the PUBG api for updates and stores said updates into a google sheets
 document. This is an example of the level of api experience I have when dealing with http calls. The project is currently being
 refactored. I am trying out the pep8 coding standard for python and I am working through that process now. 
*/

def str = " A TECH COMPANY IS THE FUTURE"

println "Initial String:"
println str

def words = str.split(" ")
str = ""

words.eachWithIndex { word, i ->
    str = str + word.reverse() + " "
}

str = str.substring(0, str.size() -1)

println ""
println "Reversed String:"
println str
