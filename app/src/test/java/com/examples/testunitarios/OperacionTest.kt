package com.examples.testunitarios

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test


class OperacionTest {

    private var mOperacion: Operacion? = null

    @Before
    fun setUp() {
        mOperacion = Operacion()
    }

    @Test
    fun operacionNotNull() {
        assertNotNull(mOperacion)
    }

    @Test
    @Throws(Exception::class)
    fun suma() {
        assertEquals("7", mOperacion!!.suma("3", "4"))
    }

    @Test
    @Throws(Exception::class)
    fun resta() {
        assertEquals("-1", mOperacion!!.resta("3", "2"))
    }

}