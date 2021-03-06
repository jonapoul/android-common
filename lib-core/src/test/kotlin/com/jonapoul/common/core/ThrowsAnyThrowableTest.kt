@file:Suppress("TooGenericExceptionThrown")

package com.jonapoul.common.core

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ThrowsAnyThrowableTest {
    private class CustomSubClassException : IllegalStateException()

    @Test
    fun `Throws any exception valid 1`() {
        assertTrue(
            throwsAnyThrowable { throw IllegalStateException() }
        )
    }

    @Test
    fun `Throws any exception valid 2`() {
        assertTrue(
            throwsAnyThrowable { throw Exception() }
        )
    }

    @Test
    fun `Throws any exception valid 3`() {
        assertTrue(
            throwsAnyThrowable { throw CustomSubClassException() }
        )
    }

    @Test
    fun `Throws any exception valid 4`() {
        assertTrue(
            throwsAnyThrowable { throw Error() }
        )
    }

    @Test
    fun `Throws any exception valid 5`() {
        assertTrue(
            throwsAnyThrowable { throw Throwable() }
        )
    }

    @Test
    fun `Throws any exception valid 6`() {
        assertTrue(
            throwsAnyThrowable { throw AssertionError() }
        )
    }

    @Test
    fun `Doesn't throw`() {
        assertFalse(
            throwsAnyThrowable {
                1 + 1
            }
        )
    }
}
