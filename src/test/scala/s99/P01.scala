package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P01Spec extends FunSpec with DiagrammedAssertions {
  describe("P01") {
    it("for example") {
      assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
    }
  }
}
