package Activities_1
//Program : Discount in %

//Enunciated : Read the original price & actual Price and Print the discount in %.
/**
 * #Discount %
 * ##Read actual price and original price and return the discount
 *
 * @author Ferran Martínez I Gilabert
 * @param originalPrice Dada type Double
 * @param actualPrice Dada typpe Double
 * @return Return the discount in %
 */
fun discount(originalPrice : Double, actualPrice : Double): Double{
    var descompte : Double = ((originalPrice - actualPrice) / originalPrice) * 100
    return descompte
}