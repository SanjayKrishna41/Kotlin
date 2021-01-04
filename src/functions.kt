/**
 * Program to implement functions in Kotlin
 */
fun main()
{
    //normal function call
    println(add(10,20));
    addNumbers(5,5);
    //function call inside println
    println("Sum = ${add(10,5)}")
    println("Single Expression Function = "+addition(1,1))
}

/**
 * function to add numbers
 */
fun add(a:Int,b:Int): Int {
    return a+b;
}

/**
 * Single line expression function
 */
fun addition(a:Int,b:Int) = a+b

fun addNumbers(a:Int,b:Int)
{
    val c = a+b
    println("Sum of $a + $b = $c")
}
