package com.knoldus

object Functions extends App {
    // 1.
    def addition: Function2[Int,Int,Int] = new Function2[Int, Int,Int] {
      override def apply(firstNumber: Int, secondNumber: Int) = firstNumber + secondNumber
    }

    // 2.
    def sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
      override def apply(list: List[Int]): Int = list.sum
    }

    // 3.
    def higherOrderFunction: (Int => Int, Int) => Int = functionWithTwoIntInputs //(calling functionWithTwoIntInputs )

    def functionWithTwoIntInputs(f: (Int => Int), num: Int): Int = f(num)
}
