package hard

/**
 * Created by yongmin_xia on 4/11/2014.
 */

/*
 *    The soluiton is O(2n) run-time complexity
 *
 *    For example:
 *
 *        ratings[] = { 5, 6, 7, 4, 1, 2, 3, 2, 1, 7 }
 *
 *    1) Go through the ratings from left to right.
 *
 *       Find the each increasing sub-array, giving the minimal candy
 *
 *        ratings[] = { 5, 6, 7,   4,   1, 2, 3,   2,   1, 7 }
 *                      ------>    ->   ------>    ->   --->
 *          candy[] = { 1, 2, 3,   1,   1, 2, 3,   1,   1, 2 }
 *
 *    2) Go through the raings from right to left.
 *
 *             ratings[] = { 5,   6,   7, 4, 1,   2,   3, 2, 1,   7 }
 *                           <-   <-   <------    <-   <------    <-
 *          prev_candy[] = { 1,   2,   3, 1, 1,   2,   3, 1, 1,   2 }
 *                                        +1              +1
 *               candy[] = { 1,   2,   3, 2, 1,   2,   3, 2, 1,   2 }
 *
 *    3) total candy is 19
 *
 */

object Candy {
  def minimum(children: List[Int]): Int = {
    var candies = List[Int](1)
    for (i <- 1 until children.size) {
      if (children(i) < children(i - 1)) candies = candies :+ 1 else candies = candies :+ (candies.last + 1)
    }

    for (i <- children.size - 2 to 0 by -1) {
      if ((children(i) > children(i + 1)) && (candies(i) <= candies(i + 1))) {
        candies = candies.updated(i, candies(i) + 1)
      }
    }

    candies.sum
  }

}
