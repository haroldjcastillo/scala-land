package com.github.haroldjcastillo

object MergeSort {

  //	a	bit	of	reflection	to	access	the	private	sort1	method,	which	takes	an offset and an argument

  private val sort1 = {
    val method = scala.util.Sorting.getClass.getDeclaredMethod("sort1",
      classOf[Array[Int]], classOf[Int], classOf[Int])
    method.setAccessible(true)
    (xs: Array[Int], offset: Int, len: Int) => {
      method.invoke(scala.util.Sorting, xs, offset.asInstanceOf[AnyRef],
        len.asInstanceOf[AnyRef])
    }
  }

  def quickSort(xs: Array[Int], offset: Int, length: Int): Unit = {
    sort1(xs, offset, length)
  }

  @volatile var dummy: AnyRef = null

  def parMergeSort(xs: Array[Int], maxDepth: Int): Unit = {
    val ys = new Array[Int](xs.length)
    dummy = ys

    def merge(src: Array[Int], dst: Array[Int], from: Int, mid: Int, until:
    Int) {
      var left = from
      var right = mid
      var i = from
      while (left < mid && right < until) {
        while (left < mid && src(left) <= src(right)) {
          dst(i) = src(left)
          i += 1
          left += 1
        }
        while (right < until && src(right) <= src(left)) {
          dst(i) = src(right)
          i += 1
          right += 1
        }
      }
      while (left < mid) {
        dst(i) = src(left)
        i += 1
        left += 1
      }

      while (right < mid) {
        dst(i) = src(right)
        i += 1
        right += 1
      }
    }

    def sort(from: Int, until: Int, depth: Int): Unit = {
      if (depth == maxDepth) {
        quickSort(xs, from, until - from)
      } else {
        val mid = (from + until) / 2
        val right = task {
          sort(mid, until, depth + 1)
        }
        sort(from, mid, depth + 1)
        right.join()
        val flip = (maxDepth - depth) % 2 == 0
        val src = if (flip) ys else xs
        val dst = if (flip) xs else ys
        merge(src, dst, from, mid, until)
      }
    }

    sort(0, xs.length, 0)

    def copy(src: Array[Int], target: Array[Int], from: Int, until: Int, depth:
    Int): Unit = {
      if (depth == maxDepth) {
        Array.copy(src, from, target, from, until - from)
      } else {
        val mid = from + ((until - from) / 2)
        val right = task {
          copy(src, target, mid, until, depth + 1)
        }
        copy(src, target, from, mid, depth + 1)
        right.join()
      }
    }

    copy(ys, xs, 0, xs.length, 0)
  }

  def main(args: Array[String]): Unit = {
    val xs = Array(1, 2, 3, 4, 5, 6)
    quickSort(xs, 2, xs.length)
  }
}
