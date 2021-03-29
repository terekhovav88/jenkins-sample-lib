#!/usr/bin/env groovy

package org.foo

class SampleClass {
    String name = "Vasya"
    Integer age = 5

    def increaseAge(Integer years) {
        this.age += years
    }
}
