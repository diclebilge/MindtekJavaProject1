package codingInterview;

public class ReverseQue2 {
    public static void main(String[] args) {
        // Write a code that will reverse sentence. String str=”String is immutable”; output: “immutable is String“;

                String str = "String is immutable";
                String[] words = str.split(" ");
                String reversed = "";

                for (int i = words.length - 1; i >= 0; i--) {
                    reversed += words[i] + " ";
                }

                System.out.println(reversed.trim());
            }
        }


