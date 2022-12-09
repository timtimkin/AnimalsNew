import Animal
import Herbivore
import Predator

fun main(args: Array<String>) {
    fun run(){
                println("Exercise four, OOP")
        val animals = mutableListOf<Animal>()

        animals.add(Herbivore("Giraffe"))
        animals.add(Herbivore("Antelope"))
        animals.add(Predator("Wolf", 200f))
        animals.add(Predator("Crocodile", 300f, false))


        for (animal in animals){

            val fur = if (animal.hasFur) "has fur" else "doesn't have fur"
            println("This is a(an) ${animal.name} of type ${animal::class.simpleName} it $fur and its tastes are: ${animal.askTastePreference()}")
            if (animal is Predator){
                println("This predator's weight is ${animal.weight}")
            }
        }


    }

}