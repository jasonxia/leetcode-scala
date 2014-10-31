package medium

import org.specs2.mutable.Specification
import scala.util.Random
import FindMinimumInRotatedSortedArray._

/**
 * Created by yongmin_xia on 31/10/2014.
 */


/**********************************************************************************
  *
  * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
  *
  * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
  *
  * Find the minimum element.
  *
  * You may assume no duplicate exists in the array.
  *
  **********************************************************************************/

class FindMinimumInRotatedSortedArraySpec extends Specification {

  def rotateList(l: List[Int]): List[Int] = {
    val p = Random.nextInt(l.size)
    (l drop p) ::: (l take p)
  }

  "findMin 0" in {
    findMin(rotateList(List.range(0, 10))) === 0
  }

  "findMin 10" in {
    findMin(rotateList(List.range(10, 100))) === 10
  }

  "findMin in the list which only contains 1 number" in {
    findMin(List(1)) === 1
  }

  "findMin in non-rotated list" in {
    findMin(List.range(10, 20)) === 10
  }

}
