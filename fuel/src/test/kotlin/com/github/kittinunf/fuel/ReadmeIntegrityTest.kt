package com.github.kittinunf.fuel

import com.github.kittinunf.fuel.test.MockHttpTestCase
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.After
import org.junit.Before

class ReadmeIntegrityTest : MockHttpTestCase() {

    // This silences the printing so it doesn't pollute the log
    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @Before
    fun prepareStream() {
        System.setOut(PrintStream(outContent))
        Fuel.reset()
    }

    @After
    fun tearDownStream() {
        System.setOut(originalOut)
    }

    // TODO: it is not really Testing anything?
    /*@Test
    fun makingRequestsAboutPatchRequests() = runBlocking {
        mock.chain(
            request = mock.request().withMethod(Method.POST.value),
            response = mock.reflect()
        )

        withContext(Dispatchers.IO) {
            Fuel.patch(mock.path("/post"))
                    .also { println("[request] $it") }
                    .awaitByteArrayResponseResult()
        }
    }*/
}
