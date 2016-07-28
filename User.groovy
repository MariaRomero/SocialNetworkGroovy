class User {
	String username
	def timeline
	def subscription

	User(username, timeline, subscription) {
		this.username = username
		this.timeline = timeline
		this.subscription = subscription
	}
}
