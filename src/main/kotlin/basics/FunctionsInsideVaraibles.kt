package basics
//function type
fun main() {
    var fn: (a: Int, b: Int) -> Int =::additionInt
    print( fn(10,20))
    fn=::substraction
    print(fn(10,20))
}
fun additionInt(a:Int,b:Int):Int{
    return a+b
}
fun substraction(a:Int,b:Int):Int{
    return  a-b
}