package nl.stenwessel.batterseye.model

import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
data class Team(val name: String, val abbreviation: String) {
    val players: List<Player> = ArrayList()
}

class Player(firstName: String? = null, lastName: String? = null) {
    var firstName by property(firstName)
    fun firstNameProperty() = getProperty(Player::firstName)

    var lastName by property(lastName)
    fun lastNameProperty() = getProperty(Player::lastName)

    class Model : ItemViewModel<Player>() {
        val firstName = bind(Player::firstNameProperty)
        val lastName = bind(Player::lastNameProperty)
    }
}
