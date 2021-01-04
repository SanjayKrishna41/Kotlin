import java.util.*

fun main()
{
    //declaring an empty array
    var empty_array = emptyArray<String>()

    //creating an array with initial value and size
    var string_array = Array<String>(size = 6,init = {index->"Item #$index"})
    println(Arrays.toString(string_array)) //converts the whole array to string and prints

    //print size of array
    println(string_array.size)

    //Arrays have getters and setters function to change values
    //set method
    string_array.set(3,"Sanjay")
    println("Changed index - "+string_array.get(3))

    empty_array = string_array

    println(Arrays.toString(string_array)) //converts the whole array to string and prints
    println(empty_array.contentToString()) //converts the whole array to string and prints

    //creating an array
    val a = arrayOf(1, 2, 3) // creates an Array<Int> of size 3 containing [1, 2, 3].
    println("Creating an array "+a.contentToString())

    //Create an array using a closure
    val b = Array(3) { i -> i * 2 } // creates an Array<Int> of size 3 containing [0, 2, 4]
    println("Creating an array "+b.contentToString())

    //create an uninitialized array
    val c = arrayOfNulls<Int>(3) // creates an Array<Int?> of [null, null, null]
    
}