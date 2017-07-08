package search

/**
  * Created by snudurupati on 7/8/17.
  */
trait Search[A] {
  def search[A](s: Seq[A], key: A): Int
}
