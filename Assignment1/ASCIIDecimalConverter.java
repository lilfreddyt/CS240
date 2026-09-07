package Assignment1;
class ASCIIDecimalConverter {
    public static void main(String[] args) {
        String ascii = "Fredric";

        for (char c : ascii.toCharArray()) {
            int decimal = (int) c;
            System.out.println(decimal);
        }
    }
}