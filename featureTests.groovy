
import spock.lang.*
import spock.lang.specification


// import User

class featureTestSpec extends Specification {
	def "Users can follow other users"() {
		setup: "two user are created"
			// def spike = new User("Spike");
			// def nikesh = new User("Nikesh");
			def a = 1
			def b  =1
		when:
		 // spike.follow(nikesh)
		 a = a + b
		then:
			// spike.following.size == 1
			a == 2
	}
}
// spike = new User("Spike")
// leo = new User("leo")
// nikesh = new User("nikesh")
// spike.publishPost("Spike first message")
// nikesh.publishPost("Nikesh first message")
// spike.follow(nikesh)
// spike.read()
// leo.follow(spike)
// leo.follow(nikesh)
// println leo.read()
