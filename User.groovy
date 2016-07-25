import Post

class User {
	String username
	def post
	def following = []
	def timeLine = []

	User(username, post) {
		this.username = username
		this.post = post
	}

	def posts(message) {
		timeLine.push(this.post.postMessage(message))
	}

	def follow(user) {
		following.push(user)
	}

	def read() {
		if (following.size < 1) {
			return "Your are not following any user"
		}
		def answer = [:]
		def userWithPosts = findUsersWithPosts()
		for (def i = 0; i < userWithPosts.size; i++) {
			answer["${userWithPosts[i].username}"] = userWithPosts[i].timeLine
		}
		return answer
	}

	def findUsersWithPosts() {
		following.findAll { user -> user.timeLine.size > 0}
	}
}
