package com.test
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.SquareList
import com.knoldus.Functions

class SquareTest extends AnyFlatSpec {

      val squareList: SquareList.type = SquareList

      val list: List[Int] = List(2, 3, 4, 5)
      val originalList: List[Int] = squareList.squareList(list)
      val squaredList: List[Int] = List(4, 9, 16, 25)

      "List" should " square list" in {

            val mainList = squareList.otherWayOfSquareList(list)
            assert(originalList == squaredList)
            assert(mainList == squaredList)
      }
      "list " should " square list" in {

            val mainList = squareList.otherWayOfSquareList(list)
            assert(originalList == squaredList)
            assert(mainList == squaredList)
      }

      val functionClassObject = Functions

      "Functions" should "run " in {
            val additionResult = functionClassObject.addition(2,3)
            val sunOfListResult = functionClassObject.sumOfList(List(1,2,3,4,5))
            val higherOrderFunctionResultForSquaringNumber = functionClassObject.higherOrderFunction((value: Int) => value * value, 4)

            assert(additionResult == 5)
            assert(sunOfListResult == 15)
            assert(higherOrderFunctionResultForSquaringNumber == 16)
      }
}
