package nl.stenwessel.batterseye.data

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

    val activeRoster = mutableListOf<TeamPlayer>()

    override fun toString(): String = "$name ($abbreviation)"
}

