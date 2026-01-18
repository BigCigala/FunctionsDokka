package Activities_1
//Program : Area calculator
//Enunciated : Calculate the Area of a Room. Read the long (Integer) and width (Integer) and make the area.
/**
 * #Area Calculator
 * ##Given the long & width we calculate the Area
 * @author Ferran Martínez I Gilaber
 * @param long Dada type integer, long of a Room
 * @param width Dada type integerm width of a Room
 * @return Return the Room area
 */
fun areaCalculator(long: Int, width:Int): Int{
    val area : Int = width * long
    return area
}