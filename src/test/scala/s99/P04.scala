package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P04Spec extends FunSpec with DiagrammedAssertions {
  describe("P04") {
    it("for example") {
      assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
    }
  }
}
