fun main() {
    val arr :Array<String> = arrayOf("phalu","sagar","demo")
    println(ReturnStringData(arr))
}
fun ReturnStringData(arr:Array<String>):String{
    var result:StringBuilder= StringBuilder()
    for((index,value) in arr.withIndex()){
        result.append("${index+1}  ${value}\n")
    }
    return result.toString()

}

////OutPut:
//1  phalu
//2  sagar
//3  demo



