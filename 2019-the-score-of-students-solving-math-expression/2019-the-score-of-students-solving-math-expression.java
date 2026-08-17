class Solution {
    public int scoreOfStudents(String s, int[] answers) {
        final int N = s.length() / 2 + 1;
        int correct = calculate(s);      
        
        Set<Integer>[][] sets = new HashSet[N][N];
        for (int i = N - 1; i >= 0; i--) {
            sets[i][i] = new HashSet<>();
            sets[i][i].add(s.charAt(i * 2) - '0');
            for (int j = i + 1; j < N; j++) {
                sets[i][j] = new HashSet<>();
                for (int k = i; k < j; k++) {
                    for (int left : sets[i][k]) {
                        for (int right : sets[k + 1][j]) {
                            int ans = s.charAt(2 * k + 1) == '+' ? left + right : left * right;
                            if (ans <= 1000) {
                                sets[i][j].add(ans);    
                            }                            
                        }
                    }
                }
            }
        }
        
        int res = 0;
        for (int a : answers) {
            if (a == correct) {
                res += 5;
            } else if (sets[0][N - 1].contains(a)) {
                res += 2;
            }
        }
        return res;
    }
    
	// calculate the correct answer using stack.
    private int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '+') {
                i++;
            } else if (Character.isDigit(s.charAt(i))) {
                stack.offerFirst(s.charAt(i++) - '0');
            } else {
				// '*'
                i++;
                stack.offerFirst(stack.pollFirst() * (s.charAt(i++) - '0'));
            }            
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pollFirst();
        }
        return sum;
    }
}