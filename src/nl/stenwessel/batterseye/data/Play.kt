package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
open class Play(
        val runnerAdvancements: Map<Runner, Base>,
        val modifiers: Set<PlayModifier>
)
