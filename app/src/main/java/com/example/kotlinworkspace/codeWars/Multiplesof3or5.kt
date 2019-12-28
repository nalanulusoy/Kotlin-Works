package com.example.kotlinworkspace.codeWars

fun main(args:Array<String>){
    println(solution(10))
}
fun solution(number: Int): Int {
  var sum=0
    var multiple=number-1
    while(multiple>=1){

        if(multiple.rem(3)==0 || multiple.rem(5)==0){

            sum=sum+multiple
        }


        multiple -= 1

    }



    return sum
}


fun solution2(number: Int) = IntRange(1, number-1)
    .filter { it.rem(3) == 0 || it.rem(5) == 0 }
    .sum()


fun solution3(number: Int) = (1..number-1).filter { it.rem(3) == 0 || it.rem(5)== 0 }.sum()


fun solution4(number: Int): Int {
    var sum: Int = 0
    for (i in 1..number-1) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum = sum + i
        }
    }
    return sum
}