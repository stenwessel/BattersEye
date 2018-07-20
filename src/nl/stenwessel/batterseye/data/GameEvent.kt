package nl.stenwessel.batterseye.data

sealed class GameEvent

class Substitution(val teamPlayer: TeamPlayer, val battingOrderPosition: Int?,
        val fieldPosition: Position) : GameEvent()

class EndOfInning() : GameEvent()

class PlateAppearance(val batter: TeamPlayer) : GameEvent() {

    val pitchEvents = mutableListOf<PitchEvent>()

    var play: BatterPlay? = null
}

class JumpToBatter(val battingOrderPosition: Int) : GameEvent()

class Comment(val comment: String) : GameEvent()

class MoundVisit() : GameEvent()

class Delay // TODO

class Ejection // TODO

class UmpireChange(
        val position: UmpirePosition,
        val umpire: Umpire,
        val reason: String? = null
) : GameEvent()

class Protest(
        val filedBy: TeamType,
        val description: String? = null
) : GameEvent()

class Suspension // TODO

sealed class PitchEvent(val play: BaseRunningPlay? = null)

class Pitch(
        val type: PitchType? = null,
        val blockedByCatcher: Boolean = false,
        val pickOffByCatcher: RunnerBase? = null,
        play: BaseRunningPlay? = null
) : PitchEvent(play)

class PickOff(val toBase: RunnerBase, play: BaseRunningPlay? = null) : PitchEvent(play)

class BaseRunningEvent(play: BaseRunningPlay) : PitchEvent(play)


