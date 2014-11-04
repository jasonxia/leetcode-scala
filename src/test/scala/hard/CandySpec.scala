package hard

import org.specs2.mutable.Specification
import Candy._

/**
 * Created by yongmin_xia on 4/11/2014.
 */

/**********************************************************************************
  *
  * There are N children standing in a line. Each child is assigned a rating value.
  *
  * You are giving candies to these children subjected to the following requirements:
  *
  * Each child must have at least one candy.
  * Children with a higher rating get more candies than their neighbors.
  *
  * What is the minimum candies you must give?
  *
  *
  **********************************************************************************/

class CandySpec extends Specification {
  "Giving candies to children [5, 6, 7, 4, 1, 2, 3, 2, 1, 7]" in {
    val children = List(5, 6, 7, 4, 1, 2, 3, 2, 1, 7)
    minimum(children) === 19
  }
}
