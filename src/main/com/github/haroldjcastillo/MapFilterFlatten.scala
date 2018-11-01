object MapFilterFlatten {
    val someList: List(1,2,3,4,5,6,7,8,9)
    val someMap: Map(801 -> "Max", 802 -> "Tom", 803 -> "Jhon", 804 -> "Peter", 805 -> "Sara")

    def main(args: Array[String]) : Unit {
        println(someList.map(x => x / 0.2))
    }
}