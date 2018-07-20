package nl.stenwessel.batterseye.model

import nl.stenwessel.batterseye.data.Team
import tornadofx.*

class TeamModel : ItemViewModel<Team>() {
    val name = bind(Team::name)
    val abbreviation = bind(Team::abbreviation)
}
