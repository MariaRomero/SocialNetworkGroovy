import User

spike = new User("Spike", new Post())
leo = new User("leo", new Post())
nikesh = new User("nikesh", new Post())
spike.posts("Spike first message")
nikesh.posts("Nikesh first message")
spike.follow(nikesh)
spike.read()
leo.follow(spike)
leo.follow(nikesh)
leo.read()


