package com.data.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StackCalculator {

    public static void main(String[] args) {
        String s = "1 + ( ( 2 + 3 ) * 4 ) - 5";
        List<String> tokens = tokenize(s);
        System.out.println("tokens = " + tokens);

        List<String> rpn = toPRN(tokens);
        System.out.println("rpn = " + rpn);

    }
//    public static double evaluateExpression(String expression) {

    /// /        List<String> tokens = tokenize(expression);
    /// /        List<String> rpn = toRpn(tokens);
    /// /        return 0;
//    }

    // 1.tokenize
    public static List<String> tokenize(String s) {
        List<String> tokens = new ArrayList<>();
        if (s == null) {
            return tokens;
        }
        int n = s.length();
        for (int i = 0; i < n; ) {
            char c = s.charAt(i);

            // 空格
            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            // 数字
            if (Character.isDigit(c) || c == '.') {
                int j = i;
                while (j < n && (Character.isDigit(s.charAt(j)) || s.charAt(j) == '.')) {
                    j++;
                    tokens.add(s.substring(i, j));
                }
                i = j;
                continue;
            }

            // 操作符括号
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') {

                // 如果是负号
                if (c == '-') {
                    // 负号 前面是（ ， 前面是操作符 ， 在tokens开头
                    if (tokens.isEmpty() || isOperator(tokens.get(tokens.size() - 1)) || (tokens.size() - 1) == '(') {
                        tokens.add("u-");
                    } else {
                        tokens.add("-");
                    }
                } else {
                    tokens.add(String.valueOf(c));
                }
                i++;
                continue;
            }

            throw new IllegalArgumentException("非法字符" + c + "at postion" + i);
        }

        return tokens;

    }



    // 2.中缀转后缀
    public static List<String> toPRN(List<String> tokens) {

        List<String> output = new ArrayList<>();
        Deque<String> ops = new ArrayDeque<>();

        for (String token : tokens) {

            if (isNumber(token)) {
                output.add(token);
            } else if (token.equals("(")) {
                output.add(token);
            } else if (token.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    output.add(ops.pop());
                }
                if (ops.isEmpty()) {
                    throw new IllegalArgumentException("括号不匹配");
                }
                ops.pop();
            } else if (isOperator(token)) {
                while ( !ops.isEmpty() && (precedence(ops.peek()) >= precedence(token)) ) {
                    output.add(ops.pop());
                }
                ops.push(token);
            }
        }
        while (!ops.isEmpty()) {
            output.add(ops.pop());
        }
        return output;
    }


    private static boolean isNumber(String tok) {
        try { Double.parseDouble(tok); return true; }
        catch (Exception e) { return false; }
    }

    private static int precedence(String op) {
        switch (op) {
            case "u-": return 3; // 一元负号优先级最高
            case "*": case "/": return 2;
            case "+": case "-": return 1;
            default: return 0;
        }
    }

    // 一元负号是右结合，其他常规二元运算为左结合
    private static boolean isLeftAssociative(String op) {
        return !op.equals("u-");
    }

    private static boolean isBinaryOperator(String tok) {
        return tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/");
    }

    private static boolean isOperator(String tok) {
        return tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/") || tok.equals("u-");
    }

}
