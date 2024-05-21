package com.yangzai.superutils

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.test.superutils.yzIsIncludeDigit
import com.test.superutils.yzLoge

import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        yzLoge("111aaa2b3c4d".yzIsIncludeDigit())
    }
}