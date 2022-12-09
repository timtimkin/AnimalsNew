class Herbivore(name: String, hasFur: Boolean = true) : Animal(name, hasFur){

    override fun askTastePreference(): String {
        return "I only eat grass and vegetables"
    }

}
