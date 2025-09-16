class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java Programming";
        String str3 = "";

        System.out.println(str1.hashCode()); // 2301506
        System.out.println(str2.hashCode()); // 1377009627

        // hash code of empty string is 0
        System.out.println(str3.hashCode()); // 0
    }
}