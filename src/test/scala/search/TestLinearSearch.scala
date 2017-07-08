package search

/**
  * Created by snudurupati on 7/8/17.
  */

import junit.framework.TestCase

class TestLinearSearch extends TestCase {

    def testLinearSearch = {
      assert(true)
      val searcher = new LinearSearch[Int]()
      val input = Array(1, 5, 7, 3, 9, 13, 4, 8)
      assert(searcher.search(input, 9) == 4)
      assert(searcher.search(input, 1) == 0)
      assert(searcher.search(input, 8) == 7)
      assert(searcher.search(input, 11) == -1)
      assert(true)
    }
}
