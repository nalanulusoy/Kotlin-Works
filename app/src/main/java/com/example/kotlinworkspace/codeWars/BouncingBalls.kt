package com.example.kotlinworkspace.codeWars

import java.lang.Math.ceil
import java.lang.Math.log
import kotlin.math.log


fun main(args:Array<String>){
   println(bouncingBall(30.0, 0.66, 1.5))
}


fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1
    var bounceHight = h * bounce
    var count = 1
    while (bounceHight > window) {
        count += 2
        bounceHight = bounceHight * bounce
    }
    return count
}

fun bouncingBall2(h:Double, bounce:Double, window:Double):Int {
    if (h <= 0.0) return -1;
    if (bounce <= 0.0 || bounce >= 1.0) return -1;
    if (window >= h) return -1;

    return generateSequence(h) { it * bounce }.takeWhile { it > window }.count() * 2 - 1
}

fun bouncingBall3(h: Double, bounce: Double, window: Double) = 1 + (ceil(log(window / h, bounce)).toInt() - 1) * 2