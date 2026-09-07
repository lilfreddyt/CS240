package Assignment1;

class NumberBaseConverter {
    public static void main (String[] args) {
        // Boundary Case: 0
        System.out.println(toBinary(0));
        System.out.println(toDecimal(0));
        System.out.println(toOctal(0));
        System.out.println(toHexidecimal(0));

        // Boundary Case: Largest unsigned int
        System.out.println(toBinary(Integer.MAX_VALUE));
        System.out.println(toDecimal(Integer.MAX_VALUE));
        System.out.println(toOctal(Integer.MAX_VALUE));
        System.out.println(toHexidecimal(Integer.MAX_VALUE));

        // Boundary Case: Negative 2's complement value
        System.out.println(toBinary(-5));
        System.out.println(toDecimal(-5));
        System.out.println(toOctal(-5));
        System.out.println(toHexidecimal(-5));
    }

    public static String toBinary(int num) {
        String result = "";
        if (num < 0) {
            num += 256;
        }
        if (num == 0) {
            return num + result;
        }
        while (num > 0) {
            int digit = num % 2;
            result = digit + result;
            num /= 2;
        }
        return result;
    }

    public static int toDecimal(int num) {
        return num;
    }

    public static String toOctal (int num) {
        if (num < 0) {
            num += 256;
        }
        String result = "";
        if (num == 0) {
            return num + result;
        }
        while (num > 0) {
            int digit = num % 8;
            result = digit + result;
            num /= 8;
        }
        return result;
    }

    public static String toHexidecimal (int num) {
        if (num < 0) {
            num += 256;
        }
        String result = "";
        if (num == 0) {
            return num + result;
        }
        while (num > 0) {
            int digit = num % 16;
            if (digit > 9) {
                switch (digit) {
                    case 10:
                        result = 'A' + result;
                        break;
                    case 11:
                        result = 'B' + result;
                        break;
                    case 12:
                        result = 'C' + result;
                        break;
                    case 13:
                        result = 'D' + result;
                        break;
                    case 14:
                        result = 'E' + result;
                        break;
                    case 15:
                        result = 'F' + result;
                        break;
                }
            }
            else {
                result = digit + result;
            }
            num /= 16;
        }
        return result;
    }
}