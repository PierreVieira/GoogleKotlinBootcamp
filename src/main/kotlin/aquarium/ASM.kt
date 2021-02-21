package aquarium

import java.util.*

fun main() {
    feedTheFish()
//    eagerExample()
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter {it[0] == 'p'}
    println("Eager: $eager")
    println("Decorations: $decorations")
    val filtered = decorations.asSequence().filter {it[0] == 'p'}
    println("Filtered: $filtered")
    println("Filtered to list: ${filtered.toList()}")
    println("Decorations: $decorations")
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()
): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

var dirty = 20
val waterFilter = { dirty: Int -> dirty/ 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty ->
        dirty + 50
    }
}