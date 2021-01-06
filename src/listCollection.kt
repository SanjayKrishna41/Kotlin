fun main() {
    //immutable(Read only) list
    val immutableList = listOf("a", "d", "S")
    //gives compile time error
    //immutableList.add = "Sreedharan"
    for (item in immutableList) {
        println(item)
    }

    //mutable (read and write array) list
    var mutableList = mutableListOf("a", "s", "d")
    // we can modify the element
    mutableList[0] = "q"
    // add one more element in the list
    mutableList.add("w")
    for (item in mutableList)
    {
        println(item)
    }
}