package java;

public class AddBInary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carryOver = 0;
        int aBinLength = a.length() - 1;
        int bBinLength = b.length() - 1;

        while (aBinLength >= 0 || bBinLength >= 0 || carryOver == 1) {
            if (aBinLength >= 0)
                carryOver += a.charAt(aBinLength--) - '0';
            if (bBinLength >= 0)
                carryOver += b.charAt(bBinLength--) - '0';
            sb.append(carryOver % 2);
            carryOver /= 2;
        }
        return sb.reverse().toString();
    }
}
