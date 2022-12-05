package basics

fun main() {
    getGrade(20,20)
}
fun getGrade(percentage:Int,attendance:Int){
    if(percentage>70&&attendance>70){
        print("Distinction")
    }else if(percentage>70||attendance>70){
        print("Grade 1")
    }else if(percentage<=35){
        print("Promoted")
    }else{
        print("Fail")
    }
}