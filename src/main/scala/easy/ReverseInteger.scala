package easy

import scala.annotation.tailrec

/**
 * Created by yongmin_xia on 28/10/2014.
 */
object ReverseInteger {
  def reverse(x: Int): Int = {
    @tailrec
    def reverseRec(i: Int, acc: Int): Int = i match {
      case 0 => acc
      case _ => reverseRec(i/10, acc * 10 + i % 10)
    }
    reverseRec(x, 0)
  }

}
