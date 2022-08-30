package com.mycompany.myproject;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

final class DumperTest {

   @Test
   public final void run() {
      List<Object> object = new ArrayList<>();
      object.add(Integer.parseInt("42"));
      object.add("Don't panic");
      object.add("Why me?");
      object.add(new StringBuffer());
      
      System.out.println(Dumper.dump(object, 0, 10, null));
   }
}