package com.cg.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class LinkedlistHashMapTest {
    @Test
    public void givenString_whenParsed_shouldReturnParanoidFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String s : words) {
            Integer value = myLinkedHashMap.get(s);
            if (value == null)
                value = 1;
            else
                value++;
            myLinkedHashMap.add(s, value);
        }
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(3, frequency);
    }
}
