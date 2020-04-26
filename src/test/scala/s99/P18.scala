package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P18Spec extends FunSpec with DiagrammedAssertions {
  describe("P18") {
    it("for example") {
      assert(
        P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('d, 'e, 'f, 'g)
      )
    }
  }
}
