package org.softserve.challenge;

import java.util.stream.Collectors;

public class StringCleaner {
    public static String removeDuplicates(final String occurrence)
    {
        final String newOccurrence = occurrence.chars().distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return newOccurrence;
    }
}
