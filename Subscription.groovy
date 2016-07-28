class Subscription {
	def followingUsers

	Subscription() {
		this.followingUsers = []
	}

	def follow(user) {
		this.followingUsers.push(user)
	}

	def read() {
		def allMessages = []
		publishSubscriptions().each { post -> allMessages.push(post.message)}
		println allMessages
	}

	def publishSubscriptions() {
		if (followingUsers.size == 0) {
			return "Your are not following any user"
		}
		def followingTimelines = []
		def userWithPosts = findUsersWithPosts()
		for (def i = 0; i < userWithPosts.size; i++) {
			followingTimelines = followingTimelines + userWithPosts[i].timeline.publishTimeline()
		}
		return followingTimelines
	}

	private findUsersWithPosts() {
		followingUsers.findAll { user -> user.timeline.publishTimeline().size > 0}
	}

	private getUserMessages(user) {
		def messages = []
		user.timeline.publishTimeline().each { post ->  					messages.push(post.message)}
		return messages
	}

}
