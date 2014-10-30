package easy

import org.specs2.mutable.Specification
import ReverseInteger._

/**
 * Created by yongmin_xia on 29/10/2014.
 */

/**********************************************************************************
  *
  * Reverse digits of an integer.
  *
  * Example1: x =  123, return  321
  * Example2: x = -123, return -321
  *
  *
  * Have you thought about this?
  *
  * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
  *
  * > If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
  *
  * > Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer,
  *   then the reverse of 1000000003 overflows. How should you handle such cases?
  *
  * > Throw an exception? Good, but what if throwing an exception is not an option?
  *   You would then have to re-design the function (ie, add an extra parameter).
  *
  *
  **********************************************************************************/

class ReverseIntegerSpec extends Specification {
  "reverse(123)" in {
    reverse(123) === 321
  }

  "reverse(-123)" in {
    reverse(-123) === -321
  }

  "reverse(100)" in {
    reverse(100) === 1
  }

  "reverse(-123)" in {
    reverse(1002) === 2001
  }

}
