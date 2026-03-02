class RevString {
    public static void main(String... args) {
        String name = "HELLO";
        String res = "";
        
        for (int i = name.length() - 1; i >= 0; i--) {
            res = res + name.charAt(i);
        }
        
        if (name.equals(res)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}