import groovy.util.GroovyTestCase
import groovy.mock.interceptor.*

class SocialNetworkTests extends GroovyTestCase {

	private sn, spike, StupFor

	def void testCanAddUsers() {
		sn = new SocialNetwork()
		sn.addUser("spike")
		assert sn.users.size == 1
	}
	// mocking and stubbing are being created but can get the test to pass

	// def void testfind_user_returns_specific_user() {
	// 	sn = new SocialNetwork()
	// 	def mock = new MockFor(MockForSocialNetworkTestsClass)
	// 	mock.demand.username { "Spike"}
	// 	sn.addUser(mock)
	// 	mock.use {
	// 		assert sn.findUser("Spike") == new SocialNetworkTestsClass().username()
	// 	}
	// }
	//
	// def void test_mock_single_method_and_use_as_category() {
	// 	sn = new SocialNetwork()
	// 	def stub = new StubFor(User)
	// 	stub.demand.username { "Spike" }
	// 	stub.use {
	// 		println stub
	// 		sn.addUser(stub)
	//     assert sn.findUser("Spike") == stub
	// 	}
	// }
}
