package easy

import org.specs2.mutable.Specification
import ReverseInteger._

/**
 * Created by yongmin_xia on 29/10/2014.
 */
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
