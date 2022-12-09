class Predator(name: String, val weight: Float, hasFur: Boolean = true) : Animal(name, hasFur) {

    override fun askTastePreference(): String {
        return "I prefer meat"
    }
}