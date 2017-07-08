package search

/**
  * Created by snudurupati on 7/8/17.
  * Divides the collection into to half every time and searches each half for a matching value.
  * Requires a sorted collections.
  * Current implementation is only for Collection of Integers.
  */
class BinarySearch {

  def isSorted(s: Seq[Int]): Boolean = {
    val ln = s.length - 1

    @annotation.tailrec
    def go(i: Int, j: Int): Boolean = {
      if (j > ln) true
      else if (s(i) > s(j)) false
      else go(i + 1, j + 1)
    }

    go(0, 1)
  }

  def search(s: Seq[Int], key: Int): Int = {

    @annotation.tailrec
    def go(lo: Int, hi: Int): Int = {
      val mid = (lo + hi) / 2
      val guess = s(mid)
      if (!isSorted(s)) -1
      else if (lo > hi) -1
      else if (guess == key) mid
      else if (guess < key) go(mid + 1, hi)
      else go(lo, mid - 1)
    }

    go(0, s.length - 1)
  }
}

