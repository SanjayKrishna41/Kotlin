fun main()
{

    val str1 = """
|Hello, World!
""".trimMargin()

    val str2 = """
#Hello, World!
""".trimMargin("#")
    val str3 = str1
    println(str1 == str2) // Prints true
    println(str1 === str2) // Prints false
    println(str1 === str3) // Prints true

    val rawStr = """| 
                    |This is a raw string 
                    |which will help me understand kotlin """.trimMargin()

    println(rawStr)

}