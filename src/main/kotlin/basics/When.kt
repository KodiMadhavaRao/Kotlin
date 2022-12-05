package basics

fun main() {
    val animal ="Monkey"
    val result=when(animal){
        "Horse"-> "Animal is horse"
        "Dog"-> "Animal is Dog"
        "Tiger"-> "Animal is Tiger"
        "Monkey"-> "Animal is Monkey"
        else ->"Animal not found"

    }
    println(result)

    val marks=90
    print(when(marks){
        in 1 until 35->"Fail"
        in 35..50->"Grade D"
        in 51..60->"Grade C"
        in 61..70->"Grade B"
        in 71..80->"Grade A"
        in 81..100->"Distinction"
        else->"Nothing"


    });
}