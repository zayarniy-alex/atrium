package ch.tutteli.atrium.assertions

import ch.tutteli.atrium.AtriumFactory
import ch.tutteli.atrium.assertions.DescriptionNarrowingAssertion.IS_A
import ch.tutteli.atrium.creating.IAssertionPlant
import ch.tutteli.atrium.creating.IAssertionPlantNullable
import ch.tutteli.atrium.creating.IReportingAssertionPlant
import ch.tutteli.atrium.creating.IReportingAssertionPlantNullable
import ch.tutteli.atrium.newDownCastBuilder

inline fun <reified T : Any> _isNotNull(plant: IAssertionPlantNullable<T?>): IAssertionPlant<T>
    = AtriumFactory.newDownCastBuilder(DescriptionBasic.IS_NOT, (plant as IReportingAssertionPlantNullable<T?>).commonFields)
    .cast()

inline fun <reified T : Any> _isNotNull(plant: IAssertionPlantNullable<T?>, noinline createAssertions: IAssertionPlant<T>.() -> Unit): IAssertionPlant<T>
    = AtriumFactory.newDownCastBuilder(DescriptionBasic.IS_NOT, (plant as IReportingAssertionPlantNullable<T?>).commonFields)
    .withLazyAssertions(createAssertions)
    .cast()

inline fun <reified TSub : Any> _isA(plant: IAssertionPlant<Any>): IAssertionPlant<TSub>
    = AtriumFactory.newDownCastBuilder<TSub, Any>(IS_A, (plant as IReportingAssertionPlant<Any>).commonFields)
    .cast()

inline fun <reified TSub : Any> _isA(plant: IAssertionPlant<Any>, noinline createAssertions: IAssertionPlant<TSub>.() -> Unit): IAssertionPlant<TSub>
    = AtriumFactory.newDownCastBuilder<TSub, Any>(IS_A, (plant as IReportingAssertionPlant<Any>).commonFields)
    .withLazyAssertions(createAssertions)
    .cast()