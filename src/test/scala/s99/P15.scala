package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P15Spec extends FunSpec with DiagrammedAssertions {
  describe("P14") {
    it("for example") {
      assert(
        P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) ==
          List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      )
    }
  }
}
