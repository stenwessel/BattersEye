package nl.stenwessel.batterseye.model

import javafx.collections.ObservableSet
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class Team(var name: String = "", abbreviation: String = "") : JsonModelAuto {
    companion object {
        val INSTANCES: ObservableSet<Team> = mutableSetOf<Team>().observable()
    }

    var abbreviation = abbreviation.toUpperCase()
        set(value) { field = value.toUpperCase() }

    init {
        INSTANCES += this
    }

    fun delete() {
        INSTANCES -= this
    }

    override fun toString(): String = "$name ($abbreviation)"
}

class TeamModel : ItemViewModel<Team>() {
    val name = bind(Team::name)
    val abbreviation = bind(Team::abbreviation)
}
