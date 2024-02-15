package com.teachmeskills.lesson12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public static void main(String[] args) {
        String text = "sdg sdg sdg@ vbfgrSE ./ /o;  8&teachmeskills@gmail_.com8, ghk doc number JKI1423-1512-51LK phone number sdf e23 L+375(29)375-3318L";
        String REG = "\\+\\d{3}?.(\\d{2})?.\\d{3}(-\\d{2}){2}|\\+\\d{3}?.(\\d{2})?.\\d{3}(-\\d{4})|[a-z0-9_-]+@[a-z0-9_\\.-]+\\.([a-z]{3})|(?:\\d{4}-){2}(\\d{2})";

        Pattern pattern = Pattern.compile(REG);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }

}
