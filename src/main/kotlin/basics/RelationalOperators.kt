package basics

fun main() {
    val teamA:Int =250
    val teamB:Int =225
    if(teamA>teamB){
        println("Team A won")
        println("Team B Lost")
    }else if(teamB>teamA){
        println("Team B won")
        println("Team A Lost")
    }else if(teamA==teamB){
        print("It's a Draw match")
    }
}