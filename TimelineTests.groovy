import groovy.util.GroovyTestCase

class TimelineTests extends GroovyTestCase {

	private tl

	def void testAddToTimelineStoresPost() {
		def tl = new Timeline()
		tl.addToTimeline("This is spike's first message")
		assert 1 == tl.personalTimeline.size
	}

	def void testPublishTimelineIsReturningThePersonalTimeline() {
		def tl = new Timeline()
		tl.addToTimeline("This is spike's first message")
		def expectation = tl.publishTimeline()
		assert expectation == tl.personalTimeline
	}

}
