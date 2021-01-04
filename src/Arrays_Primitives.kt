import java.util.*

fun main()
{
    //array of primitive data types
    //boolean
    val boolArray = booleanArrayOf(true,false)
    val intArray = intArrayOf(41,2,37)
    val doubleArray = doubleArrayOf(1.4,5.7,6.0,5.5)
    val floatArray = floatArrayOf(1.4F,5.6F)
    val charArray = charArrayOf('z','v','a')
    val longArray = longArrayOf(1,2,3,4)

    //average function always returns double
    val avg:Double = doubleArray.average()
    println("double array average $avg")

    //array sort functions
    charArray.sort()
    println("Sorting char array in ascending order "+ charArray.contentToString())
    intArray.sortDescending()
    println("Sorting int array in descending order "+intArray.contentToString())

    //array iterations
    val array = Array(6) { i -> (i * i).toString() }
    println("without changing the data type")
    for(str:String in array)
    {
        println(str)
    }
    println("changing the data type to int")
    for(str in array)
    {
        println(str)
    }
}