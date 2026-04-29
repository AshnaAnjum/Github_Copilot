public class HelloWorld {
    public static void main(String[] args) {
        User user1 = new User("Alice", 20, 101);
        User user2 = new User("Bob", 22, 101);
        User user3 = new User("Charlie", 20, 102);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("user1 equals user2: " + user1.equals(user2));
        System.out.println("user1 equals user3: " + user1.equals(user3));
        System.out.println("user1 hashCode: " + user1.hashCode());
        System.out.println("user2 hashCode: " + user2.hashCode());
        System.out.println("user3 hashCode: " + user3.hashCode());
    }
}
