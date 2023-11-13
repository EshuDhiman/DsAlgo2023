package Questions.Arrays;
// Sure, here's a detailed explanation of the code you provided:

// This is a Java code snippet for a class called `Solution` that contains a method called `strStr`. The purpose of this method is to find the index of the first occurrence of a given substring `needle` within a string `haystack`.

// The `strStr` method takes two parameters: `haystack` and `needle`, both of which are of type `String`. 

// The method first checks if the `haystack` contains the `needle` using the `contains()` method. The `contains()` method returns a boolean value indicating whether the specified substring is present in this string. 

// If `haystack` contains `needle`, then the method prints the index of the first occurrence of `needle` in `haystack` using the `indexOf()` method. The `indexOf()` method returns the index within this string of the first occurrence of the specified substring, starting at the specified index. In this case, the specified index is 0, which means that the search for `needle` starts at the beginning of `haystack`.

// Finally, if `needle` is found in `haystack`, the method returns the same index. If `needle` is not found in `haystack`, the method returns -1.
public class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        strStr(haystack, needle);
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle, 0));
            return haystack.indexOf(needle, 0);
        }
        return 0;
    }
}
