package com.yangzai.superutils

import com.test.superutils.yzCheckEmail
import com.test.superutils.yzCheckIdcard
import com.test.superutils.yzCheckPassword
import com.test.superutils.yzCheckPhone
import com.test.superutils.yzDesensitizedPhoneNumber
import com.test.superutils.yzDesensitizedUsername
import com.test.superutils.yzIsIncludeDigit
import com.test.superutils.yzSplitNotNumber
import com.test.superutils.yzSplitNumbers
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testUserUtilsExt() {
        println("13693538454".yzDesensitizedPhoneNumber())
        println("许阳".yzDesensitizedUsername())
        println("307315148q.com".yzCheckEmail())
        println("1369353845".yzCheckPhone())
        println("11021199510021811".yzCheckIdcard())
        println("12356".yzCheckPassword())
    }
    @Test
    fun testStringUtilsExt(){
        println("111aaa2b3c4d".yzSplitNumbers())
        println("111aaa2b3c4d".yzSplitNotNumber())
        println("111aaa2b3c4d".yzIsIncludeDigit())
    }
}