package Activities_1
//Program : Sum, multiply & remainder.

//Enunciated : User write 4 Integers, then we return the value of sum the first with second & multiply
// with the remainder of third with fourth
/**
 * # Multiply the Sum with Remainder
 * We sum number 1 with 2, then we multiply with the remainder of 3 with 4
 * @author Ferran Martínez I Gilabert
 * @param num1 Dada type Integer
 * @param num2 Dada type Integer
 * @param num3 Dada type Integer
 * @param num4 Dada type Integer
 * @return Returns the operation : sum of num1 with num2 multiplied with num3 remainder num4
 */
fun multiplyTheSumWithRemainder(num1 : Int, num2 : Int, num3 : Int, num4 : Int) : Int {
    var operation = (num1 + num2) * (num3 % num4)
    var result : Int = operation

    return result
}