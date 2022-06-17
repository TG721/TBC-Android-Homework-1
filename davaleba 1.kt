import kotlin.system.exitProcess

fun main()
{

    var x = readln().toFloat()
    var y = readln().toFloat()
    var z = x + y
    print("X და Y ჯამი არის: ")
    if(z!=z.toInt().toFloat()) println(z)
    else println(z.toInt())

    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
    var answer = readln()

    if(answer.equals("Y", ignoreCase = true) || answer=="დიახ") {
        return main()
    }

    if(answer.equals("N", ignoreCase = true) || answer=="არა")
    {
        exitProcess(1)
    }
}


