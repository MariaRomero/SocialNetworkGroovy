# SocialNetworkGroovy

Implemented console-based social networking application (similar to Twitter) with the features below.

Features:

- User creating: a new user called Spike can be created
- Posting: Spike can publish messages to a personal timeline
- Reading: Spike can view Nikesh’s timeline
- Following: Leo can subscribe to Spike and Nikesh's timelines, and view an aggregated list of all subscriptions

Approach:

This is a different approach to the problem, in this case I completely separated concerns and used SOLID principles, this solution in my opinion keeps the code reusable for longer as classes and their methods can be updated without affecting other classes and their functionally

Instructions for downloading and running tests:
  Fork this repo and in the shell do:
- `groovy TimelineTests`
- `groovy SubscriptionTests`
- `groovy SocialNetworkTests`

To manualy test do:
- `groovysh`
- `sn = new SocialNetwork()`
- `sn.addUser(new User("Spike", new Timeline(), new Subscription()))`
- `sn.addUser(new User("Leo", new Timeline(), new Subscription()))`
- `sn.addUser(new User("Nikesh", new Timeline(), new Subscription()))`
- `spike = sn.findUser("Spike")`
- `leo = sn.findUser("Leo")`
- `nikesh = sn.findUser("Nikesh")`
- `spike.timeline.addToTimeline(new Post("Spike first message"))`
- `spike.timeline.addToTimeline(new Post("Spike second message"))`
- `nikesh.timeline.addToTimeline(new Post("Nikesh first message"))`
- `nikesh.timeline.addToTimeline(new Post("Nikesh second message"))`
- `spike.subscription.follow(nikesh)`
- `spike.subscription.read()`
- `leo.subscription.follow(nikesh)`
- `leo.subscription.follow(spike)`
- `leo.subscription.read()`

Next steps
- Work more on tests and the mocking as at the moment not everything is being tested
- Include all the test on one file that way they can be run with one single command 
