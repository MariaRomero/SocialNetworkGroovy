class SocialNetwork {
	def users

	SocialNetwork() {
		this.users = []
	}

	def addUser(user) {
		this.users.push(user)
	}

	def findUser(username) {
		this.users.findAll { user -> user.username == username }[0]
	}

}
