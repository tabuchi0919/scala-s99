package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P14Spec extends FunSpec with DiagrammedAssertions {
  describe("P14") {
    it("for example") {
      assert(
        P14.duplicate(List('a, 'b, 'c, 'c, 'd)) ==
          List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
      )
    }
  }
}
