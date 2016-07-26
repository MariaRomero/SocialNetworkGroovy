# SocialNetworkGroovy

Implemented console-based social networking application (similar to Twitter) with the features below.

Features:

- User creating: a new user called Spike can be created
- Posting: Spike can publish messages to a personal timeline
- Reading: Spike can view Nikesh’s timeline
- Following: Leo can subscribe to Spike and Nikesh's timelines, and view an aggregated list of all subscriptions

Instructions for downloadin and running tests:
- Fork this repo and in the shell do:
- `groovy UserTests`
- `groovy featureTests`

To manualy test do:
- `groovysh`
- `spike = new User("Spike", new Post())`
- `leo = new User("leo", new Post())`
- `nikesh = new User("nikesh", new Post())`
- `spike.posts("Spike first message")`
- `nikesh.posts("Nikesh first message")`
- `spike.follow(nikesh)`
- `spike.read()`
- `leo.follow(spike)`
- `leo.follow(nikesh)`
- `leo.read()`
