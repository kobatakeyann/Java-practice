class RangeSummation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please execute with 2 arguments of integer");
            return;
        }
        int startNum = Integer.parseInt(args[0]);
        int endNum = Integer.parseInt(args[1]);
        int sum = 0;
        StringBuilder output = new StringBuilder();
        output.append(startNum);
        sum += startNum;
        for (int i = startNum + 1; i <= endNum; i++) {
            sum += i;
            String operator = (i < 0) ? "-" : "+";
            output.append(operator).append(Math.abs(i));
        }
        output.append("=").append(sum);
        System.out.println(output);
    }
}
