package Activities_1
//Program : Diameter & superficiate from a pizza

//Enunciated : Read the diameter from a pizza and print the superficiate. You can use Math.PI.
/**
 * #Superficiate
 * ##We calculate the radius from the diameter & print the superficiate
 *
 * @author Ferran Martínez I Gilabert
 * @param diameter Dada type Double
 * @return Return the superficiate from the diameter (PI * (radius * radius))
 */
fun superficiate(diameter : Double) : Double{
    var radius : Double = (diameter / 2)

    var superficiate : Double = Math.PI * (radius * radius)

    return superficiate
}