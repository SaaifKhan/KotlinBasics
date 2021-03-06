fun main() {
    val decorations = listOf("rock","pagoda","plastic plant","aligator","flowerpot")
    println(decorations.filter { true })

    //only print p elemts in list thats what filter do in kotlin ,specific
    println(decorations.filter { it[0] =='p' })

        //map
    val lazyMap = decorations.asSequence().map {
        println("map: $it")

    }
}