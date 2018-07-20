package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
sealed class PlayModifier

object AppealPlay : PlayModifier()

object BatterInterference : PlayModifier()

object BattingOutOfTurn : PlayModifier()

object RunnerHitByBattedBall : PlayModifier()

object CourtesyBatter : PlayModifier()

object CourtesyRunner : PlayModifier()

data class ErrorModifier(val committedBy: Position) : PlayModifier()

object FanInterference : PlayModifier()

object InfieldFlyRule : PlayModifier()

object InfieldFlyRuleNotCaught : PlayModifier()

object Interference : PlayModifier()

object Obstruction : PlayModifier()

object RunnerPassing : PlayModifier()

data class AdvanceOnThrow(val from: Position, val to: Base) : PlayModifier()

object RunnerInterference : PlayModifier()

object UmpireInterference : PlayModifier()
