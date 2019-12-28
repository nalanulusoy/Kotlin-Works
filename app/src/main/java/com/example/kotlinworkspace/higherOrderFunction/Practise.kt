package com.example.kotlinworkspace.higherOrderFunction



enum class  Directions{
    NORTH,SOUTH,WEST,EAST,START,END
}
class Game{
     var path:MutableList<Directions>
    init {

        path= mutableListOf(Directions.START)
    }


    var north={
        path.add(Directions.NORTH)

    }

    var south={
        path.add(Directions.SOUTH)

    }

    //Lambda function
    var east={
        path.add(Directions.EAST)

    }


    var west={

        path.add(Directions.WEST)

    }
    var end={
        path.add(Directions.END);println("Game Over");path.clear();false
    }


    fun move(where:() -> Boolean ) {
        where.invoke()
    }
    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }

}


fun main(args:Array<String>){
    var game=Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}

