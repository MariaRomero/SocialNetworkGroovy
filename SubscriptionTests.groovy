import groovy.util.GroovyTestCase

class SubscriptionTests extends GroovyTestCase {

	private subscription

	def void testUsersCanFollowUsers() {
		def subscription = new Subscription()
		subscription.follow("Spike")
		assert 1 == subscription.followingUsers.size
	}

// more test needed but having dificulties mocking items

	// def void testUserCanReadMessages(){
	// 	def subscription = new Subscription()
	// 	subscription.follow("Spike")
	// 	subscription.read()
	// }
}
