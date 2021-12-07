package com.java.java14.demo.java14Demo;

import org.junit.jupiter.api.Test;

public class SwitchExpressionTest {

    @Test
    public void switch_expression_case(){
        String day = " ";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }

        };
        System.out.println(result);
    }
}
