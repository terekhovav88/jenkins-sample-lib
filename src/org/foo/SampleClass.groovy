#!/usr/bin/env groovy

package org.foo

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }
}
