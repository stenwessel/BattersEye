package nl.stenwessel.batterseye.data

typealias LineupPlayer = Pair<TeamPlayer, Position>

class Lineup(val team: Team) {
    val players = mutableListOf<LineupPlayer>()
}
