package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P10Spec extends FunSpec with DiagrammedAssertions {
  describe("P10") {
    it("for example") {
      assert(
        P10.encode(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        ) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      )
    }
  }
}
