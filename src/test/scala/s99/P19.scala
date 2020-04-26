package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P19Spec extends FunSpec with DiagrammedAssertions {
  describe("P19") {
    it("for example") {
      assert(
        P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
      )
      assert(
        P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
      )
    }
  }
}
