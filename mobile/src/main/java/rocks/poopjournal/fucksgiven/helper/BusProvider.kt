package rocks.poopjournal.fucksgiven.helper

import com.squareup.otto.Bus

/**
 * Created by Experiments on 05-Mar-17.
 */
class BusProvider private constructor() {
    val bus: Bus = Bus()

    companion object {
        val instance = BusProvider()
    }
}
