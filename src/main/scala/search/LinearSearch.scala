package search

/**
  * Created by snudurupati on 7/8/17.
  * Linear search sequentially moves through a collection looking through for a matching value.
  */
class LinearSearch[A] extends Search[A] {

  def search[A](s: Seq[A], key: A): Int = {
    val ln = s.length - 1
    @annotation.tailrec
    def go(a: Int): Int = {
      if(a > ln) -1
      else if(s(a) == key) a
      else go(a + 1)
    }

    go(0)
  }

}
