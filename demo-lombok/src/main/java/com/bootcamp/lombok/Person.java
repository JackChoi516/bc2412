package com.bootcamp.lombok;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK (Java Development Kit) = Dev Library/Tools + JRE + JVM
// Dev Lib => javac, class Library Big Decimal(java.math), StringBuilder(java.lang)
// 1. Some of the Library auto=imported by java Project (i.e. java.lang)
// 2. but some of them have to be manually imported.
// 3. Maven: download external (outside JDK) library from maven public (i.e. lombok)

// How Lombok get it work

// Class Level annotation
@Getter // can be field level
@Setter // can br field level
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode // what if extends?
@Builder
public class Person {
  private String name;
  @ToString.Exclude
  private int age;


  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    p1.setName("Peter");
    Person p2 = new Person("Tommy", 10);
    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    System.out.println(p1);

    Person p3 = new Person("Tommy", 10);
    System.out.println(p2.equals(p3)); // true
    System.out.println(p2.hashCode() == p3.hashCode()); // true

    Person p4 = Person.builder().name("Tommy").age(10).build();
    System.out.println(p4);

  }
}
