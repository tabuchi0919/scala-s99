package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P16Spec extends FunSpec with DiagrammedAssertions {
  describe("P16") {
    it("for example") {
      assert(
        P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      )
    }
  }
}
