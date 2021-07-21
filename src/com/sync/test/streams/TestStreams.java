package com.sync.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {

  public static void main(String[] args) {
    List<Person> people = getPeople();
//
//    List<Person> females = new ArrayList<>();
//    for(Person person : people){
//      if(person.getGender().equals(Gender.FEMALE)){
//        females.add(person);
//      }
//    }person

    List<Person> females= people.stream().filter(person->person.getGender().equals(Gender.MALE))
        .collect(Collectors.toList());
    females.forEach(System.out::print);
  }

  private static List<Person> getPeople() {
    List<Person> asList = Arrays.asList(new Person("Shiva", 38, Gender.MALE), new Person("Kruthi", 7, Gender.FEMALE), new Person("Anitha", 37, Gender.FEMALE));
    return asList;
  }
}
