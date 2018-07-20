package nl.stenwessel.batterseye.data

sealed class BaseRunningPlay(runnerAdvancements: Map<Runner, Base>, modifiers: Set<PlayModifier>) : Play(runnerAdvancements, modifiers)

class Balk(
        runnerAdvancements: Map<Runner, Base>
) : BaseRunningPlay(runnerAdvancements, emptySet())

class CaughtStealing(
        val base: Base,
        val fielders: List<Position>,
        val error: BaseError? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(runnerAdvancements, modifiers)

class BaseError // TODO

class DefensiveIndifference(
        val byPosition: Position,
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(runnerAdvancements, modifiers)

class OtherAdvance // TODO

class PassedBall(
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(runnerAdvancements, modifiers)

class WildPitch(
        runnerAdvancements: Map<Runner, Base>,
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(runnerAdvancements, modifiers)

class PickedOff(
        val base: Base,
        val fielders: List<Position>,
        val error: BaseError? = null,
        runnerAdvancements: Map<Runner, Base> = emptyMap(),
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(runnerAdvancements, modifiers)

class StolenBase(
        val bases: Set<Base>,
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(bases.map { Runner.fromBase(it.previous!!)!! to it }.toMap(), modifiers)

class ErrorOnFoulFly(
        val committedBy: Position,
        val hitLocation: HitLocation? = null,
        modifiers: Set<PlayModifier>
) : BaseRunningPlay(emptyMap(), modifiers)
