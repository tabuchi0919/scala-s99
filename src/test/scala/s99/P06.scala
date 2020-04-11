package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P06Spec extends FunSpec with DiagrammedAssertions {
  describe("P06") {
    it("for example") {
      assert(P06.isPalindrome(List(1, 2, 3, 2, 1)))
    }
  }
}
