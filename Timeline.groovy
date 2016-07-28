class Timeline {
	def personalTimeline

	Timeline() {
		this.personalTimeline = []
	}

	def addToTimeline(post) {
		return this.personalTimeline.push(post)
	}

	def publishTimeline() {
		return this.personalTimeline
	}

}
