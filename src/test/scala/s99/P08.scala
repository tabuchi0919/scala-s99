package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P08Spec extends FunSpec with DiagrammedAssertions {
  describe("P08") {
    it("for example") {
      assert(
        P08.compress(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        )
          == List('a, 'b, 'c, 'a, 'd, 'e)
      )
    }
  }
}
