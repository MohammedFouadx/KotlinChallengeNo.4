fun main(args: Array<String>) {

    //In Kotlin, you can loop through the elements and the indexes at the same time by one method ? *

    val list = listOf<String>("one","two","three").iterator()

    for ((index , value) in list.withIndex()){
        println("The element at  : $index , is $value")
    }


// We can retrieve the first and the last elements of the list without using the get() method , Write code exampled by
// use 2 methods and After completed upload your project to GitHub and put link bellow in solution box ?

    val Q2= listOf<String>("blue", "black","white","green")

    println(Q2.first())
    println(Q2.last())



/// Write code example to sort a bellow list in ascending and descending order ? and After
// completed upload your project to GitHub and put link bellow in solution box ?

    val list2= listOf(8,4,7,1,2,3,0,5,6)

        println(list2.sorted())
        println(list2.sortedDescending())

}