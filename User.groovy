// import Post

class User {
	String username
	def post
	def following = []
	def timeLine = []

	User(username) {
		this.username = username
	}

	def publishPost(message) {
		timeLine.push(new Post(message))
	}

	def follow(user) {
		following.push(user)
	}

	def read() {
		if (following.size == 0) {
			return "Your are not following any user"
		}
		def usersTimeLines = [:]
		def userWithPosts = findUsersWithPosts()
		for (def i = 0; i < userWithPosts.size; i++) {
			usersTimeLines["${userWithPosts[i].username}"] = userWithPosts[i].timeLine
		}
		return usersTimeLines
	}

	private findUsersWithPosts() {
		following.findAll { user -> user.timeLine.size > 0}
	}
}
