class Solution {
    public String multiply(String num1, String num2) {
        
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m]; 

     
        for (int i = n - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int product = d1 * d2;

                int pos1 = i + j;     
                int pos2 = i + j + 1; 

                int sum = product + result[pos2];

                result[pos2] = sum % 10;         
                result[pos1] += sum / 10;         
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
