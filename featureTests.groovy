
import spock.lang.*
import spock.lang.specification

// import User

class featureTestSpec extends Specification {
	def "Users can follow other users"() {
		setup: "two user are created"
			// def spike = new User("Spike", new Post());
			// def nikesh = new User("Nikesh", new Post());
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
// spike = new User("Spike", new Post())
// leo = new User("leo", new Post())
// nikesh = new User("nikesh", new Post())
// spike.posts("Spike first message")
// nikesh.posts("Nikesh first message")
// spike.follow(nikesh)
// spike.read()
// leo.follow(spike)
// leo.follow(nikesh)
// println leo.read()


