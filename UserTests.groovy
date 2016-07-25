import groovy.util.GroovyTestCase

class UserTests extends GroovyTestCase {

	private spike, nikesh, leo

	def void setUp() {
		spike = new User("Spike", new Post())
		nikesh = new User("Nikesh", new Post())
		leo = new User("Leo", new Post())
		spike.posts("This is spike's first message")
		leo.follow(nikesh)
		leo.follow(spike)
	}

	def void tearDown() {
		spike = null
		nikesh = null
		leo = null
	}

	def void testUserCanPostOnTheirTimeLine() {
		assert 1 == spike.timeLine.size
	}

	def void testUserCanFollowAnotherUser() {
		assert 2 == leo.following.size
	}

	def void testUserCanReadAUsersPostTheyFollow() {
		def expectation = leo.read()
		assert expectation["Spike"] == spike.timeLine
	}

	def void testUserCantReadUsersPostsTheyDontFollow() {
		def expectation = nikesh.read()
		assert expectation == "Your are not following any user"
	}
}
