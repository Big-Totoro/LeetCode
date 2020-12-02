package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/">535. Encode and Decode TinyURL</a>
 */

public class _535 {
    public static class Codec {

        Map<Integer, String> urls = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            int hashCode = longUrl.hashCode();
            urls.put(hashCode, longUrl);
            return "http://tinyurl.com/" + String.valueOf(hashCode);
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            Integer hashCode = Integer.valueOf(shortUrl.replace("http://tinyurl.com/", ""));
            return urls.get(hashCode);
        }
    }
}
