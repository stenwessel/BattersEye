package nl.stenwessel.batterseye

import javafx.collections.ObservableList
import javafx.collections.ObservableSet
import javafx.collections.SetChangeListener
import tornadofx.*

fun <T> ObservableSet<T>.asObservableList(): ObservableList<T> {
    val list = this.toMutableList().observable()
    this.addListener { change: SetChangeListener.Change<out T> ->
        when {
            change.wasAdded() -> list.add(change.elementAdded)
            change.wasRemoved() -> list.remove(change.elementRemoved)
        }
    }

    return list
}
