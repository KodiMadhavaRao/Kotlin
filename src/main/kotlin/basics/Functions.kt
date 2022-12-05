package basics

fun main() {
    print(oddEven())
    print(oddEven(22))
}
fun oddEven(num:Int = 1):String{
    if(num%2==0){
        return "Even"
    }else{
        return "Odd"
    }

}