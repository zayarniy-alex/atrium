package ch.tutteli.atrium.api.cc.de_CH

import ch.tutteli.atrium.api.cc.de_CH.assertions.iterable.contains.builders.IterableContainsAtLeastCheckerBuilder
import ch.tutteli.atrium.assertions.iterable.contains.builders.IterableContainsBuilder
import ch.tutteli.atrium.assertions.iterable.contains.decorators.IterableContainsInAnyOrderSearchBehaviour
import ch.tutteli.atrium.assertions.iterable.contains.decorators.IterableContainsInAnyOrderOnlySearchBehaviour
import ch.tutteli.atrium.assertions.iterable.contains.decorators.IterableContainsInOrderOnlySearchBehaviour
import ch.tutteli.atrium.assertions.iterable.contains.decorators.IterableContainsNoOpSearchBehaviour
import ch.tutteli.atrium.creating.IAssertionPlant
import kotlin.reflect.KProperty

abstract class IterableContainsSpecBase {
    private val containsProp: KProperty<*> = IAssertionPlant<Iterable<Double>>::enthaelt
    protected val contains = containsProp.name
    protected val containsNot = IAssertionPlant<Iterable<Double>>::enthaeltNicht.name
    protected val atLeast = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderSearchBehaviour>::zumindest.name
    protected val butAtMost = IterableContainsAtLeastCheckerBuilder<Double, Iterable<Double>>::aberHoechstens.name
    protected val exactly = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderSearchBehaviour>::genau.name
    protected val atMost = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderSearchBehaviour>::hoechstens.name
    protected val notOrAtMost = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderSearchBehaviour>::nichtOderHoechstens.name
    protected val inAnyOrder = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsNoOpSearchBehaviour>::inBeliebigerReihenfolge.name
    protected val inOrder = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsNoOpSearchBehaviour>::inGegebenerReihenfolge.name
    protected val only = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderSearchBehaviour>::nur.name
    protected val inAnyOrderOnlyValues = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInAnyOrderOnlySearchBehaviour>::werte.name
    protected val inOrderOnlyValues = IterableContainsBuilder<Double, Iterable<Double>, IterableContainsInOrderOnlySearchBehaviour>::werte.name
}
