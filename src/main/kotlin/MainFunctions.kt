
fun main(args: Array<String>){
//    println("hello, ${args[0]}!")

    val isUnit = println("this is an expression")
    println(isUnit)

    val temprature = 10
    val isHot = if(temprature > 50) true else false
    println(isHot)

    val message = "you are ${ if (temprature < 50 ) "fried" else "safe"} fish"
    println(message)
}