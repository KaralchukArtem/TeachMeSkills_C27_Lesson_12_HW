package com.teachmeskills.lesson12.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String text = "ABAcs asf  ';/ , /s SDA ,sjusASD ASDC aWWR BDS";
        String REG = "\\b[A-Z]{2,6}\\b";

        Pattern pattern = Pattern.compile(REG);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group());
    }
}