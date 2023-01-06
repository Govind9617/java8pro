package Test;

import java.util.*;
import java.util.stream.Collectors;

public class UserTest {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User(100,"john","cena",125000, Arrays.asList("989767789798","988771298817")));
        users.add(new User(106,"big","show",235000, Arrays.asList("97917813838","68362828191")));
        users.add(new User(145,"edge","burge",625000, Arrays.asList("36292910293","62968201012")));
        users.add(new User(981,"john","wick",725000, Arrays.asList("462662553166","1478625633")));
        users.add(new User(187,"the","rock",825000, Arrays.asList("449336625454","2454421541")));


        List<User> list=users.stream().sorted(Comparator.comparing(User::getFirstName)).skip(2).collect(Collectors.toList());
        Optional<User> list1=users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).skip(2).findFirst();//collect(Collectors.toList());
        Map<String,Long> list2=users.stream().collect(Collectors.groupingBy(User::getFirstName,Collectors.counting()));
        List<User> list3=users.stream().filter(x->x.getId()>145 && x.getFirstName()=="edge").collect(Collectors.toList());
        List<String> list4=users.stream().flatMap(user -> user.getPhoneNumbers().stream()).collect(Collectors.toList());
        List<User> list5=  users.stream().max(Comparator.comparing(User::getSalary)).stream().limit(1).collect(Collectors.toList());
        List<User> list6= users.stream().filter(s->s.getFirstName().startsWith("j")).collect(Collectors.toList());
        List<User> list7= users.stream().filter(s->s.getSalary()>700000 && s.getFirstName().equals("john")).collect(Collectors.toList());
        System.out.println(list7);



    }
}
