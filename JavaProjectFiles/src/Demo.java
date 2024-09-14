 public class Demo {
        public static void main(String[] args) {
            Human obj = new Human();
            obj.setAge(22);
            obj.setName("khushal");
            System.out.printf(STR."\{obj.getName()} age is \{obj.getAge()} and");

            Person obj1 = new Person();
            obj1.setFirstName(" his friend is ");
            obj1.setLastName("Ritik ");
            System.out.println(obj1.getFirstName()+ obj1.getLastName());
        }
    }