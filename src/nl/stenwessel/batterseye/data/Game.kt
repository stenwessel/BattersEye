package nl.stenwessel.batterseye.data

import java.time.LocalDate
import java.time.LocalTime

/**
 *
 * @author Sten Wessel
 */
data class Game(
        val homeTeam: Team,
        val visitingTeam: Team,
        val date: LocalDate = LocalDate.now(),
        val doubleHeader: DoubleHeader = DoubleHeader.SINGLE,
        val firstPitchTime: LocalTime? = null,
        val timeOfDay: TimeOfDay = TimeOfDay.DAY,
        val usesDesignatedHitter: Boolean = true,
        val pitchData: PitchData = PitchData.PITCHES,
        val umpireHp: Umpire? = null,
        val umpire1b: Umpire? = null,
        val umpire2b: Umpire? = null,
        val umpire3b: Umpire? = null,
        val umpireLf: Umpire? = null,
        val umpireRf: Umpire? = null,
        val fieldCondition: FieldCondition = FieldCondition.UNKNOWN,
        val precipitation: Precipitation = Precipitation.UNKNOWN,
        val sky: Sky = Sky.UNKNOWN,
        val temperature: Int? = null,
        val windDirection: WindDirection = WindDirection.UNKNOWN,
        val windSpeed: Int? = null,
        val location: Ballpark? = null
) {

    var gameResult: GameResult? = null

    val homeLineup: Lineup = Lineup(homeTeam)
    val visitingLineup: Lineup = Lineup(visitingTeam)

    val events = mutableListOf<GameEvent>()

    enum class DoubleHeader { SINGLE, FIRST, SECOND }

    enum class TimeOfDay { DAY, NIGHT }

    enum class PitchData { NONE, COUNT, PITCHES }

    enum class FieldCondition { DRY, SOAKED, WET, UNKNOWN }

    enum class Precipitation { NONE, DRIZZLE, RAIN, SHOWERS, SNOW, UNKNOWN }

    enum class Sky { CLOUDY, OVERCAST, SUNNY, NIGHT, DOME, UNKNOWN }

    enum class WindDirection { FROM_LF, FROM_RF, L_TO_R, R_TO_L, TO_CF, TO_LF, TO_RF, UNKNOWN }
}


