package project_euler.problems

import org.scalatest.FunSpec
import org.scalatest.Matchers


class Problem001Spec extends FunSpec with Matchers {
  val problem = new Problem001()
  describe ("#calculate") {
    it ("multiples of 3 and 5 should give 23 under 10") {
      problem.calculate(10) should equal(23)
    }
  }

  describe ("#execute") {
    it ("multiples of 3 and 5 should give 233168 under 1000") {
     problem.execute should equal(233168)
    }
  }
}
