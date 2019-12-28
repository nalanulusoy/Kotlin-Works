

import java.util.*


fun main(args: Array<String>) {
    //findDay()
    //findHours()
    var fortune: String
    fortune =
        getFortuneCookie(getBirthday())


    while(!fortune.contains("Take it easy")){
        println("\nYour fortune is: $fortune")
    }



    for (i in 1..10) {

        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}


fun findHours() {

    var getHours = Calendar.getInstance().get(Calendar.HOUR)

    if (getHours < 12) {
        println("Good Morining")
    } else {
        println("Good Night")

    }
}



fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}






fun getFortuneCookie(brithday:Int): String{
    var fortune= listOf<String>("You will have a great day!","Things will go well for you today.","Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!","Treasure your friends because they are your greatest fortune.")
     println("Enter your birthday:")
    val index= when(brithday){
        in 1..7->4
         28,31->2
         else-> brithday.rem(fortune.size)

     }
    print(brithday.rem(fortune.size))
   return  fortune[index]


}


fun findDay() {
    var getDate = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("What Day is Today?")
    when (getDate) {
        1 -> println("Today is Sunday")
        2 -> println("Today is Monday")
        3 -> println("Today is Thursday")
        4 -> println("Today is Wednesday")
        5 -> println("Today is Thursday")
        6 -> println("Today is Friday")
        7 -> println("Today is Saturday")
        else -> println("No Day Found")
    }


}