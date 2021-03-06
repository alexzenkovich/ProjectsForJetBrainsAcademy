/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        String operator = args[0];

        switch (operator) {
            case "MAX":
                int max = Integer.MIN_VALUE;
                for (int i = 1; i < args.length; i++) {
                    int x = Integer.parseInt(args[i]);
                    if (x > max) {
                        max = x;
                    }
                }
                System.out.println(max);
                break;
            case "MIN":
                int min = Integer.MAX_VALUE;
                for (int i = 1; i < args.length; i++) {
                    int x = Integer.parseInt(args[i]);
                    if (x < min) {
                        min = x;
                    }
                }
                System.out.println(min);
                break;
            case "SUM":
                int sum = 0;
                for (int i = 1; i < args.length; i++) {
                    int x = Integer.parseInt(args[i]);
                    sum += x;
                }
                System.out.println(sum);
                break;
        }// write your code here
    }
}