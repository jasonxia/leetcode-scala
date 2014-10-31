package medium

import scala.annotation.tailrec

/**
 * Created by yongmin_xia on 31/10/2014.
 */

object FindMinimumInRotatedSortedArray {

  @tailrec
  def findMin(s: List[Int]): Int = s match {
    case i :: Nil => i
    case h :: t => if(h < t.last) h else findMin(t)
  }

}
