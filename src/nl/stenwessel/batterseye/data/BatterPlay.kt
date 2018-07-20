package nl.stenwessel.batterseye.data

sealed class BatterPlay(
        val hitLocation: HitLocation?,
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : Play(runnerAdvancements, modifiers)

class FlyOut(
        val fielder: Position,
        val isSacrificeFly: Boolean = false,
        hitLocation: HitLocation? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BatterPlay(hitLocation, runnerAdvancements, modifiers)

class GroundOut(
        val fielders: List<Position>,
        val out: Runner = Runner.BATTER,
        val isForced: Boolean = true,
        val isSacrificeBunt: Boolean = false,
        hitLocation: HitLocation? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BatterPlay(hitLocation, runnerAdvancements, modifiers)

class DoublePlay // TODO (add GDP)

class TriplePlay // TODO

class CatcherInterference(
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : BatterPlay(null, runnerAdvancements + mapOf(Runner.BATTER to Base.FIRST), modifiers)

class BatterObstruction(
        val committedBy: Position,
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : BatterPlay(null, runnerAdvancements + mapOf(Runner.BATTER to Base.FIRST), modifiers)

class BaseHit(
        val type: BaseHitType,
        hitLocation: HitLocation? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BatterPlay(hitLocation, runnerAdvancements + mapOf(Runner.BATTER to type.toBase), modifiers)

class Error(
        val committedBy: Position,
        val assists: List<Position> = emptyList(),
        val type: ErrorType = ErrorType.FIELDING,
        hitLocation: HitLocation? = null,
        runnerAdvancements: Map<Runner, Base> = mapOf(Runner.BATTER to Base.FIRST),
        modifiers: Set<PlayModifier>
) : BatterPlay(hitLocation, runnerAdvancements, modifiers)

class FieldersChoice // TODO

class HitByPitch(
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BatterPlay(null, runnerAdvancements + mapOf(Runner.BATTER to Base.FIRST), modifiers)

class StrikeOut(
        val fielders: List<Position> = emptyList(),
        val baseRunningPlay: BaseRunningPlay? = null,
        modifiers: Set<PlayModifier>
) : BatterPlay(null, emptyMap(), modifiers)

class Walk(
        val isIntentional: Boolean = false,
        val baseRunningPlay: BaseRunningPlay? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BatterPlay(null, runnerAdvancements + mapOf(Runner.BATTER to Base.FIRST), modifiers)
