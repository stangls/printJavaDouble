
fun main() {
    val source = Source()

    println("works:")
    println(source.value as Double?)

    println("works not:")
    println(source.value)

}