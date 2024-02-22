import android.renderscript.Sampler.Value

class TwoSum {
}

fun main() {
    exercise1()
    exercise2()
    exercise3()
    exercise4()
}




fun exercise1() {
    // the first repeating element
    val input = arrayOf(10, 5, 4, 6, 3, 5, 3, 2);
    var returnInt = 0;
    var ifTrueOrFalse = false;

    for (i in input.indices) {
        for (j in i + 1 until input.size) {
            if (input[j] == input[i]) {
                returnInt = input[i]
                ifTrueOrFalse = true
                break
            }
        }
        if (ifTrueOrFalse) {
            break
        }
    }
    println(returnInt)
}

fun exercise2() {
    // two sum problem
    val problemArray: ArrayList<Int> = arrayListOf(2, 8, 3, 7, 11, 15);
    val target = 9;

    var returnIndex: List<Int> = listOf()

    for (i in problemArray.indices) {
        for (j in problemArray.indices) {
            if (i != j && problemArray[i] + problemArray[j] == target) {
                returnIndex = listOf(i, j)
            }
        }
    }
        println(returnIndex)
}

fun exercise3() {
    // two sum problem
    val numArray: ArrayList<Int> = arrayListOf(3, 2, 1, 3);
    val target = 6;

    var returnIndex: List<Int> = listOf();

    for (i in numArray.indices) {
        for (j in numArray.indices) {
            if (i != j && numArray[i] + numArray[j] == target) {
                returnIndex = listOf(i, j)
            }
        }
    }
    println(returnIndex)
}

fun exercise4() {
    // Minimum distance
    val arrayOfInt: ArrayList<Int> = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 3, 9);

    for (i in arrayOfInt.indices) {
        for (j in i + 1 until arrayOfInt.size) {
            if (arrayOfInt[i] == arrayOfInt[j]) {
                println(j - i)
                break
            }
        }
    }
println("-1")
}


