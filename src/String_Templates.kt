/**
 * Program to show usage of template expression in strings
 */
fun main()
{
    //$ is a template expression
    val i =10
    println("i = $i")

    //usage in arbitary expression
    val j = "abc"
    println("$j length is ${j.length}")
}