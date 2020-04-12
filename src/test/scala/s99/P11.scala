package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P11Spec extends FunSpec with DiagrammedAssertions {
  describe("P11") {
    it("for example") {
      assert(
        P11.encodeModified(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        ) == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
      )
    }
  }
}
