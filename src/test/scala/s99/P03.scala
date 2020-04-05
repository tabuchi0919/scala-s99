package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P03Spec extends FunSpec with DiagrammedAssertions {
  describe("P03") {
    it("for example") {
      assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    }
  }
}
