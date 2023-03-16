package com.knoldus
object AdditionExceptions {
    class IntOverflowException extends RuntimeException
    class NegativeNumberException extends RuntimeException
}

object Functions extends App {
    import AdditionExceptions._
    // 1.
    def addition: Function2[Int,Int,Int] = new Function2[Int, Int,Int] {

        // this function will add only positive values. In case of negative values, it will throw NegativeNumberException
        // is result is negative is will throw IntOverflowException

      override def apply(firstNumber: Int, secondNumber: Int) = {
          if (firstNumber < 0 || secondNumber < 0) throw new NegativeNumberException
          val result = firstNumber + secondNumber
          if (result < 0) throw new IntOverflowException
          result
        }
    }
    // 2.
    def sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
      override def apply(list: List[Int]): Int = list.sum
    }

    // 3.
    def higherOrderFunction: (Int => Int, Int) => Int = functionWithTwoIntInputs //(calling functionWithTwoIntInputs )

    def functionWithTwoIntInputs(f: (Int => Int), num: Int): Int = f(num)
}
