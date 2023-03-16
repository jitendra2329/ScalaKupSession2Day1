package com.knoldus

object SquareList extends App {

    def squareList(list: List[Int]): List[Int] =
        list match {
          case Nil => list
          case head :: tail => head * head :: squareList(tail)
        }

    def otherWayOfSquareList(list: List[Int]): List[Int] = {
        val newList = list.map(value => value * value)
        newList
    }


}
