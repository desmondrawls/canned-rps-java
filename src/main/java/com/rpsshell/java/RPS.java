package com.rpsshell.java;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class RPS {

    @ShellMethod("Play a throw")
    public String play(String firstThrow, String secondThrow) {
        return firstThrow + " vs " +  secondThrow;
    }
}