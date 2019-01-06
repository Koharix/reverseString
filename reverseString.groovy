/*
 I wanted to get back to you with an appropriate solution to the test code you gave to me. I beleive in practical solutions like 
 using already avalibe soultions like helper functions, libraries, frameworks, etc to produce lightweight and human-readable code.
 
 Spent ~10 minutes writing and optomizing this script.

 Hope you don't mind I wrote it in groovy.

 The other link is to a python service I wrote that checks the PUBG api for updates and stores said updates into a google sheets
 document. This is an example of the kind of api work I have when dealing with http calls. The project is currently being
 refactored. I am trying out the pep8 coding standard for python and I am working through that process now. 
*/

def str = "A TECH PROJECT AT HR BLOCK"

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
