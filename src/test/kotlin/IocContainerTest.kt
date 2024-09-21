import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@ContextConfiguration("file:web/WEB-INF/spring/applicationContext.xml")
class IocContainerTest {

    @Test
    fun test() {
        println("Test")
    }
}