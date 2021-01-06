fun main()
{
    val num1 = 300;
    val num2 = 200;
    val result = if(num1 > num2){
        "$num1 is greater than $num2"
    }
    else
    {
        "$num2 is greater than $num1"
    }
    println(result)

    //code snippet to sow usage of when expression
    when(num1)
    {
        100-> println("100")

        200-> println("200")

        else-> print("Invalid Number")
    }
}