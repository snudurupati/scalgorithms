package search

/**
  * Created by snudurupati on 7/8/17.
  */

import junit.framework.TestCase

class TestBinarySearch extends TestCase {

    def testBinarySearch = {
      assert(true)
      val searcher = new BinarySearch()
      val input = Array(1, 3, 4, 5, 7, 8, 9, 13)
      println(searcher.search(input, 9))
      println(searcher.search(input, 1))
      println(searcher.search(input, 8))
      println(searcher.search(input, 11))
      assert(searcher.search(input, 9) == 6)
      assert(searcher.search(input, 1) == 0)
      assert(searcher.search(input, 8) == 5)
      assert(searcher.search(input, 11) == -1)
      assert(true)
    }
}
