// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")

package ch.tutteli.atrium.assertions

import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.domain.builders.AssertImpl

@Deprecated("Use AssertImpl.charSequence.containsBuilder; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.containsBuilder(plant)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _containsBuilder(plant: AssertionPlant<T>)
    = AssertImpl.charSequence.containsBuilder(plant)

@Deprecated("Use AssertImpl.charSequence.containsNotBuilder; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.containsNotBuilder(plant)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _containsNotBuilder(plant: AssertionPlant<T>)
    = AssertImpl.charSequence.containsNotBuilder(plant)


@Deprecated("Use AssertImpl.charSequence.startsWith; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.startsWith(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _startsWith(plant: AssertionPlant<T>, expected: CharSequence): Assertion
    = AssertImpl.charSequence.startsWith(plant, expected)

@Deprecated("Use AssertImpl.charSequence.startsNotWith; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.startsNotWith(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _startsNotWith(plant: AssertionPlant<T>, expected: CharSequence): Assertion
    = AssertImpl.charSequence.startsNotWith(plant, expected)

@Deprecated("Use AssertImpl.charSequence.endsWith; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.endsWith(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _endsWith(plant: AssertionPlant<T>, expected: CharSequence): Assertion
    = AssertImpl.charSequence.endsWith(plant, expected)

@Deprecated("Use AssertImpl.charSequence.endsNotWith; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.endsNotWith(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _endsNotWith(plant: AssertionPlant<T>, expected: CharSequence): Assertion
    = AssertImpl.charSequence.endsNotWith(plant, expected)

@Deprecated("Use AssertImpl.charSequence.isEmpty; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.isEmpty(plant)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _isEmpty(plant: AssertionPlant<T>): Assertion
    = AssertImpl.charSequence.isEmpty(plant)

@Deprecated("Use AssertImpl.charSequence.isNotEmpty; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.charSequence.isNotEmpty(plant)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : CharSequence> _isNotEmpty(plant: AssertionPlant<T>): Assertion
    = AssertImpl.charSequence.isNotEmpty(plant)
