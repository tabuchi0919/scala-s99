package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P05Spec extends FunSpec with DiagrammedAssertions {
  describe("P05") {
    it("for example") {
      assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    }
  }
}
