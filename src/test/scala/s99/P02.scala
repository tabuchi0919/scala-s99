package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P02Spec extends FunSpec with DiagrammedAssertions {
  describe("P02") {
    it("for example") {
      assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    }
  }
}
