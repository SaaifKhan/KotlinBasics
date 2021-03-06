@file:Suppress("UNREACHABLE_CODE")

import kotlin.random.Random

fun main(args: Array<String>) {
//    println("hello, ${args[0]}!")
    feedTheFish()

}


fun shouldChangeWater(
    day: String,
    temparature: Int = 22,
    dirty: Int = 20
): Boolean {
    val isTooHot = temparature > 30
    val isDirty = dirty > 30
    val isSunday = day == "sunday"

    return when {
        temparature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }


}


fun swim(speed: String = "fast") {
    println("swiming $speed")
}

fun randomDay(): String {
    val week = listOf("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")
    return week[Random(0).nextInt(7)]
}


fun fishFood(day: String) {
    var food = "fasting"
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the eat  $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day)) {
        println("Change the Water Today")
    }

    fun getDirtySensorReading() = 20

}