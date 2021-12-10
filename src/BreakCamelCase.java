class BreakCamelCase {
    public static String camelCase(String input) {
        String newString = "";
        for (int i = 0; i < input.length(); i++){
            if (Character.isUpperCase(input.charAt(i)))
                newString += " ";
            newString += input.charAt(i);
        }
        return newString;
    }
}