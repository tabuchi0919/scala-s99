package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P17Spec extends FunSpec with DiagrammedAssertions {
  describe("P17") {
    it("for example") {
      assert(
        P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      )
    }
  }
}
