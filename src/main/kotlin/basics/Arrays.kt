package basics

fun main() {
    var intArr= arrayOf(10,20,30)
    var stringArr= arrayOf("Apple","Banana","Carrot")
    var intExpArr= arrayOf<Int>(6,9,12)
    for ((i,e) in intArr.withIndex()){
        println("$i = $e")
    }
    println(stringArr[0])
    println(stringArr.get(2))
    stringArr.set(0,"Orange")
    println(stringArr.get(0))
}