package nl.stenwessel.batterseye.model

import javafx.collections.ObservableSet
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class Team(var name: String = "", var abbreviation: String = "") : JsonModelAuto {
    companion object {
        val INSTANCES: ObservableSet<Team> = mutableSetOf<Team>().observable()
    }

    init {
        INSTANCES += this
    }

    fun delete() {
        INSTANCES -= this
    }

    override fun toString(): String = "$name ($abbreviation)"
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
