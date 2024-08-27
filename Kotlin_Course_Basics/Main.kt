fun main() {
    var a = 10
    var b = 12.123
    var c = "hello"
    var d = true // boolean
    var e : Int = 10
    var f : Double = 12.123
    var g : String = "hello"
    var h : Boolean =true
    var i :Float = 12.234f  // by default, it is double

    // ------------------------------------------------------------------------------
    // Array -- elements of same datatype stored in continuous memory locations
    var words=arrayOf("Python","Java","Kotlin")
    val row1 = arrayOf(1,2,3,4)
    val row2 = arrayOf(5,6,7,8)
    val row3:Array<Int> = arrayOf(9,10,11,12)
    var arr = arrayOf(row1,row2,row3)
    // using the lambda function
    val squares = Array(5) {i -> i*i}
    val first = squares[2]
    println(words[1]) // Accessing the array element
    println(first)
    row1[2]=30 // changing the array element
    println("Changed value is ${row1[2]}")
    println(arr[0][3]) // accessing multidimensional array element
    // iterating through the array
    for (i in row1){
        println("The element of array is $i")
    }

    //looping through  multidimensional array
    println("The element in multidimensional array is: ")
    for (i in arr){
        for(j in i){
            print("$j ")
        }
    }
    // using for each function
    println()
    words.forEach {word -> println(word)}

    // to know the size of array
    var s = row2.size
    println("The size of the array is: $s")
    if (words.isEmpty()){ // empty method
        println("Array is empty")
    }
    else{
        println(words.first()) // first method -- to get first element
        println(words.last()) // last method -- to get last element
    }
     // to know the index of the element
    val ind = words.indexOf("Java")
    println(ind)

    // QUESTION
    // determine the eligibility for special order based on total amt and membership status
    // define two variables - total amt and membership
    // if purchase amt>1000 then check status if true - 20 percent if not then  10 percent else no discount
    println("Enter the purchase amount: ")
    val inputAmt = readln()
    val purchaseAmt=inputAmt.toDouble()
    val status=true
    var discount:Double=0.0
    var finalAmt = purchaseAmt.toDouble()
    if(purchaseAmt > 1000){
        if(status){
           discount = (20.0/100) * purchaseAmt
            finalAmt=purchaseAmt-discount

        }
        else{
            discount = (10.0/100) * purchaseAmt
            finalAmt=purchaseAmt-discount
        }
    }
    else{
        finalAmt=purchaseAmt
    }
    println("The final amount to be paid is $finalAmt")

}