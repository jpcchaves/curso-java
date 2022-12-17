package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("maria");
    list.add("alex");
    list.add("bob");
    list.add("anna");

    list.add(1, "joão");
    list.add("aoão");
    list.add("aoão");
    list.add("aoão");
    list.add("aoão");

    System.out.println(list.size());

//    list.removeIf(x -> x.charAt(0) == 'm');

    List<String> result =
            list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());

    String name =
            list.stream().filter(x -> x.toLowerCase().charAt(0) == 'j').findFirst().orElse(null);

    if (name != null) {

      System.out.println("Found first: " + name);
    } else {
      System.out.println("Found first: not found...");
    }

    for (String person : list) {
      System.out.println(person);
    }

    System.out.println("----------");
    for (String x : result) {
      System.out.println(x);

    }

  }


}
