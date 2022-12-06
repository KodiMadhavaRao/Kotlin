package basics

fun main() {
    //named arguments
    println(addition(b=2,a=1))
    println(addition(1.0,2.0))
}
//same name different parameters
fun addition(a:Int,b:Int):Int{
    print("int ")
    return a+b;
}
fun addition(a:Double,b:Double):Double{
    print("double ")
    return a+b;
}