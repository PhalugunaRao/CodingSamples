fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 5, 3)
    val uniqueNumbers = removeDuplicates(numbers)
    println(uniqueNumbers)

}
fun removeDuplicates(arr: List<Int>):List<Int>{
   var uniqueList= mutableListOf<Int>()
    var seen = mutableSetOf<Int>()
   for (item in arr){
       if(item !in seen){
           seen.add(item)
           uniqueList.add(item)
       }}
    return uniqueList

}


