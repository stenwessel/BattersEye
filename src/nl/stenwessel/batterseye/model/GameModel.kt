package nl.stenwessel.batterseye.model

import nl.stenwessel.batterseye.data.Game
import tornadofx.*

class GameModel : ItemViewModel<Game>() {
    val home = bind(Game::homeTeam)
    val away = bind(Game::visitingTeam)
}
